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
 * @author Pranay2516
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Atcode_E solver = new Atcode_E();
        solver.solve(1, in, out);
        out.close();
    }

    static class Atcode_E {
        int[] weights = new int[100];
        int[] values = new int[100];
        long[][] dp = new long[100][100001];

        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt(), w = in.nextInt();
            long ans = (long) Math.pow(10, 18);
            for (int i = 0; i < n; ++i) {
                weights[i] = in.nextInt();
                values[i] = in.nextInt();
            }
            for (int i = 0; i < 100; ++i) for (int j = 0; j < 100001; ++j) dp[i][j] = (long) Math.pow(10, 18);
            dp[0][0] = 0;
            dp[0][values[0]] = weights[0];
            for (int i = 1; i < n; ++i) {
                dp[i][0] = 0;
                for (int j = 1; j < 100001; ++j) {
                    dp[i][j] = dp[i - 1][j];
                    if (j >= values[i]) dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - values[i]] + weights[i]);
                }
            }
            for (int i = 100000; i >= 0; --i) {
                if (dp[n - 1][i] <= w) {
                    ans = i;
                    break;
                }
            }
            out.println(ans);
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
            if (numChars == -1) throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

