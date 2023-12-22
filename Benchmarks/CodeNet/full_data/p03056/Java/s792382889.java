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
 * @author Egor Kulikov (egor@egork.net)
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
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int h = in.readInt();
            int w = in.readInt();
            char[][] a = in.readTable(h, w);
            byte[][][][] complexity = new byte[h][][][];
            for (int i = 0; i < h; i++) {
                complexity[i] = new byte[i + 1][w][];
                for (int j = 0; j <= i; j++) {
                    for (int k = 0; k < w; k++) {
                        complexity[i][j][k] = new byte[k + 1];
                    }
                }
            }
            int[][] middle = new int[w][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    int changes = 0;
                    for (int k = j - 1; k >= 0; k--) {
                        if (a[i][k] != a[i][k + 1]) {
                            changes++;
                        }
                        complexity[i][i][j][k] =
                                (byte) (changes == 0 ? 0 : (Integer.bitCount(Integer.highestOneBit(changes) - 1) + 1));
                    }
                }
                ArrayUtils.fill(middle, i);
                for (int j = i - 1; j >= 0; j--) {
                    for (int k = 0; k < w; k++) {
                        int at = k;
                        for (int l = k; l >= 0; l--) {
                            if (complexity[i][j + 1][k][l] == 0 && complexity[j][j][k][l] == 0 && a[i][k] == a[j][k]) {
                                continue;
                            }
                            int result = Byte.MAX_VALUE;
                            int lastUp = Byte.MAX_VALUE;
                            while (true) {
                                if (middle[k][l] == j) {
                                    middle[k][l]++;
                                    result = Math.min(result, lastUp);
                                    break;
                                }
                                int nDown = complexity[i][middle[k][l]][k][l];
                                int nUp = complexity[middle[k][l] - 1][j][k][l];
                                if (nDown >= nUp) {
                                    result = Math.min(result, Math.min(nDown + 1, lastUp));
                                    middle[k][l] = Math.min(middle[k][l] + 1, i);
                                    break;
                                }
                                lastUp = nUp + 1;
                                middle[k][l]--;
                            }
                            int lastLeft = Byte.MAX_VALUE;
                            while (true) {
                                if (at == l) {
                                    at = Math.min(at + 1, k);
                                    result = Math.min(result, lastLeft);
                                    break;
                                }
                                int right = complexity[i][j][k][at];
                                int left = complexity[i][j][at - 1][l];
                                if (right >= left) {
                                    result = Math.min(result, Math.min(right + 1, lastLeft));
                                    at = Math.min(at + 1, k);
                                    break;
                                }
                                lastLeft = left + 1;
                                at--;
                            }
                            complexity[i][j][k][l] = (byte) result;
                        }
                    }
                }
            }
            out.printLine(complexity[h - 1][0][w - 1][0]);
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

        public char[] readCharArray(int size) {
            char[] array = new char[size];
            for (int i = 0; i < size; i++) {
                array[i] = readCharacter();
            }
            return array;
        }

        public char[][] readTable(int rowCount, int columnCount) {
            char[][] table = new char[rowCount][];
            for (int i = 0; i < rowCount; i++) {
                table[i] = this.readCharArray(columnCount);
            }
            return table;
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

        public char readCharacter() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            return (char) c;
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

        public void printLine(int i) {
            writer.println(i);
        }

    }

    static class ArrayUtils {
        public static void fill(int[][] array, int value) {
            for (int[] row : array) {
                Arrays.fill(row, value);
            }
        }

    }
}

