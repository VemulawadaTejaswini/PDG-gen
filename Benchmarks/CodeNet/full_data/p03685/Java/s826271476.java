import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.ArrayList;
import java.io.UncheckedIOException;
import java.util.List;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
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
            TaskA solver = new TaskA();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class TaskA {
        int r;
        int c;
        RandomWrapper rw = new RandomWrapper(new Random(0));

        public boolean inboard(IntPoint a) {
            return a.x == 0 || a.y == 0 ||
                    a.x == c || a.y == r;
        }

        public void solve(int testNumber, FastInput in, FastOutput out) {
            c = in.readInt();
            r = in.readInt();
            int n = in.readInt();
            List<IntLine> lineList = new ArrayList<>(4 + n);
            for (int i = 0; i < n; i++) {
                IntPoint a = new IntPoint(in.readInt(), in.readInt());
                IntPoint b = new IntPoint(in.readInt(), in.readInt());
                if (inboard(a) && inboard(b)) {
                    IntLine line = new IntLine(a, b);
                    lineList.add(line);
                }
            }

            IntLine[] lines = lineList.toArray(new IntLine[0]);
            boolean ans = dac(lines, 0, lines.length - 1);
            out.println(ans ? "YES" : "NO");
        }

        public boolean dac(IntLine[] lines, int l, int r) {
            if (r <= l) {
                return true;
            }
            ArrayUtils.swap(lines, rw.nextInt(l, r), l);
            int sep = l + 1;
            for (int i = l + 1; i <= r; i++) {
                int sa = lines[l].whichSide(lines[i].a);
                int sb = lines[l].whichSide(lines[i].b);
                if (sa == -sb) {
                    return false;
                }
                if (sa < 0) {
                    ArrayUtils.swap(lines, sep, i);
                    sep++;
                }
            }
            return dac(lines, l + 1, sep - 1) && dac(lines, sep, r);
        }

    }

    static class IntLine {
        IntPoint a;
        IntPoint b;

        public IntLine(IntPoint a, IntPoint b) {
            this.a = a;
            this.b = b;
        }

        public int whichSide(IntPoint pt) {
            long vecx = b.x - a.x;
            long vecy = b.y - a.y;
            long ptx = pt.x - a.x;
            long pty = pt.y - a.y;
            return Long.signum(vecx * pty - vecy * ptx);
        }

    }

    static class ArrayUtils {
        public static <T> void swap(T[] data, int i, int j) {
            T tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
        }

    }

    static class RandomWrapper {
        private Random random;

        public RandomWrapper(Random random) {
            this.random = random;
        }

        public int nextInt(int l, int r) {
            return random.nextInt(r - l + 1) + l;
        }

    }

    static class IntPoint {
        int x;
        int y;

        public IntPoint(int x, int y) {
            this.x = x;
            this.y = y;
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

        public FastOutput println(String c) {
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
}

