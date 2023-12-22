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
        EGolf solver = new EGolf();
        solver.solve(1, in, out);
        out.close();
    }

    static class EGolf {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            long k = in.readLong();
            long x = in.readLong();
            long y = in.readLong();

            if (k % 2 == 0 && (x + y) % 2 == 1) {
                out.printLine(-1);
                return;
            }

            int cnt = 0;
            while (x < 0 || y < 0) {
                cnt++;
                long t = x;
                x = -y;
                y = t;
            }

            boolean flag = false;
            if (x < y) {
                flag = true;
                long t = x;
                x = y;
                y = t;
            }

            int n = (int) ((x + y + k - 1) / k);
            if (x + y < k) n++;
            if ((n * k) % 2 != (x + y) % 2) n++;

            long tx;
            long ty;
            if (x + y < k && (x + y) % 2 == 1) {
                ty = y + k - x;
                tx = -(2 * k - ty) / 2;
            } else {
                tx = 0;
                ty = y + (n * k - x - y) / 2;
            }

            out.printLine(n);
            long[][] ans = new long[n][2];
            int idx = 0;
            long v = -k;
            for (; v >= tx; v -= k) {
                ans[idx++] = new long[]{v, 0};
            }
            v = (-tx / k + 1) * k + tx;
            for (; v <= ty; v += k) {
                ans[idx++] = new long[]{tx, v};
            }
            v = tx + ((-tx + ty) / k + 1) * k + tx - ty;
            for (; v <= x; v += k) {
                ans[idx++] = new long[]{v, ty};
            }
            v = ty - (((-2 * tx + ty + x) / k + 1) * k + 2 * tx - ty - x);
            for (; v >= y; v -= k) {
                ans[idx++] = new long[]{x, v};
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 4 - cnt; j++) {
                    long t = ans[i][0];
                    ans[i][0] = -ans[i][1];
                    ans[i][1] = t;
                }
                if (flag) {
                    long t = ans[i][0];
                    ans[i][0] = ans[i][1];
                    ans[i][1] = t;
                }
                out.printLine(ans[i]);
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

        public void print(long[] array) {
            for (int i = 0; i < array.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(array[i]);
            }
        }

        public void printLine(long[] array) {
            print(array);
            writer.println();
        }

        public void close() {
            writer.close();
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

        public long readLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
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

