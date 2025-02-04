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
 * @author lewin
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        EMajorityOfBalls solver = new EMajorityOfBalls();
        solver.solve(1, in, out);
        out.close();
    }

    static class EMajorityOfBalls {
        InputReader in;
        OutputWriter out;
        int n;

        boolean ask_consec(int start) {
            out.print("?");
            for (int i = 0; i < n; i++) out.print(" " + (start + i));
            out.println();
            out.flush();
            return in.next().equals("Red");
        }

        public void solve(int testNumber, InputReader _in, OutputWriter _out) {
            in = _in;
            out = _out;
            n = in.nextInt();
            int lo = 1, hi = n + 1;
            boolean r1 = ask_consec(1);
            // lo is r1, hi is !r1;
            while (lo + 1 < hi) {
                int mid = (lo + hi) / 2;
                if (ask_consec(mid) == r1) lo = mid;
                else hi = mid;
            }
            char[] ret = new char[2 * n];
            for (int i = 1; i <= 2 * n; i++) {
                out.print("?");
                out.print(" " + i);
                int s = hi;
                if (s <= i && i <= s + n - 2) {
                    if (s <= n) s += n;
                    else s -= n;
                }
                for (int j = 0; j < n - 1; j++) out.print(" " + (s + j));
                out.println();
                out.flush();
                ret[i - 1] = in.next().charAt(0);
            }
            out.println("! " + new String(ret));
            out.flush();
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

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void println() {
            writer.println();
        }

        public void println(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

        public void flush() {
            writer.flush();
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

        public String next() {
            int c;
            while (isSpaceChar(c = this.read())) {
                ;
            }

            StringBuilder result = new StringBuilder();
            result.appendCodePoint(c);

            while (!isSpaceChar(c = this.read())) {
                result.appendCodePoint(c);
            }

            return result.toString();
        }

        public static boolean isSpaceChar(int c) {
            return c == 32 || c == 10 || c == 13 || c == 9 || c == -1;
        }

    }
}

