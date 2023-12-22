import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    long M = 1_000_000_007;

    List<Integer> factors = new ArrayList<>();
    factors.add(0);
    for (int i = 1; i * i <= N; i++) {
      int j = N / i;
      factors.add(i);
      if (j != i) factors.add(j);
    }
    Collections.sort(factors);

    int F = factors.size() - 1;
    long[][] dp = new long[K][F + 1];
    for (int i = 1; i <= F; i++) {
      dp[0][i] = factors.get(i);
    }
    for (int i = 1; i < K; i++) {
      for (int j = 1; j <= F; j++) {
        dp[i][j] = dp[i][j - 1];
        dp[i][j] += dp[i - 1][F - j + 1] * (factors.get(j) - factors.get(j - 1)) % M;
        if (dp[i][j] >= M) dp[i][j] -= M;
        //for (int k = 1; k <= F - j + 1; k++) {
        //  dp[i][j] += dp[i - 1][k];
        //  if (dp[i][j] >= M) dp[i][j] -= M;
        //}
        //dp[i][j] *= factors.get(j) - factors.get(j - 1);
        //dp[i][j] %= M;
      }
    }

    System.out.println(dp[K - 1][F]);
  }
}
