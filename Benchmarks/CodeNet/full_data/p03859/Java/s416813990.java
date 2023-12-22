import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.io.IOException;
import java.util.Deque;
import java.io.UncheckedIOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
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
            TaskC solver = new TaskC();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskC {
        NumberTheory.Modular mod = new NumberTheory.Modular(1e9 + 7);
        NumberTheory.Composite comp = new NumberTheory.Composite(10000, mod);
        int[] preSum;
        int[][] dp;
        int n;
        int m;
        Interval[] intervals;
        int zero = 3000;

        public void solve(int testNumber, FastInput in, FastOutput out) {
            n = in.readInt();
            m = in.readInt();
            char[] s = (" " + in.readString()).toCharArray();
            preSum = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                preSum[i] = preSum[i - 1] + s[i] - '0';
            }

            intervals = new Interval[m];
            for (int i = 0; i < m; i++) {
                intervals[i] = new Interval();
                intervals[i].l = in.readInt();
                intervals[i].r = in.readInt();
            }
            Arrays.sort(intervals, (a, b) -> a.l == b.l ? -(a.r - b.r) : a.l - b.l);
            Deque<Interval> deque = new ArrayDeque<>(m);
            for (int i = 0; i < m; i++) {
                if (deque.isEmpty()) {
                    deque.addLast(intervals[i]);
                } else if (deque.peekLast().l < intervals[i].l && deque.peekLast().r < intervals[i].r) {
                    deque.addLast(intervals[i]);
                }
            }
            intervals = deque.toArray(new Interval[0]);
            m = intervals.length;

            dp = new int[m + 1][6001];
            ArrayUtils.deepFill(dp, -1);
            Arrays.fill(dp[m], 0);
            dp[m][zero] = 1;

            int ans = dp(0, 3000);
            out.println(ans);
        }

        public int dp(int i, int j) {
            if (dp[i][j] == -1) {
                dp[i][j] = 0;
                Interval interval = intervals[i];
                int len = interval.r - interval.l + 1;
                int oneCnt = j - zero + preSum[interval.r] - preSum[interval.l - 1];
                int zeroCnt = len - oneCnt;

                int commonLength = 0;
                int originOneCnt = 0;
                if (i < m - 1 && intervals[i + 1].l <= interval.r) {
                    commonLength = interval.r - intervals[i + 1].l + 1;
                    originOneCnt = preSum[interval.r] - preSum[intervals[i + 1].l - 1];
                }
                int nonCommonLength = len - commonLength;

                for (int k = Math.max(commonLength - zeroCnt, 0); k <= oneCnt && k <= commonLength; k++) {
                    int contri = mod.mul(dp(i + 1, zero - originOneCnt + k),
                                    comp.composite(nonCommonLength, oneCnt - k));
                    dp[i][j] = mod.plus(dp[i][j], contri);
                }
            }
            return dp[i][j];
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

        public FastOutput println(int c) {
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
    static class NumberTheory {
        public static class Modular {
            int m;

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

        public static class InverseNumber {
            int[] inv;

            public InverseNumber(int[] inv, int limit, NumberTheory.Modular modular) {
                this.inv = inv;
                inv[1] = 1;
                int p = modular.m;
                for (int i = 2; i <= limit; i++) {
                    int k = p / i;
                    int r = p % i;
                    inv[i] = modular.mul(-k, inv[r]);
                }
            }

            public InverseNumber(int limit, NumberTheory.Modular modular) {
                this(new int[limit + 1], limit, modular);
            }

        }

        public static class Factorial {
            int[] fact;
            int[] inv;
            NumberTheory.Modular modular;

            public Factorial(int[] fact, int[] inv, NumberTheory.InverseNumber in, int limit,
                            NumberTheory.Modular modular) {
                this.modular = modular;
                this.fact = fact;
                this.inv = inv;
                fact[0] = inv[0] = 1;
                for (int i = 1; i <= limit; i++) {
                    fact[i] = modular.mul(fact[i - 1], i);
                    inv[i] = modular.mul(inv[i - 1], in.inv[i]);
                }
            }

            public Factorial(int limit, NumberTheory.Modular modular) {
                this(new int[limit + 1], new int[limit + 1], new NumberTheory.InverseNumber(limit, modular), limit,
                                modular);
            }

        }

        public static class Composite {
            final NumberTheory.Factorial factorial;
            final NumberTheory.Modular modular;

            public Composite(NumberTheory.Factorial factorial) {
                this.factorial = factorial;
                this.modular = factorial.modular;
            }

            public Composite(int limit, NumberTheory.Modular modular) {
                this(new NumberTheory.Factorial(limit, modular));
            }

            public int composite(int m, int n) {
                if (n > m) {
                    return 0;
                }
                return modular.mul(modular.mul(factorial.fact[m], factorial.inv[n]), factorial.inv[m - n]);
            }

        }

    }
    static class ArrayUtils {
        public static void deepFill(Object array, int val) {
            if (!array.getClass().isArray()) {
                throw new IllegalArgumentException();
            }
            if (array instanceof int[]) {
                int[] intArray = (int[]) array;
                Arrays.fill(intArray, val);
            } else {
                Object[] objArray = (Object[]) array;
                for (Object obj : objArray) {
                    deepFill(obj, val);
                }
            }
        }

    }
    static class Interval {
        int l;
        int r;

    }
    static class FastInput {
        private final InputStream is;
        private StringBuilder defaultStringBuf = new StringBuilder(1 << 13);
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

    }
}

