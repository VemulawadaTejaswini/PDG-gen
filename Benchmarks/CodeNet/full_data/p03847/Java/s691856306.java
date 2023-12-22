import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long N = scanner.nextLong();
    int M = 1_000_000_007;

    int t = 0;
    long n = N;
    while (n > 0) {
      n /= 2;
      t++;
    }

    long[][] dp = new long[t + 1][3];
    dp[0][0] = 1;
    for (int i = 1; i <= t; i++) {
      if ((N >> (i - 1)) % 2 == 0) {
        dp[i][0] = dp[i - 1][0];
        dp[i][1] = dp[i - 1][2];
        dp[i][1] += dp[i - 1][0] * 2 % M;
        dp[i][1] %= M;
        dp[i][1] += dp[i - 1][1] * 2 % M;
        dp[i][1] %= M;
        dp[i][2] = dp[i - 1][1];
        dp[i][2] += dp[i - 1][2] * 2;
        dp[i][2] %= M;
      } else {
        dp[i][0] = dp[i - 1][1];
        dp[i][0] += dp[i - 1][0] * 2;
        dp[i][0] %= M;
        dp[i][1] = dp[i - 1][0];
        dp[i][1] += dp[i - 1][1] * 2;
        dp[i][1] %= M;
        dp[i][1] += dp[i - 1][2] * 2;
        dp[i][1] %= M;
        dp[i][2] = dp[i - 1][2];
      }
    }

    System.out.println(dp[t][0]);
  }
}