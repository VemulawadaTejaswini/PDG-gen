import java.io.*;
import java.util.*;

@SuppressWarnings("unused")
public class Main implements Runnable{
    private FastScanner in;
    private PrintWriter out;
    final int MOD = (int)1e9+7;
    long ceil(long a, long b){return (a + b - 1) / b;}
    long gcd(long a, long b){return b == 0 ? a : gcd(b, a % b);}
    long lcm(long a, long b){return a / gcd(a, b) * b; /*オーバーフローに注意*/}

    void solve() {
        int N = in.nextInt();
        int[] num = new int[4];
        for(int i = 0; i < N; i++){
            int a = in.nextInt();
            num[a]++;
        }

        //「1個のものがi種類、2個のものがj種類、3個のものがk種類」の状態からすべてなくなるまでの回数の期待値
        //i,j,kの順で回るようにする
        double[][][] dp = new double[N+1][N+1][N+1];
        dp[0][0][0] = 0.0;
        for(int k = 0; k <= N; k++){
            for(int j = 0; j <= N; j++){
                for(int i = 0; i <= N; i++){
                    //範囲外
                    if((i + j + k > N)) continue;
                    //終了状態
                    if(i == 0 && j == 0 && k == 0) continue;

                    double e = 0;
                    if(i > 0) e += (dp[i-1][j  ][k  ] + 1) * i / N;
                    if(j > 0) e += (dp[i+1][j-1][k  ] + 1) * j / N;
                    if(k > 0) e += (dp[i  ][j+1][k-1] + 1) * k / N;

                    //0個のものがm種類
                    int m = N-i-j-k;
                    //自己ループがあるとき
                    if(m > 0 && m < N){
                        //e = (dp[i-1][j][k] + 1) * i / N + (dp[i+1][j-1][k] + 1) * j / N + (dp[i][j+1][k-1] + 1) * k / N
                        //dp[i][j][k] = (dp[i][j][k] + 1) * m / N + e
                        //((N - m) / N) * dp[i][j][k] = m / N + e
                        //dp[i][j][k] = (m / N + e) * N / (N - m)
                        e += (double)m / N;
                        e *= (double)N / (N - m);
                    }
                    dp[i][j][k] = e;
                }
            }
        }
        out.println(dp[num[1]][num[2]][num[3]]);
    }
    //end solve

    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler((t,e)->System.exit(1));
        new Thread(null, new Main(), "", 16L * 1024 * 1024).start();
    }

    public void run() {
        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);
        solve();
        out.flush();
    }

    static class FastScanner {
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