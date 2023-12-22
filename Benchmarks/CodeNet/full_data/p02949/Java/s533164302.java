import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class Main {
    FastScanner in = new FastScanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    final int MOD = (int)1e9+7;
    void printlnYN(boolean b){out.println((b ? "Yes" : "No"));}

    //System.out.println();はつかわない！！
    void solve() throws Exception{
        int N = in.nextInt(), M = in.nextInt();
        PriorityQueue<Pair> queue = new PriorityQueue<>();
        ArrayList<Pair> list = new ArrayList<>();
        for(int i = 0; i < N; i++){
            int A = in.nextInt();
            int B = in.nextInt();
            list.add(new Pair(A, B));
        }
        Collections.sort(list, (e1, e2)->Integer.compare(e1.A, e2.A));

        long sum = 0;
        int index = 0;
        LOOP:for(int i = 1; i <= M; i++){
            while(index < N && list.get(index).A <= i){
                queue.add(list.get(index));
                index++;
            }
            if(queue.isEmpty()) continue;
            Pair p = queue.remove();
            sum += p.B;
        }
        out.println(sum);
    }

    class Pair implements Comparable<Pair>{
        int A, B;
        public Pair(int A, int B){this.A = A; this.B = B;}
        @Override
        public int compareTo(Pair o) {
            return Integer.compare(o.B, this.B);
        }
    }

    class SegmentTree{
        int n;
        long[] node;

        /*二項演算で使える単位元*/
        private long e = Integer.MAX_VALUE;
        //private long e = 0;

        /*結合律が成り立つ、要素同士の二項演算*/
        private long f(long e1, long e2){
            return Math.max(e1, e2); //区間最小値
            //return e1 + e2; //区間和
        }

        /*要素更新用の演算(可換でなくてもよい)*/
        private long g(long nodeVal, long val){
            return val; //更新
            //return nodeVal + val; //加算
        }

        /* 単位元で初期化 */
        public SegmentTree(int sz){
            n = 1;
            while(n < sz) n *= 2;
            node = new long[2*n];
            Arrays.fill(node, e);
        }

        /* 元配列vでセグメント木を初期化 */
        public SegmentTree(long[] v){
            this(v.length);
            for(int i = 0; i < v.length; i++)
                node[i+n] = v[i];
            for(int i = n-1; i > 0; i--)
                node[i] = f(node[2*i+0], node[2*i+1]);
        }

        public long getPoint(int x){
            return node[x + n];
        }

        /* 0-indexed:xの要素をg(node[x], val)に更新 */
        public void setPoint(int x, long val){
            x += n;
            node[x] = g(node[x], val);
            while(x > 1){
                x = x / 2;
                node[x] = f(node[2*x+0], node[2*x+1]);
            }
        }

        /* 指定した区間[L,R)の区間演算の結果を求めるクエリ */
        public long getSegment(int L, int R){
            L += n;
            R += n;
            long resL = e, resR = e;
            while (L < R) {
                if ((L & 1) != 0){
                    resL = f(resL, node[L]);
                    L++;
                }
                if ((R & 1) != 0){
                    --R;
                    resR = f(resR, node[R]);
                }
                L >>= 1;
                R >>= 1;
            }
            return f(resL, resR);
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().m();
    }

    void m() throws Exception {
        solve();
        out.flush();
    }

    class FastScanner {
        Reader input;

        FastScanner() {this(System.in);}
        FastScanner(InputStream stream) {this.input = new BufferedReader(new InputStreamReader(stream));}

        int nextInt() {return (int) nextLong();}

        long nextLong() {
            try {
                int sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                long ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) return ret * sign;
                    ret *= 10;
                    ret += b - '0';
                }
            } catch (IOException e) {
                e.printStackTrace();
                return -1;
            }
        }

        double nextDouble() {
            try {
                double sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                double ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) break;
                    ret *= 10;
                    ret += b - '0';
                }
                if (b != '.') return sign * ret;
                double div = 1;
                b = input.read();
                while ('0' <= b && b <= '9') {
                    ret *= 10;
                    ret += b - '0';
                    div *= 10;
                    b = input.read();
                }
                return sign * ret / div;
            } catch (IOException e) {
                e.printStackTrace();
                return Double.NaN;
            }
        }

        char nextChar() {
            try {
                int b = input.read();
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                return (char) b;
            } catch (IOException e) {
                e.printStackTrace();
                return 0;
            }
        }

        String nextStr() {
            try {
                StringBuilder sb = new StringBuilder();
                int b = input.read();
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                while (b != -1 && !Character.isWhitespace(b)) {
                    sb.append((char) b);
                    b = input.read();
                }
                return sb.toString();
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }

        public int[] nextIntArray(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        public int[] nextIntArrayDec(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt() - 1;
            }
            return res;
        }

        public int[] nextIntArray1Index(int n) {
            int[] res = new int[n + 1];
            for (int i = 0; i < n; i++) {
                res[i + 1] = nextInt();
            }
            return res;
        }

        public long[] nextLongArray(int n) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong();
            }
            return res;
        }

        public long[] nextLongArrayDec(int n) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong() - 1;
            }
            return res;
        }

        public long[] nextLongArray1Index(int n) {
            long[] res = new long[n + 1];
            for (int i = 0; i < n; i++) {
                res[i + 1] = nextLong();
            }
            return res;
        }

        public double[] nextDoubleArray(int n) {
            double[] res = new double[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextDouble();
            }
            return res;
        }
    }
}
/* end Main */
