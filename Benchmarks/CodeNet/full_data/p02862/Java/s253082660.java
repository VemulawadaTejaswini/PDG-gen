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
        DKnight solver = new DKnight();
        solver.solve(1, in, out);
        out.close();
    }

    static class DKnight {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int x = in.readInt();
            int y = in.readInt();

            if ((x + y) % 3 != 0) {
                out.printLine(0);
                return;
            }

            int p = (x + y) / 3;
            x -= p;
            y -= p;

            if (x <= 0 || y <= 0) {
                out.printLine(0);
                return;
            }

            Modulo.mod = MiscUtils.MOD7;
            Modulo.buildCombination(1000005);

            out.printLine(Modulo.c(x + y, x));
        }

    }

    static class Modulo {
        public static long mod;
        private long value;
        public static long[] nors;
        public static long[] revs;

        public Modulo(long value) {
            this.value = (value % mod + mod) % mod;
        }

        public static long mlt(long a, long b) {
            return ((a % mod + mod) * (b % mod + mod)) % mod;
        }

        public static long rev(long a) {
            //return pow(a, mod - 2);
            return (Euclid.extgcd(a, mod, new long[3])[0] % mod + mod) % mod;
        }

        public Modulo mlt(long a) {
            setValue(mlt(value, a));
            return this;
        }

        public static void buildCombination(int n) {
            nors = new long[n + 1];
            revs = new long[n + 1];

            nors[0] = 1;
            for (int i = 1; i <= n; i++) {
                nors[i] = mlt(nors[i - 1], i);
            }

            revs[n] = rev(nors[n]);
            for (int i = n - 1; i >= 0; i--) {
                revs[i] = mlt(revs[i + 1], i + 1);
            }
        }

        public static long c(int n, int k) {
            return n - k < 0 ? 0 : new Modulo(nors[n]).mlt(revs[k]).mlt(revs[n - k]).getValue();
        }

        public long getValue() {
            return value;
        }

        public void setValue(long value) {
            this.value = value;
        }

        public String toString() {
            return "" + value;
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

    static class MiscUtils {
        public static final int MOD7 = (int) (1e9 + 7);

    }

    static class Euclid {
        public static long[] extgcd(long a, long b, long[] is) {
            if (a == 0) {
                is[0] = 0;
                is[1] = 1;
                is[2] = b;
            } else {
                extgcd(b % a, a, is);
                long x = is[1] - b / a * is[0];
                is[1] = is[0];
                is[0] = x;
            }
            return is;
        }

    }
}

