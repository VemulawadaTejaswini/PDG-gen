import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Aman Kumar Singh
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EAllYouCanEat solver = new EAllYouCanEat();
        solver.solve(1, in, out);
        out.close();
    }

    static class EAllYouCanEat {
        int MAXN = 6005;
        PrintWriter out;
        InputReader in;
        int n;
        int T;
        long[][] dp = new long[MAXN][MAXN];
        int[][] hola = new int[MAXN][2];

        long go(int ind, int time) {
            if (ind == n)
                return 0;
            if (dp[ind][time] != -1)
                return dp[ind][time];
            long max = 0;
            max = Math.max(max, go(ind + 1, time));
            if (time < T)
                max = Math.max(max, go(ind + 1, time + hola[ind][0] + 1) + hola[ind][1]);
            dp[ind][time] = max;
            return max;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            this.out = out;
            this.in = in;
            n = ni();
            T = ni();
            int i = 0;
            for (i = 0; i < n; i++) {
                hola[i][0] = ni();
                hola[i][1] = ni();
            }
            for (i = 0; i < MAXN; i++)
                Arrays.fill(dp[i], -1);
            pn(go(0, 1));
        }

        int ni() {
            return in.nextInt();
        }

        void pn(long zx) {
            out.println(zx);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new UnknownError();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new UnknownError();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuffer res = new StringBuffer();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));

            return res.toString();
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

