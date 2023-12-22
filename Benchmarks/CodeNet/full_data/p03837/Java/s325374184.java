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
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
      c[i] = sc.nextInt();
    }
    int[][][] dp = new int[N + 1][N][N];
    for(int i = 0; i < N; i++) {
      for(int j = 0; j < N; j++) {
        if(i != j) {
          dp[0][i][j] = Integer.MAX_VALUE;
        } else {
          dp[0][i][j] = 0;
        }
      }
    }
    for(int i = 0; i < M; i++) {
      dp[0][a[i] - 1][b[i] - 1] = c[i];
      dp[0][b[i] - 1][a[i] - 1] = c[i];
    }
    for(int k = 1; k < N + 1; k++) {
      for(int i = 0; i < N; i++) {
        for(int j = 0; j < N; j++) {
          dp[k][i][j] = Math.min(dp[k - 1][i][j], dp[k - 1][i][k] + dp[k - 1][k][j]);
        }
      }
    }
    int ans = 0;
    for(int i = 0; i < M; i++) {
      if(dp[N][a[i]][b[i]] < c[i]) ans++;
    }
    System.out.println(ans);
  }
}