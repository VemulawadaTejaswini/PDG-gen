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
 * @author prakharjain
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        RWalk solver = new RWalk();
        solver.solve(1, in, out);
        out.close();
    }

    static class RWalk {
        int mod = 1000000007;

        public void solve(int testNumber, InputReader in, OutputWriter out) {

            int n = in.nextInt();

            long k = in.nextLong();

            long[][] a = new long[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = in.nextInt();
                }
            }

            MatrixExpo mat = new MatrixExpo(n);

            if (k > 1)
                a = mat.matrixPower(a, k, mod);

            long ans = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    ans += a[i][j];
                    ans %= mod;
                }
            }

            out.println(ans);
        }

        class MatrixExpo {
            int n;

            public MatrixExpo(int n) {
                this.n = n;
            }

            long[][] matrixPower(long[][] base, long pow, long mod) {
//            if (pow == 0) {
//                return id;
//            }
                if (pow == 1) {
                    return base;
                }

                long[][] t = matrixPower(base, pow / 2, mod);

                t = multiplyMatrix(t, t, mod);
                if (pow % 2 == 1) {
                    t = multiplyMatrix(t, base, mod);
                }

                return t;
            }

            long[][] multiplyMatrix(long[][] m, long[][] m2, long mod) {
                long[][] ans = new long[n][n];

                for (int i = 0; i < n; i++)
                    for (int j = 0; j < n; j++) {
                        ans[i][j] = 0;
                        for (int k = 0; k < n; k++) {
                            ans[i][j] += m[i][k] * m2[k][j];
                            ans[i][j] %= mod;
                        }
                    }

                return ans;
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

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
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

        public long nextLong() {
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

        public void println(long i) {
            writer.println(i);
        }

    }
}

