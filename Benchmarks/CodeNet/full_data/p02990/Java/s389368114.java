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
        DBlueAndRedBalls solver = new DBlueAndRedBalls();
        solver.solve(1, in, out);
        out.close();
    }

    static class DBlueAndRedBalls {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            int b = in.readInt();
            int r = n - b;

            Modulo m = new Modulo(MiscUtils.MOD7);
            Combination c = new Combination(4000, MiscUtils.MOD7);

            out.printLine(r + 1);

            for (int i = 2; i <= b; i++) {
                long ans = 0;
                long hb = c.hMod(b - i, i);
                if (r >= i - 1) {
                    long rb = c.hMod(r - (i - 1), i - 1);
                    ans = m.add(ans, m.mlt(hb, rb));
                }
                if (r >= i) {
                    long rb = c.hMod(r - i, i);
                    ans = m.add(ans, 2 * m.mlt(hb, rb));
                }
                if (r >= i + 1) {
                    long rb = c.hMod(r - (i + 1), i + 1);
                    ans = m.add(ans, m.mlt(hb, rb));
                }
                out.printLine(ans);
            }
        }

    }

    static class MiscUtils {
        public static final int MOD7 = (int) (1e9 + 7);

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

        public void printLine(long i) {
            writer.println(i);
        }

        public void printLine(int i) {
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

        public int readInt() {
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

    static class Combination {
        Modulo modulo;
        long[] nors;
        long[] revs;

        public Combination(int n, long m) {
            nors = new long[n + 1];
            revs = new long[n + 1];
            modulo = new Modulo(m);

            nors[0] = 1;
            for (int i = 1; i <= n; i++) {
                nors[i] = modulo.mlt(nors[i - 1], i);
            }

            revs[n] = modulo.rev(nors[n]);
            for (int i = n - 1; i >= 0; i--) {
                revs[i] = (revs[i + 1] * (i + 1)) % m;
            }
        }

        public long hMod(int n, int k) {
            long ret = nors[n + k - 1];
            ret = modulo.mlt(ret, revs[n]);
            ret = modulo.mlt(ret, revs[k - 1]);
            return ret;
        }

    }

    static class Modulo {
        long m;

        public Modulo(long m) {
            this.m = m;
        }

        public long add(long a, long b) {
            if (b < 0) b += (b / m + 1) * m;
            return (a + b) % m;
        }

        public long mlt(long a, long b) {
            return (a * b) % m;
        }

        public long rev(long a) {
            return pow(a, m - 2);
        }

        public long pow(long a, long x) {
            long ans = 1 % m;
            while (x > 0) {
                if ((x & 1) != 0) {
                    ans = (ans * a) % m;
                }
                x >>= 1;
                a = (a * a) % m;
            }
            return ans;
        }

    }
}

