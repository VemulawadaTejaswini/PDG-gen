import static java.math.BigDecimal.ROUND_HALF_DOWN;

import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(sc.next());
    }
    BigDecimal ans = IntStream.of(a)
      .mapToObj(
        i -> BigDecimal.valueOf(1, 10).divide(BigDecimal.valueOf(i, 10), 10, ROUND_HALF_DOWN))
      .reduce(BigDecimal::add).map(decimal -> BigDecimal.ONE.divide(decimal, 10, ROUND_HALF_DOWN))
      .get();
    pw.println(ans.doubleValue());
  }
}
