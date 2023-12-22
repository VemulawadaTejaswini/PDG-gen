import java.io.*;
import java.util.*;

@SuppressWarnings("unused")
public class Main {
    FastScanner in;
    PrintWriter out;
    int MOD = (int)1e9+7;
    long ceil(long a, long b){return (a + b - 1) / b;}
    long gcd(long a, long b){return b == 0 ? a : gcd(b, a % b);}
    long lcm(long a, long b){return a / gcd(a, b) * b;}

    void solve(){
        int N = in.nextInt(), M = in.nextInt();
        String S = in.nextStr();

        long INF = Long.MAX_VALUE / 2;
        SegmentTreeIndex seg = new SegmentTreeIndex(N+1, INF);
        seg.setPoint(0, 0);
        int[] p = new int[N+1];
        Arrays.fill(p, -1);
        for(int i = 1; i <= N; i++){
            if(S.charAt(i) == '1') continue;
            int idx = seg.getSegmentIndex(Math.max(0, i-M), i);
            if(seg.getPoint(idx) == INF) continue;
            seg.setPoint(i, seg.getPoint(idx)+1);
            p[i] = idx;
        }

        if(seg.getPoint(N) == INF){
            out.println("-1");
            return;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        int now = N;
        while(true){
            int pre = p[now];
            if(pre == -1) break;
            ans.add(now - pre);
            now = pre;
        }
        Collections.reverse(ans);
        for(int e : ans) out.print(e + " ");
        out.println();
    }

    class SegmentTreeIndex{
        int d;
        int[] node;
        long[] arr;

        /*二項演算で使える単位元*/
        private long e = Long.MAX_VALUE / 2;

        /*要素同士の二項演算*/
        private int f(int e1, int e2){
            //区間最小値、値が同じときは小さいインデックスを返す
            return (arr[e1] == arr[e2] ? Math.min(e1, e2) : (arr[e1] < arr[e2] ? e1 : e2));
        }

        /*要素更新用の演算(可換でなくてもよい)*/
        private long g(long arrVal, long val){
            return val; //更新
            //return arrVal + val; //加算
        }

        /* 単位元で初期化 */
        public SegmentTreeIndex(int sz, long e){
            this.e = e;
            d = 1;
            while(d < sz) d *= 2;
            arr = new long[d];
            Arrays.fill(arr, e);
            node = new int[2*d];
            for(int i = 0; i < d; i++)
                node[i+d] = i;
            for(int i = d - 1; i > 0; i--)
                node[i] = f(node[2*i], node[2*i+1]);
        }

        /* 元配列vでセグメント木を初期化 */
        public SegmentTreeIndex(long[] v, long e){
            this(v.length, e);
            for(int i = 0; i < v.length; i++)
                arr[i] = v[i];
            for(int i = d - 1; i > 0; i--)
                node[i] = f(node[2*i], node[2*i+1]);
        }

        public long getPoint(int x){
            return arr[x];
        }

        /* 0-indexed:xの要素をg(node[x], val)に更新 */
        public void setPoint(int x, long val){
            arr[x] = g(arr[x], val);
            x += d;
            while(x > 1){
                x = x / 2;
                node[x] = f(node[2*x], node[2*x+1]);
            }
        }

        /* 指定した区間[L,R)の区間演算の結果を求めるクエリ */
        public int getSegmentIndex(int L, int R){
            L += d;
            R += d;
            int resL = node[L], resR = node[R-1];
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

    public static void main(String[] args) {
        new Main().m();
    }

    private void m() {
        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);
        /*
        try {
            String path = "output.txt";
            out = new PrintWriter(new BufferedWriter(new FileWriter(new File(path))));
        }catch (IOException e){
            e.printStackTrace();
        }
        */
        solve();
        out.flush();
        in.close();
        out.close();
    }

    static class FastScanner {
        private Reader input;

        public FastScanner() {this(System.in);}
        public FastScanner(InputStream stream) {this.input = new BufferedReader(new InputStreamReader(stream));}
        public void close() {
            try {
                this.input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public int nextInt() {return (int) nextLong();}

        public long nextLong() {
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

        public double nextDouble() {
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

        public char nextChar() {
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

        public String nextStr() {
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

        public String nextLine() {
            try {
                StringBuilder sb = new StringBuilder();
                int b = input.read();
                while (b != -1 && b != '\n') {
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