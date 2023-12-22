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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DIrohaAndAGrid solver = new DIrohaAndAGrid();
        solver.solve(1, in, out);
        out.close();
    }

    static class DIrohaAndAGrid {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();

            int mod = 1_000_000_007;
            Mod_nCr mn = new Mod_nCr(mod, 210000);

            long ans = 0L;
            for (int i = b + 1; i <= w; i++) {
                long x = mn.nCr(h - a + i - 2, i - 1);
                long y = mn.nCr(a - 1 + w - i, w - i);
                ans += ((x % mod) * (y % mod)) % mod;
            }

            out.println(ans % mod);
        }

    }

    static class Mod_nCr {
        int mod;
        long[] fact;
        long[] rfact;

        public Mod_nCr(int mod, int max) {
            this.mod = mod;
            fact = new long[max];
            rfact = new long[max];

            fact[0] = 1;
            rfact[0] = 1;

            for (int i = 1; i < max; i++) {
                fact[i] = (fact[i - 1] * i) % mod;
                rfact[i] = mod_inverse(fact[i], mod);
            }
        }

        private long mod_pow(long x, long p, long m) {
            long a = 1;
            while (p > 0) {
                if (p % 2 == 1) {
                    a = a * x % m;
                }
                x = x * x % m;
                p /= 2;
            }
            return a;
        }

        private long mod_inverse(long a, long m) {
            return mod_pow(a, m - 2, m);
        }

        public long nCr(int n, int r) {
            return fact[n] * rfact[r] % mod * rfact[n - r] % mod;
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

