import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 27);
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
            TaskC solver = new TaskC();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskC {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            int m = in.readInt();
            int a = in.readInt();
            int b = in.readInt();

            char[][][] mats = new char[3][n][m];
            if (oddPut(mats[0], a, b)) {
                yes(out, mats[0]);
                return;
            }
            if (evenPut(mats[1], a, b)) {
                yes(out, mats[1]);
                return;
            }
            if (oddEvenPut(mats[2], a, b)) {
                yes(out, mats[2]);
                return;
            }
            char[][][] rotated = new char[3][m][n];
            if (oddPut(rotated[0], b, a)) {
                yes(out, rotate(rotated[0]));
                return;
            }
            if (evenPut(rotated[1], b, a)) {
                yes(out, rotate(rotated[1]));
                return;
            }
            if (oddEvenPut(rotated[2], b, a)) {
                yes(out, rotate(rotated[2]));
                return;
            }

            out.println("NO");
        }

        public void yes(FastOutput out, char[][] mat) {
            out.println("YES");
            for (char[] r : mat) {
                for (char c : r) {
                    if (c == 0) {
                        out.append('.');
                    } else {
                        out.append(c);
                    }
                }
                out.println();
            }
        }

        public char[][] rotate(char[][] mat) {
            int n = mat.length;
            int m = mat[0].length;
            char[][] ans = new char[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    char c = mat[n - j - 1][i];
                    if (c == 0) {
                        ans[i][j] = 0;
                    } else if (c == '<') {
                        ans[i][j] = '^';
                    } else if (c == '>') {
                        ans[i][j] = 'v';
                    } else if (c == '^') {
                        ans[i][j] = '>';
                    } else if (c == 'v') {
                        ans[i][j] = '<';
                    }
                }
            }
            return ans;
        }

        public boolean oddPut(char[][] mat, int a, int b) {
            int n = mat.length;
            int m = mat[0].length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m - 1; j++) {
                    if (a == 0 || mat[i][j] != 0 || mat[i][j + 1] != 0) {
                        continue;
                    }
                    mat[i][j] = '<';
                    mat[i][j + 1] = '>';
                    a--;
                }
            }

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < m; j++) {
                    if (b == 0 || mat[i][j] != 0 || mat[i + 1][j] != 0) {
                        continue;
                    }
                    mat[i][j] = '^';
                    mat[i + 1][j] = 'v';
                    b--;
                }
            }

            return a == 0 && b == 0;
        }

        public boolean oddEvenPut(char[][] mat, int a, int b) {
            int n = mat.length;
            int m = mat[0].length;
            for (int j = 0; j < m - 1; j++) {
                if (a == 0 || mat[0][j] != 0 || mat[0][j + 1] != 0) {
                    continue;
                }
                mat[0][j] = '<';
                mat[0][j + 1] = '>';
                a--;
            }
            if (a % 2 == 1 && n >= 2 && m >= 2) {
                mat[1][0] = '<';
                mat[1][1] = '>';
                a--;
            }

            for (int i = 1; i < n; i++) {
                for (int j = 0; j < m - 1; j++) {
                    if (a == 0 || mat[i][j] != 0 || mat[i][j + 1] != 0) {
                        continue;
                    }
                    mat[i][j] = '<';
                    mat[i][j + 1] = '>';
                    a--;
                }
            }

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < m; j++) {
                    if (b == 0 || mat[i][j] != 0 || mat[i + 1][j] != 0) {
                        continue;
                    }
                    mat[i][j] = '^';
                    mat[i + 1][j] = 'v';
                    b--;
                }
            }

            return a == 0 && b == 0;
        }

        public boolean evenPut(char[][] mat, int a, int b) {
            int n = mat.length;
            int m = mat[0].length;
            if (a % 2 == 1 && m >= 2) {
                mat[0][0] = '<';
                mat[0][1] = '>';
                a--;
            }
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < m - 1; j++) {
                    if (a < 2 || mat[i][j] != 0 || mat[i][j + 1] != 0 || mat[i + 1][j] != 0 || mat[i + 1][j + 1] != 0) {
                        continue;
                    }
                    mat[i + 1][j] = mat[i][j] = '<';
                    mat[i + 1][j + 1] = mat[i][j + 1] = '>';
                    a -= 2;
                }
            }

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < m; j++) {
                    if (b == 0 || mat[i][j] != 0 || mat[i + 1][j] != 0) {
                        continue;
                    }
                    mat[i][j] = '^';
                    mat[i + 1][j] = 'v';
                    b--;
                }
            }

            return a == 0 && b == 0;
        }

    }
    static class FastOutput implements AutoCloseable, Closeable {
        private StringBuilder cache = new StringBuilder(10 << 20);
        private final Writer os;

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

        public FastOutput println(String c) {
            cache.append(c).append('\n');
            return this;
        }

        public FastOutput println() {
            cache.append('\n');
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

    }
}

