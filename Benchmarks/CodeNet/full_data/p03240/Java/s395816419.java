import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final Scanner sc = new Scanner(System.in);
    static final int MOD = (int) 1E9 + 7;
    
    public static void main(String[] args) {
        int N = nint();
        Point[] a = new Point[N];
        for (int i = 0; i < N; i++) {
            a[i] = new Point(nint(), nint(), nint());
        }
        Arrays.sort(a, (p1, p2) -> p1.h - p2.h);
        
        for (int x = 0; x <= 100; x++) {
            loop: for (int y = 0; y <= 100; y++) {
                Point maybeC = new Point(x, y);
                maybeC.h = calc_H(maybeC, a[N-1]);
                
                for (int i = 0; i < a.length; i++) {
                    if (calc_h(maybeC, a[i]) != a[i].h) {
                        continue loop;
                    }
                }
                
                System.out.println(maybeC.forAns());
                return;
            }
        }
    }
    
    static int calc_H(Point maybeC, Point defined) {
        int absX = Math.abs(maybeC.x - defined.x);
        int absY = Math.abs(maybeC.y - defined.y);
        return defined.h + absX + absY;
    }
    
    static int calc_h(Point c, Point toCalc) {
        return Math.max(c.h - Math.abs(c.x - toCalc.x) - Math.abs(c.y - toCalc.y), 0);
    }
    
    static class Point {
        int x;
        int y;
        int h;
        public Point(int x, int y, int h) {
            super();
            this.x = x;
            this.y = y;
            this.h = h;
        }
        
        public Point(int x, int y) {
            this(x, y, -1);
        }
        
        @Override
        public String toString() {
            return String.format("Point[x:%d, y:%d, h:%d]", x, y, h);
        }
        
        public String forAns() {
            return x + " " + y + " " + h;
        }
    }

    private static long nlong() {
        return sc.nextLong();
    }

    private static int nint() {
        return sc.nextInt();
    }

    private static String nstr() {
        return sc.next();
    }

    private static char[] nsToChars() {
        return sc.next().toCharArray();
    }

    private static long[] nlongs(int n) {
        return nlongs(n, 0, 0);
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

    private static long[] nlongs(int n, int padL, int padR) {
        long[] a = new long[padL + n + padR];
        for (int i = 0; i < n; i++)
            a[padL + i] = nlong();
        return a;
    }

    private static String[] nstrs(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = nstr();
        return a;
    }

    private static char[][] nsToChars2D(int h, int w) {
        return nsToChars2D(h, w, 0);
    }

    private static char[][] nsToChars2D(int h, int w, int pad) {
        char[][] a2 = new char[h + pad * 2][w + pad * 2];
        for (int i = 0; i < h; i++)
            System.arraycopy(nsToChars(), 0, a2[pad + i], pad, w);
        return a2;
    }
}
