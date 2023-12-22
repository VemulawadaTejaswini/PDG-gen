import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int A = sc.nextInt();
    int[] x = new int[N];

    for (int i = 0; i < N; i++) {
      x[i] = sc.nextInt();
    }

    sc.close();

    long[][][] dp = new long[N+1][N+1][2501];

    dp[0][0][0] = 1;

    for (int i = 1; i <= N; i++) {
      for (int j = 0; j <= N; j++) {
        for (int k = 0; k <= 2500; k++) {
          if (j > 0 && (k - x[i-1]) >= 0) {
            dp[i][j][k] = dp[i - 1][j][k] + dp[i - 1][j - 1][k - x[i - 1]];
          } else {
            dp[i][j][k] = dp[i - 1][j][k];
          }
        }
      }
    }

    long sum = 0;
    
		for (int k = 1; k <= N; k++) {
			sum += dp[N][k][k * A];
		}

    System.out.println(sum);

  }

}