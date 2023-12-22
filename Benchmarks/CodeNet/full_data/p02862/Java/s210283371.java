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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DKnight solver = new DKnight();
        solver.solve(1, in, out);
        out.close();
    }

    static class DKnight {
        public void solve(int testNumber, FastReader s, PrintWriter out) {
            int x = s.nextInt();
            int y = s.nextInt();

            if (y < x) {
                int temp = x;
                x = y;
                y = temp;
            }

            if (y > 2 * x) {
                out.println("0");
            } else {

                int a = x;
                int b = (2 * x - y) / 3;
                int a1 = x % 3;
                int b1 = y % 3;
                a -= b;

                if ((a1 == 2 && b1 == 1) || (a1 == 1 && b1 == 2) || (a1 == 0 && b1 == 0)) {

                    long ans = nCrModPFermat(a, b, 1000000007L);
                    out.println(ans);
                } else {
                    out.println(0);
                }
            }

//        out.println(Arrays.deepToString(ans));
        }

        static long power(long x, long y, long p) {

            // Initialize result
            long res = 1L;

            // Update x if it is more than or
            // equal to p
            x = x % p;

            while (y > 0) {

                // If y is odd, multiply x
                // with result
                if (y % 2 == 1)
                    res = (res * x) % p;

                // y must be even now
                y = y >> 1; // y = y/2
                x = (x * x) % p;
            }

            return res;
        }

        static long modInverse(long n, long p) {
            return power(n, p - 2, p);
        }

        static long nCrModPFermat(int n, int r,
                                  long p) {

            // Base case
            if (r == 0)
                return 1;

            // Fill factorial array so that we
            // can find all factorial of r, n
            // and n-r
            long[] fac = new long[n + 1];
            fac[0] = 1;

            for (int i = 1; i <= n; i++)
                fac[i] = fac[i - 1] * i % p;

            return (fac[n] * modInverse(fac[r], p)
                    % p * modInverse(fac[n - r], p)
                    % p) % p;
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

