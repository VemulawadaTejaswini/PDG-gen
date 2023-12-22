import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BigDecimal power = BigDecimal.ONE;
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        BigDecimal v = BigDecimal.valueOf(1000000007L);
        for (int i = 2; i <= amount; i++) {
            power = power.multiply(BigDecimal.valueOf(i));
        }
        System.out.println(power.remainder(v));
    }
}
