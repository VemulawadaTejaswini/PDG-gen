import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Map;
import java.io.Closeable;
import java.util.Map.Entry;
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
            TaskD solver = new TaskD();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskD {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            int m = in.readInt();
            Map<Integer, Integer> cntMap = new HashMap<>(n);
            int[] cnts = new int[m];
            int[] pairs = new int[m];
            for (int i = 0; i < n; i++) {
                int x = in.readInt();
                cntMap.put(x, cntMap.getOrDefault(x, 0) + 1);
            }

            long ans = 0;
            for (Map.Entry<Integer, Integer> kv : cntMap.entrySet()) {
                int k = kv.getKey();
                int v = kv.getValue();
                cnts[k % m] += v % 2;
                pairs[k % m] += v / 2;
                ans += v / 2;
            }

            ans += cnts[0] / 2;
            for (int i = 1; i < m; i++) {
                int j = m - i;
                if (j == i) {
                    ans += cnts[i] / 2;
                    cnts[i] %= 2;
                    continue;
                }
                int match = Math.min(cnts[i], cnts[j]);
                ans += match;
                cnts[i] -= match;
                cnts[j] -= match;
                if (cnts[i] == 0) {
                    continue;
                }
                match = Math.min(cnts[i], pairs[j] * 2);
                if (match % 2 == 1) {
                    match--;
                }
                ans = ans + match / 2;
                cnts[i] -= match;
                pairs[j] -= match / 2;
            }

            out.println(ans);
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

