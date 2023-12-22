import java.util.*;

public class Main {

  static int ans;
  static int[][] dp;
static int R;
static int[] r;
static int[] mach;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    R = sc.nextInt();
    r = new int[R];
    mach = new int[R];
    for(int i = 0; i < R; i++) {
      r[i] = sc.nextInt() - 1;
    }

    dp = new int[n][n];
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        if(i != j) dp[i][j] = Integer.MAX_VALUE; 
      }
    }
    for(int i = 0; i < m; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      int c = sc.nextInt();
      dp[a][b] = c;
      dp[b][a] = c;
    }
    
    for(int k = 0; k < n; k++) {
      for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
          dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j]); 
        }
      }
    }

    ans = Integer.MAX_VALUE;
    
    dfs(0, 0);

    System.out.println(ans);
  }

  public static void dfs(int n, int mask) {
    if(n == R) {
      int s = 0;
      for(int i = 0; i < R - 1; i++) {
        s += (dp[mach[i]][mach[i + 1]]);
      }
      ans = Math.min(ans, s);
    } else {
      for(int j = 0; j < R; j++) {
        if((mask & (1 << j)) == 0) {
          mach[n] = r[j]; 
          dfs(n + 1, (mask + (1 << j)));
        }
      }
    }
  }
}