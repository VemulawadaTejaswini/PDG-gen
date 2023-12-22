import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;

public class Main {
    static int[][] dp;

    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);

        int N = ir.nextInt();
        int K = ir.nextInt();
        int[] a = ir.nextIntArray(N);

        dp = new int[2][K+1];

        for(int i=0; i<2; i++) {
            Arrays.fill(dp[i], -1);
        }

        Arrays.sort(a);

        computeWinner(K, a);

        System.out.println(dp[0][K] == 0 ? "First" : "Second");
    }

    private static void computeWinner(int k, int[] a) {
        for(int i=0; i<a[0]; i++) {
            dp[0][i] = 1;
            dp[1][i] = 0;
        }

        for(int i=a[0]; i<=k; i++) {
            for(int j=0; j<a.length; j++) {
                if(i - a[j] < 0) {
                    break;
                }

                if(dp[1][i-a[j]] == 0) {
                    dp[0][i] = 0;
                    break;
                }
            }

            if(dp[0][i] == -1) {
                dp[0][i] = 1;
            }

            for(int j=0; j<a.length; j++) {
                if(i - a[j] < 0) {
                    break;
                }

                if(dp[0][i-a[j]] == 1) {
                    dp[1][i] = 1;
                    break;
                }
            }

            if(dp[1][i] == -1) {
                dp[1][i] = 0;
            }
        }
    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[8192];
        private int curChar, snumChars;
        private SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int snext() {
            if (snumChars == -1)
                throw new InputMismatchException();
            if (curChar >= snumChars) {
                curChar = 0;
                try {
                    snumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (snumChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = snext();
            while (isSpaceChar(c))
                c = snext();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = snext();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = snext();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public long nextLong() {
            int c = snext();
            while (isSpaceChar(c))
                c = snext();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = snext();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = snext();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int[] nextIntArray(int n) {
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public String readString() {
            int c = snext();
            while (isSpaceChar(c))
                c = snext();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = snext();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }
}