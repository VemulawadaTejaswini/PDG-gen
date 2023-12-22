

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean local = false;
        boolean async = false;

        Charset charset = Charset.forName("ascii");

        FastIO io = local ? new FastIO(new FileInputStream("D:\\DATABASE\\TESTCASE\\Code.in"), System.out, charset) : new FastIO(System.in, System.out, charset);
        Task task = new Task(io, new Debug(local));

        if (async) {
            Thread t = new Thread(null, task, "dalt", 1 << 27);
            t.setPriority(Thread.MAX_PRIORITY);
            t.start();
            t.join();
        } else {
            task.run();
        }

        if (local) {
            io.cache.append("\n\n--memory -- \n" + ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) >> 20) + "M");
        }

        io.flush();
    }

    public static class Task implements Runnable {
        final FastIO io;
        final Debug debug;
        int inf = (int) 1e8;
        long lInf = (long) 1e18;
        double dInf = 1e50;

        public Task(FastIO io, Debug debug) {
            this.io = io;
            this.debug = debug;
        }

        @Override
        public void run() {
            //bf();
            solve();
        }

        public void bf() {
            int n = io.readInt();
            int q = io.readInt();

            int[] qs = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                qs[i] = io.readInt();
            }

            int[] seq = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                seq[i] = i;
            }

            debug.debug("seq", seq);
            for (int i = 1; i <= q; i++) {
                seq = extend(seq, qs[i]);
                debug.debug("seq", seq);
            }
        }


        public int[] extend(int[] seq, int k) {
            int[] data = new int[k + 1];
            for (int i = 1; i <= k; i++) {
                data[i] = seq[(i - 1) % (seq.length - 1) + 1];
            }
            return data;
        }

        public void solve() {
            int n = io.readInt();
            int q = io.readInt();

            long[] qs = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                qs[i] = io.readLong();
            }

            Deque<Long> deque = new ArrayDeque<>(q);
            for (int i = q; i >= 1; i--) {
                if (!deque.isEmpty() && deque.peekFirst() <= qs[i]) {
                    continue;
                }
                deque.addFirst(qs[i]);
            }

            long[] queries = deque.stream().mapToLong(Long::longValue)
                    .toArray();

            q = queries.length;
            long[] cnt = new long[n + 1];
            long[] cntOfQuries = new long[q];
            cntOfQuries[q - 1] = 1;
            for (int i = q - 1; i >= 0; i--) {
                long hold = queries[i];
                while (hold > 0) {
                    int next = indexOf(queries, hold - 1);
                    if (next < 0) {
                        break;
                    }
                    cntOfQuries[next] += hold / queries[next] * cntOfQuries[i];
                    hold %= queries[next];
                }
                cnt[n] += hold / n * cntOfQuries[i];
                cnt[(int) (hold % n)] += cntOfQuries[i];
            }

            debug.debug("cntOfQueries", cntOfQuries);
            debug.debug("cnt", cnt);
            for(int i = n - 1; i >= 1; i--){
                cnt[i] += cnt[i + 1];
            }

            for(int i = 1; i <= n; i++){
                io.cache.append(cnt[i]).append('\n');
            }
        }

        public int indexOf(long[] data, long x) {
            int index = Arrays.binarySearch(data, x);
            if (index < 0) {
                index = -(index + 1) - 1;
            }
            return index;
        }
    }

    public static class Interval {
        int r;
        int t;
        long l;

        public long length() {
            return t * l + r;
        }

        public void pick(long q) {
            pick0(q - length());
        }

        public void pick0(long q) {
            if (q == 0) {
                return;
            }
            if (r != t) {
                long used = Math.min(t - r, q);
                r += used;
                pick0(q - used);
                return;
            }
            if (q < t) {
                l++;
                r = (int) q;
                return;
            }
            long used = q / t;
            l += used;
            q -= t * used;
            pick0(q);
        }

        public long cntOfNumber(int i) {
            if (i > t) {
                return 0;
            }
            long cnt = l;
            if (r >= i) {
                cnt++;
            }
            return cnt;
        }
    }

    public static class FastIO {
        public final StringBuilder cache = new StringBuilder(1 << 13);
        private final InputStream is;
        private final OutputStream os;
        private final Charset charset;
        private StringBuilder defaultStringBuf = new StringBuilder(1 << 13);
        private byte[] buf = new byte[1 << 13];
        private int bufLen;
        private int bufOffset;
        private int next;

        public FastIO(InputStream is, OutputStream os, Charset charset) {
            this.is = is;
            this.os = os;
            this.charset = charset;
        }

        public FastIO(InputStream is, OutputStream os) {
            this(is, os, Charset.forName("ascii"));
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

        public long readLong() {
            int sign = 1;

            skipBlank();
            if (next == '+' || next == '-') {
                sign = next == '+' ? 1 : -1;
                next = read();
            }

            long val = 0;
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

        public double readDouble() {
            boolean sign = true;
            skipBlank();
            if (next == '+' || next == '-') {
                sign = next == '+';
                next = read();
            }

            long val = 0;
            while (next >= '0' && next <= '9') {
                val = val * 10 + next - '0';
                next = read();
            }
            if (next != '.') {
                return sign ? val : -val;
            }
            next = read();
            long radix = 1;
            long point = 0;
            while (next >= '0' && next <= '9') {
                point = point * 10 + next - '0';
                radix = radix * 10;
                next = read();
            }
            double result = val + (double) point / radix;
            return sign ? result : -result;
        }

        public String readString(StringBuilder builder) {
            skipBlank();

            while (next > 32) {
                builder.append((char) next);
                next = read();
            }

            return builder.toString();
        }

        public String readString() {
            defaultStringBuf.setLength(0);
            return readString(defaultStringBuf);
        }

        public int readLine(char[] data, int offset) {
            int originalOffset = offset;
            while (next != -1 && next != '\n') {
                data[offset++] = (char) next;
                next = read();
            }
            return offset - originalOffset;
        }

        public int readString(char[] data, int offset) {
            skipBlank();

            int originalOffset = offset;
            while (next > 32) {
                data[offset++] = (char) next;
                next = read();
            }

            return offset - originalOffset;
        }

        public int readString(byte[] data, int offset) {
            skipBlank();

            int originalOffset = offset;
            while (next > 32) {
                data[offset++] = (byte) next;
                next = read();
            }

            return offset - originalOffset;
        }

        public char readChar() {
            skipBlank();
            char c = (char) next;
            next = read();
            return c;
        }

        public void flush() throws IOException {
            os.write(cache.toString().getBytes(charset));
            os.flush();
            cache.setLength(0);
        }

        public boolean hasMore() {
            skipBlank();
            return next != -1;
        }
    }

    public static class Debug {
        private boolean allowDebug;

        public Debug(boolean allowDebug) {
            this.allowDebug = allowDebug;
        }

        public void assertTrue(boolean flag) {
            if (!allowDebug) {
                return;
            }
            if (!flag) {
                fail();
            }
        }

        public void fail() {
            throw new RuntimeException();
        }

        public void assertFalse(boolean flag) {
            if (!allowDebug) {
                return;
            }
            if (flag) {
                fail();
            }
        }

        private void outputName(String name) {
            System.out.print(name + " = ");
        }

        public void debug(String name, int x) {
            if (!allowDebug) {
                return;
            }

            outputName(name);
            System.out.println("" + x);
        }

        public void debug(String name, long x) {
            if (!allowDebug) {
                return;
            }
            outputName(name);
            System.out.println("" + x);
        }

        public void debug(String name, double x) {
            if (!allowDebug) {
                return;
            }
            outputName(name);
            System.out.println("" + x);
        }

        public void debug(String name, int[] x) {
            if (!allowDebug) {
                return;
            }
            outputName(name);
            System.out.println(Arrays.toString(x));
        }

        public void debug(String name, long[] x) {
            if (!allowDebug) {
                return;
            }
            outputName(name);
            System.out.println(Arrays.toString(x));
        }

        public void debug(String name, double[] x) {
            if (!allowDebug) {
                return;
            }
            outputName(name);
            System.out.println(Arrays.toString(x));
        }

        public void debug(String name, Object x) {
            if (!allowDebug) {
                return;
            }
            outputName(name);
            System.out.println("" + x);
        }

        public void debug(String name, Object... x) {
            if (!allowDebug) {
                return;
            }
            outputName(name);
            System.out.println(Arrays.deepToString(x));
        }
    }
}
