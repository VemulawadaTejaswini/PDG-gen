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
 * Built using CHelper plug-in
 * Actual solution is at the top
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
            int h = in.readInt();
            int w = in.readInt();
            int k = in.readInt();
            char[][] mat = new char[h][w];
            for (int i = 0; i < h; i++) {
                in.readString(mat[i], 0);
            }

            int[][] assign = new int[h][w];
            int num = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (mat[i][j] != '#') {
                        continue;
                    }
                    num++;
                    //horizontal first
                    int l = j;
                    int r = j;
                    while (l - 1 >= 0 && assign[i][l - 1] == 0 &&
                            mat[i][l - 1] == '.') {
                        l--;
                    }
                    while (r + 1 <= w - 1 && assign[i][r + 1] == 0 &&
                            mat[i][r + 1] == '.') {
                        r++;
                    }
                    int u = i;
                    int d = i;
                    while (u - 1 >= 0) {
                        boolean valid = true;
                        for (int t = l; t <= r; t++) {
                            valid = valid && assign[u - 1][t] == 0 &&
                                    mat[u - 1][t] == '.';
                        }
                        if (!valid) {
                            break;
                        }
                        u--;
                    }
                    while (d + 1 <= h - 1) {
                        boolean valid = true;
                        for (int t = l; t <= r; t++) {
                            valid = valid && assign[d + 1][t] == 0 &&
                                    mat[d + 1][t] == '.';
                        }
                        if (!valid) {
                            break;
                        }
                        d++;
                    }
                    for (int a = u; a <= d; a++) {
                        for (int b = l; b <= r; b++) {
                            assign[a][b] = num;
                        }
                    }
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    out.append(assign[i][j]).append(' ');
                }
                out.println();
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

        public int readString(char[] data, int offset) {
            skipBlank();

            int originalOffset = offset;
            while (next > 32) {
                data[offset++] = (char) next;
                next = read();
            }

            return offset - originalOffset;
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

        public FastOutput append(int c) {
            cache.append(c);
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
}

