import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 29);
        thread.start();
        thread.join();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastInput in = new FastInput(inputStream);
            FastOutput out = new FastOutput(outputStream);
            CNuskeVsPhantomThnook solver = new CNuskeVsPhantomThnook();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class CNuskeVsPhantomThnook {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            int m = in.readInt();
            int q = in.readInt();
            //even for vertex, odd for edge
            int[][] mat = new int[n + 1][m + 1];
            //edge with top
            int[][] colEdge = new int[n + 1][m + 1];
            //edge with right
            int[][] rowEdge = new int[n + 1][m + 1];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    mat[i][j] = in.readChar() - '0';
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (mat[i][j] + mat[i + 1][j] == 2) {
                        colEdge[i][j] = 1;
                    }
                    if (mat[i][j] + mat[i][j + 1] == 2) {
                        rowEdge[i][j] = 1;
                    }
                }
            }

            presum(mat);
            presum(colEdge);
            presum(rowEdge);

            for (int i = 0; i < q; i++) {
                int b = in.readInt() - 1;
                int l = in.readInt() - 1;
                int t = in.readInt() - 1;
                int r = in.readInt() - 1;

                int vertexCnt = region(mat, b, t, l, r);
                int edge = region(colEdge, b, t - 1, l, r) +
                        region(rowEdge, b, t, l, r - 1);

                int cc = vertexCnt - edge;
                out.println(cc);
            }
        }

        public int region(int[][] mat, int b, int t, int l, int r) {
            if (b > t || l > r) {
                return 0;
            }

            int ans = mat[t][r];
            if (b > 0) {
                ans -= mat[b - 1][r];
            }
            if (l > 0) {
                ans -= mat[t][l - 1];
            }
            if (b > 0 && l > 0) {
                ans += mat[b - 1][l - 1];
            }
            return ans;
        }

        public void presum(int[][] mat) {
            int n = mat.length;
            int m = mat[0].length;
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    mat[i][j] += mat[i][j - 1];
                }
                if (i > 0) {
                    for (int j = 0; j < m; j++) {
                        mat[i][j] += mat[i - 1][j];
                    }
                }
            }
        }

    }

    static class FastInput {
        private final InputStream is;
        private byte[] buf = new byte[1 << 13];
        private int bufLen;
        private int bufOffset;
        private int next;

        public FastInput(InputStream is) {
            this.is = is;
        }

        private int read() {
            while (bufLen == bufOffset) {
                bufOffset = 0;
                try {
                    bufLen = is.read(buf);
                } catch (IOException e) {
                    bufLen = -1;
                }
                if (bufLen == -1) {
                    return -1;
                }
            }
            return buf[bufOffset++];
        }

        public void skipBlank() {
            while (next >= 0 && next <= 32) {
                next = read();
            }
        }

        public int readInt() {
            int sign = 1;

            skipBlank();
            if (next == '+' || next == '-') {
                sign = next == '+' ? 1 : -1;
                next = read();
            }

            int val = 0;
            if (sign == 1) {
                while (next >= '0' && next <= '9') {
                    val = val * 10 + next - '0';
                    next = read();
                }
            } else {
                while (next >= '0' && next <= '9') {
                    val = val * 10 - next + '0';
                    next = read();
                }
            }

            return val;
        }

        public char readChar() {
            skipBlank();
            char c = (char) next;
            next = read();
            return c;
        }

    }

    static class FastOutput implements AutoCloseable, Closeable, Appendable {
        private StringBuilder cache = new StringBuilder(10 << 20);
        private final Writer os;

        public FastOutput append(CharSequence csq) {
            cache.append(csq);
            return this;
        }

        public FastOutput append(CharSequence csq, int start, int end) {
            cache.append(csq, start, end);
            return this;
        }

        public FastOutput(Writer os) {
            this.os = os;
        }

        public FastOutput(OutputStream os) {
            this(new OutputStreamWriter(os));
        }

        public FastOutput append(char c) {
            cache.append(c);
            return this;
        }

        public FastOutput append(int c) {
            cache.append(c);
            return this;
        }

        public FastOutput println(int c) {
            return append(c).println();
        }

        public FastOutput println() {
            cache.append(System.lineSeparator());
            return this;
        }

        public FastOutput flush() {
            try {
                os.append(cache);
                os.flush();
                cache.setLength(0);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
            return this;
        }

        public void close() {
            flush();
            try {
                os.close();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }

        public String toString() {
            return cache.toString();
        }

    }
}

