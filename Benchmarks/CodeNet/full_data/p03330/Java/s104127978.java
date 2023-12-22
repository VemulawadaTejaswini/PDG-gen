import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        inclass in = new inclass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DGoodGrid solver = new DGoodGrid();
        solver.solve(1, in, out);
        out.close();
    }

    static class DGoodGrid {
        public void solve(int testNumber, inclass in, PrintWriter out) {
            int n = in.nextInt(), c = in.nextInt();
            int d[][] = new int[c][c];
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < c; j++) {
                    d[i][j] = in.nextInt();
                }
            }
            int mat[][] = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    mat[i][j] = in.nextInt() - 1;
                }
            }
            int col[][] = new int[3][c];
            for (int i = 0; i < col.length; i++) {
                Arrays.fill(col[i], -1);
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((i + j) % 3 == 0) {
                        col[0][mat[i][j]]++;
                    }
                    if ((i + j) % 3 == 1) {
                        col[1][mat[i][j]]++;
                    }
                    if ((i + j) % 3 == 2) {
                        col[2][mat[i][j]]++;
                    }
                }
            }
            long min = (long) 1e9;
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < c; j++) {
                    if (i == j) continue;
                    for (int k = 0; k < c; k++) {
                        if (j == k || k == i || j == i) continue;
                        int c1 = i, c2 = j, c3 = k;
                        long cost1 = 0, cost2 = 0, cost3 = 0;
                        for (int l = 0; l < 3; l++) {
                            for (int m = 0; m < c; m++) {
                                if (l == 0 && col[l][m] != -1) {
                                    cost1 += (col[l][m] + 1) * (long) d[m][c1];
                                }
                                if (l == 1 && col[l][m] != -1) {
                                    cost2 += (col[l][m] + 1) * (long) d[m][c2];
                                }
                                if (l == 2 && col[l][m] != -1) {
                                    cost3 += (col[l][m] + 1) * (long) d[m][c3];
                                }
                            }
                        }
                        min = Math.min(cost1 + cost2 + cost3, min);
                    }
                }
            }
            out.println(min);
        }

    }

    static class inclass {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private inclass.SpaceCharFilter filter;

        public inclass(InputStream stream) {
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

