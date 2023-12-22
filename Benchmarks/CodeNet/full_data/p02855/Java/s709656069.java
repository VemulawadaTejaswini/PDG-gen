import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Sparsh Sanchorawala
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CStrawberryCakes solver = new CStrawberryCakes();
        solver.solve(1, in, out);
        out.close();
    }

    static class CStrawberryCakes {
        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int n = s.nextInt(), m = s.nextInt(), k = s.nextInt();
            char[][] a = new char[n][];
            for (int i = 0; i < n; i++)
                a[i] = s.next().toCharArray();
            int[] done = new int[n];
            int[] dead = new int[n];
            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 0; j < m; j++) {
                    if (a[i][j] == '#')
                        count++;
                }
                if (count == 0)
                    dead[i] = 1;
            }
            int curr = 0;
            int[][] res = new int[n][m];
            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 0; j < m; j++) {
                    if (a[i][j] == '#')
                        count++;
                }
                if (count > 0) {
                    done[i] = 1;
                    int cx = 0;
                    for (int j = 0; j < m; j++) {
                        if (a[i][j] == '#')
                            cx++;
                        res[i][j] = Math.max(curr + cx, curr + 1);
                    }
                    curr += count;

                    for (int x = i - 1; x >= 0; x--) {
                        if (done[x] == 0 && dead[x] == 1) {
                            for (int j = 0; j < m; j++)
                                res[x][j] = res[i][j];
                        } else
                            break;
                    }
                    for (int x = i + 1; x < n; x++) {
                        if (done[x] == 0 && dead[x] == 1) {
                            for (int j = 0; j < m; j++)
                                res[x][j] = res[i][j];
                        } else
                            break;
                    }
                }

            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++)
                    w.print(res[i][j] + " ");
                w.println();
            }
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

        public String nextString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
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

        public String next() {
            return nextString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

