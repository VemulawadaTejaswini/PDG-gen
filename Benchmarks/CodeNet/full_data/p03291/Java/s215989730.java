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
 * @author DY
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
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            char[] S = in.readString().toCharArray();
            int n = S.length;
            long[][] dp = new long[n + 1][4];
            dp[0][0] = 1;
            long MOD = (long) (1e9 + 7);
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < 4; ++j)
                    if (dp[i][j] != 0) {
                        char c = (char) ('A' + j);
                        if ((S[i] == c || S[i] == '?') && j + 1 < 4) {
                            dp[i + 1][j + 1] += dp[i][j];
                            if (dp[i + 1][j + 1] >= MOD) dp[i + 1][j + 1] -= MOD;
                        }
                        if (S[i] == '?')
                            dp[i + 1][j] = (dp[i + 1][j] + dp[i][j] * 3L) % MOD;
                        else
                            dp[i + 1][j] = (dp[i + 1][j] + dp[i][j]) % MOD;
                    }
            }
            long ans = dp[n][3];
            out.printLine(ans);
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

        public void printLine(long i) {
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

        public String readString() {
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

