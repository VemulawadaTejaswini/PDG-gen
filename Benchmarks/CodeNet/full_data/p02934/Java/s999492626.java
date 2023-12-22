import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        BigDecimal sum = BigDecimal.ZERO;
        for (int i = 0; i < N; i++) {
            BigDecimal n = new BigDecimal(sc.next());
            n = BigDecimal.ONE.divide(n, 7, RoundingMode.HALF_EVEN);
            sum = sum.add(n, MathContext.UNLIMITED);
        }

        System.out.println(BigDecimal.ONE.divide(sum, 6, RoundingMode.HALF_EVEN).toPlainString());
        sc.close();
    }
}