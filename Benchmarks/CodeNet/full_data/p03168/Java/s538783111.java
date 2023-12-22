import java.util.*;

public class Main {
    public static double solve(int n, double[] prob) {
      
      double[][] dp = new double[n + 1][n + 1];
      dp[0][0] = 1;
      

      for(int i = 1; i <= n; i++){
        double headEvent = prob[i-1], tailEvent = 1 - prob[i-1];
        dp[0][i] = tailEvent * dp[0][i - 1];
        
        for(int heads = 1; heads <= i; heads++)
        {
            dp[heads][i] = headEvent*dp[heads - 1][i - 1] + tailEvent*dp[heads][i - 1];
        }
      }
      
      double result = 0;
      for(int i = n/2 + 1; i <= n; i++)
          result += dp[i][n];

      
      return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        double[] prob = new double[n];

        for (int i = 0; i < n; i++) {
          prob[i] = scanner.nextDouble();
        }

      	double result = solve(n, prob);
        System.out.println(result);
    }
}
