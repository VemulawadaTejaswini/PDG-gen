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
            TaskD solver = new TaskD();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskD {
        public char charAt(char[] c, int i) {
            return c[DigitUtils.mod(i, c.length)];
        }

        public void solve(int testNumber, FastInput in, FastOutput out) {
            char[] a = in.readString().toCharArray();
            char[] b = in.readString().toCharArray();
            int n = a.length;

            if (SequenceUtils.indexOf(b, 0, n - 1, '1') == -1) {
                if (SequenceUtils.indexOf(a, 0, n - 1, '1') >= 0) {
                    out.println(-1);
                } else {
                    out.println(0);
                }
                return;
            }


            int[] lefts = new int[n];
            int[] rights = new int[n];
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    for (int j = 0;; j--) {
                        if (charAt(b, j) == '1') {
                            lefts[i] = j;
                            break;
                        }
                    }
                } else {
                    lefts[i] = lefts[i - 1];
                    if (b[i] == '1') {
                        lefts[i] = i;
                    }
                }
            }

            for (int i = n - 1; i >= 0; i--) {
                if (i == n - 1) {
                    for (int j = n - 1;; j++) {
                        if (charAt(b, j) == '1') {
                            rights[i] = j;
                            break;
                        }
                    }
                } else {
                    rights[i] = rights[i + 1];
                    if (b[i] == '1') {
                        rights[i] = i;
                    }
                }
            }

            int[][] data = new int[n][2];
            int ans = (int) 1e9;

            // left rotate
            for (int i = 0; i <= n; i++) {
                int cost = i;
                for (int j = 0; j < n; j++) {
                    if (a[j] != charAt(b, j - i)) {
                        cost++;
                        data[j][0] = Math.max(0, (j - i) - lefts[j]);
                        data[j][1] = rights[j] - j;
                    } else {
                        data[j][0] = 0;
                        data[j][1] = 0;
                    }
                }
                cost += cost(data) * 2;
                ans = Math.min(ans, cost);
            }

            // right rotate
            for (int i = 0; i <= n; i++) {
                int cost = i;
                for (int j = 0; j < n; j++) {
                    if (a[j] != charAt(b, j + i)) {
                        cost++;
                        data[j][1] = Math.max(0, rights[j] - (j + i));
                        data[j][0] = j - lefts[j];
                    } else {
                        data[j][0] = 0;
                        data[j][1] = 0;
                    }

                }
                cost += cost(data) * 2;
                ans = Math.min(ans, cost);
            }

            out.println(ans);
        }

        public int cost(int[][] data) {
            Arrays.sort(data, (a, b) -> -Integer.compare(a[0], b[0]));
            int mx = 0;
            int ans = (int) 1e9;
            for (int l = 0, r; l < data.length; l = r + 1) {
                r = l;
                while (r + 1 < data.length && data[r + 1][0] == data[r][0]) {
                    r++;
                }
                ans = Math.min(ans, mx + data[l][0]);
                for (int i = l; i <= r; i++) {
                    mx = Math.max(mx, data[i][1]);
                }
            }
            return mx;
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

        public static int mod(int x, int mod) {
            x %= mod;
            if (x < 0) {
                x += mod;
            }
            return x;
        }

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
    static class SequenceUtils {
        public static int indexOf(char[] array, int l, int r, char val) {
            for (int i = l; i <= r; i++) {
                if (array[i] == val) {
                    return i;
                }
            }
            return -1;
        }

    }
}

