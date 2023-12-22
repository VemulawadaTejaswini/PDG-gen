import java.math.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int L = sc.nextInt();
    sc.close();

    double ans = (double) (L * L * L) / (3d * 3d * 3d);
    System.out.println(BigDecimal.valueOf(ans).toPlainString());
  }
}
