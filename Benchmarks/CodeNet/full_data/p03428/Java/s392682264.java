import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.io.BufferedOutputStream;
import java.util.ArrayList;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Objects;
import java.util.List;
import java.io.Writer;
import java.io.BufferedReader;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        LightWriter out = new LightWriter(outputStream);
        BHoles solver = new BHoles();
        solver.solve(1, in, out);
        out.close();
    }

    static class BHoles {
        private static final double PI2 = Math.PI * 2;

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints(), m;
            BHoles.Point[] points = new BHoles.Point[n];
            for (int i = 0; i < n; i++) points[i] = new BHoles.Point(in.longs(), in.longs());
            List<BHoles.Point> hull = ConvexHull.makeHull(Arrays.asList(points));
            m = hull.size();
            for (int i = 0; i < m; i++) {
                BHoles.Point x = hull.get((i + m - 1) % m), y = hull.get(i), z = hull.get((i + 1) % m);
                y.ans = (x.sub(y).rotate().arg() - y.sub(z).rotate().arg()) / PI2;
                if (y.ans < 0) y.ans += 1.0;
            }
            for (int i = 0; i < n; i++) {
                out.ans(points[i].ans, 20).ln();
            }
        }

        private static class Point extends Vec2l {
            double ans;

            public Point(long x, long y) {
                super(x, y);
            }

        }

    }

    static class Vec2l implements Comparable<Vec2l> {
        public long x;
        public long y;

        public Vec2l(long x, long y) {
            this.x = x;
            this.y = y;
        }

        public Vec2l sub(Vec2l other) {
            return new Vec2l(x - other.x, y - other.y);
        }

        public Vec2l rotate() {
            return new Vec2l(y, -x);
        }

        public double arg() {
            return Math.atan2(y, x);
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vec2l vec2i = (Vec2l) o;
            return x == vec2i.x &&
                    y == vec2i.y;
        }

        public int hashCode() {
            return Objects.hash(x, y);
        }

        public String toString() {
            return "(" + x + ", " + y + ")";
        }

        public int compareTo(Vec2l o) {
            if (x == o.x) {
                return Long.compare(y, o.y);
            }
            return Long.compare(x, o.x);
        }

        public Vec2l clone() throws CloneNotSupportedException {
            return (Vec2l) super.clone();
        }

    }

    static class LightWriter implements AutoCloseable {
        private final Writer out;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter(Writer out) {
            this.out = out;
        }

        public LightWriter(OutputStream out) {
            this(new OutputStreamWriter(new BufferedOutputStream(out), Charset.defaultCharset()));
        }

        public LightWriter print(char c) {
            try {
                out.write(c);
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter print(String s) {
            try {
                out.write(s, 0, s.length());
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter ans(double x, int n) {
            if (!breaked) {
                print(' ');
            }
            if (x < 0) {
                print('-');
                x = -x;
            }
            x += Math.pow(10, -n) / 2;
            print(Long.toString((long) x)).print('.');
            x -= (long) x;
            for (int i = 0; i < n; i++) {
                x *= 10;
                print((char) ('0' + ((int) x)));
                x -= (int) x;
            }
            return this;
        }

        public LightWriter ln() {
            print(System.lineSeparator());
            breaked = true;
            if (autoflush) {
                try {
                    out.flush();
                } catch (IOException ex) {
                    throw new UncheckedIOException(ex);
                }
            }
            return this;
        }

        public void close() {
            try {
                out.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

        public long longs() {
            return Long.parseLong(string());
        }

    }

    static final class ConvexHull {
        public static <T extends Vec2l> List<T> makeHull(List<T> points) {
            List<T> newPoints = new ArrayList<>(points);
            Collections.sort(newPoints);
            return makeHullPresorted(newPoints);
        }

        public static <T extends Vec2l> List<T> makeHullPresorted(List<T> points) {
            if (points.size() <= 2) return points;

            List<T> upperHull = new ArrayList<>();
            for (T p : points) {
                while (upperHull.size() >= 2) {
                    T q = upperHull.get(upperHull.size() - 1);
                    T r = upperHull.get(upperHull.size() - 2);
                    if ((q.x - r.x) * (p.y - r.y) >= (q.y - r.y) * (p.x - r.x))
                        upperHull.remove(upperHull.size() - 1);
                    else
                        break;
                }
                upperHull.add(p);
            }
            upperHull.remove(upperHull.size() - 1);

            List<T> lowerHull = new ArrayList<>();
            for (int i = points.size() - 1; i >= 0; i--) {
                T p = points.get(i);
                while (lowerHull.size() >= 2) {
                    T q = lowerHull.get(lowerHull.size() - 1);
                    T r = lowerHull.get(lowerHull.size() - 2);
                    if ((q.x - r.x) * (p.y - r.y) >= (q.y - r.y) * (p.x - r.x))
                        lowerHull.remove(lowerHull.size() - 1);
                    else
                        break;
                }
                lowerHull.add(p);
            }
            lowerHull.remove(lowerHull.size() - 1);

            if (!(upperHull.size() == 1 && upperHull.equals(lowerHull)))
                upperHull.addAll(lowerHull);
            return upperHull;
        }

    }
}

