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
            TaskE solver = new TaskE();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class TaskE {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int h = in.readInt();
            int w = in.readInt();
            int[][] a = new int[h][w];
            int[][] b = new int[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    a[i][j] = in.readInt();
                }
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    b[i][j] = in.readInt();
                }
            }
            ArrayIndex ai = new ArrayIndex(h, w, 80 * 160);
            boolean[] dp = new boolean[ai.totalSize()];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (i == 0 && j == 0) {
                        dp[ai.indexOf(0, 0, Math.abs(b[0][0] - a[0][0]))] = true;
                    }
                    for (int k = 0; k < 80 * 160; k++) {
                        if (!dp[ai.indexOf(i, j, k)]) {
                            continue;
                        }
                        if (i + 1 < h) {
                            dp[ai.indexOf(i + 1, j, Math.abs(k + b[i + 1][j] - a[i + 1][j]))] = true;
                            dp[ai.indexOf(i + 1, j, Math.abs(k - b[i + 1][j] + a[i + 1][j]))] = true;
                        }
                        if (j + 1 < w) {
                            dp[ai.indexOf(i, j + 1, Math.abs(k + b[i][j + 1] - a[i][j + 1]))] = true;
                            dp[ai.indexOf(i, j + 1, Math.abs(k - b[i][j + 1] + a[i][j + 1]))] = true;
                        }
                    }
                }
            }

            for (int i = 0; i < 80 * 160; i++) {
                if (dp[ai.indexOf(h - 1, w - 1, i)]) {
                    out.println(i);
                    return;
                }
            }
        }

    }

    static class ArrayIndex {
        int[] dimensions;

        public ArrayIndex(int... dimensions) {
            this.dimensions = dimensions;
        }

        public int totalSize() {
            int ans = 1;
            for (int x : dimensions) {
                ans *= x;
            }
            return ans;
        }

        public int indexOf(int a, int b) {
            return a * dimensions[1] + b;
        }

        public int indexOf(int a, int b, int c) {
            return indexOf(a, b) * dimensions[2] + c;
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

        public FastOutput println(int c) {
            cache.append(c).append('\n');
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

