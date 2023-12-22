import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int T = scanner.nextInt();
    int[] a = new int[N];
    int[] b = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = scanner.nextInt();
      b[i] = scanner.nextInt();
    }

    int[][] dp = new int[N + 1][T];
    for (int i = 1; i <= N; i++) {
      for (int j = 0; j < T; j++) {
        dp[i][j] = dp[i - 1][j];
        if (j >= a[i - 1]) {
          int newValue = dp[i - 1][j - a[i - 1]] + b[i - 1];
          if (newValue > dp[i][j]) {
            dp[i][j] = newValue;
          }
        }
      }
    }
    Set<Integer> selected = new HashSet<>();
    int j = T - 1;
    for (int i = N; i > 0; i--) {
      if (j >= a[i - 1] && dp[i - 1][j] < dp[i - 1][j - a[i - 1]] + b[i - 1]) {
        selected.add(i - 1);
        j -= a[i - 1];
      }
    }
    int max = 0;
    for (int i = 0; i < N; i++) {
      if (!selected.contains(i)) max = Math.max(max, b[i]);
    }
    System.out.println(dp[N][T - 1] + max);
  }
}
