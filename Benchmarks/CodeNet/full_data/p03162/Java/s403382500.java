
import java.util.Scanner;

public class Main {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[][] h = new int[3][N];
    for (int i = 0; i < N; i++) {
      h[0][i] = sc.nextInt();
      h[1][i] = sc.nextInt();
      h[2][i] = sc.nextInt();
    }
    int[][] dp = new int[3][N];
    dp[0][0] = h[0][0];
    dp[1][0] = h[1][0];
    dp[2][0] = h[2][0];

    for (int i = 1; i < N ; i++) {
        dp[0][i] = Math.max(
            (dp[1][i-1]+h[0][i]),
            (dp[2][i-1]+h[0][i])
        );
      dp[1][i] = Math.max(
          (dp[0][i-1]+h[1][i]),
          (dp[2][i-1]+h[1][i])
      );
      dp[2][i] = Math.max(
          (dp[1][i-1]+h[2][i]),
          (dp[0][i-1]+h[2][i])
      );
    }

    System.out.println(Math.max(Math.max(dp[0][N-1],dp[1][N-1]),dp[2][N-1]));
  }


}
