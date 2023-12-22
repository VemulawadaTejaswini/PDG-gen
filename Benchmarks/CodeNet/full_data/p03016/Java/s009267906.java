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
            TaskF solver = new TaskF();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskF {
        DigitUtils.DigitBase base10 = new DigitUtils.DigitBase(10);

        public void solve(int testNumber, FastInput in, FastOutput out) {
            long L = in.readLong();
            long a = in.readLong();
            long b = in.readLong();

            NumberTheory.Modular mod = new NumberTheory.Modular(in.readInt());
            int maxDigit = base10.ceilLog(a + b * (L - 1));
            int minDigit = base10.ceilLog(a);
            int ans = 0;
            for (int i = minDigit; i <= maxDigit; i++) {
                long l = getL(i, a, b, L);
                long r = getR(i, a, b, L);
                ModMatrix mat = new ModMatrix(new int[][] {{mod.valueOf(base10.setBit(0, i, 1)), 1, 0},
                                {0, 1, mod.valueOf(b)}, {0, 0, 1}});
                ModMatrix vec = new ModMatrix(3, 1);
                vec.set(0, 0, ans);
                vec.set(1, 0, mod.valueOf(a + b * l));
                vec.set(2, 0, 1);
                ModMatrix transform = ModMatrix.pow(mat, r - l + 1, mod);
                ModMatrix after = ModMatrix.mul(transform, vec, mod);
                ans = after.get(0, 0);
            }

            out.println(ans);
        }

        public long getL(int digit, long a, long b, long L) {
            long l = 0;
            long r = L - 1;
            while (l < r) {
                long m = (l + r) >>> 1;
                long val = a + b * m;
                if (base10.ceilLog(val) >= digit) {
                    r = m;
                } else {
                    l = m + 1;
                }
            }
            return l;
        }

        public long getR(int digit, long a, long b, long L) {
            long l = 0;
            long r = L - 1;
            while (l < r) {
                long m = (l + r + 1) >>> 1;
                long val = a + b * m;
                if (base10.ceilLog(val) <= digit) {
                    l = m;
                } else {
                    r = m - 1;
                }
            }
            return l;
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
    static class DigitUtils {
        private DigitUtils() {}

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
            return a > limit / b;
        }

        public static class DigitBase {
            private long[] pow;
            private long base;

            public DigitBase(long base) {
                if (base <= 1) {
                    throw new IllegalArgumentException();
                }
                this.base = base;
                LongList ll = new LongList(64);
                ll.add(1);
                while (!isMultiplicationOverflow(ll.tail(), base, Long.MAX_VALUE)) {
                    ll.add(ll.tail() * base);
                }
                pow = ll.toArray();
            }

            public int ceilLog(long x) {
                int ans = 0;
                while (x > 0) {
                    x /= base;
                    ans++;
                }
                return ans;
            }

            public int getBit(long x, int i) {
                return (int) (x / pow[i] % base);
            }

            public long setBit(long x, int i, long val) {
                return x + (val - getBit(x, i)) * pow[i];
            }

        }

    }
    static class NumberTheory {
        public static class Modular {
            int m;

            public int getMod() {
                return m;
            }

            public Modular(int m) {
                this.m = m;
            }

            public Modular(long m) {
                this.m = (int) m;
                if (this.m != m) {
                    throw new IllegalArgumentException();
                }
            }

            public Modular(double m) {
                this.m = (int) m;
                if (this.m != m) {
                    throw new IllegalArgumentException();
                }
            }

            public int valueOf(int x) {
                x %= m;
                if (x < 0) {
                    x += m;
                }
                return x;
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

            public int plus(int x, int y) {
                return valueOf(x + y);
            }

            public String toString() {
                return "mod " + m;
            }

        }

    }
    static class ModMatrix {
        int[][] mat;
        int n;
        int m;

        public ModMatrix(ModMatrix model) {
            n = model.n;
            m = model.m;
            mat = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    mat[i][j] = model.mat[i][j];
                }
            }
        }

        public ModMatrix(int n, int m) {
            this.n = n;
            this.m = m;
            mat = new int[n][m];
        }

        public ModMatrix(int[][] mat) {
            if (mat.length == 0 || mat[0].length == 0) {
                throw new IllegalArgumentException();
            }
            this.n = mat.length;
            this.m = mat[0].length;
            this.mat = mat;
        }

        public void fill(int v) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    mat[i][j] = v;
                }
            }
        }

        public void asStandard(NumberTheory.Modular mod) {
            fill(0);
            if (mod.getMod() == 1) {
                return;
            }
            for (int i = 0; i < n && i < m; i++) {
                mat[i][i] = 1;
            }
        }

        public void set(int i, int j, int val) {
            mat[i][j] = val;
        }

        public int get(int i, int j) {
            return mat[i][j];
        }

        public static ModMatrix mul(ModMatrix a, ModMatrix b, NumberTheory.Modular modular) {
            ModMatrix c = new ModMatrix(a.n, b.m);
            for (int i = 0; i < c.n; i++) {
                for (int j = 0; j < c.m; j++) {
                    for (int k = 0; k < a.m; k++) {
                        c.mat[i][j] = modular.plus(c.mat[i][j], modular.mul(a.mat[i][k], b.mat[k][j]));
                    }
                }
            }
            return c;
        }

        public static ModMatrix pow(ModMatrix x, long n, NumberTheory.Modular modular) {
            if (n == 0) {
                ModMatrix r = new ModMatrix(x.n, x.m);
                r.asStandard(modular);
                return r;
            }
            ModMatrix r = pow(x, n >> 1, modular);
            r = ModMatrix.mul(r, r, modular);
            if (n % 2 == 1) {
                r = ModMatrix.mul(r, x, modular);
            }
            return r;
        }

        public String toString() {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    builder.append(mat[i][j]).append(' ');
                }
                builder.append('\n');
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
    static class LongList {
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

        private void ensureSpace(int need) {
            int req = size + need;
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

        public long tail() {
            checkRange(0);
            return data[size - 1];
        }

        public void add(long x) {
            ensureSpace(1);
            data[size++] = x;
        }

        public long[] toArray() {
            return Arrays.copyOf(data, size);
        }

        public String toString() {
            return Arrays.toString(Arrays.copyOf(data, size));
        }

    }
}

