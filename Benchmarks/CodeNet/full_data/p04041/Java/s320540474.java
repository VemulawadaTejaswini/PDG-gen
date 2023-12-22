import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Sparsh Sanchorawala
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EIrohaAndHaiku solver = new EIrohaAndHaiku();
        solver.solve(1, in, out);
        out.close();
    }

    static class EIrohaAndHaiku {
        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int n = s.nextInt(), x = s.nextInt(), y = s.nextInt(), z = s.nextInt();
            int haiku = (1 << (x - 1)) + (1 << (x + y - 1)) + (1 << (x + y + z - 1));
            int k = 1 << (x + y + z);
            long res = 0;
            long[][] dp = new long[n + 1][k];
            dp[0][0] = 1;
            long mod = (long) 1e9 + 7;
            for (int i = 0; i < n; i++) {
                res = res * 10 % mod;
                for (int mask = 0; mask < (1 << x + y + z); mask++) {
                    for (int d = 1; d <= 10; d++) {
                        int nmask = ((mask << d) | (1 << (d - 1))) & (k - 1);
                        if ((nmask & haiku) == haiku) {
                            res = (res + dp[i][mask]) % mod;
                        } else {
                            dp[i + 1][nmask] = (dp[i + 1][nmask] + dp[i][mask]) % mod;
                        }
                    }
                }
            }
            w.println(res);
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

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
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

