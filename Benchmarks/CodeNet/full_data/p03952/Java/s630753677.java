import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.util.TreeSet;
import java.io.UncheckedIOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author daltao
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "daltao", 1 << 27);
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
            TaskB solver = new TaskB();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class TaskB {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            int x = in.readInt();
            if (x == 1 || x == 2 * n - 1) {
                out.println("No");
                return;
            }
            out.println("Yes");
            if (n == 2) {
                out.println("1 2 3");
                return;
            }

            int[] data = new int[2 * n];
            TreeSet<Integer> remain = new TreeSet<Integer>();
            for (int i = 1; i < 2 * n; i++) {
                remain.add(i);
            }
            if (x == 2) {
                data[n] = x;
                remain.remove(x);
                data[n - 1] = x + 1;
                remain.remove(x + 1);
                data[n + 1] = x - 1;
                remain.remove(x - 1);
                data[n + 2] = x + 2;
                remain.remove(x + 2);
            } else {
                data[n] = x;
                remain.remove(x);
                data[n - 1] = x - 1;
                remain.remove(x - 1);
                data[n + 1] = x + 1;
                remain.remove(x + 1);
                data[n + 2] = x - 2;
                remain.remove(x - 2);
            }

            for (int i = 1; i < 2 * n; i++) {
                if (data[i] == 0) {
                    data[i] = remain.pollFirst();
                }
            }

            for (int i = 1; i < 2 * n; i++) {
                out.println(data[i]);
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
                    throw new RuntimeException(e);
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

    static class FastOutput implements AutoCloseable, Closeable {
        private StringBuilder cache = new StringBuilder(1 << 20);
        private final Writer os;

        public FastOutput(Writer os) {
            this.os = os;
        }

        public FastOutput(OutputStream os) {
            this(new OutputStreamWriter(os));
        }

        public FastOutput println(String c) {
            cache.append(c).append('\n');
            return this;
        }

        public FastOutput println(int c) {
            cache.append(c).append('\n');
            return this;
        }

        public FastOutput flush() {
            try {
                os.append(cache);
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

    }
}

