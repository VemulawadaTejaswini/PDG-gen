// package agc.agc030;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
    static long __startTime = System.currentTimeMillis();

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        long L = in.nextLong();
        int n = in.nextInt();
        if (n > 2000) {
            throw new RuntimeException();
        }

        long[] x = new long[n];
        for (int i = 0; i < n ; i++) {
            x[i] = in.nextLong();
        }


        long[][][] dp = new long[2][2][n];
        for (int w = 0; w <= 1; w++) {
            Arrays.fill(dp[0][w], -1);
        }
        dp[0][0][0] = x[0];
        dp[0][1][0] = L-x[n-1];

        for (int c = 0 ; c < n-1 ; c++) {
            int fr = c % 2;
            int to = 1 - fr;
            for (int w = 0; w <= 1; w++) {
                Arrays.fill(dp[to][w], -1);
            }
            for (int w = 0 ; w <= 1 ; w++) {
                for (int l = 0 ; l < n ; l++) {
                    int r = l+n-c-1;
                    long now = dp[fr][w][l];
                    if (now == -1) {
                        continue;
                    }
                    if (w == 0) {
                        // go R
                        {
                            long v = now + x[l + 1] - x[l];
                            dp[to][0][l+1] = Math.max(dp[to][0][l + 1], v);
                        }

                        // go L
                        {
                            long v = now + x[l] + (L - x[r]);
                            dp[to][1][l+1] = Math.max(dp[to][1][l+1], v);
                        }
                    } else {
                        // go R
                        {
                            long v = now + (x[r]-x[r-1]);
                            dp[to][1][l] = Math.max(dp[to][1][l], v);
                        }

                        // go L
                        {
                            long v = now + (L-x[r]) + x[l];
                            dp[to][0][l] = Math.max(dp[to][0][l], v);
                        }
                    }
                }
            }
        }


        long best = 0;
        for (int w = 0 ; w <= 1 ; w++) {
            for (int i = 0; i < n ; i++) {
                best = Math.max(best, dp[(n-1)%2][w][i]);
            }
        }
        out.println(best);
        out.flush();
    }

    private static void printTime(String label) {
        debug(label, System.currentTimeMillis() - __startTime);
    }

    private static void debug(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }

    public static class InputReader {
        private static final int BUFFER_LENGTH = 1 << 12;
        private InputStream stream;
        private byte[] buf = new byte[BUFFER_LENGTH];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        private int next() {
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
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public char nextChar() {
            return (char) skipWhileSpace();
        }

        public String nextToken() {
            int c = skipWhileSpace();
            StringBuilder res = new StringBuilder();
            do {
                res.append((char) c);
                c = next();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public int nextInt() {
            return (int) nextLong();
        }

        public long nextLong() {
            int c = skipWhileSpace();
            long sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = next();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = next();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            return Double.valueOf(nextToken());
        }

        int skipWhileSpace() {
            int c = next();
            while (isSpaceChar(c)) {
                c = next();
            }
            return c;
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
    }
}