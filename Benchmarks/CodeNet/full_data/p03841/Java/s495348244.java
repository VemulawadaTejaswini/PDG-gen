import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.AbstractQueue;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.AbstractCollection;
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
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 29);
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
            DKThK solver = new DKThK();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class DKThK {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            PriorityQueue<Cond> pq = new PriorityQueue<>(n, (a, b) -> Integer.compare(a.index, b.index));

            int[] xs = new int[n];
            int[] ans = new int[n * n];
            Arrays.fill(ans, -1);
            for (int i = 0; i < n; i++) {
                int x = in.readInt() - 1;
                xs[i] = x;
                Cond cond = new Cond();
                cond.remain = i;
                cond.index = x;
                cond.e = i;
                ans[cond.index] = cond.e;
                if (cond.remain > 0) {
                    pq.add(cond);
                }
            }

            for (int i = 0; i < n * n; i++) {
                if (!pq.isEmpty() && pq.peek().index <= i) {
                    out.println("No");
                    return;
                }

                if (ans[i] != -1) {
                    Cond cond = new Cond();
                    cond.index = n * n;
                    cond.remain = n - xs[ans[i]] - 1;
                    cond.e = ans[i];
                    pq.add(cond);
                    continue;
                }


                if (pq.isEmpty()) {
                    out.println("No");
                    return;
                }
                Cond head = pq.remove();
                head.remain--;
                ans[i] = head.e;
                if (head.remain > 0) {
                    pq.add(head);
                }


            }

            out.println("Yes");
            for (int x : ans) {
                out.append(x + 1).append(' ');
            }
        }

    }

    static class Cond {
        int remain;
        int index;
        int e;

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

        public FastOutput append(String c) {
            cache.append(c);
            return this;
        }

        public FastOutput println(String c) {
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

