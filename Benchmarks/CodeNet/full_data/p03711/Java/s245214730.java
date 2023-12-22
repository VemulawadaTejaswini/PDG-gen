import java.io.*;
import java.math.*;
import java.util.*;
 
public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;
 
    private static PrintWriter _out = new PrintWriter(System.out);
    private static PrintWriter _err = new PrintWriter(System.err);
 
    private void solve(Scanner sc) {
        String[] groups = {
            ",1,3,5,7,8,10,12,",
            ",4,6,9,11,",
            ",2,",
        };
 
        int x = sc.nextInt();
        int y = sc.nextInt();
 
        int g1;
        for (g1 = 0; g1 < groups.length; ++g1) {
            if (groups[g1].indexOf("," + x + ",") >= 0) {
                break;
            }
        }
        int g2;
        for (g2 = 0; g2 < groups.length; ++g2) {
            if (groups[g2].indexOf("," + y + ",") >= 0) {
                break;
            }
        }
        _out.println((g1 == g2 ? "Yes" : "No"));
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