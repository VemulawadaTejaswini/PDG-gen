import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int l = sc.nextInt();

    BigDecimal a = new BigDecimal(l).divide(new BigDecimal(3), 6, RoundingMode.DOWN);
    BigDecimal w = a;
    BigDecimal h = a;
    BigDecimal d = a;

    BigDecimal cube = w.multiply(h).multiply(d);

    BigDecimal rect;
    BigDecimal oldRect = cube;
    while (true) {
      w = w.subtract(BigDecimal.valueOf(0.1));
      h = h.add(BigDecimal.valueOf(0.1));
      rect = w.multiply(h).multiply(d);
      if (cube.compareTo(rect) > 0) {
        System.out.println(oldRect.doubleValue());
        return;
      }
      oldRect = rect;
    }
  }
}