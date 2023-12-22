import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] a = new int[M];
    int[] b = new int[M];
    int[] c = new int[M];
    for(int i = 0; i < M; i++) {
      a[i] = sc.nextInt() - 1;
      b[i] = sc.nextInt() - 1;
      c[i] = sc.nextInt();
    }
    int[][] dp = new int[N][N];
    for(int i = 0; i < N; i++) {
      for(int j = 0; j < N; j++) {
        if(i != j) {
          dp[i][j] = Integer.MAX_VALUE;
        } else {
          dp[i][j] = 0;
        }
      }
    }
    for(int i = 0; i < M; i++) {
      dp[a[i]][b[i]] = Math.min(dp[a[i]][b[i]], c[i]);
      dp[b[i]][a[i]] = Math.min(dp[a[i]][b[i]], c[i]);
    }
    for(int k = 0; k < N; k++) {
      for(int i = 0; i < N; i++) {
        for(int j = 0; j < N; j++) {
          dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j]);
        }
      }
    }
    int ans = 0;
    for(int i = 0; i < M; i++) {
      if(dp[a[i]][b[i]] < c[i]) ans++;
    }
    System.out.println(ans);
  }
}