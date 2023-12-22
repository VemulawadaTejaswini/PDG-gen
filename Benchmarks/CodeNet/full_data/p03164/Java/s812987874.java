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
 *
 * @author KharYusuf
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EKnapsack2 solver = new EKnapsack2();
        solver.solve(1, in, out);
        out.close();
    }

    static class EKnapsack2 {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), W = s.nextInt();
            long sumw = 0;
            int sumv = 0;
            int[] v = new int[n + 1], wi = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                sumw += wi[i] = s.nextInt();
                sumv += v[i] = s.nextInt();
            }
            long[][] dp = new long[n + 1][sumv + 1];
            for (int i = 0; i <= n; i++) {
                Arrays.fill(dp[i], sumw);
                dp[i][0] = 0;
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= sumv; j++) {
                    dp[i][j] = dp[i - 1][j];
                    if (j - v[i] < 0) continue;
                    dp[i][j] = Math.min(dp[i - 1][j - v[i]] + wi[i], dp[i][j]);
                }
            }
            int ans = 0;
            for (int i = 1; i <= sumv; i++) if (dp[n][i] <= W) ans = i;
            w.println();
            w.println(ans);
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

        public int nextInt() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;

            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();

                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
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

