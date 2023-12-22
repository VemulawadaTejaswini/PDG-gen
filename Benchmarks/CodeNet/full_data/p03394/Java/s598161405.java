import java.util.*;

public class Main {
  public static void main(String[]$) {
    int n = new Scanner(System.in).nextInt() - 1;
    System.out.println(1);
    long sum = 1;
    for (int i = 2; n > 0; i++) {
      if (n == 1) {
        if ((i + sum) % 30 == 0) {
          System.out.println(i);
          return;
        } else {
          continue;
        }
      }
      if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
        continue;
      }
      System.out.println(i);
      sum += i;
      n--;
    }
  }
}
