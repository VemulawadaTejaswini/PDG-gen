import java.math.BigDecimal;
import java.util.*;
public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final Double n = sc.nextDouble();
        final int k = sc.nextInt();
        System.out.println(n + " " + k);
        Double d = 0.0;
        for (int i = 1; i <= n; i++) {
            if (i >= k) break;
            int t = 0;
            while (true) {
                if (i * (Math.pow(2, ++t)) >= k) {
                    double temp = (1.0d / n) * Math.pow(0.5, t);
                    d += temp;
                    break;
                }
            }
        }
        System.out.print(BigDecimal.valueOf(d).toPlainString());
    }
}