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
 * @author Ribhav
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DLamp solver = new DLamp();
        solver.solve(1, in, out);
        out.close();
    }

    static class DLamp {
        public void solve(int testNumber, FastReader s, PrintWriter out) {
            int n = s.nextInt();
            int m = s.nextInt();
            char[][] arr = new char[n][m];
            for (int i = 0; i < n; i++) {
                String str = s.nextString();
                arr[i] = str.toCharArray();
            }

            int[][] up = new int[n][m];
            int[][] down = new int[n][m];
            int[][] right = new int[n][m];
            int[][] left = new int[n][m];

            for (int i = 0; i < m; i++) {
                up[0][i] = 0;
            }

            for (int i = 0; i < m; i++) {
                down[n - 1][i] = 0;
            }

            for (int i = 1; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i - 1][j] == '#') {
                        up[i][j] = 0;
                    } else {
                        up[i][j] = up[i - 1][j] + 1;
                    }
                }
            }

            for (int i = n - 2; i >= 0; i--) {
                for (int j = 0; j < m; j++) {
                    if (arr[i + 1][j] == '#') {
                        down[i][j] = 0;
                    } else {
                        down[i][j] = down[i + 1][j] + 1;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                left[i][0] = 0;
            }

            for (int i = 0; i < n; i++) {
                right[i][m - 1] = 0;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    if (arr[i][j - 1] == '#') {
                        left[i][j] = 0;
                    } else {
                        left[i][j] = left[i][j - 1] + 1;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = m - 2; j >= 0; j--) {
                    if (arr[i][j + 1] == '#') {
                        right[i][j] = 0;
                    } else {
                        right[i][j] = right[i][j + 1] + 1;
                    }
                }
            }

//        for (int i = 0; i < n; i++) {
//            System.out.println(Arrays.toString(up[i]));
//        }
//        System.out.println();
//        for (int i = 0; i < n; i++) {
//            System.out.println(Arrays.toString(down[i]));
//        }
//        System.out.println();
//        for (int i = 0; i < n; i++) {
//            System.out.println(Arrays.toString(left[i]));
//        }
//        System.out.println();
//        for (int i = 0; i < n; i++) {
//            System.out.println(Arrays.toString(right[i]));
//        }
//        System.out.println();

            int max = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] != '#') {
                        max = Math.max(max, left[i][j] + right[i][j] + up[i][j] + down[i][j] + 1);
                    }
                }
            }

            out.println(max);


        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
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

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

