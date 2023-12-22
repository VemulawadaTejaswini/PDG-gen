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
 * @author Rustam Musin (t.me/musin_acm)
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DNumberOfAmidakuji solver = new DNumberOfAmidakuji();
        solver.solve(1, in, out);
        out.close();
    }

    static class DNumberOfAmidakuji {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            int m = in.readInt();
            int k = in.readInt();

            int mod = (int) 1e9 + 7;
            int[][] dpCur = new int[1 << (m - 1)][m];
            dpCur[0][0] = 1;
            int[][] dpPrev = new int[1 << (m - 1)][m];
            int[] masks = goodMasks(m);
            for (int i = 0; i < n; i++) {
                int[][] t = dpCur;
                dpCur = dpPrev;
                dpPrev = t;
                ArrayUtils.fill(dpCur, 0);
                for (int prevM : masks) {
                    for (int curM : masks) {
                        for (int prevPos = 0; prevPos < m; prevPos++) {
                            int curPos = prevPos;
                            if (prevPos > 0 && bit(curM, prevPos - 1) == 1) {
                                curPos--;
                            } else if (prevPos + 1 < m && bit(curM, prevPos) == 1) {
                                curPos++;
                            }
                            dpCur[curM][curPos] += dpPrev[prevM][prevPos];
                            dpCur[curM][curPos] %= mod;
                        }
                    }
                }
            }
            int ans = 0;
            for (int i = 0; i < 1 << (m - 1); i++) {
                ans = (ans + dpCur[i][k - 1]) % mod;
            }
            out.print(ans);
        }

        int[] goodMasks(int m) {
            int cnt = 0;
            for (int i = 0; i < 1 << (m - 1); i++) {
                if (checkMask(i)) {
                    cnt++;
                }
            }
            int[] a = new int[cnt];
            for (int i = 0; i < 1 << (m - 1); i++) {
                if (checkMask(i)) {
                    a[--cnt] = i;
                }
            }
            return a;
        }

        int bit(int m, int b) {
            return (m >> b) & 1;
        }

        boolean checkMask(int m) {
            boolean prev1 = false;
            while (m > 0) {
                if (((m & 1) == 1) && prev1) {
                    return false;
                }
                prev1 = (m & 1) == 1;
                m >>= 1;
            }
            return true;
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

        public void print(int i) {
            writer.print(i);
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

