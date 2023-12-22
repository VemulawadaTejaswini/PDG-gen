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
            TaskC solver = new TaskC();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskC {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            long a = in.readLong();
            long b = in.readLong();

            long[] nums = new long[n + 2];
            for (int i = 2; i <= n + 1; i++) {
                nums[i] = in.readLong();
            }
            nums[1] = -(long) 1e18;


            int[] al = new int[n + 2];
            int[] bl = new int[n + 2];
            int[] ar = new int[n + 2];
            int[] br = new int[n + 2];

            al[1] = 1;
            bl[1] = 1;
            ar[1] = 1;
            br[1] = 1;
            for (int i = 2; i <= n + 1; i++) {
                if (nums[i] - nums[i - 1] >= a) {
                    al[i] = al[i - 1];
                } else {
                    al[i] = i;
                }
                if (nums[i] - nums[i - 1] >= b) {
                    bl[i] = bl[i - 1];
                } else {
                    bl[i] = i;
                }

                if (i + 1 <= n + 1) {
                    ar[i] = SequenceUtils.floorIndex(nums, nums[i + 1] - b, 1, i - 1) + 1;
                    br[i] = SequenceUtils.floorIndex(nums, nums[i + 1] - a, 1, i - 1) + 1;
                } else {
                    ar[i] = i;
                    br[i] = i;
                }
            }

            NumberTheory.Modular mod = new NumberTheory.Modular(1e9 + 7);
            ModBIT bita = new ModBIT(n + 1, mod);
            ModBIT bitb = new ModBIT(n + 1, mod);

            bita.update(1, 1);
            bitb.update(1, 1);

            for (int i = 2; i <= n + 1; i++) {
                int dpOfA = 0;
                if (ar[i] >= al[i]) {
                    if (ar[i] - 1 >= 1) {
                        dpOfA = mod.plus(dpOfA, bitb.query(ar[i] - 1));
                    }
                    if (al[i] - 2 >= 1) {
                        dpOfA = mod.subtract(dpOfA, bitb.query(al[i] - 2));
                    }
                }
                int dpOfB = 0;
                if (br[i] >= bl[i]) {
                    if (br[i] - 1 >= 1) {
                        dpOfB = mod.plus(dpOfB, bita.query(br[i] - 1));
                    }
                    if (bl[i] - 2 >= 1) {
                        dpOfB = mod.subtract(dpOfB, bita.query(bl[i] - 2));
                    }
                }

                bita.update(i, dpOfA);
                bitb.update(i, dpOfB);
            }

            int ans1 = mod.subtract(bita.query(n + 1), bita.query(n));
            int ans2 = mod.subtract(bitb.query(n + 1), bitb.query(n));
            int ans = mod.plus(ans1, ans2);

            out.println(ans);
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
    static class SequenceUtils {
        public static int floorIndex(long[] data, long x, int l, int r) {
            int index = Arrays.binarySearch(data, l, r + 1, x);
            if (index < 0) {
                return -(index + 1) - 1;
            }
            return index;
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

            public int plus(int x, int y) {
                return valueOf(x + y);
            }

            public int subtract(int x, int y) {
                return valueOf(x - y);
            }

            public String toString() {
                return "mod " + m;
            }

        }

    }
    static class ModBIT {
        private int[] data;
        private int n;
        private NumberTheory.Modular modular;

        public ModBIT(int n, NumberTheory.Modular mod) {
            this.n = n;
            data = new int[n + 1];
            this.modular = mod;
        }

        public int query(int i) {
            long sum = 0;
            for (; i > 0; i -= i & -i) {
                sum += data[i];
            }
            return modular.valueOf(sum);
        }

        public void update(int i, int mod) {
            if (i <= 0) {
                return;
            }
            for (; i <= n; i += i & -i) {
                data[i] = modular.plus(data[i], mod);
            }
        }

        public String toString() {
            StringBuilder builder = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                builder.append(query(i) - query(i - 1)).append(' ');
            }
            return builder.toString();
        }

    }
}

