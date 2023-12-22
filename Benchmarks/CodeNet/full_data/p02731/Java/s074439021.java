import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l = scanner.nextLine();
        BigDecimal d = new BigDecimal(l);
        BigDecimal a = new BigDecimal("3.0");
        BigDecimal r = d.divide(a, 10, RoundingMode.HALF_EVEN);
        BigDecimal result = r.pow(3);
        System.out.println(result);
    }
}