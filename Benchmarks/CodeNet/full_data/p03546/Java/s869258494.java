
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int[][] dp = new int[10][10];
    for(int i = 0; i < 10; i++) {
      for(int j = 0; j < 10; j++) {
        dp[i][j] = sc.nextInt();
      }
    }
    for(int k = 0; k < 10; k++) {
      for(int i = 0; i < 10; i++) {
        for(int j = 0; j < 10; j++) {
          dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j]);
        }
      }
    }
    int ans = 0;
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        int a = sc.nextInt();
        if(a != -1) ans += dp[a][1];
      }
    }
    System.out.println(ans);
  }
}