import java.util.*;
import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double n = sc.nextDouble();
    double m = sc.nextDouble();
    double d = sc.nextDouble();
    BigDecimal bd1 = new BigDecimal(2 * (n - d));
    if(d == 0) bd1 = new BigDecimal(n - d);
    BigDecimal bd2 = new BigDecimal(m - 1);
    BigDecimal bd3 = new BigDecimal(n * n);
    BigDecimal bd4 = bd1.multiply(bd2);
    BigDecimal result = bd4.divide(bd3, 10, BigDecimal.ROUND_HALF_UP);
    System.out.println(result);
  }
}