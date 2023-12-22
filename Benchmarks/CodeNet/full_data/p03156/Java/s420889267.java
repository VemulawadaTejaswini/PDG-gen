import java.util.*;

public class Main {
  public static void main(final String[] args) throws Exception {
    final Scanner scanner = new Scanner(System.in);
    try {
      final int n = scanner.nextInt();
      final int a = scanner.nextInt();
      final int b = scanner.nextInt();
      final int[] cnt = new int[3];

      for (int i = 0; i < n; i++) {
        final int p = scanner.nextInt();
        int j = 0;
        if (a < p) j++;
        if (b < p) j++;
        cnt[j]++;
      }

      OptionalInt ans = Arrays.stream(cnt).min();
      System.out.print(ans.getAsInt());
    } finally {
      scanner.close();
    }
  }
}
