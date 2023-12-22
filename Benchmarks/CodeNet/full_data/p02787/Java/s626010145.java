import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int n = sc.nextInt();
      int[][] ab = new int[n][2];
      for(int i = 0; i < n; i++) {
        ab[i][0] = sc.nextInt();
        ab[i][1] = sc.nextInt();
      }
      long[] dp = new long[h+1];
      Arrays.fill(dp, Long.MAX_VALUE);
      dp[0] = 0;
      for(int i = 0; i < n; i++) {
        for(int j = 1; j <= h; j++) {
          if(ab[i][0] >= j)
            dp[j] = Math.min(dp[j], ab[i][1]);
          else {
            int idx = j - ab[i][0];
            dp[j] = Math.min(dp[j], dp[idx] + ab[i][1]);
          }            
        }
      }
      System.out.println(dp[h]);
  }
}