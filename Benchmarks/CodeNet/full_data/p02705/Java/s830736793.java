import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int r = sc.nextInt();

    BigDecimal l = new BigDecimal(r);
    BigDecimal ret = l.multiply(new BigDecimal(2))
        .multiply(new BigDecimal("3.141592"))
        .divide(new BigDecimal(100), 4, RoundingMode.DOWN)
        .multiply(new BigDecimal(100));

    System.out.println(ret.toString());
  }
}
