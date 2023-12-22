import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        long jpy = 0;
        BigDecimal btc = BigDecimal.ZERO;
        for (int i = 0; i < count; i++) {
            BigDecimal amount = sc.nextBigDecimal();
            String unit = sc.next();
            if (unit.equals("JPY")) {
                jpy += amount.longValue();
            } else {
                btc = btc.add(amount);
            }
        }
        BigDecimal total = BigDecimal.valueOf(jpy).add(btc.multiply(BigDecimal.valueOf(380_000))).stripTrailingZeros();
        System.out.println(total.toPlainString());
    }
}