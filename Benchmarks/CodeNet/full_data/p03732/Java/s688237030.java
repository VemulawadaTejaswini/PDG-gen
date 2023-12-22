import java.util.*;

public class Main {
  static long[] w;
  static long[] v;
  static long[][] dp;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long W = sc.nextLong();
    w = new long[N];
    v = new long[N];
    for(int i = 0; i < N; i++) {
      w[i] = sc.nextLong();
      v[i] = sc.nextLong();
    }
    dp = new long[N][(int)W + 1];
    for(int i = 0; i < N; i++) {
      for(int j = 0; j < W + 1; j++) {
        dp[i][j] = -1;
      }
    }
    System.out.println(func(N - 1, W));
  }

  public static long func(int i, long j) {
    if(dp[i][(int)j] >= 0) {
      return dp[i][(int)j];
    } else {
      if(i > 0) {
        if(j >= w[i]) {
          if(dp[i - 1][(int)j] < 0) dp[i - 1][(int)j] = func(i - 1, (int)j);
          if(dp[i - 1][(int)(j - w[i])] < 0) dp[i - 1][(int)(j - w[i])] = func(i - 1, j - w[i]);
          return dp[i][(int)j] = Math.max(dp[i - 1][(int)j], dp[i - 1][(int)(j - w[i])] + v[i]);
        } else {
          if(dp[i - 1][(int)j] >= 0) return dp[i - 1][(int)j];
          dp[i - 1][(int)j] = func(i - 1, j);
          return dp[i][(int)j] = dp[i - 1][(int)j];
        }
      } else {
        if(j >= w[i]) return dp[i][(int)j] = v[i];
        return dp[i][(int)j] = 0;
      }      
    }
  }
}