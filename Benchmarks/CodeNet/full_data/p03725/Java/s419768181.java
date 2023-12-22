import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;

    private static PrintWriter _out = new PrintWriter(System.out);
    private static PrintWriter _err = new PrintWriter(System.err);

    private int H;
    private int W;
    private int K;
    private int[][] b;

    private void solve(Scanner sc) {
        H = sc.nextInt();
        W = sc.nextInt();
        K = sc.nextInt();
        sc.nextLine();
        int x = 1;
        int y = 1;
        b = new int[H][W];
        for (int i = 0; i < H; ++i) {
            String s = sc.nextLine();
            for (int j = 0; j < W; ++j) {
                char ch = s.charAt(j);
                if (ch == '.') {
                    b[i][j] = 1;
                } else if (ch == 'S') {
                    b[i][j] = 2;
                    x = j;
                    y = i;
                } else {
                    b[i][j] = -1;
                }
            }
        }

        int rmin = Integer.MAX_VALUE;
        rmin = Math.min(rmin, search(x, y, 1, 0));
        rmin = Math.min(rmin, search(x, y, -1, 0));
        rmin = Math.min(rmin, search(x, y, 0, 1));
        rmin = Math.min(rmin, search(x, y, 0, -1));

        _out.println(rmin);
    }
    private int search(int x, int y, int dx, int dy) {
        if (edge(x, y)) {
            return 0;
        }

        for (int i = 0; i < K && b[y + dy][x + dx] >= 0; ++i) {
            x += dx;
            y += dy;
            if (edge(x, y)) {
                break;
            }
        }
        if (edge(x, y)) {
            return 1;
        }

        int xx = x + dx;
        int yy = y + dy;
        int k = 0;
        while (k < K) {
            if (b[yy][xx] < 0) {
                ++k;
                b[yy][xx] = 0;
            }
            if (edge(xx, yy)) {
                break;
            }
            xx += dx;
            yy += dy;
        }
        return search(x, y, dx, dy) + 1;
    }
    private boolean edge(int x, int y) {
        if (x <= 0 || y <= 0 || x >= W - 1 || y >= H - 1) {
            return true;
        } else {
            return false;
        }
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