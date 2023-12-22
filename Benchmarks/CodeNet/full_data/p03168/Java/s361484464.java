import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    double[] P = new double[scan.nextInt()];
    for (int i = 0; i < P.length; i++)
      P[i] = scan.nextDouble();
    scan.close();

    System.out.println(headsOverTailsProbability(P));
  }

  private static double headsOverTailsProbability(double[] P) {
    if (P.length == 0) return 0;

    int N = P.length;
    double[][] dp = new double[N + 1][N + 1];
    dp[0][0] = 1;
    for (int i = 1; i <= N; i++) {
      double headProbability = P[i - 1];
      double tailProbability = 1 - headProbability;
      dp[i][0] = tailProbability * dp[i-1][0];
      for (int j = 1; j <= N; j++)
        dp[i][j] = dp[i-1][j-1] * headProbability + dp[i-1][j] * tailProbability;
    }

    double result = 0;
    for (int i = N/2 + 1; i <= N; i++)
      result += dp[N][i];

    return result;
  }
}