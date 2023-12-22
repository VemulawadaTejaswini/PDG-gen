import java.math.BigInteger;
import java.util.stream.*;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        long[] v = IntStream.range(0, n).mapToLong(i -> scanner.nextLong()).sorted().toArray();

        double ave = Arrays.stream(v).skip(n - a).average().getAsDouble();
        int count = 0;
        int max = 0, min;
        for (int i = 0; i < n; i++) {
            if (v[i] == v[n - a]) {
                count++;
                max = i;
            }
        }

        min = a - n + max + 1;
        max = max + 1 == n ? Math.min(b - n + max + 1, count) : min;

        BigInteger[] fac = new BigInteger[count + 1];
        fac[0] = BigInteger.ONE;
        for (int i = 1; i <= count; i++) {
            fac[i] = fac[i - 1].multiply(BigInteger.valueOf(i));
        }

        long ans = 0;
        for (int i = min; i <= max; i++) {
            ans += fac[count].divide(fac[count - i].multiply(fac[i])).longValue();
        }
        System.out.println(ave);
        System.out.println(ans);
    }
}