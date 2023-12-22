

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Random;

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
            solve();
        }

        public void solve() {
            char[] s = new char[1000000];
            int n = io.readString(s, 0);
            int p = minPeriod(s, n);
            if (p == 1) {
                answer(n, 1);
                return;
            }
            int cnt = n / p;
            if (cnt == 2) {
                answer(2, n - 1);
                return;
            }
            if (p == n) {
                answer(1, 1);
                return;
            }
            answer(2, n - cnt);
        }

        public void answer(int len, int cnt) {
            io.cache.append(len).append('\n').append(cnt);
        }

        public int minPeriod(char[] s, int n) {
            Hash h1 = new Hash(n, 31);
            Hash h2 = new Hash(n, 11);
            Hash h3 = new Hash(n, 19);
            h1.populate(s, n);
            h2.populate(s, n);
            h3.populate(s, n);
            for (int i = 1; i < n; i++) {
                if (n % i != 0) {
                    continue;
                }
                int h1Val = h1.partial(0, i - 1);
                int h2Val = h2.partial(0, i - 1);
                int h3Val = h3.partial(0,  i - 1);
                boolean flag = true;
                for (int j = 0; j + i <= n; j += i) {
                    if (h1Val != h1.partial(j, j + i - 1) ||
                            h2Val != h2.partial(j, j + i - 1) ||
                            h3Val != h3.partial(j, j + i - 1)) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    return i;
                }
            }
            return n;
        }
    }

    public static class NumberTheory {

        private static final Random RANDOM = new Random();

        public static class ExtLucasFactorial {
            int exp;
            int fact;
            int p;
            int pc;
            Modular modular;
            Power power;
            ExtGCD extGCD = new ExtGCD();
            int[] g;

            /**
             * O(pc)
             *
             * @param p  the prime
             * @param pc p^c
             * @param g  buffer
             */
            public ExtLucasFactorial(int p, int pc, int[] g) {
                this.p = p;
                this.pc = pc;
                this.g = g;
                modular = new Modular(pc);
                power = new Power(modular);
                g[0] = 1;
                g[1] = 1;
                for (int i = 2; i <= pc; i++) {
                    if (i % p == 0) {
                        g[i] = g[i - 1];
                    } else {
                        g[i] = modular.mul(g[i - 1], i);
                    }
                }
            }

            /**
             * return m! (mod pc) without any factor which is multiple of p.
             * <br>
             * O(\log_2^2{m})
             */
            private int fact(long m) {
                fact = 1;
                exp = 0;
                while (m > 1) {
                    exp += m / p;
                    fact = modular.mul(fact, power.pow(g[pc], m / pc));
                    fact = modular.mul(fact, g[(int) (m % pc)]);
                    m /= p;
                }
                return fact;
            }

            /**
             * Find C(m,n), it means choose n elements from a set whose size is m.
             * <br>
             * O(\log_2^2{m})
             */
            public int composite(long m, long n) {
                int v = fact(m);
                int e = exp;
                extGCD.extgcd(fact(n), pc);
                v = modular.mul(v, modular.valueOf(extGCD.getX()));
                e -= exp;
                extGCD.extgcd(fact(m - n), pc);
                v = modular.mul(v, modular.valueOf(extGCD.getX()));
                e -= exp;
                v = modular.mul(v, power.pow(p, e));
                return v;
            }
        }

        /**
         * Extend gcd
         */
        public static class ExtGCD {
            private long x;
            private long y;
            private long g;

            public long getX() {
                return x;
            }

            public long getY() {
                return y;
            }

            /**
             * Get g = Gcd(a, b) and find a way to set x and y to match ax+by=g
             */
            public long extgcd(long a, long b) {
                if (a >= b) {
                    g = extgcd0(a, b);
                } else {
                    g = extgcd0(b, a);
                    long tmp = x;
                    x = y;
                    y = tmp;
                }
                return g;
            }


            private long extgcd0(long a, long b) {
                if (b == 0) {
                    x = 1;
                    y = 0;
                    return a;
                }
                long g = extgcd0(b, a % b);
                long n = x;
                long m = y;
                x = m;
                y = n - m * (a / b);
                return g;
            }
        }

        public static class Gcd {
            public long gcd(long a, long b) {
                return a >= b ? gcd0(a, b) : gcd0(b, a);
            }

            private long gcd0(long a, long b) {
                return b == 0 ? a : gcd0(b, a % b);
            }

            public int gcd(int a, int b) {
                return a >= b ? gcd0(a, b) : gcd0(b, a);
            }

            private int gcd0(int a, int b) {
                return b == 0 ? a : gcd0(b, a % b);
            }
        }

        /**
         * Mod operations
         */
        public static class Modular {
            int m;

            public Modular(int m) {
                this.m = m;
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

            public int mul(long x, long y) {
                x = valueOf(x);
                y = valueOf(y);
                return valueOf(x * y);
            }

            public int plus(int x, int y) {
                return valueOf(x + y);
            }

            public int plus(long x, long y) {
                x = valueOf(x);
                y = valueOf(y);
                return valueOf(x + y);
            }

            public int subtract(int x, int y) {
                return valueOf(x - y);
            }

            public int subtract(long x, long y) {
                return valueOf(x - y);
            }

            @Override
            public String toString() {
                return "mod " + m;
            }
        }

        /**
         * Bit operations
         */
        public static class BitOperator {
            public int bitAt(int x, int i) {
                return (x >> i) & 1;
            }

            public int bitAt(long x, int i) {
                return (int) ((x >> i) & 1);
            }

            public int setBit(int x, int i, boolean v) {
                if (v) {
                    x |= 1 << i;
                } else {
                    x &= ~(1 << i);
                }
                return x;
            }

            public long setBit(long x, int i, boolean v) {
                if (v) {
                    x |= 1L << i;
                } else {
                    x &= ~(1L << i);
                }
                return x;
            }

            public long swapBit(long x, int i, int j) {
                int bi = bitAt(x, i);
                int bj = bitAt(x, j);
                x = setBit(x, i, bj == 1);
                x = setBit(x, j, bi == 1);
                return x;
            }

            public int swapBit(int x, int i, int j) {
                int bi = bitAt(x, i);
                int bj = bitAt(x, j);
                x = setBit(x, i, bj == 1);
                x = setBit(x, j, bi == 1);
                return x;
            }

            /**
             * Determine whether x is subset of y
             */
            public boolean subset(long x, long y) {
                return intersect(x, y) == x;
            }

            /**
             * Merge two set
             */
            public long merge(long x, long y) {
                return x | y;
            }

            public long intersect(long x, long y) {
                return x & y;
            }

            public long differ(long x, long y) {
                return x - intersect(x, y);
            }
        }

        /**
         * Power operations
         */
        public static class Power {
            public Modular getModular() {
                return modular;
            }

            final Modular modular;

            public Power(Modular modular) {
                this.modular = modular;
            }

            public int pow(int x, long n) {
                if (n == 0) {
                    return 1;
                }
                long r = pow(x, n >> 1);
                r = modular.valueOf(r * r);
                if ((n & 1) == 1) {
                    r = modular.valueOf(r * x);
                }
                return (int) r;
            }

            public int inverse(int x) {
                return pow(x, modular.m - 2);
            }

            public int pow2(int x) {
                return x * x;
            }

            public long pow2(long x) {
                return x * x;
            }

            public double pow2(double x) {
                return x * x;
            }
        }

        /**
         * Log operations
         */
        public static class Log2 {
            public int ceilLog(int x) {
                return 32 - Integer.numberOfLeadingZeros(x - 1);
            }

            public int floorLog(int x) {
                return 31 - Integer.numberOfLeadingZeros(x);
            }

            public int ceilLog(long x) {
                return 64 - Long.numberOfLeadingZeros(x - 1);
            }

            public int floorLog(long x) {
                return 63 - Long.numberOfLeadingZeros(x);
            }
        }

    }

    public static class Hash {
        private static final NumberTheory.Modular MOD = new NumberTheory.Modular((int) (1e9 + 7));
        private int[] inverse;
        private int[] xs;
        private int[] hash;
        private int n;

        public static interface ToHash<T> {
            int hash(T obj);
        }

        public Hash(Hash model) {
            inverse = model.inverse;
            hash = new int[model.hash.length];
            n = model.n;
            xs = model.xs;
        }

        public Hash(int size, int x) {
            inverse = new int[size];
            hash = new int[size];
            xs = new int[size];
            int invX = new NumberTheory.Power(MOD).inverse(x);
            inverse[0] = 1;
            xs[0] = 1;
            for (int i = 1; i < size; i++) {
                this.inverse[i] = MOD.mul(this.inverse[i - 1], invX);
                xs[i] = MOD.mul(xs[i - 1], x);
            }
        }

        public <T> void populate(T[] data, int n, ToHash<T> toHash) {
            this.n = n;
            hash[0] = toHash.hash(data[0]);
            for (int i = 1; i < n; i++) {
                hash[i] = MOD.plus(hash[i - 1], MOD.mul(toHash.hash(data[i]), xs[i]));
            }
        }

        public void populate(Object[] data, int n) {
            this.n = n;
            hash[0] = data[0].hashCode();
            for (int i = 1; i < n; i++) {
                hash[i] = MOD.plus(hash[i - 1], MOD.mul(data[i].hashCode(), xs[i]));
            }
        }

        public void populate(int[] data, int n) {
            this.n = n;
            hash[0] = data[0];
            for (int i = 1; i < n; i++) {
                hash[i] = MOD.plus(hash[i - 1], MOD.mul(data[i], xs[i]));
            }
        }

        public void populate(char[] data, int n) {
            this.n = n;
            hash[0] = data[0];
            for (int i = 1; i < n; i++) {
                hash[i] = MOD.plus(hash[i - 1], MOD.mul(data[i], xs[i]));
            }
        }

        public int partial(int l, int r) {
            int h = hash[r];
            if (l > 0) {
                h = MOD.plus(h, -hash[l - 1]);
                h = MOD.mul(h, inverse[l]);
            }
            return h;
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
