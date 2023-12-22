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
        CSyntheticKadomatsu solver = new CSyntheticKadomatsu();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSyntheticKadomatsu {
        int[] l;
        int n;
        int a;
        int b;
        int c;
        int ans = Integer.MAX_VALUE;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            n = in.nextInt();

            a = in.ni();

            b = in.ni();
            c = in.ni();

            l = in.nextIntArray(n);

            bt(0, 0, 0, 0, 0, 0, 0);

            out.println(ans);
        }

        void bt(int i, int ca, int cb, int cc, int ta, int tb, int tc) {
            if (i == n) {
                if (ta == 0 || tb == 0 || tc == 0)
                    return;
                int mp = 0;
                mp += Math.max(0, ta - 1) * 10;
                mp += Math.max(0, tb - 1) * 10;
                mp += Math.max(0, tc - 1) * 10;

                mp += Math.abs(ca - a);
                mp += Math.abs(cb - b);
                mp += Math.abs(cc - c);

                ans = Math.min(ans, mp);

                return;
            }

            for (int j = 0; j < 4; j++) {
                if (j == 1) {
                    ca += l[i];
                    bt(i + 1, ca, cb, cc, ta + 1, tb, tc);
                    ca -= l[i];
                } else if (j == 2) {
                    cb += l[i];
                    bt(i + 1, ca, cb, cc, ta, tb + 1, tc);
                    cb -= l[i];
                } else if (j == 3) {
                    cc += l[i];
                    bt(i + 1, ca, cb, cc, ta, tb, tc + 1);
                    cc -= l[i];
                } else {
                    bt(i + 1, ca, cb, cc, ta, tb, tc);
                }
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

        public void close() {
            writer.close();
        }

        public void println(int i) {
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

        public int ni() {
            return nextInt();
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

