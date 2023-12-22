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
        EFlatten solver = new EFlatten();
        solver.solve(1, in, out);
        out.close();
    }

    static class EFlatten {
        static int mod = 1000000007;
        static int MAXN = 1000100;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            int a[] = in.nextIntArray(n);

            int lowest_prime[] = new int[MAXN];
            for (int i = 2; i < MAXN; ++i) {
                if (lowest_prime[i] == 0) {
                    for (int j = i; j < MAXN; j += i) {
                        lowest_prime[j] = i;
                    }
                }
            }

            int max_power[] = new int[MAXN];
            for (int i = 0; i < n; ++i) {
                int x = a[i], last = 0, cnt = 0;
                while (x > 1) {
                    if (x == 4) {
                        x = 4;
                    }
                    if (lowest_prime[x] != last) cnt = 0;
                    int p = lowest_prime[x];
                    max_power[p] = Math.max(max_power[p], ++cnt);
                    x /= p;
                    last = p;
                }
            }

            long lcm = 1;
            for (int i = 2; i < MAXN; ++i) {
                for (int j = 0; j < max_power[i]; ++j) {
                    lcm = lcm * i % mod;
                }
            }

            long ans = 0;
            for (int i = 0; i < n; ++i) {
                ans += lcm * fpow(a[i], -1) % mod;
                ans = ans % mod;
            }

            out.println(ans);
        }

        private long fpow(long x, int y) {
            if (y < 0) y = y + mod - 1;
            long risan = 1;
            while (y > 0) {
                if (y % 2 == 1) risan = risan * x % mod;
                x = x * x % mod;
                y = y / 2;
            }
            return risan;
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

