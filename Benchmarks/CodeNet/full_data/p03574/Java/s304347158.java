import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;

    private static PrintWriter _out = new PrintWriter(System.out);
    private static PrintWriter _err = new PrintWriter(System.err);

    private static final int INF = Integer.MAX_VALUE / 2;

    private void solve(Scanner sc) {
        int H = sc.nextInt();
        int W = sc.nextInt();
        sc.nextLine();

        char[][] b = new char[H][];

        for (int i = 0; i < H; ++i) {
            b[i] = sc.nextLine().toCharArray();
        }

        for (int i = 0; i < H; ++i) {
            for (int j = 0; j < W; ++j) {
                if (b[i][j] == '.') {
                    int n = 0;
                    if (i > 0 && j > 0 && b[i - 1][j - 1] == '#') ++n;
                    if (i > 0 && b[i - 1][j] == '#') ++n;
                    if (i > 0 && j < W - 1 && b[i - 1][j + 1] == '#') ++n;
                    if (j > 0 && b[i][j - 1] == '#') ++n;
                    if (j < W - 1 && b[i][j + 1] == '#') ++n;
                    if (i < H - 1 && j > 0 && b[i + 1][j - 1] == '#') ++n;
                    if (i < H - 1 && b[i + 1][j] == '#') ++n;
                    if (i < H - 1 && j < W - 1 && b[i + 1][j + 1] == '#') ++n;
                    b[i][j] = (char)('0' + n);
                }
            }
        }
        for (int i = 0; i < H; ++i) {
            _out.println(new String(b[i]));
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