import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
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
            FFractalShortestPath solver = new FFractalShortestPath();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class FFractalShortestPath {
        Debug debug = new Debug(false);

        public long min(long... x) {
            long ans = x[0];
            for (long a : x) {
                ans = Math.min(a, ans);
            }
            return ans;
        }

        public long move(long x1, long x2, long l, long r) {
            return min(x1 - l, r - x1, x2 - l, r - x2) + 1;
        }

        public void solve(int testNumber, FastInput in, FastOutput out) {
            int q = in.readInt();
            Radix radix = new Radix(3);
            for (int i = 0; i < q; i++) {
                long a = in.readLong() - 1;
                long b = in.readLong() - 1;
                long c = in.readLong() - 1;
                long d = in.readLong() - 1;
                long dist = Math.abs(a - c) + Math.abs(b - d);
                long d1 = -1;
                long d2 = -1;
                for (int j = 30; j >= 0; j--) {
                    long size = radix.valueOfBit(j);
                    if (Math.abs(a / size - c / size) >= 2 && (b % (3 * size)) / size == 1 && (d % (3 * size)) / size == 1) {
                        d1 = dist + 2 * move(b % (size * 3), d % (size * 3), size, size * 2 - 1);
                        break;
                    }
                }
                {
                    long tmp = a;
                    a = b;
                    b = tmp;
                }
                {
                    long tmp = c;
                    c = d;
                    d = tmp;
                }
                for (int j = 30; j >= 0; j--) {
                    long size = radix.valueOfBit(j);
                    if (Math.abs(a / size - c / size) >= 2 && b / size / 3 == 1 && d / size / 3 == 1) {
                        d2 = dist + 2 * move(b % (size * 3), d % (size * 3), size, size * 2 - 1);
                        break;
                    }
                }

                debug.debug("d1", d1);
                debug.debug("d2", d2);
                if (d1 != -1 || d2 != -1) {
                    if (d1 >= 0 && d2 >= 0) {
                        throw new RuntimeException();
                    }
                    out.println(Math.max(d1, d2));
                } else {
                    out.println(dist);
                }
            }
        }

    }

    static class FastInput {
        private final InputStream is;
        private byte[] buf = new byte[1 << 20];
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

    }

    static class LongList implements Cloneable {
        private int size;
        private int cap;
        private long[] data;
        private static final long[] EMPTY = new long[0];

        public LongList(int cap) {
            this.cap = cap;
            if (cap == 0) {
                data = EMPTY;
            } else {
                data = new long[cap];
            }
        }

        public LongList(LongList list) {
            this.size = list.size;
            this.cap = list.cap;
            this.data = Arrays.copyOf(list.data, size);
        }

        public LongList() {
            this(0);
        }

        public void ensureSpace(int req) {
            if (req > cap) {
                while (cap < req) {
                    cap = Math.max(cap + 10, 2 * cap);
                }
                data = Arrays.copyOf(data, cap);
            }
        }

        private void checkRange(int i) {
            if (i < 0 || i >= size) {
                throw new ArrayIndexOutOfBoundsException();
            }
        }

        public void add(long x) {
            ensureSpace(size + 1);
            data[size++] = x;
        }

        public void addAll(long[] x, int offset, int len) {
            ensureSpace(size + len);
            System.arraycopy(x, offset, data, size, len);
            size += len;
        }

        public void addAll(LongList list) {
            addAll(list.data, 0, list.size);
        }

        public long tail() {
            checkRange(0);
            return data[size - 1];
        }

        public long[] toArray() {
            return Arrays.copyOf(data, size);
        }

        public String toString() {
            return Arrays.toString(toArray());
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof LongList)) {
                return false;
            }
            LongList other = (LongList) obj;
            return SequenceUtils.equal(data, 0, size - 1, other.data, 0, other.size - 1);
        }

        public int hashCode() {
            int h = 1;
            for (int i = 0; i < size; i++) {
                h = h * 31 + Long.hashCode(data[i]);
            }
            return h;
        }

        public LongList clone() {
            LongList ans = new LongList();
            ans.addAll(this);
            return ans;
        }

    }

    static class DigitUtils {
        private DigitUtils() {
        }

        public static boolean isMultiplicationOverflow(long a, long b, long limit) {
            if (limit < 0) {
                limit = -limit;
            }
            if (a < 0) {
                a = -a;
            }
            if (b < 0) {
                b = -b;
            }
            if (a == 0 || b == 0) {
                return false;
            }
            //a * b > limit => a > limit / b
            return a > limit / b;
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

    static class Radix {
        private long[] pow;
        private long base;

        public Radix(long base) {
            if (base <= 1) {
                throw new IllegalArgumentException();
            }
            this.base = base;
            LongList ll = new LongList(64);
            ll.add(1);
            while (!DigitUtils.isMultiplicationOverflow(ll.tail(), base, Long.MAX_VALUE)) {
                ll.add(ll.tail() * base);
            }
            pow = ll.toArray();
        }

        public long valueOfBit(int i) {
            return pow[i];
        }

    }

    static class SequenceUtils {
        public static boolean equal(long[] a, int al, int ar, long[] b, int bl, int br) {
            if ((ar - al) != (br - bl)) {
                return false;
            }
            for (int i = al, j = bl; i <= ar; i++, j++) {
                if (a[i] != b[j]) {
                    return false;
                }
            }
            return true;
        }

    }

    static class Debug {
        private boolean offline;
        private PrintStream out = System.err;

        public Debug(boolean enable) {
            offline = enable && System.getSecurityManager() == null;
        }

        public Debug debug(String name, long x) {
            if (offline) {
                debug(name, "" + x);
            }
            return this;
        }

        public Debug debug(String name, String x) {
            if (offline) {
                out.printf("%s=%s", name, x);
                out.println();
            }
            return this;
        }

    }
}

