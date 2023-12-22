import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author maheshwari29
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DLine solver = new DLine();
        solver.solve(1, in, out);
        out.close();
    }

    static class DLine {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int i, j;
            int n = in.ni();
            int x = in.ni();
            int y = in.ni();
            int temp[][] = new int[n + 1][n + 1];
            for (i = 1; i <= n; i++)
                for (j = 1; j <= n; j++)
                    temp[i][j] = Math.abs(j - i);
            temp[x][y] = 1;
            for (i = 1; i <= x; i++) {
                for (j = x; j <= n; j++) {
                    int temp1 = temp[i][x] + temp[y][j] + 1;
                    temp[i][j] = Math.min(temp[i][j], temp1);
                }
            }
            for (i = x; i <= y; i++) {
                for (j = i + 1; j <= n; j++) {
                    int temp1 = temp[x][i] + 1 + temp[j][y];
                    temp[i][j] = Math.min(temp[i][j], temp1);
                }
            }
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (i = 1; i <= n; i++) {
                for (j = i + 1; j <= n; j++) {
                    int z = temp[i][j];
                    if (hm.containsKey(z))
                        hm.put(z, hm.get(z) + 1);
                    else
                        hm.put(z, 1);
                }
            }
            for (i = 1; i <= n - 1; i++) {
                if (hm.containsKey(i))
                    out.println(hm.get(i));
                else
                    out.println(0);

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

        public int ni() {
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

