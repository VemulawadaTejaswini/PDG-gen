import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;

    private static PrintWriter _out = new PrintWriter(System.out);
    private static PrintWriter _err = new PrintWriter(System.err);

    private void solve(Scanner sc) {
        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; ++i) {
            a[i] = sc.nextInt();
        }

        int[][] c = new int[H][W];
        int h = 0;
        int w = 0;
        int dh = 0;
        int dw = 1;
        for (int i = 0; i < N; ++i) {
            for (int cnt = 0; cnt < a[i]; ++cnt) {
                c[h][w] = i + 1;
                if (w + dw >= W) {
                    dw = 0;
                    dh = 1;
                } else if (h + dh >= H) {
                    dw = -1;
                    dh = 0;
                } else if (w + dw < 0) {
                    dh = -1;
                    dw = 0;
                } else if (h + dh < 0) {
                    dw = 1;
                    dh = 0;
                } else if (c[h + dh][w + dw] != 0) {
                    if (dw > 0) {
                        dw = 0;
                        dh = 1;
                    } else if (dh > 0) {
                        dw = -1;
                        dh = 0;
                    } else if (dw < 0) {
                        dh = -1;
                        dw = 0;
                    } else if (dh < 0) {
                        dw = 1;
                        dh = 0;
                    }
                }
                h += dh;
                w += dw;
            }
        }

        for (int i = 0; i < H; ++i) {
            for (int j = 0; j < W; ++j) {
                if (j > 0) {
                    _out.print(" ");
                }
                _out.print(c[i][j]);
            }
            _out.println();
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