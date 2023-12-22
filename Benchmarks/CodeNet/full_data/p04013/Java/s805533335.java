import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int[] x = new int[N+1];
    int sum = 0;
    for (int i = 1; i <= N; i++) {
      x[i] = sc.nextInt();
      sum += x[i];
    }
    
    long[][][] dp = new long[N+1][N+1][sum+1];
    dp[0][0][0] = 1;
    for (int j = 1; j <= N; j++) {
      for (int k = 0; k <= j; k++) {
        for (int s = 0; s <= sum; s++) {
          if (k > 0 && s - x[j] >= 0) {
            // x[j] can be used.
            // not use x[j] + use x[j]
            dp[j][k][s] = dp[j-1][k][s] + dp[j-1][k-1][s-x[j]];
          } else {
            // x[j] can't be used => not use x[j] case only
            dp[j][k][s] = dp[j-1][k][s];
          }
        }
      }
    }
    
    long ans = 0;
    for (int k = 1; k <= N; k++) {
      if (k*A <= sum) {
        ans += dp[N][k][k*A];
      }
    }

    System.out.println(ans);
  }
}