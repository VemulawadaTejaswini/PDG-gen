import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

@SuppressWarnings("unused")
public class Main {
    private FastScanner in = new FastScanner(System.in);
    private PrintWriter out = new PrintWriter(System.out);
    final int MOD = (int)1e9+7;
    long ceil(long a, long b){return (a + b - 1) / b;}

    void solve() throws Exception{
        int N = in.nextInt();
        int[] L = in.nextIntArray(N);
        Arrays.sort(L);
        long sum = 0;
        for(int i = 0; i < N; i++){
            for(int j = i + 1; j < N; j++){
                int min = L[j] - L[i];
                int max = L[j] + L[i];
                int idxMin = lowerBound(L, min);
                int idxMax = upperBound(L, max);
                idxMin = Math.max(idxMin, j + 1);
                if(idxMin > idxMax) continue;
                int num = idxMax - idxMin + 1;
                //out.println(i + " " + j + " " + idxMin + " " + idxMax);
                sum += num;
            }
        }
        out.println(sum);
    }

    int lowerBound(int[] a, int key){
        int ng = -1;
        int ok = a.length;
        while(Math.abs(ok - ng) > 1){
            int mid = (ok + ng) / 2;
            if(a[mid] > key) ok = mid;
            else ng = mid;
        }
        return ok;
    }

    int upperBound(int[] a, int key){
        int ok = -1;
        int ng = a.length;
        while(Math.abs(ok - ng) > 1){
            int mid = (ok + ng) / 2;
            if(a[mid] < key) ok = mid;
            else ng = mid;
        }
        return ok;
    }
    //end solve

    public static void main(String[] args) throws Exception {
        new Main().m();
    }

    private void m() throws Exception {
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