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
            TaskE solver = new TaskE();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskE {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            int m = in.readInt();
            int[] a = new int[n];
            long[] presumOfA = new long[n];
            for (int i = 1; i < n; i++) {
                a[i] = in.readInt();
                presumOfA[i] = presumOfA[i - 1] + a[i];
            }
            int[][] b = new int[n + 1][m + 1];
            int[][] l = new int[n + 1][m + 1];
            int[][] r = new int[n + 1][m + 1];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    b[i][j] = in.readInt();
                }
            }

            long[][] intervals = new long[n + 1][n + 1];
            IntDeque deque = new IntDeque(n);
            for (int i = 1; i <= m; i++) {
                deque.clear();
                for (int j = 1; j <= n; j++) {
                    while (!deque.isEmpty() && b[deque.peekLast()][i] < b[j][i]) {
                        deque.removeLast();
                    }
                    if (deque.isEmpty()) {
                        l[j][i] = 1;
                    } else {
                        l[j][i] = deque.peekLast() + 1;
                    }
                    deque.addLast(j);
                }
                deque.clear();
                for (int j = n; j >= 1; j--) {
                    while (!deque.isEmpty() && b[deque.peekFirst()][i] < b[j][i]) {
                        deque.removeLast();
                    }
                    if (deque.isEmpty()) {
                        r[j][i] = n;
                    } else {
                        r[j][i] = deque.peekFirst() - 1;
                    }
                    deque.addFirst(j);
                }
            }


            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    int x = l[i][j];
                    int y = r[i][j];
                    intervals[i][y] += b[i][j];
                    intervals[x - 1][y] -= b[i][j];
                    intervals[i][i - 1] -= b[i][j];
                    intervals[x - 1][i - 1] += b[i][j];
                }
            }

            // push down
            for (int i = n + n; i >= 0; i--) {
                for (int j = 1; j <= n; j++) {
                    int k = i - j;
                    if (k < 1 || k > n) {
                        continue;
                    }
                    if (j + 1 <= n) {
                        intervals[j][k] += intervals[j + 1][k];
                    }
                    if (k + 1 <= n) {
                        intervals[j][k] += intervals[j][k + 1];
                    }
                    if (j + 1 <= n && k + 1 <= n) {
                        intervals[j][k] -= intervals[j + 1][k + 1];
                    }
                }
            }

            long ans = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    long profit = intervals[i][j] - (presumOfA[j - 1] - presumOfA[i - 1]);
                    ans = Math.max(ans, profit);
                }
            }

            out.println(ans);
        }

    }
    static class IntDeque {
        int[] data;
        int bpos;
        int epos;
        int cap;

        public IntDeque(int cap) {
            this.cap = cap + 1;
            this.data = new int[this.cap];
        }

        public boolean isEmpty() {
            return epos == bpos;
        }

        public int peekFirst() {
            return data[bpos];
        }

        private int last(int i) {
            return (i == 0 ? cap : i) - 1;
        }

        private int next(int i) {
            int n = i + 1;
            return n == cap ? 0 : n;
        }

        public int peekLast() {
            return data[last(epos)];
        }

        public int removeLast() {
            return data[epos = last(epos)];
        }

        public void addLast(int val) {
            data[epos] = val;
            epos = next(epos);
        }

        public void addFirst(int val) {
            data[bpos = last(bpos)] = val;
        }

        public void clear() {
            bpos = epos = 0;
        }

        public String toString() {
            StringBuilder builder = new StringBuilder();
            for (int i = bpos; i != epos; i = next(i)) {
                builder.append(data[i]).append(' ');
            }
            return builder.toString();
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
}

