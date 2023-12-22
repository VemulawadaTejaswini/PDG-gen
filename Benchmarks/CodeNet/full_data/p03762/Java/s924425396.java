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
        BigInteger area = new BigInteger(String.valueOf(0));
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = 0; k < m - 1; k++) {
                    for (int l = k + 1; l < m; l++) {
                        area = area.add(new BigInteger(String.valueOf((xs[j] - xs[i]) * (ys[l] - ys[k]))));
                    }
                }
            }
        }
        System.out.println(area.remainder(new BigInteger(String.valueOf("1000000007"))));
    }
}
