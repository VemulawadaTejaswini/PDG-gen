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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        FCoincidence solver = new FCoincidence();
        solver.solve(1, in, out);
        out.close();
    }

    static class FCoincidence {
        long l;
        long r;
        long[][][][] dp = new long[2][2][2][60];

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            l = in.readLong();
            r = in.readLong();
            ArrayUtils.fill(dp, -1);
            out.printLine(rec(0, 0, 0, 59));
        }

        long rec(int x, int y, int z, int i) {
            if (i == -1) return 1;
            if (dp[x][y][z][i] >= 0) return dp[x][y][z][i];

            long ret = 0;
            boolean flg1 = (l >> i & 1) == 0;
            boolean flg2 = (r >> i & 1) == 1;
            if (x == 1 || flg1) ret += rec(x, flg2 ? 1 : y, z, i - 1);
            if ((x == 1 || flg1) && (y == 1 || flg2) && z == 1) ret += rec(x, y, z, i - 1);
            if (y == 1 || flg2) ret += rec(flg1 ? 1 : x, y, 1, i - 1);
            ret %= MiscUtils.MOD7;
            return dp[x][y][z][i] = ret;
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

    static class ArrayUtils {
        public static void fill(long[][] array, long value) {
            for (long[] row : array) {
                Arrays.fill(row, value);
            }
        }

        public static void fill(long[][][] array, long value) {
            for (long[][] row : array) {
                fill(row, value);
            }
        }

        public static void fill(long[][][][] array, long value) {
            for (long[][][] row : array) {
                fill(row, value);
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

        public void printLine(long i) {
            writer.println(i);
        }

    }

    static class MiscUtils {
        public static final int MOD7 = (int) (1e9 + 7);

    }
}

