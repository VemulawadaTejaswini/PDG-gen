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
            TaskD solver = new TaskD();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskD {
        NumberTheory.EulerSieve es = new NumberTheory.EulerSieve(10000000);
        int[][][] dp;
        int[] xs;
        int n;

        public void solve(int testNumber, FastInput in, FastOutput out) {
            n = in.readInt();
            xs = new int[n];
            for (int i = 0; i < n; i++) {
                xs[i] = in.readInt();
            }

            dp = new int[2][n][n];
            SequenceUtils.deepFill(dp, -1);
            int ans = dp(0, n - 1);
            out.println(ans);
        }

        public int feeOnFlip(int len) {
            if (len == 0) {
                return 0;
            }
            if (len == 2) {
                return 2;
            }
            if (es.isPrime(len)) {
                return 1;
            }
            return len % 2 + 2;
        }

        public int dp(int l, int r) {
            if (dp[0][l][r] == -1) {
                if (l == r) {
                    return dp[0][l][r] = feeOnFlip(1);
                }
                dp[0][l][r] = feeOnFlip(xs[r] - xs[l] + 1) + dpFlipped(l, r);
                for (int i = l; i < r; i++) {
                    dp[0][l][r] = Math.min(dp[0][l][r], dp(l, i) + dp(i + 1, r));
                }
            }
            return dp[0][l][r];
        }

        public int dpFlipped(int l, int r) {
            if (dp[1][l][r] == -1) {
                if (l == r) {
                    return dp[1][l][r] = 0;
                }
                if (l + 1 == r) {
                    return dp[1][l][r] = feeOnFlip(xs[r] - xs[l] - 1);
                }
                // flip or sep
                dp[1][l][r] = feeOnFlip(xs[r] - xs[l] - 1) + dp(l + 1, r - 1);
                for (int i = l + 1; i < r; i++) {
                    dp[1][l][r] = Math.min(dp[1][l][r], dpFlipped(l, i) + dpFlipped(i, r));
                }
            }
            return dp[1][l][r];
        }

    }
    static class NumberTheory {
        public static class EulerSieve {
            private int[] primes;
            private boolean[] isComp;
            private int primeLength;

            public boolean isPrime(int x) {
                if (x == 1) {
                    return false;
                }
                return !isComp[x];
            }

            public EulerSieve(int limit) {
                isComp = new boolean[limit + 1];
                primes = new int[limit + 1];
                primeLength = 0;
                for (int i = 2; i <= limit; i++) {
                    if (!isComp[i]) {
                        primes[primeLength++] = i;
                    }
                    for (int j = 0, until = limit / i; j < primeLength && primes[j] <= until; j++) {
                        int pi = primes[j] * i;
                        isComp[pi] = true;
                        if (i % primes[j] == 0) {
                            break;
                        }
                    }
                }
            }

        }

    }
    static class SequenceUtils {
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

    }
}

