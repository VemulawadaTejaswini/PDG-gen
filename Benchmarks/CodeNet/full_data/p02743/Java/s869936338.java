import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        BigDecimal abd = new BigDecimal(Math.sqrt(a));
        BigDecimal bbd = new BigDecimal(Math.sqrt(b));
        BigDecimal cbd = new BigDecimal(Math.sqrt(c));
        if (abd.add(bbd).compareTo(cbd) < 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}