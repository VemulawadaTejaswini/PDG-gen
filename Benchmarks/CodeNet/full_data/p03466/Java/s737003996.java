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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public char f(int a, int b, int pos) {
            if (a == b) {
                return pos % 2 == 0 ? 'A' : 'B';
            }
            if (b > a) {
                return (char) (f(b, a, b + a - pos - 1) ^ 'A' ^ 'B');
            }
            int mx = (a + b) / (b + 1);
            int lo = 0, hi = a / mx;
            while (lo < hi) {
                int mid = (lo + hi + 1) / 2;
                int useda = mid * mx;
                int usedb = mid;
                int lefta = a - useda;
                int leftb = b - usedb;

                if (lefta < 0 || leftb < 0) {
                    hi = mid - 1;
                    continue;
                }

                if (leftb - lefta >= mx) {
                    hi = mid - 1;
                    continue;
                }

                lo = mid;
            }
            int useda = lo * mx;
            int usedb = lo;
            int lefta = a - useda;
            int leftb = b - usedb;

            if (leftb == 0 && a + b - pos <= lefta) {
                return 'A';
            }

            if (a + b - pos <= leftb - lefta) {
                return 'B';
            }

            if (pos < hi * (mx + 1)) {
                if (pos % (mx + 1) == mx) {
                    return 'B';
                } else {
                    return 'A';
                }
            }
            pos -= hi * (mx + 1);
            return (pos % 2 == 1) ? 'A' : 'B';
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int q = in.nextInt();
            while (q-- > 0) {
                int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
                for (int i = c; i <= d; i++) out.print(f(a, b, i - 1));
                out.println();
            }
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

        public void println() {
            writer.println();
        }

        public void print(char i) {
            writer.print(i);
        }

        public void close() {
            writer.close();
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1 << 16];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (this.numChars == -1) {
                throw new InputMismatchException();
            } else {
                if (this.curChar >= this.numChars) {
                    this.curChar = 0;

                    try {
                        this.numChars = this.stream.read(this.buf);
                    } catch (IOException var2) {
                        throw new InputMismatchException();
                    }

                    if (this.numChars <= 0) {
                        return -1;
                    }
                }

                return this.buf[this.curChar++];
            }
        }

        public int nextInt() {
            int c;
            for (c = this.read(); isSpaceChar(c); c = this.read()) {
                ;
            }

            byte sgn = 1;
            if (c == 45) {
                sgn = -1;
                c = this.read();
            }

            int res = 0;

            while (c >= 48 && c <= 57) {
                res *= 10;
                res += c - 48;
                c = this.read();
                if (isSpaceChar(c)) {
                    return res * sgn;
                }
            }

            throw new InputMismatchException();
        }

        public static boolean isSpaceChar(int c) {
            return c == 32 || c == 10 || c == 13 || c == 9 || c == -1;
        }

    }
}

