import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long M = 1_000_000_007;
    char[] l = scanner.next().toCharArray();
    int n = l.length;
    long[][] dp = new long[n + 1][2];
    dp[0][0] = 1;
    for (int i = 1; i <= n; i++) {
      if (l[i - 1] == '0') {
        dp[i][0] = dp[i - 1][0];
        dp[i][1] = dp[i - 1][1] * 3 % M;
      } else {
        dp[i][0] = dp[i - 1][0] * 2 % M;
        dp[i][1] = dp[i - 1][1] * 3 % M;
        dp[i][1] += dp[i - 1][0];
        if (dp[i][1] >= M) dp[i][1] -= M;
      }
    }
    System.out.println((dp[n][0] + dp[n][1]) % M);
  }
}
