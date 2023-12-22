
import java.math.BigDecimal;
import java.util.Scanner;

import static java.math.BigDecimal.ROUND_HALF_UP;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();


        BigDecimal as = BigDecimal.valueOf(a);
        BigDecimal bs = BigDecimal.valueOf(b);
        BigDecimal cs = BigDecimal.valueOf(c);

        if ((sqrt(as).add(sqrt(bs))).compareTo(sqrt(cs)) == -1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static BigDecimal sqrt(BigDecimal A) {
        final int SCALE = 1000;
        BigDecimal x0 = new BigDecimal("0");
        BigDecimal x1 = new BigDecimal(Math.sqrt(A.doubleValue()));
        while (!x0.equals(x1)) {
            x0 = x1;
            x1 = A.divide(x0, SCALE, ROUND_HALF_UP);
            x1 = x1.add(x0);
            x1 = x1.divide(BigDecimal.valueOf(2), SCALE, ROUND_HALF_UP);

        }
        return x1;
    }
}