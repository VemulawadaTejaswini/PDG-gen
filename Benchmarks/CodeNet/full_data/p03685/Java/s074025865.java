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
        RandomWrapper rw = new RandomWrapper(new Random());

        public boolean inboard(GeometryUtils.Point2D a) {
            return GeometryUtils.near(a.x, 0) || GeometryUtils.near(a.y, 0) ||
                    GeometryUtils.near(a.x, c) || GeometryUtils.near(a.y, r);
        }

        public void solve(int testNumber, FastInput in, FastOutput out) {
            r = in.readInt();
            c = in.readInt();
            int n = in.readInt();
            List<GeometryUtils.Line2D> lineList = new ArrayList<>(4 + n);
            for (int i = 0; i < n; i++) {
                GeometryUtils.Point2D a = new GeometryUtils.Point2D(in.readInt(), in.readInt());
                GeometryUtils.Point2D b = new GeometryUtils.Point2D(in.readInt(), in.readInt());
                if (inboard(a) && inboard(b)) {
                    GeometryUtils.Line2D line = new GeometryUtils.Line2D(a, b);
                    lineList.add(line);
                }
            }

            GeometryUtils.Line2D[] lines = lineList.toArray(new GeometryUtils.Line2D[0]);
            boolean ans = dac(lines, 0, lines.length - 1);
            out.println(ans ? "YES" : "NO");
        }

        public boolean dac(GeometryUtils.Line2D[] lines, int l, int r) {
            if (r <= l) {
                return true;
            }
            ArrayUtils.swap(lines, rw.nextInt(l, r), l);
            int sep = l + 1;
            for (int i = l + 1; i <= r; i++) {
                int sa = lines[l].whichSideIs(lines[i].a);
                int sb = lines[l].whichSideIs(lines[i].b);
                if (sa != sb) {
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

    static class GeometryUtils {
        private static final double PREC = 1e-12;

        public static double valueOf(double x) {
            return x > -PREC && x < PREC ? 0 : x;
        }

        public static boolean near(double a, double b) {
            return valueOf(a - b) == 0;
        }

        public static double cross(double x1, double y1, double x2, double y2) {
            return valueOf(x1 * y2 - y1 * x2);
        }

        public static class Point2D {
            public final double x;
            public final double y;

            public Point2D(double x, double y) {
                this.x = x;
                this.y = y;
            }

            public double cross(GeometryUtils.Point2D a, GeometryUtils.Point2D b) {
                return GeometryUtils.cross(a.x - x, a.y - y, b.x - x, b.y - y);
            }

            public String toString() {
                return String.format("(%f, %f)", x, y);
            }

            public int hashCode() {
                return (int) (Double.doubleToLongBits(x) * 31 + Double.doubleToLongBits(y));
            }

            public boolean equals(Object obj) {
                GeometryUtils.Point2D other = (GeometryUtils.Point2D) obj;
                return x == other.x && y == other.y;
            }

        }

        public static class Line2D {
            public final GeometryUtils.Point2D a;
            public final GeometryUtils.Point2D b;
            public final GeometryUtils.Point2D d;
            public final double theta;

            public Line2D(GeometryUtils.Point2D a, GeometryUtils.Point2D b) {
                this.a = a;
                this.b = b;
                d = new GeometryUtils.Point2D(valueOf(b.x - a.x), valueOf(b.y - a.y));
                theta = Math.atan2(d.y, d.x);
            }

            public int whichSideIs(GeometryUtils.Point2D pt) {
                return Double.compare(a.cross(b, pt), 0);
            }

            public String toString() {
                return d.toString();
            }

        }

    }

    static class ArrayUtils {
        public static <T> void swap(T[] data, int i, int j) {
            T tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
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

    static class RandomWrapper {
        private Random random;

        public RandomWrapper(Random random) {
            this.random = random;
        }

        public int nextInt(int l, int r) {
            return random.nextInt(r - l + 1) + l;
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
}

