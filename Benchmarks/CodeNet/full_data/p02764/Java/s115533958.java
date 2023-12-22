import java.awt.geom.Point2D;
import java.io.*;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.DoublePredicate;

public class Main {

    static int N, K;
    static int[] X, Y, A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        X = new int[N];
        Y = new int[N];
        A = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
            A[i] = sc.nextInt();
        }
        System.out.println(BigDecimal.valueOf(solve()).toPlainString());
    }

    static double solve() {
//        Circle c1 = new Circle(0, 0, 2);
//        Circle c2 = new Circle(2, 0, 2);
//        debug( intersect(c1, c2) );
        // ちょっと前のABCで似たようなのなかったっけ？
        return minimizeD(0, 1000*1000*1000, Main::test);
    }

    static boolean test(double sec) {
        // sec秒で肉がK枚焼けるか
        // sec秒で焼ける距離で円が作れるのでそれらの交点と中心を対象にK枚焼けるか調べる
        Circle[] C = new Circle[N];
        for (int i = 0; i < N; i++) {
            C[i] = new Circle(X[i], Y[i], sec/(double)A[i]);
        }

        for (int i = 0; i < N; i++) {
            if( isOk(new Point(X[i], Y[i]), C) ) return true;
        }

        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {
                Point[] pp = intersect(C[i], C[j]);
                if( pp == null ) continue;

                if( isOk(pp[0], C) ) return true;
                if( isOk(pp[1], C) ) return true;
            }
        }
        return false;
    }

    static boolean isOk(Point p, Circle[] C) {
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            double dist = Point2D.distance(p.x, p.y, C[i].x, C[i].y);
            // ここでさぼって C[i].r >= dist とかすると酷い目に合う
            if( C[i].r > dist || Math.abs(C[i].r - dist) <= 1e-9 ) {
                cnt++;
            }
        }
        return cnt >= K;
    }

    static double minimizeD(double lo, double hi, DoublePredicate p) {
        int time = 0;
        while(time++ < 100) {
            double x = (hi + lo) / 2;
            if( p.test(x) ) {
                hi = x;
            } else {
                lo = x;
            }
        }
        return lo;
    }

    static Point[] intersect(Circle c0, Circle c1) {
        // https://stackoverflow.com/questions/3349125/circle-circle-intersection-points
        // http://paulbourke.net/geometry/circlesphere/
        Point p0 = new Point(c0.x, c0.y);
        Point p1 = new Point(c1.x, c1.y);
        double d = Point.dist(p0, p1);

        if( d > c0.r + c1.r ) return null;
        if( d < Math.abs(c0.r - c1.r) ) return null;

        double a = (c0.r*c0.r - c1.r*c1.r + d*d) / (2*d);
        double h = Math.sqrt(c0.r*c0.r - a*a);
        // p2 = p0 + a(p1-p0)/d
        Point p2 = Point.add(p0, Point.mul(Point.sub(p1, p0), a/d) );

        double x3 = p2.x + h*(p1.y - p0.y)/d;
        double y3 = p2.y - h*(p1.x - p0.x)/d;
        double x4 = p2.x - h*(p1.y - p0.y)/d;
        double y4 = p2.y + h*(p1.x - p0.x)/d;
        return new Point[]{ new Point(x3, y3), new Point(x4, y4)};
    }

    static class Point {
        double x, y;

        static double dist(Point p1, Point p2) {
            return Point2D.distance(p1.x, p1.y, p2.x, p2.y);
        }

        static Point sub(Point p1, Point p2) {
            return new Point(p1.x-p2.x, p1.y-p2.y);
        }

        static Point add(Point p1, Point p2) {
            return new Point(p1.x+p2.x, p1.y+p2.y);
        }

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        static Point mul(Point p, double m) {
            return new Point(p.x*m, p.y*m);
        }

        public String toString() {
            return "(" + BigDecimal.valueOf(x).toPlainString() + ", " + BigDecimal.valueOf(y).toPlainString() + ")";
        }
    }

    static class Circle {
        double x, y;
        double r;

        public Circle(double x, double y, double r) {
            this.x = x;
            this.y = y;
            this.r = r;
        }
    }

    @SuppressWarnings("unused")
    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        int[] nextIntArray(int n, int delta) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }
    }

    static void writeLines(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int a : as) pw.println(a);
        pw.flush();
    }

    static void writeLines(long[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (long a : as) pw.println(a);
        pw.flush();
    }

    static void writeSingleLine(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < as.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(as[i]);
        }
        pw.println();
        pw.flush();
    }

    static int max(int... as) {
        int max = Integer.MIN_VALUE;
        for (int a : as) max = Math.max(a, max);
        return max;
    }

    static int min(int... as) {
        int min = Integer.MAX_VALUE;
        for (int a : as) min = Math.min(a, min);
        return min;
    }

    static void debug(Object... args) {
        StringJoiner j = new StringJoiner(" ");
        for (Object arg : args) {
            if (arg == null) j.add("null");
            else if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }

    static void printSingleLine(int[] array) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < array.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(array[i]);
        }
        pw.println();
        pw.flush();
    }

    static int lowerBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] < value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    static int upperBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] <= value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}
