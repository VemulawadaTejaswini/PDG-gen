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
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ngfam
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DSwapAndFlip solver = new DSwapAndFlip();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSwapAndFlip {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            int a[] = new int[n + n];
            for (int i = 0; i < n; ++i) {
                a[i << 1] = in.nextInt();
            }
            for (int i = 0; i < n; ++i) {
                a[i << 1 | 1] = in.nextInt();
            }

            int f[][] = new int[1 << n][n + n];
            for (int i = 0; i < (1 << n); ++i) {
                f[i] = new int[n + n];
                Arrays.fill(f[i], 1000006);
            }

            int ans = 1000006;

            f[0][0] = 0;
            for (int mask = 0; mask < (1 << n); ++mask) {
                int pos = Integer.bitCount(mask);
                for (int v = 0; v < n + n; ++v) {
                    int cst = 0;
                    for (int i = 0; i < n; ++i) {
                        if ((mask >> i & 1) > 0) continue;
                        int w = Math.abs(pos - i) % 2;
                        if (a[i << 1 | w] >= a[v] || pos == 0) {
                            f[mask ^ (1 << i)][i << 1 | w] = Math.min(f[mask ^ (1 << i)][i << 1 | w], f[mask][v] + cst);
                        }
                        cst++;
                    }
                    if (pos == n) ans = Math.min(ans, f[mask][v]);
                }
            }
            out.println((ans == 1000006 ? -1 : ans));
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

        public void println(int i) {
            writer.println(i);
        }

    }
}

