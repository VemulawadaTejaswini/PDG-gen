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
            TaskB solver = new TaskB();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class TaskB {
        Problem[] ps;
        int m;
        int v;
        int p;
        int n;

        public void solve(int testNumber, FastInput in, FastOutput out) {
            n = in.readInt();
            m = in.readInt();
            v = in.readInt();
            p = in.readInt();
            ps = new Problem[n];
            for (int i = 0; i < n; i++) {
                ps[i] = new Problem();
                ps[i].a = in.readInt();
            }

            Arrays.sort(ps, (a, b) -> Integer.compare(a.a, b.a));
            IntBinarySearch ibs = new IntBinarySearch() {

                public boolean check(int mid) {
                    return TaskB.this.check(mid);
                }
            };

            int index = ibs.binarySearch(0, n - 1);
            out.println(n - index);
        }

        public boolean check(int mid) {
            int remainChance = Math.max(0, v - (mid + 1));
            long threshold = ps[mid].a + m;
            long full = Math.max(0, remainChance - (p - 1));
            long row = 0;
            for (int i = mid + 1; i <= n - p; i++) {
                if (ps[i].a > threshold) {
                    return false;
                }
                long used = Math.min(m, threshold - ps[i].a);
                row -= used;
                if (row < 0) {
                    full--;
                    row += m;
                }
            }
            return (full < 0 || (full == 0 && row == 0));
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

    static abstract class IntBinarySearch {
        public abstract boolean check(int mid);

        public int binarySearch(int l, int r) {
            if (l > r) {
                throw new IllegalArgumentException();
            }
            while (l < r) {
                int mid = (l + r) >>> 1;
                if (check(mid)) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            }
            return l;
        }

    }

    static class Problem {
        int a;

    }
}

