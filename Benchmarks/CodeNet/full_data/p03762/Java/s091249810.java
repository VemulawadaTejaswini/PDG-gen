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
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                x += xs[j] - xs[i];
            }
        }
        long y = 0L;
        for (int k = 0; k < m - 1; k++) {
            for (int l = k + 1; l < m; l++) {
                y += ys[l] - ys[k];
            }
        }
        System.out.println(new BigInteger(String.valueOf(x)).multiply(new BigInteger(String.valueOf(y))).remainder(new BigInteger(String.valueOf("1000000007"))));
    }
}
