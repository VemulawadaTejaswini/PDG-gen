import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] a = new int[m];
    int[] c = new int[m];
    int d = (int)Math.pow(2, n);
    int[][] dp = new int[m][d];
    for(int i = 0; i < m; i++) {
      a[i] = sc.nextInt();
      int b = sc.nextInt();
      int cc = 0;
      for(int j = 0; j < b; j++) {
        int c1 = sc.nextInt();
        cc += (int)(Math.pow(2, c1 - 1));
      }
      c[i] = cc;
    }
    for(int j = 1; j < d; j++) {
      dp[0][j] = (int)Math.pow(10, 7);
    }
    dp[0][c[0]] = a[0]; 
    for(int i = 1; i < m; i++) {
      for(int j = 1; j < d; j++) {
        dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - (j & c[i])] + a[i]);
      }
    }
    if(dp[m - 1][d - 1] < (int)Math.pow(10, 7)) {
      System.out.println(dp[m - 1][d - 1]);
    } else {
      System.out.println(-1);
    }
  }
}
