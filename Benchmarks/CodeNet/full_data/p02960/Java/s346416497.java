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
 * @author KharYusuf
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DDigitsParade solver = new DDigitsParade();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDigitsParade {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            char[] c = s.next().toCharArray();
            int n = c.length;
            long[][] dp = new long[n][13];
            long mod = (long) 1e9 + 7;
            if (c[0] == '?') for (int i = 0; i < 10; i++) dp[0][i] = 1;
            else dp[0][c[0] - '0'] = 1;
            for (int i = 1; i < n; i++) {
                if (c[i] != '?') {
                    for (int j = 0; j < 13; j++) {
                        int cur = j * 10 + c[i] - '0';
                        cur %= 13;
                        dp[i][cur] += dp[i - 1][j];
                        dp[i][cur] %= mod;
                    }
                } else {
                    for (int j = 0; j < 13; j++) {
                        for (int m = 0; m < 10; m++) {
                            int cur = j * 10 + m;
                            cur %= 13;
                            dp[i][cur] += dp[i - 1][j];
                            dp[i][cur] %= mod;
                        }
                    }
                }
            }
            w.println(dp[n - 1][5]);
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {

            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {

                curChar = 0;

                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }

            return buf[curChar++];
        }

        public String next() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            StringBuilder res = new StringBuilder();

            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));

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

