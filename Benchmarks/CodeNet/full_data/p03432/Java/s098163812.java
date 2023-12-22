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
 * @author Egor Kulikov (egor@egork.net)
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskF solver = new TaskF();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskF {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            int m = in.readInt();
            long[][] answer = new long[n + 1][m + 1];
            answer[0][0] = 1;
            long[] temp = new long[n + 1];
            long[][] c = IntegerUtils.generateBinomialCoefficients(n + 1, MiscUtils.MODF);
            for (int mm = 1; mm <= m; mm++) {
                answer[0][mm] = 1;
                for (int nn = 1; nn <= n; nn++) {
                    for (int j = 1; j < nn; j++) {
                        temp[j] = 0;
                        for (int k = 0; k < j; k++) {
                            temp[j] += c[j - 1][k] * answer[nn - k - 2][mm - 1] % MiscUtils.MODF;
                        }
                        temp[j] %= MiscUtils.MODF;
                    }
                    answer[nn][mm] = answer[nn][mm - 1] * ((nn + 1) * nn / 2 + 1) % MiscUtils.MODF;
                    for (int j = 0; j < nn; j++) {
                        answer[nn][mm] += (j + 1) * (nn - j) * answer[nn - 1][mm - 1] % MiscUtils.MODF;
                        for (int k = j + 1; k < nn; k++) {
                            answer[nn][mm] += (j + 1) * (nn - k) * temp[k - j];
                        }
                    }
                    answer[nn][mm] %= MiscUtils.MODF;
                }
            }
            long result = 0;
            for (int i = 0; i <= n; i++) {
                result += answer[i][m] * c[n][i];
            }
            result %= MiscUtils.MODF;
            out.printLine(result);
        }

    }

    static class MiscUtils {
        public static final int MODF = 998244353;

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

    static class IntegerUtils {
        public static long[][] generateBinomialCoefficients(int n, long module) {
            long[][] result = new long[n + 1][n + 1];
            if (module == 1) {
                return result;
            }
            for (int i = 0; i <= n; i++) {
                result[i][0] = 1;
                for (int j = 1; j <= i; j++) {
                    result[i][j] = result[i - 1][j - 1] + result[i - 1][j];
                    if (result[i][j] >= module) {
                        result[i][j] -= module;
                    }
                }
            }
            return result;
        }

    }
}

