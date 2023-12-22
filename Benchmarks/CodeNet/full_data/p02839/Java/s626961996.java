import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.util.Set;
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
        EBalancedPath solver = new EBalancedPath();
        solver.solve(1, in, out);
        out.close();
    }

    static class EBalancedPath {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int h = in.readInt();
            int w = in.readInt();
            int[][] a = in.readIntTable(h, w);
            int[][] b = in.readIntTable(h, w);

            int MAX = 80 * (h + w - 1);
            Set<Integer>[][] dp = new HashSet[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    dp[i][j] = new HashSet<>();
                    if (i == 0 && j == 0) {
                        dp[0][0].add(Math.abs(a[0][0] - b[0][0]));
                    } else {
                        if (i > 0) {
                            for (int x : dp[i - 1][j]) {
                                int diff = Math.abs(a[i][j] - b[i][j]);
                                int tmp1 = x + diff;
                                int tmp2 = Math.abs(x - diff);
                                if (Math.abs(tmp1) <= MAX / 2) dp[i][j].add(tmp1);
                                dp[i][j].add(tmp2);
                            }
                        }
                        if (j > 0) {
                            for (int x : dp[i][j - 1]) {
                                int diff = Math.abs(a[i][j] - b[i][j]);
                                int tmp1 = x + diff;
                                int tmp2 = Math.abs(x - diff);
                                if (Math.abs(tmp1) <= MAX / 2) dp[i][j].add(tmp1);
                                dp[i][j].add(tmp2);
                            }
                        }
                    }
                }
            }

            int ans = Constants.INF;
            for (int x : dp[h - 1][w - 1]) {
                ans = Math.min(ans, x);
            }
            out.printLine(ans);
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

        public int[][] readIntTable(int rowCount, int columnCount) {
            int[][] table = new int[rowCount][];
            for (int i = 0; i < rowCount; i++) {
                table[i] = readIntArray(columnCount);
            }
            return table;
        }

        public int[] readIntArray(int size) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = readInt();
            }
            return array;
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

    static class Constants {
        public static final int INF = (int) 1e9 + 1;

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
}

