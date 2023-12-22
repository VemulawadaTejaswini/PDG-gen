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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt(), m = in.nextInt();
            int[][] arr = new int[n][m];
            for (int i = 0; i < n; i++) {
                arr[i] = in.readIntArray(m);
                for (int j = 0; j < m; j++) arr[i][j]--;
            }

            int lo = 0, hi = n;
            while (lo < hi) {
                int mid = (lo + hi) / 2;

                int[] idx = new int[n];
                int[] count = new int[m];
                for (int i = 0; i < n; i++) count[arr[i][0]]++;
                boolean ok = true;
                boolean[] marked = new boolean[m];
                outer:
                for (int iter = 0; iter < m; iter++) {
                    boolean found = false;
                    for (int k = 0; k < m; k++) {
                        if (!marked[k] && count[k] > mid) {
                            marked[k] = true;
                            found = true;
                            for (int i = 0; i < n; i++) {
                                if (arr[i][idx[i]] == k) {
                                    while (idx[i] < m && marked[arr[i][idx[i]]]) idx[i]++;
                                    if (idx[i] == m) {
                                        ok = false;
                                        break outer;
                                    }
                                    count[k]--;
                                    count[arr[i][idx[i]]]++;
                                }
                            }
                        }
                    }
                    if (!found) {
                        break;
                    }
                }

                if (ok) hi = mid;
                else lo = mid + 1;
            }
            out.println(lo);
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

        public int[] readIntArray(int tokens) {
            int[] ret = new int[tokens];
            for (int i = 0; i < tokens; i++) {
                ret[i] = nextInt();
            }
            return ret;
        }

        public int read() {
            if (this.numChars == -1) {
                throw new InputMismatchException();
            } else {
                if (this.curChar >= this.numChars) {
                    this.curChar = 0;

                    try {
                        this.numChars = this.stream.read(this.buf);
                    } catch (IOException var2) {
                        throw new InputMismatchException();
                    }

                    if (this.numChars <= 0) {
                        return -1;
                    }
                }

                return this.buf[this.curChar++];
            }
        }

        public int nextInt() {
            int c;
            for (c = this.read(); isSpaceChar(c); c = this.read()) {
                ;
            }

            byte sgn = 1;
            if (c == 45) {
                sgn = -1;
                c = this.read();
            }

            int res = 0;

            while (c >= 48 && c <= 57) {
                res *= 10;
                res += c - 48;
                c = this.read();
                if (isSpaceChar(c)) {
                    return res * sgn;
                }
            }

            throw new InputMismatchException();
        }

        public static boolean isSpaceChar(int c) {
            return c == 32 || c == 10 || c == 13 || c == 9 || c == -1;
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
}

