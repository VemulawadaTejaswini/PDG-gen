import java.io.*;
import java.util.*;

@SuppressWarnings("unused")
public class Main {
    private FastScanner in;
    private PrintWriter out;
    final int MOD = (int)1e9+7;
    long ceil(long a, long b){return (a + b - 1) / b;}
    long gcd(long a, long b){return b == 0 ? a : gcd(b, a % b);}
    long lcm(long a, long b){return a / gcd(a, b) * b; /*オーバーフローに注意*/}

    void solve() {
        int N = in.nextInt();
        int[][] LR = new int[N][2];
        for (int i = 0; i < N; i++) {
            LR[i][0] = in.nextInt();
            LR[i][1] = in.nextInt();
        }
        Arrays.sort(LR, (e1, e2)->e1[0] != e2[0] ? Integer.compare(e1[0], e2[0]) : Integer.compare(e2[1], e1[1]));

        int[] minLeft = new int[N], minRight = new int[N];
        minLeft[0] = LR[0][1];
        for(int i = 1; i < N; i++) minLeft[i] = Math.min(minLeft[i-1], LR[i][1]);
        minRight[N-1] = LR[N-1][1];
        for(int i = N-2; i >= 0; i--) minRight[i] = Math.min(minRight[i+1], LR[i][1]);

        long ans = 0;

        for(int i = 0; i < N-1; i++){
            int maxL1 = LR[i][0], minR1 = minLeft[i];
            int maxL2 = LR[N-1][0], minR2 = minRight[i+1];
            long sum = 0;
            if(maxL1 <= minR1) sum += (minR1 - maxL1 + 1);
            if(maxL2 <= minR2) sum += (minR2 - maxL2 + 1);
            ans = Math.max(ans, sum);
        }

        for(int i = 0; i < N; i++){
            long sum = LR[i][1] - LR[i][0] + 1;
            int maxL = (i == N-1 ? LR[N-2][0] : LR[N-1][0]);
            int minR = Math.min((i == 0 ? Integer.MAX_VALUE : minLeft[i-1]), (i == N-1 ? Integer.MAX_VALUE : minRight[i+1]));
            sum += Math.max(0, minR - maxL + 1);
            ans = Math.max(ans, sum);
        }

        out.println(ans);
    }
    //end solve

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