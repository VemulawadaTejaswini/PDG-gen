import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] xs = new long[n];
        long[] ys = new long[m];
        for (int i = 0; i < n; i++) {
            xs[i] = sc.nextLong();
        }
        for (int i = 0; i < m; i++) {
            ys[i] = sc.nextLong();
        }
        long x = 0L;
        for (int k = 1; k <= n; k++) {
            x += (k - 1) * xs[k - 1] - (n - k) * xs[k - 1];
        }
        long y = 0L;
        for (int k = 1; k <= m; k++) {
            y += (k - 1) * ys[k - 1] - (m - k) * ys[k - 1];
        }
        System.out.println(new BigInteger(String.valueOf(x)).multiply(new BigInteger(String.valueOf(y))).remainder(new BigInteger(String.valueOf("1000000007"))));
    }
}
