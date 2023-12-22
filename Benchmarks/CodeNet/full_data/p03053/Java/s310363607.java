import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static final Scanner sc  = new Scanner(System.in);
    static final int MOD = (int) 1E9 + 7;
    static final int INF = Integer.MAX_VALUE;
    static final char BLACK = '#';
    static final char WHITE = '.';
    
    public static void main(String[] args) {
        int H = nint();
        int W = nint();
        char[][] A = nchars2(H, W);
        
        
        int countB = 0;
        Queue<Point> q = new ArrayDeque<>();
        for (int h = 0; h < H; h++) {
            for (int w = 0; w < W; w++) {
                if (A[h][w] == BLACK) {
                    countB++;
                    q.add(new Point(h, w));
                }
            }
        }
        
        Point minP = new Point(0, 0);
        Point maxP = new Point(H-1, W-1);
        int ans = 0;
        
        while (countB < H*W) {
            Set<Point> s = new HashSet<>();
            while (!q.isEmpty()) {
                s.add(q.poll());
            }
            
            for (Point p: s) {
                for (int i = 0; i < Point.mv4.length; i++) {
                    Point next = p.add(Point.mv4[i]);
                    if (next.isIn(minP, maxP) && A[next.h][next.w] == WHITE) {
                        q.add(next);
                        countB++;
                        A[next.h][next.w] = BLACK;
                    }
                }
            }
            ans++;
        }
        
        System.out.println(ans);
    }

    public static class Point {
        public int h;
        public int w;
        public Point(int h, int w) {
            this.h = h;
            this.w = w;
        }
        
        public boolean isIn(int minH, int maxH, int minW, int maxW) {
            return minH <= this.h && this.h <= maxH && minW <= this.w && this.w <= maxW;
        }
        
        public boolean isIn(Point min, Point max) {
            return isIn(min.h, max.h, min.w, max.w);
        }
        
        
        public Point add(Point mv) {
            return new Point(this.h + mv.h, this.w + mv.w);
        }
        
        @Override
        public boolean equals(Object obj) {
            Point that = (Point) obj;
            return this.h == that.h && this.w == that.w;
        }
        
        @Override
        public String toString() {
            return "(" + h + ", " + w + ")";
        }

        public static final Point[] mv8 = {
                new Point(1, 0), new Point( 0, 1), new Point(-1,  0), new Point(0, -1),
                new Point(1, 1), new Point(-1, 1), new Point(-1, -1), new Point(1, -1)};
        
        public static final Point[] mv4 = {
                new Point(1, 0), new Point( 0, 1), new Point(-1,  0), new Point(0, -1)};
    }
    
    private static int nint() {
        return sc.nextInt();
    }

    private static int[] nints(int n) {
        return nints(n, 0, 0);
    }

    private static int[] nints(int n, int padL, int padR) {
        int[] a = new int[padL + n + padR];
        for (int i = 0; i < n; i++)
            a[padL + i] = nint();
        return a;
    }

    private static long nlong() {
        return sc.nextLong();
    }

    private static long[] nlongs(int n) {
        return nlongs(n, 0, 0);
    }

    private static long[] nlongs(int n, int padL, int padR) {
        long[] a = new long[padL + n + padR];
        for (int i = 0; i < n; i++)
            a[padL + i] = nlong();
        return a;
    }

    private static double ndouble() {
        return sc.nextDouble();
    }
    
    private static double[] ndoubles(int n) {
        return ndoubles(n, 0, 0);
    }
    
    private static double[] ndoubles(int n, int padL, int padR) {
        double[] d = new double[n + padL + padR];
        for (int i = 0; i < n; i++) {
            d[padL + i] = ndouble();
        }
        return d;
    }

    private static String nstr() {
        return sc.next();
    }

    private static char[] nchars() {
        return sc.next().toCharArray();
    }

    private static char[] nchars(int padL, int padR) {
        char[] temp = sc.next().toCharArray();
        char[] ret = new char[temp.length + padL + padR];
        System.arraycopy(temp, 0, ret, padL, temp.length);
        return ret;
    }
    
    private static char[][] nchars2(int h, int w) {
        return nchars2(h, w, 0, 0);
    }

    private static char[][] nchars2(int h, int w, int padLU, int padRD) {
        char[][] a2 = new char[h + padLU + padRD][w + padLU + padRD];
        for (int i = 0; i < h; i++)
            System.arraycopy(nchars(), 0, a2[padLU + i], padLU, w);
        return a2;
    }
    
    private static long min(long... ls) {
        return Arrays.stream(ls).min().getAsLong();
    }
    
    private static long max(long... ls) {
        return Arrays.stream(ls).max().getAsLong();
    }
}
