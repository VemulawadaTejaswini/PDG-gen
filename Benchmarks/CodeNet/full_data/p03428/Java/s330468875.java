import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Deque;
import java.util.ArrayList;
import java.math.BigDecimal;
import java.util.Map;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.List;
import java.io.Closeable;
import java.io.Writer;
import java.util.Comparator;
import java.util.ArrayDeque;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 29);
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
            CHoles solver = new CHoles();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class CHoles {
        Debug debug = new Debug(false);

        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            Point2D[] pts = new Point2D[n];
            for (int i = 0; i < n; i++) {
                pts[i] = new Point2D(in.readInt(), in.readInt());
            }

            if (n == 2) {
                for (int i = 0; i < 2; i++) {
                    out.println(0.5);
                }
                return;
            }

            PointPolygon pointPolygon = new PointPolygon(Arrays.asList(pts));
            PointConvexHull ch = PointConvexHull.grahamScan(pointPolygon);
            List<Point2D> outside = ch.getData();
            Map<Point2D, Double> prob = new HashMap<>(n);
            KahanSummation sum = new KahanSummation();
            if (outside.size() == 2) {
                for (Point2D pt : outside) {
                    prob.put(pt, 0.5);
                }
                sum.add(1);
            } else {
                for (int i = 0; i < outside.size(); i++) {
                    Point2D a = outside.get(i);
                    Point2D b = outside.get(DigitUtils.mod(i - 1, outside.size()));
                    Point2D c = outside.get(DigitUtils.mod(i + 1, outside.size()));
                    double ab = a.distanceBetween(b);
                    double ac = a.distanceBetween(c);
                    double bc = b.distanceBetween(c);
                    double ans = Math.PI - GeometryUtils.triangleAngle(bc, ab, ac);
                    prob.put(a, ans);
                    sum.add(ans);
                }
            }

            debug.debug("sum", sum);
            for (Point2D pt : pts) {
                double ans = prob.getOrDefault(pt, 0D);
                ans /= sum.sum();
                out.println(ans);
            }
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

    static class Point2D {
        public final double x;
        public final double y;

        public Point2D(double x, double y) {
            this.x = x;//GeometryUtils.valueOf(x);
            this.y = y;//GeometryUtils.valueOf(y);
        }

        public double distance2Between(Point2D another) {
            double dx = x - another.x;
            double dy = y - another.y;
            return dx * dx + dy * dy;
        }

        public double distanceBetween(Point2D another) {
            return Math.sqrt(distance2Between(another));
        }

        public double cross(Point2D a, Point2D b) {
            return GeometryUtils.cross(a.x - x, a.y - y, b.x - x, b.y - y);
        }

        public String toString() {
            return String.format("(%f, %f)", x, y);
        }

        public int hashCode() {
            return (int) (Double.doubleToLongBits(x) * 31 + Double.doubleToLongBits(y));
        }

        public boolean equals(Object obj) {
            Point2D other = (Point2D) obj;
            return x == other.x && y == other.y;
        }

    }

    static class PointConvexHull extends PointPolygon {
        PointConvexHull(List<Point2D> points) {
            super(points);
        }

        public static PointConvexHull grahamScan(PointPolygon pointPolygon) {
            final Point2D[] points = pointPolygon.data.toArray(new Point2D[0]);
            int n = points.length;
            for (int i = 1; i < n; i++) {
                int cmp = points[i].y != points[0].y ? Double.compare(points[i].y, points[0].y)
                        : Double.compare(points[i].x, points[0].x);
                if (cmp >= 0) {
                    continue;
                }
                Point2D tmp = points[0];
                points[0] = points[i];
                points[i] = tmp;
            }


            Comparator<Point2D> cmp = new Comparator<Point2D>() {

                public int compare(Point2D o1, Point2D o2) {
                    return GeometryUtils.signOf(GeometryUtils.valueOf(-points[0].cross(o1, o2)));
                }
            };
            Arrays.sort(points, 1, n, cmp);

            int shrinkSize = 2;
            for (int i = 2; i < n; i++) {
                if (cmp.compare(points[i], points[shrinkSize - 1]) == 0) {
                    if (points[i].distance2Between(points[0]) > points[shrinkSize - 1].distance2Between(points[0])) {
                        points[shrinkSize - 1] = points[i];
                    }
                } else {
                    points[shrinkSize++] = points[i];
                }
            }

            n = shrinkSize;
            Deque<Point2D> stack = new ArrayDeque(n);
            stack.addLast(points[0]);
            for (int i = 1; i < n; i++) {
                while (stack.size() >= 2) {
                    Point2D last = stack.removeLast();
                    Point2D second = stack.peekLast();
                    if (GeometryUtils.valueOf(second.cross(points[i], last)) < 0) {
                        stack.addLast(last);
                        break;
                    }
                }
                stack.addLast(points[i]);
            }

            return new PointConvexHull(new ArrayList(stack));
        }

    }

    static class Debug {
        private boolean offline;
        private PrintStream out = System.err;
        static int[] empty = new int[0];

        public Debug(boolean enable) {
            offline = enable && System.getSecurityManager() == null;
        }

        public Debug debug(String name, Object x) {
            return debug(name, x, empty);
        }

        public Debug debug(String name, Object x, int... indexes) {
            if (offline) {
                if (x == null || !x.getClass().isArray()) {
                    out.append(name);
                    for (int i : indexes) {
                        out.printf("[%d]", i);
                    }
                    out.append("=").append("" + x);
                    out.println();
                } else {
                    indexes = Arrays.copyOf(indexes, indexes.length + 1);
                    if (x instanceof byte[]) {
                        byte[] arr = (byte[]) x;
                        for (int i = 0; i < arr.length; i++) {
                            indexes[indexes.length - 1] = i;
                            debug(name, arr[i], indexes);
                        }
                    } else if (x instanceof short[]) {
                        short[] arr = (short[]) x;
                        for (int i = 0; i < arr.length; i++) {
                            indexes[indexes.length - 1] = i;
                            debug(name, arr[i], indexes);
                        }
                    } else if (x instanceof boolean[]) {
                        boolean[] arr = (boolean[]) x;
                        for (int i = 0; i < arr.length; i++) {
                            indexes[indexes.length - 1] = i;
                            debug(name, arr[i], indexes);
                        }
                    } else if (x instanceof char[]) {
                        char[] arr = (char[]) x;
                        for (int i = 0; i < arr.length; i++) {
                            indexes[indexes.length - 1] = i;
                            debug(name, arr[i], indexes);
                        }
                    } else if (x instanceof int[]) {
                        int[] arr = (int[]) x;
                        for (int i = 0; i < arr.length; i++) {
                            indexes[indexes.length - 1] = i;
                            debug(name, arr[i], indexes);
                        }
                    } else if (x instanceof float[]) {
                        float[] arr = (float[]) x;
                        for (int i = 0; i < arr.length; i++) {
                            indexes[indexes.length - 1] = i;
                            debug(name, arr[i], indexes);
                        }
                    } else if (x instanceof double[]) {
                        double[] arr = (double[]) x;
                        for (int i = 0; i < arr.length; i++) {
                            indexes[indexes.length - 1] = i;
                            debug(name, arr[i], indexes);
                        }
                    } else if (x instanceof long[]) {
                        long[] arr = (long[]) x;
                        for (int i = 0; i < arr.length; i++) {
                            indexes[indexes.length - 1] = i;
                            debug(name, arr[i], indexes);
                        }
                    } else {
                        Object[] arr = (Object[]) x;
                        for (int i = 0; i < arr.length; i++) {
                            indexes[indexes.length - 1] = i;
                            debug(name, arr[i], indexes);
                        }
                    }
                }
            }
            return this;
        }

    }

    static class PointPolygon extends Polygon<Point2D> {
        public PointPolygon(List<Point2D> points) {
            super(points);
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

        public FastOutput append(double c) {
            cache.append(new BigDecimal(c).toPlainString());
            return this;
        }

        public FastOutput println(double c) {
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

    static class Polygon<T> {
        protected List<T> data;

        protected Polygon(List<T> data) {
            this.data = data;
        }

        public List<T> getData() {
            return data;
        }

    }

    static class GeometryUtils {
        public static final double PREC = 1e-15;

        public static double valueOf(double x) {
            return x > -PREC && x < PREC ? 0 : x;
        }

        public static double triangleAngle(double a, double b, double c) {
            double cosa = (b * b + c * c - a * a) / (2 * b * c);
            return Math.acos(cosa);
        }

        public static double cross(double x1, double y1, double x2, double y2) {
            return valueOf(x1 * y2 - y1 * x2);
        }

        public static int signOf(double x) {
            return x > 0 ? 1 : x < 0 ? -1 : 0;
        }

    }

    static class KahanSummation {
        private double error;
        private double sum;

        public double sum() {
            return sum;
        }

        public void add(double x) {
            x = x - error;
            double t = sum + x;
            error = (t - sum) - x;
            sum = t;
        }

        public String toString() {
            return new BigDecimal(sum).toString();
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
}

