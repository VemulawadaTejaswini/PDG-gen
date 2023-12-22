import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Spandan Mishra
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FSelectHalf solver = new FSelectHalf();
        solver.solve(1, in, out);
        out.close();
    }

    static class FSelectHalf {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.readInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = in.readInt();

            System.out.println(selectHalf(a, n));

        }

        long selectHalf(int[] a, int n) {
            long[][] dp = new long[n / 2 + 1][n + 1]; // cnt x n
            for (int i = 0; i < dp.length; i++)
                for (int j = 0; j < dp[i].length; j++)
                    dp[i][j] = Long.MIN_VALUE;

            long ans = shUtils(0, 0, a, n, dp); // cnt and index passed
            return ans;
        }

        long shUtils(int cnt, int curr, int[] a, int n, long[][] dp) {
            if (cnt >= n / 2) {
                return 0;
            }

            if (curr >= n) {
                return Long.MIN_VALUE;
            }


            if (dp[cnt][curr] != Long.MIN_VALUE)
                return dp[cnt][curr];

            long tmp = shUtils(cnt + 1, curr + 2, a, n, dp);
            long choice1;
            if (tmp == Long.MIN_VALUE)
                choice1 = tmp;
            else
                choice1 = a[curr] + tmp;

            long choice2 = shUtils(cnt, curr + 1, a, n, dp);

            dp[cnt][curr] = Math.max(choice1, choice2);
            return dp[cnt][curr];

//        return Math.max(choice1, choice2);


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
            if (numChars == -1)
                throw new RuntimeException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int readInt() {
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
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

