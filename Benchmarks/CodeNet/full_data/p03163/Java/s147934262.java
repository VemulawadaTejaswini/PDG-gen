import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int W = scanner.nextInt();
    int[] w = new int[N + 1];
    int[] v = new int[N + 1];
    for (int i = 1; i <= N; i++) {
      w[i] = scanner.nextInt();
      v[i] = scanner.nextInt();
    }

    long[][] dp = new long[N + 1][W + 1];
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= W; j++) {
        dp[i][j] = dp[i - 1][j];
        if (j >= w[i]) dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - w[i]] + v[i]);
      }
    }
    System.out.println(dp[N][W]);
  }
}
