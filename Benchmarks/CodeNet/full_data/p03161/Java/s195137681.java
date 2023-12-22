import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    long[] h = new long[n];
    for(int i = 0; i < n; i++) {
      h[i] = sc.nextLong();
    }
    long[] dp = new long[n];
    for(int i = 1; i < n; i++) {
      dp[i] = Long.MAX_VALUE;
    }
    for(int i = 1; i < n; i++) {
      for(int j = 1; j <= k; j++) {
        if(i >= j) dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(h[i] - h[i - j]));
      }
    }
    System.out.println(dp[n - 1]);
  }
}