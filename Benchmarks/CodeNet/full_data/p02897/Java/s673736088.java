/**
 * 
 */
package beginnerContest142;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());

    int count = 0;
   for (int i = 1; i <= n; i++) {
      if (i % 2 != 0) {
        count++;
      }
  }

    BigDecimal bd = new BigDecimal(String.valueOf(n));
    BigDecimal bd2 = new BigDecimal(String.valueOf(count));
    System.out.println(bd2.divide(bd, 10, RoundingMode.HALF_UP));
  }

}
