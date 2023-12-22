import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    long MOD = (long)Math.pow(10, 9) + 7;
    int[] s = new int[n];
    int[] t = new int[m];
    for(int i = 0; i < n; i++) {
      s[i] = sc.nextInt();
    }
    for(int i = 0; i < m; i++) {
      t[i] = sc.nextInt();
    }
    long[][] dp = new long[n][m];
    long[][] sum = new long[n][m];
    if(s[0] == t[0]) {
      dp[0][0] = 1;
      sum[0][0] = 1;
    }
    for(int j = 1; j < m; j++) {
      if(s[0] == t[j])  dp[0][j] = 1;
      sum[0][j] = (sum[0][j - 1] + dp[0][j]) % MOD; 
    }
    for(int i = 1; i < n; i++) {
      if(s[i] == t[0])  dp[i][0] = 1;
      sum[i][0] = (sum[i - 1][0] + dp[i][0]) % MOD; 
    }
    for(int i = 1; i < n; i++) {
      for(int j = 1; j < m; j++) {
        if(s[i] == t[j]) dp[i][j] = (sum[i - 1][j - 1] + 1) % MOD;
        sum[i][j] = (sum[i - 1][j] + sum[i][j - 1] + dp[i][j] + MOD - sum[i - 1][j - 1]) % MOD;
      }
    }
    long ans = 0;
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < m; j++) {
        ans = (ans + dp[i][j]) % MOD;
      }
    }
    ans = (ans + 1) % MOD;
    System.out.println(ans);
  }
}