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
            EOrPlusMax solver = new EOrPlusMax();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class EOrPlusMax {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            int[] a = new int[1 << n];
            in.populate(a);

            int[][][] heaps = new int[1 << n][n + 1][2];

            for (int i = 0; i < 1 << n; i++) {
                add(heaps[i][n], -a[i]);
                for (int j = n - 1; j >= 0; j--) {
                    if (Bits.get(i, j) == 0) {
                        for (int k = 0; k < 2; k++) {
                            add(heaps[i][j], heaps[i][j + 1][k]);
                        }
                    } else {
                        for (int k = 0; k < 2; k++) {
                            add(heaps[i][j], heaps[i - (1 << j)][j + 1][k]);
                            add(heaps[i][j], heaps[i][j + 1][k]);
                        }
                    }
                }
            }

            int max = 0;
            for (int i = 1; i < 1 << n; i++) {
                max = Math.max(max, -(heaps[i][0][0] + heaps[i][0][1]));
                out.println(max);
            }
        }

        public void add(int[] heap, int x) {
            if (heap[1] <= x) {
                return;
            }
            if (heap[0] <= x) {
                heap[1] = x;
                return;
            }
            heap[1] = heap[0];
            heap[0] = x;
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

        public void populate(int[] data) {
            for (int i = 0; i < data.length; i++) {
                data[i] = readInt();
            }
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

    static class Bits {
        private Bits() {
        }

        public static int get(int x, int i) {
            return (x >>> i) & 1;
        }

    }
}

