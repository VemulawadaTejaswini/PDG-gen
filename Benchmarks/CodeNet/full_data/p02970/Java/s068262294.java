import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static BigInteger MOD = BigInteger.valueOf((long) 1e9 + 7);

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();
        int d = in.nextInt();

        out.println((int) Math.ceil((double) n / (double) (d * 2 + 1)));
    }

}
