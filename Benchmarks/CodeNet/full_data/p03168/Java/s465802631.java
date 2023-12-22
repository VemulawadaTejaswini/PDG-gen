import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    double[] p = new double[N + 1];
    for (int i = 1; i <= N; i++) p[i] = scanner.nextDouble();

    double[][] dp = new double[N + 1][N + 1];
    dp[0][0] = 1.d;
    for (int i = 1; i <= N; i++) {
      for (int j = 0; j <= i; j++) {
        dp[i][j] = dp[i - 1][j] * (1 - p[i]);
        if (j > 0) dp[i][j] += dp[i - 1][j - 1] * p[i];
      }
    }
    double res = 0.d;
    for (int i = N / 2 + 1; i <= N; i++) res += dp[N][i];
    System.out.println(res);
  }
}
