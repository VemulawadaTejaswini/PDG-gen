import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;

    private static PrintWriter _out = new PrintWriter(System.out);
    private static PrintWriter _err = new PrintWriter(System.err);

    private void solve(Scanner sc) {
        int N = sc.nextInt();
        NavigableSet<Point> set1 = new TreeSet<>(new Comparator<Point>() { public int compare(Point p1, Point p2) { return (p1.x > p2.x ? 1 : (p1.x < p2.x ? -1 : 0)); } });
        NavigableSet<Point> set2 = new TreeSet<>(new Comparator<Point>() { public int compare(Point p1, Point p2) { return (p1.y > p2.y ? 1 : (p1.y < p2.y ? -1 : 0)); } });
        long cost = 0;
        Point[] points = new Point[N];
        for (int i = 0; i < N; ++i) {
            long x = sc.nextInt();
            long y = sc.nextInt();
            Point p = new Point(i, x, y);
            points[i] = p;
            set1.add(p);
            set2.add(p);
        }
        for (int i = 0; i < N; ++i) {
            Point p = points[i];
            Point p11 = set1.lower(p);
            Point p12 = set1.higher(p);
            Point p21 = set2.lower(p);
            Point p22 = set2.higher(p);
            long cost1 = 0;
            if (p11 == null && p12 == null) {
            } else if (p11 == null && p12 != null) {
                cost1 = Math.abs(p.x - p12.x);
            } else if (p11 != null && p12 == null) {
                cost1 = Math.abs(p.x - p11.x);
            } else {
                cost1 = Math.min(Math.abs(p.x - p11.x), Math.abs(p.x - p12.x));
            }
            long cost2 = 0;
            if (p21 == null && p22 == null) {
            } else if (p21 == null && p22 != null) {
                cost2 = Math.abs(p.y - p22.y);
            } else if (p21 != null && p22 == null) {
                cost2 = Math.abs(p.y - p21.y);
            } else {
                cost2 = Math.min(Math.abs(p.y - p21.y), Math.abs(p.y - p22.y));
            }
            cost += Math.min(cost1, cost2);
        }
        _out.println(cost - 1);
    }
    private static BigInteger C(long n, long r) {
        BigInteger res = BigInteger.ONE;
        for (long i = n; i > n - r; --i) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        for (long i = r; i > 1; --i) {
            res = res.divide(BigInteger.valueOf(i));
        }
        return res;
    }
    private static BigInteger P(long n, long r) {
        BigInteger res = BigInteger.ONE;
        for (long i = n; i > n - r; --i) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
    private static class Point implements Comparable<Point> {
        int n;
        long x;
        long y;
        public Point(int n, long x, long y) {
            this.n = n;
            this.x = x;
            this.y = y;
        }
        public boolean equals(Object o) {
            if (o instanceof Point) {
                Point that = (Point)o;
                return this.n == that.n && this.x == that.x && this.y == that.y;
            }
            return false;
        }
        public int hashCode() {
            int hashCode = 17;
            hashCode = hashCode * 31 + n;
            hashCode = hashCode * 31 + (int)(x ^ (x >>> 32));
            hashCode = hashCode * 31 + (int)(y ^ (y >>> 32));
            return hashCode;
        }
        public int compareTo(Point that) {
            if (this.n != that.n) {
                return this.n > that.n ? 1 : -1;
            }
            if (this.x != that.x) {
                return this.x > that.x ? 1 : -1;
            }
            if (this.y != that.y) {
                return this.y > that.y ? 1 : -1;
            }
            return 0;
        }
        public String toString() {
            return n + ":(" + x + ", " + y + ")";
        }
    }
    /*
     * 10^10 > Integer.MAX_VALUE = 2147483647 > 10^9
     * 10^19 > Long.MAX_VALUE = 9223372036854775807L > 10^18
     */
    public static void main(String[] args) {
        long S = System.currentTimeMillis();

        Scanner sc = new Scanner(System.in);
        new Main().solve(sc);
        _out.flush();

        long G = System.currentTimeMillis();
        if (elapsed) {
            _err.println((G - S) + "ms");
        }
        _err.flush();
    }
}