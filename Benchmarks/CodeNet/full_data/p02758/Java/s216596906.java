import java.io.*;
import java.util.*;

@SuppressWarnings("unused")
public class Main {
    FastScanner in;
    PrintWriter out;
    final static int MOD = 998244353;//(int)1e9+7;
    final static long INF = Long.MAX_VALUE / 2;
    
    void solve(){
        int N = in.nextInt();
        long[][] XD = new long[N][3];
        for(int i = 0; i < N; i++){
            XD[i][0] = in.nextLong();
            XD[i][1] = in.nextLong();
            XD[i][2] = XD[i][0] + XD[i][1];
        }
        Arrays.sort(XD, (e1, e2)->Long.compare(e1[0], e2[0]));
        int[] idxRight = new int[N];
        for(int i = 0; i < N; i++){
            int ok = i, ng = N;
            while(ng - ok > 1){
                int mid = (ok + ng) / 2;
                if(XD[mid][0] < XD[i][2]) ok = mid;
                else ng = mid;
            }
            idxRight[i] = ok;
        }
        
        long[] dp = new long[N+1];
        dp[N] = 1;
        SegmentTree seg = new SegmentTree(N);
        for(int i = N-1; i >= 0; i--){
            seg.setPoint(i, idxRight[i]);
            seg.setPoint(i, seg.getSegment(i, idxRight[i] + 1));
            dp[i] = (dp[i+1] + dp[(int)seg.getPoint(i) + 1]) % MOD;
        }
        out.println(dp[0]);
    }
    
    class SegmentTree{
        int d;
        long[] node;
        
        /*二項演算で使える単位元*/
        private long e = 0;
        
        /*結合律が成り立つ、要素同士の二項演算*/
        private long f(long e1, long e2){
            return Math.max(e1, e2);
        }
        
        /*要素更新用の演算(可換でなくてもよい)*/
        private long g(long nodeVal, long val){
            return val; //更新
        }
        
        /* 単位元で初期化 */
        public SegmentTree(int sz){
            long[] v = new long[sz];
            Arrays.fill(v, e);
            init(v);
        }
        
        /* 配列vで初期化 */
        public SegmentTree(long[] v){
            init(v);
        }
        
        private void init(long[] v){
            d = 1;
            while(d < v.length) d *= 2;
            node = new long[2*d];
            for(int i = 0; i < v.length; i++)
                node[i+d] = v[i];
            for(int i = d-1; i > 0; i--)
                node[i] = f(node[2*i], node[2*i+1]);
        }
        
        public long getPoint(int x){
            return node[x+d];
        }
        
        /* 0-indexed:xの要素をg(node[x], val)に更新 */
        public void setPoint(int x, long val){
            x += d;
            node[x] = g(node[x], val);
            while(x > 1){
                x = x / 2;
                node[x] = f(node[2*x], node[2*x+1]);
            }
        }
        
        /* 指定した区間[L,R)の区間演算の結果を求めるクエリ */
        public long getSegment(int L, int R){
            L += d;
            R += d;
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
    
    public static void main(String[] args) {
        new Main().m();
    }
    
    private void m() {
        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);
        /*
        try {
            String path = "input.txt";
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