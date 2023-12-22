import java.math.BigDecimal;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        BigDecimal x = scanner.nextBigDecimal();
        BigDecimal y = scanner.nextBigDecimal();

        if (x.subtract(y).abs().compareTo(BigDecimal.ONE) > 0) {
            System.out.println("Alice");
        }
        else {
            System.out.println("Brown");
        }
    }
}

