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
            int n = in.readInt();
            int[] xs = new int[n];
            int[] dx = new int[n];
            int[] swap = new int[n];
            for (int i = 0; i < n; i++) {
                xs[i] = in.readInt();
                if (i > 0) {
                    dx[i] = xs[i] - xs[i - 1];
                } else {
                    dx[0] = xs[0];
                }
                swap[i] = i;
            }

            int m = in.readInt();
            int k = in.readInt();
            for (int i = 0; i < m; i++) {
                int j = in.readInt() - 1;
                ArrayUtils.swap(swap, j, j + 1);
            }

            Permutation perm = new Permutation(swap);

            int[] results = new int[n + 1];
            results[0] = dx[0];
            for (int i = 1; i < n; i++) {
                results[i] = dx[perm.apply(i, k)];
            }

            long prefix = 0;
            for (int i = 0; i < n; i++) {
                prefix += results[i];
                out.println(prefix);
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

        public FastOutput println(long c) {
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

    static class Permutation {
        int[] g;
        int[] idx;
        int[] l;
        int[] r;
        int n;

        public Permutation(int[] p) {
            this(p, p.length);
        }

        public Permutation(int[] p, int len) {
            n = len;
            boolean[] visit = new boolean[n];
            g = new int[n];
            l = new int[n];
            r = new int[n];
            idx = new int[n];
            int wpos = 0;
            for (int i = 0; i < n; i++) {
                int val = p[i];
                if (visit[val]) {
                    continue;
                }
                visit[val] = true;
                g[wpos] = val;
                l[wpos] = wpos;
                idx[val] = wpos;
                wpos++;
                while (true) {
                    int x = p[g[wpos - 1]];
                    if (visit[x]) {
                        break;
                    }
                    visit[x] = true;
                    g[wpos] = x;
                    l[wpos] = l[wpos - 1];
                    idx[x] = wpos;
                    wpos++;
                }
                for (int j = l[wpos - 1]; j < wpos; j++) {
                    r[j] = wpos - 1;
                }
            }
        }

        public int apply(int x, int p) {
            int i = idx[x];
            int dist = (i - l[i]) + p;
            int len = r[i] - l[i] + 1;
            dist %= len;
            if (dist < 0) {
                dist += len;
            }
            return g[dist + l[i]];
        }

        public String toString() {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < n; i++) {
                builder.append(apply(i, 1)).append(' ');
            }
            return builder.toString();
        }

    }

    static class ArrayUtils {
        public static void swap(int[] data, int i, int j) {
            int tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
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
}

