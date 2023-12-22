import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();

    BigDecimal bA = BigDecimal.valueOf(Math.sqrt(a));
    BigDecimal bB = BigDecimal.valueOf(Math.sqrt(b));
    BigDecimal bC = BigDecimal.valueOf(Math.sqrt(c));

    BigDecimal sub = bA.add(bB);
    if (sub.compareTo(bC) < 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
