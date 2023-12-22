import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int W = sc.nextInt();
    int[] w = new int[N];
    int[] v = new int[N];
    for (int i = 0; i < N; i++) {
      w[i] = sc.nextInt();
      v[i] = sc.nextInt();
    }
    sc.close();

    long[][] dp = new long[N][W + 1];
    for (long[] a : dp) Arrays.fill(a, -1);
    dp[0][0] = 0;
    dp[0][w[0]] = v[0];

    long ans = 0;
    for (int i = 0; i < N - 1; i++) {
      for (int j = 0; j < W + 1; j++) {
        if (dp[i][j] < 0) continue;

        dp[i + 1][j] = Math.max(
            dp[i + 1][j],
            dp[i][j]);
        ans = Math.max(ans, dp[i + 1][j]);

        int wi = w[i + 1];
        if (W < j + wi) continue;
        dp[i + 1][j + wi] = Math.max(
            dp[i + 1][j + wi],
            dp[i][j] + v[i + 1]);
        ans = Math.max(ans, dp[i + 1][j + wi]);
      }
    }
    System.out.println(ans);
  }
}