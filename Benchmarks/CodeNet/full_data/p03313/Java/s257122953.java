import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
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

            IntegerFixedMinHeap[] heaps = new IntegerFixedMinHeap[1 << n];
            for (int i = 0; i < 1 << n; i++) {
                heaps[i] = new IntegerFixedMinHeap(2);
                heaps[i].add(-a[i]);
            }
            for (int j = n - 1; j >= 0; j--) {
                for (int i = (1 << n) - 1; i >= 0; i--) {
                    if (Bits.get(i, j) == 0) {
                    } else {
                        for (int k = 0; k < 2; k++) {
                            heaps[i].add(heaps[i - (1 << j)].get(k));
                        }
                    }
                }
            }

            int max = 0;
            for (int i = 1; i < 1 << n; i++) {
                max = Math.max(max, -(heaps[i].get(0) + heaps[i].get(1)));
                out.println(max);
            }
        }

    }

    static class IntegerFixedMinHeap {
        private int[] data;
        private static int[] buf = new int[1 << 8];

        public IntegerFixedMinHeap(int cap) {
            if (cap <= 0 || cap > buf.length) {
                throw new IllegalArgumentException();
            }
            data = new int[cap];
            clear();
        }

        public void clear() {
            Arrays.fill(data, Integer.MAX_VALUE);
        }

        public int get(int i) {
            return data[i];
        }

        public void add(int x) {
            if (data[data.length - 1] <= x) {
                return;
            }
            int j = data.length - 1;
            while (j > 0 && data[j - 1] > x) {
                data[j] = data[j - 1];
                j--;
            }
            data[j] = x;
        }

        public String toString() {
            return Arrays.toString(data);
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

