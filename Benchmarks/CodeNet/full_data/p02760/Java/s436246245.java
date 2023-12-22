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
        BBingo solver = new BBingo();
        solver.solve(1, in, out);
        out.close();
    }

    static class BBingo {
        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int[][] a = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++)
                    a[i][j] = s.nextInt();
            }
            int[][] b = new int[3][3];
            int n = s.nextInt();
            for (int k = 0; k < n; k++) {
                int x = s.nextInt();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++)
                        if (a[i][j] == x)
                            b[i][j] = 1;
                }
            }
            boolean res = false;
            for (int i = 0; i < 3; i++) {
                int c = 1;
                for (int j = 0; j < 3; j++)
                    if (b[i][j] == 0)
                        c = 0;
                if (c == 1)
                    res = true;
            }
            for (int j = 0; j < 3; j++) {
                int c = 1;
                for (int i = 0; i < 3; i++) {
                    if (b[i][j] == 0)
                        c = 0;
                }
                if (c == 1)
                    res = true;
            }
            int c = 1;
            for (int i = 0; i < 3; i++) {
                if (b[i][i] == 0)
                    c = 0;
            }
            if (c == 1)
                res = true;
            c = 1;
            for (int i = 0; i < 3; i++) {
                if (b[i][2 - i] == 0)
                    c = 0;
            }
            if (c == 1)
                res = true;
            if (res)
                w.println("Yes");
            else
                w.println("No");
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

