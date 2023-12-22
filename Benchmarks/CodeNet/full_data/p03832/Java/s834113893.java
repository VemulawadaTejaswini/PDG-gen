import java.util.*;

public class Main {
  public static long MOD = (long)Math.pow(10, 9) + 7;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    long[][] dp = new long[b - a + 1][n + 1];
    long[] kai = new long[n + 1];
    kai[0] = 1;
    for(int i = 1; i <= n; i++) {
      kai[i] = (kai[i - 1] * (long)i) % MOD;
    }
    dp[0][0] = 1;
    for(int j = c; j <= Math.min(d, (n / a)); j++) {
      int t = a * j;
      dp[0][t] = (kai[n] * func(kai[n - t], MOD - 2)) % MOD;
    //  dp[0][t] = (dp[0][t] * func(n - t, MOD - 2)) % MOD;
      dp[0][t] = (dp[0][t] * func(kai[a], (long)j * (MOD - 2))) % MOD;
      dp[0][t] = (dp[0][t] * func(kai[j], MOD - 2)) % MOD;  
    }
    for(int i = 1; i < (b - a + 1); i++) {
      dp[i][0] = 1;
      for(int j = 1; j <= n; j++) {
        dp[i][j] = dp[i - 1][j];
        for(int k = c; k <= Math.min(d, j / (i + a)); k++) {
          int s = (i + a) * k;
          long t = (dp[i - 1][j - s] * kai[n - j + s]) % MOD;
          t = (t * func(kai[n - j], MOD - 2)) % MOD;
          t = (t * func(kai[i + a], (long)k * (MOD - 2))) % MOD;
          t = (t * func(kai[k], MOD - 2)) % MOD;
          dp[i][j] = (dp[i][j] + t) % MOD;
        }
      }
    }
    System.out.println(dp[b - a][n]);
  }

  public static long func(long a, long x) {
    if(x == 0) return 1;
    if((x % 2) == 0) {
      long t = func(a, x / 2);
      return (t * t) % MOD;
    } else {
      long t = func(a, x - 1);
      return (a * t) % MOD;
    }
  }
}
