import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.IOException;
import java.util.ArrayList;
import java.io.UncheckedIOException;
import java.util.function.Consumer;
import java.util.Objects;
import java.util.List;
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
            TaskF solver = new TaskF();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class TaskF {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            String s = in.readString();
            String t = in.readString();
            List<Character> a = toList(s);
            List<Character> b = toList(t);
            List<Character> common =
                    DiffUtils.longestCommonSubSequence(a, b);
            for (Character c : common) {
                out.append(c);
            }
        }

        public List<Character> toList(String s) {
            List<Character> list = new ArrayList<>(s.length());
            for (int i = 0; i < s.length(); i++) {
                list.add(s.charAt(i));
            }
            return list;
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

        public FastOutput append(Object c) {
            cache.append(c);
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

    static class DiffUtils {
        private DiffUtils() {
        }

        public static <T> List<T> longestCommonSubSequence(List<T> a, List<T> b) {
            List<T> result = new ArrayList<>();
            new DiffUtils.MyersAlgoLinearVariation<>(a, b).generateLCS(result::add);
            return result;
        }

        private static class MyersAlgoLinearVariation<T> {
            private List<T> a;
            private List<T> b;
            private DiffUtils.RangeArray furthest00;
            private DiffUtils.RangeArray furthestnm;
            private Consumer<T> consumer;

            public MyersAlgoLinearVariation(List<T> a, List<T> b) {
                this.a = a;
                this.b = b;
                furthest00 = new DiffUtils.RangeArray(-b.size(), a.size());
                furthestnm = new DiffUtils.RangeArray(-b.size(), a.size());
            }

            public void generateLCS(Consumer<T> consumer) {
                this.consumer = consumer;
                lcs(a, b);
            }

            private void output(List<T> list) {
                for (T t : list) {
                    consumer.accept(t);
                }
            }

            private void lcs0(List<T> a, List<T> b, int i, int u, int x, int d) {
                int n = a.size();
                int m = b.size();
                int y = x - i;
                int v = u - i;
                if (d > 1) {
                    lcs(a.subList(0, u), b.subList(0, v));
                    output(a.subList(u, x));
                    lcs(a.subList(x, n), b.subList(y, m));
                } else if (n < m) {
                    output(a);
                } else {
                    output(b);
                }
            }

            private void lcs(List<T> a, List<T> b) {
                int n = a.size();
                int m = b.size();
                if (n == 0 || m == 0) {
                    return;
                }
                furthest00.fill(-1, -m, n);
                furthestnm.fill(n + 1, -m, n);
                for (int d = 0; ; d++) {
                    for (int left = -d, right = d, i = left; i <= right; i += 2) {
                        if (i > n) {
                            continue;
                        }
                        if (i < -m) {
                            continue;
                        }
                        int x = 0;
                        if (i > left && i > -m) {
                            x = Math.max(x, Math.min(furthest00.get(i - 1) + 1, n));
                        }
                        if (i < right && i < n) {
                            x = Math.max(x, furthest00.get(i + 1));
                        }
                        int y = x - i;
                        while (x < n && y < m && Objects.equals(a.get(x), b.get(y))) {
                            x++;
                            y++;
                        }
                        furthest00.set(i, x);
                        if (furthest00.get(i) >= furthestnm.get(i)) {
                            lcs0(a, b, i, furthestnm.get(i), furthest00.get(i), d * 2 - 1);
                            return;
                        }
                    }
                    for (int left = -d + n - m, right = d + n - m, i = left; i <= right; i += 2) {
                        if (i > n) {
                            continue;
                        }
                        if (i < -m) {
                            continue;
                        }
                        int x = n;
                        if (i > left && i > -m) {
                            x = Math.min(x, furthestnm.get(i - 1));
                        }
                        if (i < right && i < n) {
                            x = Math.min(x, Math.max(0, furthestnm.get(i + 1) - 1));
                        }
                        int y = x - i;
                        while (x > 0 && y > 0 && Objects.equals(a.get(x - 1), b.get(y - 1))) {
                            x--;
                            y--;
                        }
                        furthestnm.set(i, x);
                        if (furthest00.get(i) >= furthestnm.get(i)) {
                            lcs0(a, b, i, furthestnm.get(i), furthest00.get(i), d * 2);
                            return;
                        }
                    }
                }
            }

        }

        private static class RangeArray {
            private int offset;
            private int[] data;

            public RangeArray(int left, int right) {
                this.offset = -left;
                this.data = new int[right - left + 1];
            }

            public int get(int i) {
                return data[i + offset];
            }

            public void set(int i, int val) {
                data[i + offset] = val;
            }

            public void fill(int val, int l, int r) {
                Arrays.fill(data, offset + l, offset + r + 1, val);
            }

        }

    }
}

