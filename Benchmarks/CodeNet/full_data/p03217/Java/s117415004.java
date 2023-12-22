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
            DSquareRotation solver = new DSquareRotation();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class DSquareRotation {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            int d = in.readInt();
            int d2 = d * 2;
            int[][] mat = new int[d2][d2];
            int[][][] sum = new int[3][d2][d2];
            for (int i = 0; i < n; i++) {
                int x = DigitUtils.mod(in.readInt(), d);
                int y = DigitUtils.mod(in.readInt(), d);
                mat[x][y]++;
            }
            for (int i = 0; i < d2; i++) {
                for (int j = 0; j < d2; j++) {
                    mat[i][j] = mat[i % d][j % d];
                }
            }

            IntBinarySearch ibs = new IntBinarySearch() {

                public boolean check(int mid) {
                    //0
                    int a = mid / d;
                    int b = mid % d;
                    long[] limits = new long[]{(long) a * a, (long) a * (a + 1), (long) (a + 1) * (a + 1)};
                    for (int t = 0; t < 3; t++) {
                        for (int i = 0; i < d2; i++) {
                            for (int j = 0; j < d2; j++) {
                                sum[t][i][j] = mat[i][j] > limits[t] ? 1 : 0;
                            }
                        }
                    }
                    for (int t = 0; t < 3; t++) {
                        for (int i = 0; i < d2; i++) {
                            for (int j = 0; j < d2; j++) {
                                if (j > 0) {
                                    sum[t][i][j] += sum[t][i][j - 1];
                                }
                            }
                        }
                    }
                    for (int t = 0; t < 3; t++) {
                        for (int i = 0; i < d2; i++) {
                            for (int j = 0; j < d2; j++) {
                                if (i > 0) {
                                    sum[t][i][j] += sum[t][i - 1][j];
                                }
                            }
                        }
                    }

                    for (int i = 0; i < d; i++) {
                        for (int j = 0; j < d; j++) {
                            int total = interval(sum[2], i, j, i + b - 1, j + b - 1)
                                    + interval(sum[1], i + b, j, i + d - 1, j + b - 1)
                                    + interval(sum[1], i, j + b, i + b - 1, j + d - 1)
                                    + interval(sum[0], i + b, j + b, i + d - 1, j + d - 1);
                            if (total == 0) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
            };

            int ans = ibs.binarySearch(0, (int) 1e9) - 1;
            out.println(ans);
        }

        public int interval(int[][] sum, int x1, int y1, int x2, int y2) {
            if (x1 > x2 || y1 > y2) {
                return 0;
            }
            int ans = sum[x2][y2];
            if (x1 > 0) {
                ans -= sum[x1 - 1][y2];
            }
            if (y1 > 0) {
                ans -= sum[x2][y1 - 1];
            }
            if (x1 > 0 && y1 > 0) {
                ans += sum[x1 - 1][y1 - 1];
            }
            return ans;
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

    }

    static class DigitUtils {
        private DigitUtils() {
        }

        public static int mod(int x, int mod) {
            x %= mod;
            if (x < 0) {
                x += mod;
            }
            return x;
        }

    }

    static abstract class IntBinarySearch {
        public abstract boolean check(int mid);

        public int binarySearch(int l, int r) {
            if (l > r) {
                throw new IllegalArgumentException();
            }
            while (l < r) {
                int mid = (l + r) >>> 1;
                if (check(mid)) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            }
            return l;
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
}

