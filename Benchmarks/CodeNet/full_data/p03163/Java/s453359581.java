import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int maxWeight = scan.nextInt();
    
    int[] weights = new int[n];
    int[] values = new int[n];
    
    for (int i = 0; i < n; i++) {
      weights[i] = scan.nextInt();
      values[i] = scan.nextInt();
    }
    scan.close();

    long result = solve(n, weights, values, maxWeight);
    System.out.println(result);
  }
  
  private static long solve(int n, int[] weights,int[] values, int maxWeight){
	long[][] dp = new long[n][maxWeight + 1];
    
    for(int i = 0; i < n; i++) {
      for(int j = 1; j <= maxWeight; j++) {
        if(j < weights[i] && i == 0) {
          continue;
        }
        
        if(i == 0) {
          dp[i][j] = values[i];
        } else {
          if(j < weights[i]) {
            dp[i][j] = dp[i-1][j];
          } else 
          dp[i][j] = Math.max(dp[i-1][j], values[i] + dp[i-1][j - weights[i]]);
        }
      }
    }
    
	return dp[n-1][maxWeight];
  }
}