import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long M = 1_000_000_007;
    int N = scanner.nextInt();
    int[][] a = new int[N][N];
    for (int i = 0; i < N; i++) for (int j = 0; j < N; j++) a[i][j] = scanner.nextInt();

    long[][] dp = new long[N + 1][1 << N];
    dp[0][0] = 1;

    for (int i = 1; i <= N; i++) {
      for (int j = 1; j < 1 << N; j++) {
        dp[i][j] = dp[i - 1][j];
        for (int k = 0; k < N; k++) {
          if ((j & 1 << k) != 0) {
            dp[i][j] += dp[i - 1][j ^ 1 << k] * a[i - 1][k];
            if (dp[i][j] > M) dp[i][j] -= M;
          }
        }
      }
    }
    System.out.println(dp[N][(1 << N) - 1]);
  }
}
