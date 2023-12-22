
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BigDecimal  W = new BigDecimal(scanner.next());
        BigDecimal H = new BigDecimal(scanner.next());
        BigDecimal x = new BigDecimal(scanner.next());
        BigDecimal y = new BigDecimal(scanner.next());

        BigDecimal menseki = W.multiply(H).divide(BigDecimal.valueOf(2), BigDecimal.ROUND_UP);
        BigDecimal halfW = W.divide(BigDecimal.valueOf(2), BigDecimal.ROUND_UP);
        BigDecimal halfH = H.divide(BigDecimal.valueOf(2), BigDecimal.ROUND_UP);

        int divType = 0;
        if (halfW.compareTo(x) == 0
                && halfH.compareTo(y) == 0) {
            divType = 1;
        }
        System.out.printf("%f %d\n", menseki.doubleValue(), divType);
    }
}