import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long M = 1_000_000_007;
    int N = scanner.nextInt();
    int X = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();
    Arrays.sort(a);

    long[][] dp = new long[N + 1][X + 1];
    for (int i = 0; i <= X; i++) dp[0][i] = i;
    for (int i = 1; i <= N; i++) {
      for (int j = 0; j <= X; j++) {
        dp[i][j] = (long)(i - 1) * dp[i - 1][j] % M;
        dp[i][j] += dp[i - 1][j % a[i - 1]];
        dp[i][j] %= M;
      }
    }
    System.out.println(dp[N][X]);
  }
}
