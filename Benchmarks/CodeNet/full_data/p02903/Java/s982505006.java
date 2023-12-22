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
 * @author gaidash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        A01Matrix solver = new A01Matrix();
        solver.solve(1, in, out);
        out.close();
    }

    static class A01Matrix {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int sizeI = in.nextInt();
            int sizeJ = in.nextInt();
            int smallJ = in.nextInt();
            int smallI = in.nextInt();

            if (smallI + smallJ == 0) {
                for (int i = 0; i < sizeI; i++) {
                    for (int j = 0; j < sizeJ; j++) {
                        out.print(0);
                    }
                    out.println();
                }
            }

            if (sizeI == 1) {
                int[] ret = new int[sizeJ];
                for (int i = 0; i < smallJ; i++) {
                    ret[i] = 1;
                }
                for (int val : ret) {
                    out.print(val);
                }
                out.println();
                return;
            }
            if (sizeJ == 1) {
                int[] ret = new int[sizeI];
                for (int i = 0; i < smallI; i++) {
                    ret[i] = 1;
                }
                for (int val : ret) {
                    out.println(val);
                }
                return;
            }

            if (smallI == 0 || smallJ == 0 || sizeJ % smallJ > 0 || sizeI % smallI > 0 || sizeJ / smallJ != sizeI / smallI) {
                out.println(-1);
                return;
            }

            int[][] ret = new int[sizeI][sizeJ];
            int col = 0;
            for (int startI = 0; startI + smallI <= sizeI; startI += smallI) {
                for (int i = startI; i < startI + smallI; i++) {
                    for (int j = col; j < col + smallJ; j++) {
                        ret[i][j] = 1;
                    }
                }
                col += smallJ;
            }

            for (int i = 0; i < sizeI; i++) {
                for (int j = 0; j < sizeJ; j++) {
                    out.print(ret[i][j]);
                }
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

        public void close() {
            writer.close();
        }

        public void print(int i) {
            writer.print(i);
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
}

