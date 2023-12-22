import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<Integer>();
    int[] a = new int[m];
    for(int i = 0; i < m; i++) {
      a[i] = sc.nextInt();
      list.add(a[i]);
    }
    long MOD = (long)Math.pow(10, 9) + 7;
    long[] dp = new long[n + 1];
    dp[0] = 1;
    if(list.contains(1)) {
      dp[1] = 0;
    } else {
      dp[1] = 1;
    }
    for(int i = 0; i < m; i++) {
      dp[a[i]] = -1;
    }
    for(int i = 2; i < n + 1; i++) {
      if(dp[i] != -1) {
        int a = 0;
        int b = 0;
        if(dp[i - 1] != -1) a = dp[i - 1];
        if(dp[i - 2] != -1) b = dp[i - 2];
        dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
      }
    }
    System.out.println(dp[n]);
  }
}