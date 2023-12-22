import java.util.*;
import java.util.function.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int[][] A = new int[H][W];
    int[][] B = new int[H][W];
    for (int i = 0; i < H; i++) for (int j = 0; j < W; j++) A[i][j] = sc.nextInt();
    for (int i = 0; i < H; i++) for (int j = 0; j < W; j++) B[i][j] = sc.nextInt();
    sc.close();
    
    int m = 80;
    int[][][] dp = new int[H][W][m * 2 + 1];
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        int d = Math.abs(A[i][j] - B[i][j]);
        if (i == 0 && j == 0) {
          dp[0][0][m - d] = 1;
          dp[0][0][m + d] = 1;
        }
        if (0 < i) {
          for (int k = d; k < m * 2 + 1 - d; k++) {
            if (dp[i - 1][j][k] == 1) {
              dp[i][j][k + d] = 1;
              dp[i][j][k - d] = 1;
            }
          }
        }
        if (0 < j) {
          for (int k = d; k < m * 2 + 1 - d; k++) {
            if (dp[i][j - 1][k] == 1) {
              dp[i][j][k + d] = 1;
              dp[i][j][k - d] = 1;
            }
          }
        }
      }
    }
    int ans = m * 2 + 1;
    int[] l = dp[H - 1][W - 1];
    for (int k = 0; k < m * 2 + 1; k++) {
      if (l[k] == 1) {
        ans = Math.min(ans, Math.abs(m - k));
      }
    }
    System.out.println(ans);
  }
}
