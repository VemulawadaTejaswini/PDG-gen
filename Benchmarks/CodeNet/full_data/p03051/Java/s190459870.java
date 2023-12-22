import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.IOException;
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
            XorSum3 solver = new XorSum3();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class XorSum3 {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.readLong();
            }

            DigitUtils.BitOperator bo = new DigitUtils.BitOperator();
            int[] bitCnts = new int[64];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 64; j++) {
                    bitCnts[j] += bo.bitAt(a[i], j);
                }
            }

            LinearBasis lb = new LinearBasis();
            for (int i = 0; i < n; i++) {
                long v = a[i];
                for (int j = 0; j < 64; j++) {
                    if (bitCnts[j] % 2 == 1) {
                        v = bo.setBit(v, j, false);
                    }
                }
                lb.add(v);
            }

            long maxAdd = lb.theMaximumNumberXor(0);
            long xor = 0;
            for (int i = 0; i < n; i++) {
                xor ^= a[i];
            }

            long ans = xor + maxAdd * 2;
            out.println(ans);
        }

    }
    static class DigitUtils {
        private static final long[] DIGIT_VALUES = new long[19];
        static {
            DIGIT_VALUES[0] = 1;
            for (int i = 1; i < 19; i++) {
                DIGIT_VALUES[i] = DIGIT_VALUES[i - 1] * 10;
            }
        }

        private DigitUtils() {}

        public static class BitOperator {
            public int bitAt(long x, int i) {
                return (int) ((x >> i) & 1);
            }

            public long setBit(long x, int i, boolean v) {
                if (v) {
                    x |= 1L << i;
                } else {
                    x &= ~(1L << i);
                }
                return x;
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
    static class FastOutput implements AutoCloseable, Closeable {
        private StringBuilder cache = new StringBuilder(10 << 20);
        private final Writer os;

        public FastOutput(Writer os) {
            this.os = os;
        }

        public FastOutput(OutputStream os) {
            this(new OutputStreamWriter(os));
        }

        public FastOutput println(long c) {
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
    static class LinearBasis {
        private long[] map = new long[64];
        private int size;

        private void afterAddBit(int bit) {
            for (int i = 63; i >= 0; i--) {
                if (i == bit || map[i] == 0) {
                    continue;
                }
                if (bitAt(map[i], bit) == 1) {
                    map[i] ^= map[bit];
                }
            }
        }

        public boolean add(long val) {
            for (int i = 63; i >= 0 && val != 0; i--) {
                if (bitAt(val, i) == 0) {
                    continue;
                }
                val ^= map[i];
            }
            if (val != 0) {
                int log = 63 - Long.numberOfLeadingZeros(val);
                map[log] = val;
                size++;
                afterAddBit(log);
                return true;
            }
            return false;
        }

        private long bitAt(long val, int i) {
            return (val >>> i) & 1;
        }

        public long theMaximumNumberXor(long x) {
            for (int i = 0; i < 64; i++) {
                if (map[i] == 0) {
                    continue;
                }
                if (bitAt(x, i) == 0) {
                    x ^= map[i];
                }
            }
            return x;
        }

    }
}

