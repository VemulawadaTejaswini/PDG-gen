import java.io.*;
import java.util.*;

public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;

    private static PrintWriter _out = new PrintWriter(System.out);
    private static PrintWriter _err = new PrintWriter(System.err);

    private Point s;
    private Point t;

    private Map<String, int[]> map;

    private boolean done;

    private void solve(Scanner sc) {
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int tx = sc.nextInt();
        int ty = sc.nextInt();
        s = new Point(sx, sy);
        t = new Point(tx, ty);

        map = new LinkedHashMap<>();
        map.put("U", new int[] { 0, 1 });
        map.put("R", new int[] { 1, 0 });
        map.put("D", new int[] { 0, -1 });
        map.put("L", new int[] { -1, 0 });

        search(0, s, t, new HashSet<>(), new StringBuilder());
    }
    private void search(int cnt, Point current, Point target, Set<Point> set, StringBuilder route) {
        if (cnt == 4) {
            _out.println(route);
            done = true;
            return;
        }

        if (done) {
            return;
        }

        Map<String, Point> directionMap = new HashMap<>();
        int minDistance = Integer.MAX_VALUE;
        String minDirection = null;
        for (Map.Entry<String, int[]> entry : map.entrySet()) {
            int[] d = entry.getValue();
            Point p = new Point(current.x + d[0], current.y + d[1]);
            if (!(set.contains(p) || target.equals(t) && p.equals(s) || target.equals(s) && p.equals(t))) {
                int distance = distance(p, target);
                if (distance < minDistance) {
                    minDistance = distance;
                    minDirection = entry.getKey();
                }
                directionMap.put(entry.getKey(), p);
            }
        }
        Point p = directionMap.get(minDirection);
        if (p.equals(target)) {
            if (cnt % 2 == 0) {
                target = s;
            } else {
                target = t;
            }
            route.append(minDirection);
            search(cnt + 1, p, target, set, route);
            route.delete(route.length() - 1, route.length());
        } else if (!set.contains(p)) {
            set.add(p);
            route.append(minDirection);
            search(cnt, p, target, set, route);
            set.remove(p);
            route.delete(route.length() - 1, route.length());
        }
    }
    private int distance(Point p1, Point p2) {
        return (int)(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }
    private long C(long n, long r) {
        long res = 1;
        for (long i = n; i > n - r; --i) {
            res *= i;
        }
        for (long i = r; i > 1; --i) {
            res /= i;
        }
        return res;
    }
    private long P(long n, long r) {
        long res = 1;
        for (long i = n; i > n - r; --i) {
            res *= i;
        }
        return res;
    }
    private static class Point implements Comparable<Point> {
        long x;
        long y;
        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
        public boolean equals(Object o) {
            if (o instanceof Point) {
                Point that = (Point)o;
                return this.x == that.x && this.y == that.y;
            }
            return false;
        }
        public int hashCode() {
            int hashCode = 17;
            hashCode = hashCode * 31 + (int)(x ^ (x >>> 32));
            hashCode = hashCode * 31 + (int)(y ^ (y >>> 32));
            return hashCode;
        }
        public int compareTo(Point that) {
            if (this.x != that.x) {
                return this.x > that.x ? 1 : -1;
            }
            if (this.y != that.y) {
                return this.y > that.y ? 1 : -1;
            }
            return 0;
        }
        public String toString() {
            return "(" + x + ", " + y + ")";
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