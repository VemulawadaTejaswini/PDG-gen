import java.util.*;
import java.math.*;

public class Main{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] a = new int[m][2];
    int ma = 0;
    for(int i = 0; i < m; ++i) {
      a[i][0] = sc.nextInt();
      if(a[i][0] > ma) ma = a[i][0];
      a[i][1] = sc.nextInt();
    }
    n = n + ma;
    int[] dp = new int[n + 1];
    for(int i = 0; i < n + 1; ++i) {
      dp[i] = Integer.MAX_VALUE;
    }
    for(int i = 0; i < m; ++i) {
      for(int j = 0; j <= n; ++j) {
        if(j < a[i][0]) {
          dp[j] = Math.min(a[i][1], dp[j]);
        } else {
          dp[j] = Math.min(dp[j], dp[j - a[i][0]] + a[i][1]); 
        }
      }
    }
    int res = Integer.MAX_VALUE;
    for(int i = n - ma - 1; i < n; ++i) {
      if(dp[i] < res) res = dp[i];
    }
    System.out.println(res);
  }
}