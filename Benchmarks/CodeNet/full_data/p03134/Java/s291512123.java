import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author prakharjain
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        FPass solver = new FPass();
        solver.solve(1, in, out);
        out.close();
    }

    static class FPass {
        int mod = 998244353;

        public void solve(int testNumber, InputReader in, OutputWriter out) {

            String s = in.next();

            int n = s.length();

            int[] r = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    r[i] += 2;
                } else if (s.charAt(i) == '1') {
                    r[i]++;
                    b[i]++;
                } else {
                    b[i] += 2;
                }
            }

            int[] pr = in.calculatePrefixSum(r);
            int[] pb = in.calculatePrefixSum(b);

            int[][] dp = new int[2 * n][2 * n + 1];

            if (r[0] > 0) {
                dp[0][1] = 1;
            }

            if (b[0] > 0) {
                dp[0][0] = 1;
            }

            for (int i = 1; i < 2 * n; i++) {
                for (int j = 0; j <= Math.min(i, pr[Math.min(i - 1, n - 1)]); j++) {
                    int maxi = Math.min(i, n - 1);
                    if (pr[maxi] > j) {
                        dp[i][j + 1] += dp[i - 1][j];
                        dp[i][j + 1] %= mod;
                    }
                    int bu = i - j;
                    int br = pb[maxi] - bu;

                    if (br > 0) {
                        dp[i][j] += dp[i - 1][j];
                        dp[i][j] %= mod;
                    }
                }
            }

            long ans = 0;

            for (int i = 0; i <= 2 * n; i++) {
                ans += dp[2 * n - 1][i];
                ans %= mod;
            }

            out.println(ans);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public String nextString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public String next() {
            return nextString();
        }

        public int[] calculatePrefixSum(int[] a) {
            int n = a.length;

            int[] prefixSum = new int[n];

            prefixSum[0] = a[0];

            for (int i = 1; i < n; i++) {
                prefixSum[i] = prefixSum[i - 1] + a[i];
            }

            return prefixSum;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void println(long i) {
            writer.println(i);
        }

    }
}

