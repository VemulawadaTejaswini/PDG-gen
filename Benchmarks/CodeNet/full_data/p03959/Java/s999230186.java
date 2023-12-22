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
 * Built using CHelper plug-in Actual solution is at the top
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
            TaskC solver = new TaskC();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskC {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            NumberTheory.Modular mod = new NumberTheory.Modular((int) 1e9 + 7);

            int n = in.readInt();
            int[] head = new int[n];
            int[] tail = new int[n];
            for (int i = 0; i < n; i++) {
                head[i] = in.readInt();
            }
            for (int i = 0; i < n; i++) {
                tail[i] = in.readInt();
            }
            int[] limit = new int[n];
            int[] certain = new int[n];
            Arrays.fill(limit, (int) 1e9);
            Arrays.fill(certain, -1);
            int last = 0;
            for (int i = 0; i < n; i++) {
                if (head[i] > last) {
                    last = head[i];
                    certain[i] = last;
                }
                limit[i] = last;
            }
            last = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (tail[i] > last) {
                    last = tail[i];
                    certain[i] = tail[i];
                }
                limit[i] = Math.min(limit[i], last);
            }

            boolean flag = true;
            int l2r = 0;
            for (int i = 0; i < n; i++) {
                l2r = Math.max(l2r, certain[i]);
                if (l2r != head[i]) {
                    flag = false;
                }
            }
            int r2l = 0;
            for (int i = n - 1; i >= 0; i--) {
                r2l = Math.max(r2l, certain[i]);
                if (r2l != tail[i]) {
                    flag = false;
                }
            }

            if (!flag) {
                out.println(0);
                return;
            }

            int ans = 1;
            for (int i = 0; i < n; i++) {
                if (certain[i] != -1) {
                    continue;
                }
                ans = mod.mul(ans, limit[i]);
            }

            out.println(ans);
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
    static class NumberTheory {
        public static class Modular {
            int m;

            public Modular(int m) {
                this.m = m;
            }

            public int valueOf(long x) {
                x %= m;
                if (x < 0) {
                    x += m;
                }
                return (int) x;
            }

            public int mul(int x, int y) {
                return valueOf((long) x * y);
            }

            public String toString() {
                return "mod " + m;
            }

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

