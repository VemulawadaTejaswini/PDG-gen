import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextLong();
    long b = scanner.nextLong();
    long k = scanner.nextLong();

    for (int i = 0; i < k; i++) {
      if (a > 0) {
        a--;
      } else if (b > 0) {
        b--;
      }
    }

    System.out.println(a + b);
  }
}
