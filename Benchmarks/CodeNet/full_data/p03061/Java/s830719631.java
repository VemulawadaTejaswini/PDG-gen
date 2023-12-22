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
 * @author Ribhav
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CGCDOnBlackboard solver = new CGCDOnBlackboard();
        solver.solve(1, in, out);
        out.close();
    }

    static class CGCDOnBlackboard {
        public void solve(int testNumber, FastReader s, PrintWriter out) {
            int n = s.nextInt();
            int[] arr = s.nextIntArray(n);
            int[] prefix = new int[n];
            int[] suffix = new int[n];
            prefix[0] = arr[0];
            for (int i = 1; i < n; i++) {
                prefix[i] = CGCDOnBlackboard.Maths.gcd(prefix[i - 1], arr[i]);
            }

            suffix[n - 1] = arr[n - 1];

            for (int i = n - 2; i >= 0; i--) {
                suffix[i] = CGCDOnBlackboard.Maths.gcd(suffix[i + 1], arr[i]);
            }

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    max = Math.max(max, suffix[1]);
                } else if (i == n - 1) {
                    max = Math.max(max, prefix[i - 1]);
                } else {
                    max = Math.max(max, CGCDOnBlackboard.Maths.gcd(suffix[i + 1], prefix[i - 1]));
                }
            }
            out.println(max);
        }

        private static class Maths {
            private static int gcd(int a, int b) {
                if (b == 0) {
                    return a;
                }

                return gcd(b, a % b);
            }

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

        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; ++i) array[i] = nextInt();
            return array;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

