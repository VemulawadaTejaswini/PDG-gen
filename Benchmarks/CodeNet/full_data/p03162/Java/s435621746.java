import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
      int N = in.nextInt();
      int[][] a = new int[N][3];
      for (int i = 0; i < N; i++) {
        a[i][0] = in.nextInt();
        a[i][1] = in.nextInt();
        a[i][2] = in.nextInt();
      }
      int[][] dp = new int[N][3];
      dp[0][0] = a[0][0];
      dp[0][1] = a[0][1];
      dp[0][2] = a[0][2];
      for(int i = 1; i< N ;i++){
        dp[i][0] = Math.max(dp[i-1][1] + a[i][0], dp[i-1][2] + a[i][0]);
        dp[i][1] = Math.max(dp[i-1][0] + a[i][1], dp[i-1][2] + a[i][1]);
        dp[i][2] = Math.max(dp[i-1][1] + a[i][2], dp[i-1][0] + a[i][2]);
      }
      System.out.println(Math.max(dp[N-1][0], Math.max(dp[N-1][1], dp[N-1][2])));
	}
}
