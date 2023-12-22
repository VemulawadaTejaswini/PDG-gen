import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final BigInteger MOD = BigInteger.valueOf((long) 1e9 + 7);

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();
        int k = in.nextInt();

        for (int i=1; i <= k; i++) {
            out.println(combination(n-k+1, i).mod(MOD).multiply(combination(k-1, i-1)).mod(MOD));
        }
    }

    /**
     * Returns Combination(a, b) = aCb
     * @param a Integer
     * @param b Integer
     * @return Combination
     */

    private static BigInteger combination(int a, int b) {
        BigInteger ret = BigInteger.ONE;
        for (int i=a; i > a-b; i--) {
            ret = ret.multiply(BigInteger.valueOf(i));
        }
        for (int i=1; i <= b; i++) {
            ret = ret.divide(BigInteger.valueOf(i));
        }
        return ret;
    }


}
