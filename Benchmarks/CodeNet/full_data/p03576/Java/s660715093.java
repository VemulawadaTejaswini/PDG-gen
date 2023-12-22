import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;

    private static PrintWriter _out = new PrintWriter(System.out);
    private static PrintWriter _err = new PrintWriter(System.err);

    private static final int INF = Integer.MAX_VALUE / 2;

    private static class Point implements Comparable<Point> {
        long x;
        long y;
        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public boolean equals(Object o) {
            if (o instanceof Point) {
                Point that = (Point)o;
                return this.x == that.x && this.y == that.y;
            }
            return false;
        }
        @Override
        public int hashCode() {
            int hashCode = 17;
            hashCode = hashCode * 31 + Long.hashCode(x);
            hashCode = hashCode * 31 + Long.hashCode(y);
            return hashCode;
        }
        @Override
        public int compareTo(Point that) {
            if (this.x < that.x) {
                return -1;
            } else if (this.x > that.x) {
                return 1;
            } else if (this.y < that.y) {
                return -1;
            } else if (this.x > that.x) {
                return 1;
            } else {
                return 0;
            }
        }
        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    private void solve(Scanner sc) {
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<Point> pList = new ArrayList<>();
        long minX = Long.MAX_VALUE;
        long minY = Long.MAX_VALUE;
        long maxX = Long.MIN_VALUE;
        long maxY = Long.MIN_VALUE;
        for (int i = 0; i < N; ++i) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            pList.add(new Point(x, y));
            minX = Math.min(minX, x);
            minY = Math.min(minY, y);
            maxX = Math.max(maxX, x);
            maxY = Math.max(maxY, y);
        }

        while (pList.size() > K) {
            int cntT = 0;
            int cntB = 0;
            int cntL = 0;
            int cntR = 0;
            for (Point p : pList) {
                if (p.x == minX) { ++cntL; }
                if (p.x == maxX) { ++cntR; }
                if (p.y == minY) { ++cntB; }
                if (p.y == maxY) { ++cntT; }
            }
            int cnt = Math.max(Math.max(cntR, cntL), Math.max(cntB, cntT));
            if (cntL == cnt && pList.size() - cntL >= K) {
                for (Iterator<Point> it = pList.iterator(); it.hasNext();) {
                    Point p = it.next();
                    if (p.x == minX) {
                        it.remove();
                    }
                }
            } else if (cntR == cnt && pList.size() - cntR >= K) {
                for (Iterator<Point> it = pList.iterator(); it.hasNext();) {
                    Point p = it.next();
                    if (p.x == maxX) {
                        it.remove();
                    }
                }
            } else if (cntB == cnt && pList.size() - cntB >= K) {
                for (Iterator<Point> it = pList.iterator(); it.hasNext();) {
                    Point p = it.next();
                    if (p.y == minY) {
                        it.remove();
                    }
                }
            } else if (cntT == cnt && pList.size() - cntT >= K) {
                for (Iterator<Point> it = pList.iterator(); it.hasNext();) {
                    Point p = it.next();
                    if (p.y == maxY) {
                        it.remove();
                    }
                }
            } else {
                break;
            }
            minX = Long.MAX_VALUE;
            minY = Long.MAX_VALUE;
            maxX = Long.MIN_VALUE;
            maxY = Long.MIN_VALUE;
            for (Point p : pList) {
                minX = Math.min(minX, p.x);
                minY = Math.min(minY, p.y);
                maxX = Math.max(maxX, p.x);
                maxY = Math.max(maxY, p.y);
            }
        }

        _out.println((maxX - minX) * (maxY - minY));
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