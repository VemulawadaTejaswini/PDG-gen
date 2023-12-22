import java.math.BigDecimal;
import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double x = sc.nextDouble();
    double pi = 3.14;
    BigDecimal ans = new BigDecimal(2*x*pi);
    System.out.println(ans);
  }
}  