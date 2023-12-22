import java.util.*;

public class Main {
  public static void main(String[]$) {
    int n = new Scanner(System.in).nextInt();
    long sum = 0;
    for (int i =  5; n > 0; i++) {
      if (n == 2) {
        i = (i + 60) / 30 * 30;
        System.out.println(sum % 2 + 2);
        System.out.println(i - (sum + sum % 2 + 2) % 30);
        return;
      }
      if (i % 2 != 0 && i % 3 != 0 && i % 2 != 0) {
        continue;
      }
      System.out.println(i);
      sum += i;
      n--;
    }
  }
}
