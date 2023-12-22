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
            EBlackOrWhite solver = new EBlackOrWhite();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class EBlackOrWhite {
        Modular mod = new Modular(1e9 + 7);
        Power power = new Power(mod);
        CachedPow cp = new CachedPow(2, mod);
        Combination comb = new Combination((int) 2e5, power);

        public void solve(int testNumber, FastInput in, FastOutput out) {
            int b = in.readInt();
            int w = in.readInt();

            int[] pb = calcProbs(b, w);
            int[] pw = calcProbs(w, b);

            ModPreSum pbPs = new ModPreSum(pb, mod);
            ModPreSum pwPs = new ModPreSum(pw, mod);
            for (int i = 1; i <= b + w; i++) {
                int ans = 0;
                ans = mod.plus(ans, mod.mul(pbPs.prefix(i - 1), 0));
                ans = mod.plus(ans, mod.mul(pwPs.prefix(i - 1), 1));
                int remain = 1;
                remain = mod.subtract(remain, pbPs.prefix(i - 1));
                remain = mod.subtract(remain, pwPs.prefix(i - 1));
                ans = mod.plus(ans, mod.mul(remain, cp.inverse(1)));

                out.println(ans);
            }
        }

        public int[] calcProbs(int b, int w) {
            int[] ans = new int[b + w + 1];
            ans[0] = 0;
            for (int i = 1; i < b + w; i++) {
                int prob = cp.inverse(i);
                prob = mod.mul(prob, comb.combination(i - 1, b - 1));
                ans[i] = prob;
            }
            ans[b + w] = 1;
            for (int i = 0; i < b + w; i++) {
                ans[b + w] = mod.subtract(ans[b + w], ans[i]);
            }
            return ans;
        }

    }

    static class ExtGCD {
        public static int extGCD(int a, int b, int[] xy) {
            if (a >= b) {
                return extGCD0(a, b, xy);
            }
            int ans = extGCD0(b, a, xy);
            SequenceUtils.swap(xy, 0, 1);
            return ans;
        }

        private static int extGCD0(int a, int b, int[] xy) {
            if (b == 0) {
                xy[0] = 1;
                xy[1] = 0;
                return a;
            }
            int ans = extGCD0(b, a % b, xy);
            int x = xy[0];
            int y = xy[1];
            xy[0] = y;
            xy[1] = x - a / b * y;
            return ans;
        }

    }

    static class IntExtGCDObject {
        private int[] xy = new int[2];

        public int extgcd(int a, int b) {
            return ExtGCD.extGCD(a, b, xy);
        }

        public int getX() {
            return xy[0];
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

        public FastOutput append(int c) {
            cache.append(c);
            return this;
        }

        public FastOutput println(int c) {
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

    static class Factorial {
        int[] fact;
        int[] inv;
        Modular mod;

        public Modular getMod() {
            return mod;
        }

        public Factorial(int[] fact, int[] inv, Power pow) {
            this.mod = pow.getModular();
            this.fact = fact;
            this.inv = inv;
            fact[0] = inv[0] = 1;
            for (int i = 1; i < fact.length; i++) {
                fact[i] = i;
                fact[i] = mod.mul(fact[i], fact[i - 1]);
            }
            inv[inv.length - 1] = pow.inverse(fact[inv.length - 1]);
            for (int i = inv.length - 2; i >= 1; i--) {
                inv[i] = mod.mul(inv[i + 1], i + 1);
            }
        }

        public Factorial(int limit, Power pow) {
            this(new int[limit + 1], new int[limit + 1], pow);
        }

        public int fact(int n) {
            return fact[n];
        }

        public int invFact(int n) {
            return inv[n];
        }

    }

    static interface InverseNumber {
    }

    static class Combination implements IntCombination {
        final Factorial factorial;
        final Modular modular;

        public Combination(Factorial factorial) {
            this.factorial = factorial;
            this.modular = factorial.getMod();
        }

        public Combination(int limit, Power pow) {
            this(new Factorial(limit, pow));
        }

        public int combination(int m, int n) {
            if (n > m || n < 0) {
                return 0;
            }
            return modular.mul(modular.mul(factorial.fact(m), factorial.invFact(n)), factorial.invFact(m - n));
        }

    }

    static class Power implements InverseNumber {
        static IntExtGCDObject extGCD = new IntExtGCDObject();
        final Modular modular;

        public Modular getModular() {
            return modular;
        }

        public Power(Modular modular) {
            this.modular = modular;
        }

        public int inverse(int x) {
            int ans = inverseExtGCD(x);
//        if(modular.mul(ans, x) != 1){
//            throw new IllegalStateException();
//        }
            return ans;
        }

        public int inverseExtGCD(int x) {
            if (extGCD.extgcd(x, modular.getMod()) != 1) {
                throw new IllegalArgumentException();
            }
            return modular.valueOf(extGCD.getX());
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

    static class Modular {
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

        public int subtract(int x, int y) {
            return valueOf(x - y);
        }

        public Modular getModularForPowerComputation() {
            return new Modular(m - 1);
        }

        public String toString() {
            return "mod " + m;
        }

    }

    static class SequenceUtils {
        public static void swap(int[] data, int i, int j) {
            int tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
        }

    }

    static interface IntCombination {
    }

    static class ModPreSum {
        private int[] pre;
        private Modular mod;

        public ModPreSum(int n, Modular mod) {
            pre = new int[n];
            this.mod = mod;
        }

        public void populate(int[] a) {
            int n = a.length;
            pre[0] = a[0];
            for (int i = 1; i < n; i++) {
                pre[i] = mod.plus(pre[i - 1], a[i]);
            }
        }

        public ModPreSum(int[] a, Modular mod) {
            this(a.length, mod);
            populate(a);
        }

        public int prefix(int i) {
            if (i < 0) {
                return 0;
            }
            return pre[Math.min(i, pre.length - 1)];
        }

    }

    static class CachedPow {
        private int[] first;
        private int[] second;
        private Modular mod;
        private Modular powMod;
        private static int step = 16;
        private static int limit = 1 << step;
        private static int mask = limit - 1;

        public CachedPow(int x, Modular mod) {
            this.mod = mod;
            this.powMod = mod.getModularForPowerComputation();
            first = new int[limit];
            second = new int[Integer.MAX_VALUE / limit + 1];
            first[0] = 1;
            for (int i = 1; i < first.length; i++) {
                first[i] = mod.mul(x, first[i - 1]);
            }
            second[0] = 1;
            int step = mod.mul(x, first[first.length - 1]);
            for (int i = 1; i < second.length; i++) {
                second[i] = mod.mul(second[i - 1], step);
            }
        }

        public int pow(int exp) {
            return mod.mul(first[exp & mask], second[exp >> step]);
        }

        public int inverse(int exp) {
            return pow(powMod.valueOf(-exp));
        }

    }
}

