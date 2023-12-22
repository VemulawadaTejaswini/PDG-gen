import java.util.*;

public class Main {
  public static void main(final String[] args) throws Exception {
    final Scanner scanner = new Scanner(System.in);
    try {
      final int k = scanner.nextInt();
      final int t = scanner.nextInt();

      int maxi = 0;
      for (int i = 0; i < t; i++) {
        final int a = scanner.nextInt();
        if (maxi < a) maxi = a;
      }

      int ans = 2 * maxi - k - 1;
      if (ans < 0) {
        System.out.println(0);
      } else {
        System.out.println(ans);
      }
    } finally {
      scanner.close();
    }
  }
}
