import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
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
            CIntervalGame solver = new CIntervalGame();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class CIntervalGame {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            LR[] lrs = new LR[n];
            for (int i = 0; i < n; i++) {
                lrs[i] = new LR();
                lrs[i].l = in.readInt();
                lrs[i].r = in.readInt();
                lrs[i].id = i;
            }
            long ans1 = go(lrs);
            for (int i = 0; i < n; i++) {
                int tmp = lrs[i].l;
                lrs[i].l = -lrs[i].r;
                lrs[i].r = -tmp;
            }
            long ans2 = go(lrs);

            long ans = Math.max(ans1, ans2);
            out.println(ans);
        }

        public long go(LR[] lrs) {
            TreeSet<LR> sortByL = new TreeSet<>((a, b) -> a.l == b.l ? Integer.compare(a.id, b.id) : Integer.compare(a.l, b.l));
            TreeSet<LR> sortByR = new TreeSet<>((a, b) -> a.r == b.r ? Integer.compare(a.id, b.id) : Integer.compare(a.r, b.r));
            sortByL.addAll(Arrays.asList(lrs));
            sortByR.addAll(Arrays.asList(lrs));

            int cur = 0;
            long ans = 0;
            while (!sortByL.isEmpty()) {
                {
                    LR head = sortByL.pollLast();
                    sortByR.remove(head);
                    if (head.l > cur) {
                        ans += head.l - cur;
                        cur = head.l;
                    }
                }
                if (!sortByR.isEmpty()) {
                    LR tail = sortByR.pollFirst();
                    sortByL.remove(tail);
                    if (tail.r < cur) {
                        ans += cur - tail.r;
                        cur = tail.r;
                    }
                }
            }

            return ans + Math.abs(cur);
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

        public FastOutput append(long c) {
            cache.append(c);
            return this;
        }

        public FastOutput println(long c) {
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

    static class LR {
        int l;
        int r;
        int id;

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

