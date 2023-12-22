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
 * @author prakharjain
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DBouquet solver = new DBouquet();
        solver.solve(1, in, out);
        out.close();
    }

    static class DBouquet {
        int mod = 1000_000_007;
        long[] fac;
        long[] ifac;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();

            long ans = pow(2, n, mod);

            fac = factorial(200000, mod);
            ifac = factorialInverse(200000, mod);

            ans -= cal(a, n);
            ans %= mod;

            ans -= cal(b, n);
            ans %= mod;

            ans -= 1;
            ans %= mod;

            ans += mod;
            ans %= mod;

            out.println(ans);
        }

        long cal(int a, int n) {
            long ans = 1;

            for (int i = n, j = 0; j < a; i--, j++) {
                ans *= i;
                ans %= mod;
            }

            ans *= ifac[a];

            ans %= mod;

            return ans;
        }

        long[] factorial(int n, int mod) {
            long[] factorial = new long[n + 1];

            factorial[0] = 1;

            for (int i = 1; i <= n; i++) {
                factorial[i] = i * factorial[i - 1];
                factorial[i] %= mod;
            }

            return factorial;
        }

        long[] factorialInverse(int n, int mod) {
            long[] factorialInverse = new long[n + 1];

            long[] inv = new long[n + 1];

            inv[1] = 1;

            for (int i = 2; i <= n; i++) {
                inv[i] = inv[mod % i];
                inv[i] *= (mod - mod / i);
                inv[i] %= mod;
            }

            factorialInverse[0] = 1;

            for (int i = 1; i <= n; i++) {
                factorialInverse[i] = inv[i] * factorialInverse[i - 1];
                factorialInverse[i] %= mod;
            }

            return factorialInverse;
        }

        long pow(long a, long p, int mod) {
            if (p == 0) {
                return 1;
            }

            long t = pow(a, p / 2, mod);

            if (p % 2 != 0) {
                return (((t * t) % mod) * a) % mod;
            } else {
                return (t * t) % mod;
            }
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

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
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

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

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

        public void println(long i) {
            writer.println(i);
        }

    }
}

