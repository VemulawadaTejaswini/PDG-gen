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
import java.util.TreeSet;
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
        ENonTriangularTriplets solver = new ENonTriangularTriplets();
        solver.solve(1, in, out);
        out.close();
    }

    static class ENonTriangularTriplets {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            int k = in.readInt();

            if (k == 1) {
                for (int i = 0; i < n; i++) {
                    out.printLine((i + 1) + " " + (2 * n - i) + " " + (2 * n + 1 + i));
                }
                return;
            }

            if (n < k * 2 - 1) {
                out.printLine(-1);
                return;
            }

            int[] ans = new int[3 * n];
            for (int i = 0; i < 3 * n; i++) {
                ans[i] = k + i;
            }

            int x = n;
            if (x % 2 == 0) x--;
            int xx = x / 2;
            int xx2 = x - xx;

            for (int i = 0; i < xx; i++) {
                if (i > xx - 1 - i) continue;
                int tmp = ans[i];
                ans[i] = ans[xx - 1 - i];
                ans[xx - 1 - i] = tmp;
            }
            for (int i = xx; i < xx + xx2; i++) {
                if (i > n - 1 - (i - xx)) continue;
                int tmp = ans[i];
                ans[i] = ans[n - 1 - (i - xx)];
                ans[n - 1 - (i - xx)] = tmp;
            }

            TreeSet<Integer> set = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                set.add(k + 2 * n + i);
            }
            for (int i = 0; i < n; i++) {
                int sum = ans[i] + ans[2 * n - 1 - i];
                int g = set.ceiling(sum);
                out.printLine(ans[i] + " " + ans[2 * n - 1 - i] + " " + g);
                set.remove(g);
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

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void printLine(Object... objects) {
            print(objects);
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
}

