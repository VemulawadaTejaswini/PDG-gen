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
        int a = in.nextInt();
        int b = in.nextInt();

        out.println((a - b) % 2 == 0 ? Math.abs((a - b)/2) + Math.min(a, b) : "IMPOSSIBLE");
    }

}
