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
            BFusingSlimes solver = new BFusingSlimes();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class BFusingSlimes {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            int[] x = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = in.readInt();
            }
//
//        Modular mod = new Modular(1e9 + 7);
//        Power power = new Power(mod);
//        Factorial fact = new Factorial(n, mod);
//        int inv2 = power.inverseByFermat(2);
//
//        int[] exp = new int[n];
//        exp[n - 1] = 0;
//        exp[n - 2] = x[n - 1] - x[n - 2];
//        for (int i = n - 3; i >= 0; i--) {
//            int contrib = 0;
//            contrib = mod.mul(inv2, exp[i + 1]);
//            contrib = mod.plus(contrib, x[i + 1] - x[i]);
//            exp[i] = contrib;
//        }
//
//        System.err.println(Arrays.toString(exp));
//        int ans = 0;
//        for (int i = 0; i < n; i++) {
//            ans = mod.plus(ans, exp[i]);
//        }
//        ans = mod.mul(ans, fact.fact(n - 1));

            out.println(bf(x));
        }

        public int bf(int[] x) {
            int n = x.length;
            int[] exp = new int[n];

            Modular mod = new Modular(1e9 + 7);
            Power power = new Power(mod);
            Factorial fact = new Factorial(n, mod);

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int contrib = x[j] - x[i];
                    int cnt = j - i + 1;
                    int prob = 0;
                    if (j < n - 1) {
                        prob = mod.mul(fact.fact(cnt - 2), fact.invFact(cnt));
                    } else {
                        prob = mod.mul(fact.fact(cnt - 2), fact.invFact(cnt - 1));
                    }
                    exp[i] = mod.plus(exp[i], mod.mul(contrib, prob));
                }
            }

            int ans = 0;
            for (int i = 0; i < n; i++) {
                ans = mod.plus(ans, exp[i]);
            }

            return mod.mul(ans, fact.fact(n - 1));
        }

    }

    static class InverseNumber {
        int[] inv;

        public InverseNumber(int[] inv, int limit, Modular modular) {
            this.inv = inv;
            inv[1] = 1;
            int p = modular.getMod();
            for (int i = 2; i <= limit; i++) {
                int k = p / i;
                int r = p % i;
                inv[i] = modular.mul(-k, inv[r]);
            }
        }

        public InverseNumber(int limit, Modular modular) {
            this(new int[limit + 1], limit, modular);
        }

    }

    static class Factorial {
        int[] fact;
        int[] inv;
        Modular modular;

        public Factorial(int[] fact, int[] inv, InverseNumber in, int limit, Modular modular) {
            this.modular = modular;
            this.fact = fact;
            this.inv = inv;
            fact[0] = inv[0] = 1;
            for (int i = 1; i <= limit; i++) {
                fact[i] = modular.mul(fact[i - 1], i);
                inv[i] = modular.mul(inv[i - 1], in.inv[i]);
            }
        }

        public Factorial(int limit, Modular modular) {
            this(new int[limit + 1], new int[limit + 1], new InverseNumber(limit, modular), limit, modular);
        }

        public int fact(int n) {
            return fact[n];
        }

        public int invFact(int n) {
            return inv[n];
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

        public String toString() {
            return "mod " + m;
        }

    }

    static class Power {
        final Modular modular;

        public Power(Modular modular) {
            this.modular = modular;
        }

    }
}

