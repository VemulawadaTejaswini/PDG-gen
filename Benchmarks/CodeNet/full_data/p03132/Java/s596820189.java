import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public static final long oo = Long.MAX_VALUE;

        public void solve(int testNumber, FastReader in, PrintWriter out) {
            final int n = in.nextInt();
            int[] a = in.nextIntArray(n);

            long[][] dp = new long[n + 1][5];
            ArrayUtils.fill(dp, oo >> 1);
            dp[0][0] = 0;
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < 5; ++j) {
                    for (int k = j; k < 5; ++k) {
                        if (k == 1 || k == 3) {
                            dp[i + 1][k] = Math.min(dp[i + 1][k], dp[i][j] + (a[i] == 0 ? 2 : a[i] % 2));
                        }
                        if (k == 0 || k == 4) {
                            dp[i + 1][k] = Math.min(dp[i + 1][k], dp[i][j] + a[i]);
                        }
                        if (k == 2) {
                            dp[i + 1][k] = Math.min(dp[i + 1][k], dp[i][j] + (a[i] + 1) % 2);
                        }
                    }
                }
            }
            long ans = oo;
            for (long v : dp[n]) ans = Math.min(ans, v);
            out.println(ans);
        }

    }

    static class ArrayUtils {
        public static void fill(long[][] array, long value) {
            for (long[] row : array) {
                Arrays.fill(row, value);
            }
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[8192];
        private int curChar;
        private int pnumChars;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        private int pread() {
            if (pnumChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= pnumChars) {
                curChar = 0;
                try {
                    pnumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (pnumChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = pread();
            while (isSpaceChar(c))
                c = pread();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = pread();
            }
            int res = 0;
            do {
                if (c == ',') {
                    c = pread();
                }
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = pread();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = nextInt();
            }
            return array;
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

