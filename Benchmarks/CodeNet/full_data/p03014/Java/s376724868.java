import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
        DLamp solver = new DLamp();
        solver.solve(1, in, out);
        out.close();
    }

    static class DLamp {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int i, j;
            int n = in.ni();
            int m = in.ni();
            int temp[][] = new int[n][m];
            for (i = 0; i < n; i++) {
                String s = in.next();
                for (j = 0; j < m; j++) {
                    if (s.charAt(j) == '#')
                        temp[i][j] = 1;
                    else
                        temp[i][j] = 0;
                }
            }
            int ans[][] = new int[n][m];
            for (i = 0; i < n; i++) {
                ArrayList<Integer> arr = new ArrayList<>();
                for (j = 0; j < m; j++) {
                    if (temp[i][j] == 1) {
                        for (int c : arr)
                            ans[i][c] = arr.size();
                        arr = new ArrayList<>();
                    } else {
                        arr.add(j);
                    }
                }
                for (int c : arr)
                    ans[i][c] = arr.size();
            }

            for (i = 0; i < m; i++) {
                ArrayList<Integer> arr = new ArrayList<>();
                for (j = 0; j < n; j++) {
                    if (temp[j][i] == 1) {
                        for (int c : arr)
                            ans[c][i] += arr.size();
                        arr = new ArrayList<>();
                    } else {
                        arr.add(j);
                    }
                }
                for (int c : arr)
                    ans[c][i] += arr.size();
            }
            int max = 0;
            for (i = 0; i < n; i++) {
                for (j = 0; j < m; j++) {
                    if (temp[i][j] == 0)
                        --ans[i][j];
                    max = Math.max(max, ans[i][j]);
                }
            }
            out.println(max);
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

        public String ns() {
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
            return ns();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

