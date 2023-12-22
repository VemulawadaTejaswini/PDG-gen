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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        RWalk solver = new RWalk();
        solver.solve(1, in, out);
        out.close();
    }

    static class RWalk {
        long MOD = (int) 1e9 + 7;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            long K = in.nextLong();
            long[][] grd = new long[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    grd[i][j] = in.nextInt();
                }
            }
            long[][] ans = exp(grd, K);
            long w = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    w += ans[i][j];
                    w %= MOD;
                }
            }
            out.print(w);
        }

        long[][] exp(long[][] mat, long k) {
            if (k == 0) {
                long[][] t = new long[mat.length][mat.length];
                for (int i = 0; i < mat.length; i++) {
                    t[i][i] = 1;
                }
                return t;
            } else {
                long[][] X = exp(mat, k / 2);
                if (k % 2 == 0) {
                    return mul(X, X);
                } else {
                    return mul(mul(X, X), mat);
                }
            }
        }

        long[][] mul(long[][] a, long[][] b) {
            long[][] mat = new long[a.length][b[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    for (int k = 0; k < a.length; k++) {
                        mat[i][j] += a[i][k] * b[k][j];
                        mat[i][j] %= MOD;
                    }
                }
            }
            return mat;
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

