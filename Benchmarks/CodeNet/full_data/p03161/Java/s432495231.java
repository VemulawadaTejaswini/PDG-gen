import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    long[] h = new long[N];
    for (int i = 0; i < N; i++) {
      h[i] = sc.nextLong();
    }
    sc.close();

    long[] dp = new long[N];
    Arrays.fill(dp, Integer.MAX_VALUE);
    dp[0] = 0;
    for (int i = 0; i < N; i++)
      for (int k = i + 1; k < N && k <= i + K; k++)
        dp[k] = Math.min(dp[k],
            dp[i] + Math.abs(h[k] - h[i]));
    long ans = dp[N - 1];
    System.out.println(ans);
  }
}