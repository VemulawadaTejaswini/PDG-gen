import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int[][] a = new int[h][w];
    int[][] b = new int[h][w];
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        a[i][j] = sc.nextInt();
      }
    }
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        b[i][j] = sc.nextInt();
      }
    }
    int[][][] dp = new int[h][w][1000000];
    /**
    dp[0][0][Math.abs(a[0][0] - b[0][0])] = 1;
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        int t = Math.abs(a[i][j] - b[i][j]);
        for(int k = 0; k < 1000000; k++) {
          if(i > 0) {
            if((((k + t) < 1000000) && (dp[i - 1][j][k + t] == 1)) || (dp[i - 1][j][Math.abs(k - t)] == 1)) dp[i][j][k] = 1;
          }
          if(j > 0) {
            if((((k + t) < 1000000) && (dp[i][j - 1][k + t] == 1)) || (dp[i][j - 1][Math.abs(k - t)] == 1)) dp[i][j][k] = 1;
          }
        }
      }
    } */
    int ans = 0;
    for(int i = 0; i < 10; i++) {
      if(dp[h - 1][w - 1][i] == 1) {
        ans = i;
        break;
      }
    }
    System.out.println(ans);
  }
}
