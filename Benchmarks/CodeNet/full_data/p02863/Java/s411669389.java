import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }
    int[][] dp1 = new int[n][t + 1];
    int[][] dp2 = new int[n][t + 1];

    for(int j = a[0]; j <= t; j++) {
      dp1[0][j] = b[0];
    }

    for(int j = a[n - 1]; j <= t; j++) {
      dp2[n - 1][j] = b[n - 1];
    }

    for(int i = 1; i < n; i++) {
      for(int j = 1; j <= t; j++) {
        if(j >= a[i]) {
          dp1[i][j] = Math.max(dp1[i - 1][j], b[i] + dp1[i - 1][j - a[i]]);
        } else {
          dp1[i][j] = dp1[i - 1][j];
        }
      }
    }

    for(int i = n - 2; i >= 0; i--) {
      for(int j = 1; j <= t; j++) {
        if(j >= a[i]) {
          dp2[i][j] = Math.max(dp2[i + 1][j], b[i] + dp2[i + 1][j - a[i]]);
        } else {
          dp2[i][j] = dp2[i + 1][j];
        }        
      }      
    }

    int ans = 0;
    for(int i = 0; i < n; i++) {
      int s = 0;
      for(int j = 0; j <= t - 1; j++) {
        if(i == 0) s = Math.max(s, dp2[1][t - 1]);
        if((i > 0) && (i < (n - 1))) s = Math.max(s, dp1[i - 1][j] + dp2[i + 1][t - 1 - j]);
        if(i == (n - 1)) s = Math.max(s, dp1[n - 2][t - 1]);
      }
      ans = Math.max(ans, b[i] + s);
    }
    System.out.println(ans);
  }
}