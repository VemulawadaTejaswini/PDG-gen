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
 * @author gaidash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DWeLoveABC solver = new DWeLoveABC();
        solver.solve(1, in, out);
        out.close();
    }

    static class DWeLoveABC {
        final static private int MOD = (int) 1e9 + 7;

        private int modMul3(int num) {
            return (((num + num) % MOD) + num) % MOD;
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            final int NULL = 0;
            final int A = 1;
            final int B = 2;
            final int C = 3;
            final int SIZE = 4;

            String s = in.nextString();

            int n = s.length();
            // dp[last][len] - number of ways to make sequences ending in 'last' character after checking substring from 0 to len
            int[][] dp = new int[SIZE][n + 1];
            dp[NULL][0] = 1;
            for (int i = 1; i <= n; i++) {
                char ch = s.charAt(i - 1);
                if (ch == 'A') {
                    dp[NULL][i] = dp[NULL][i - 1];
                    dp[A][i] = (dp[A][i - 1] + dp[NULL][i - 1]) % MOD;
                    dp[B][i] = dp[B][i - 1];
                    dp[C][i] = dp[C][i - 1];
                } else if (ch == 'B') {
                    dp[NULL][i] = dp[NULL][i - 1];
                    dp[A][i] = dp[A][i - 1];
                    dp[B][i] = (dp[B][i - 1] + dp[A][i - 1]) % MOD;
                    dp[C][i] = dp[C][i - 1];
                } else if (ch == 'C') {
                    dp[NULL][i] = dp[NULL][i - 1];
                    dp[A][i] = dp[A][i - 1];
                    dp[B][i] = dp[B][i - 1];
                    dp[C][i] = (dp[C][i - 1] + dp[B][i - 1]) % MOD;
                } else if (ch == '?') {
                    dp[NULL][i] = modMul3(dp[NULL][i - 1]);
                    dp[A][i] = (modMul3(dp[A][i - 1]) + dp[NULL][i - 1]) % MOD;
                    dp[B][i] = (modMul3(dp[B][i - 1]) + dp[A][i - 1]) % MOD;
                    dp[C][i] = (modMul3(dp[C][i - 1]) + dp[B][i - 1]) % MOD;
                } else {
                    throw new RuntimeException();
                }
            }

            out.println(dp[C][n]);
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

        public void println(int i) {
            writer.println(i);
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

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

