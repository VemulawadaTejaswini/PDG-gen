import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int W = sc.nextInt();
    int[] w = new int[N];
    int[] v = new int[N];
    for (int i = 0; i < N; i++) {
	  w[i] = sc.nextInt();
      v[i] = sc.nextInt();
    }
    int[][] dp = new int[2][W + 1];
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= W; j++) {
      	dp[i % 2][j] = dp[1 - i % 2][j];
        if (j >= w[i]) {
          dp[i % 2][j] = Math.max(dp[1 - i % 2][j - w[i]] + v[i], dp[i % 2][j]);
        }
      }
    }
    System.out.println(dp[N % 2][W]);
  }
}