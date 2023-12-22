import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

@SuppressWarnings("unused")
public class Main {
    FastScanner in = new FastScanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    final int MOD = (int)1e9+7;
    long dup(long a, long b){return (a + b - 1) / b;}

    void solveTest() throws  Exception{
        out.println(LCS("afa", "sdfasdf"));
    }

    void solve() throws Exception{
        int N = in.nextInt();
        String S = in.nextStr();

        int heightIndex = N-1, lowIndex = 1;
        while(heightIndex - lowIndex > 15){
            int midLeft = heightIndex / 3 + lowIndex * 2 / 3;
            int midRight = heightIndex * 2 / 3 + lowIndex / 3;
            String leftA = S.substring(0, midLeft);
            String leftB = S.substring(midLeft, N);
            String rightA = S.substring(0, midRight);
            String rightB = S.substring(midRight, N);
            int leftLen = LCS(leftA, leftB);
            int rightLen = LCS(rightA, rightB);
            if(leftLen >= rightLen){
                heightIndex = midRight;
            }else{
                lowIndex = midLeft;
            }
            //out.println(lowIndex + " " + heightIndex);
            //out.flush();
        }

        int max = 0;
        for(int i = lowIndex; i <= heightIndex; i++){
            String A = S.substring(0, i);
            String B = S.substring(i, N);
            //out.println(A + " " + B + " " + LCS(A, B));
            max = Math.max(max, LCS(A, B));
        }
        out.println(max);


        /*
        for(int i = 1; i < N; i++){
            String A = S.substring(0, i);
            String B = S.substring(i, N);
            out.println(A + " " + B + " " + LCSubStr(A, B));
            max = Math.max(max, LCSubStr(A, B));
        }
        out.println(max);
         */
    }

    public static int LCS(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        if (l1 == 0 || l2 == 0) return 0; // no common strings

        // memorization
        int[][] m = new int[l1][l2];
        int maxLen = 0;

        // set 1st index value
        for (int i = 0; i < l1; i++) {
            if (s1.charAt(i) == s2.charAt(0)) {
                m[i][0] = 1;
                maxLen = 1;
            } else m[i][0] = 0;
        }
        for (int i = 0; i < l2; i++) {
            if (s2.charAt(i) == s1.charAt(0)) {
                m[0][i] = 1;
                maxLen = 1;
            } else m[0][i] = 0;
        }

        // m[i][j] stands for s1.charAt(i) and s2.charAt(j)
        // is the m[i][j] th bit of a common substring
        for (int i = 1; i < l1; i++) {
            for (int j = 1; j < l2; j++) {
                if (s1.charAt(i) != s2.charAt(j)) m[i][j] = 0;
                else {
                    m[i][j] = m[i-1][j-1] + 1;
                    maxLen = (m[i][j] > maxLen)? m[i][j] : maxLen;
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) throws Exception {
        new Main().m();
    }

    void m() throws Exception {
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

        public Long[] nextWrapperLongArray(int n) {
            Long[] res = new Long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong();
            }
            return res;
        }

        public Long[] nextWrapperLongArrayDec(int n) {
            Long[] res = new Long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong() - 1;
            }
            return res;
        }

        public Long[] nextWrapperLongArray1Index(int n) {
            Long[] res = new Long[n + 1];
            for (int i = 0; i < n; i++) {
                res[i + 1] = nextLong();
            }
            return res;
        }
    }
}