import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Comparator;
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
        XTower solver = new XTower();
        solver.solve(1, in, out);
        out.close();
    }

    static class XTower {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            XTower.Item[] its = new XTower.Item[n];
            for (int i = 0; i < n; i++) {
                its[i] = new XTower.Item(in.nextInt(), in.nextInt(), in.nextInt());
            }
            Arrays.sort(its, Comparator.comparingInt(x -> x.w + x.s));
            long[] best = new long[100010];
            for (int i = 0; i < n; i++) {
                for (int bs = its[i].s; bs >= 0; bs--) {
                    int nd = bs + its[i].w;
                    best[nd] = Math.max(best[nd], best[bs] + its[i].v);
                }
            }
            out.println(AUtils.max(best));
        }

        static class Item {
            public int w;
            public int s;
            public int v;

            public Item(int w, int s, int v) {
                this.w = w;
                this.s = s;
                this.v = v;
            }

        }

    }

    static class AUtils {
        public static long max(long[] arr) {
            long res = arr[0];
            for (long x : arr) if (x > res) res = x;
            return res;
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

