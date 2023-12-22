import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int W = sc.nextInt();
    int[] wt = new int[n];
    for(int i=0; i<n; i++) {
      wt[i] = sc.nextInt();
    }
    
    int[] val = new int[n];
    for(int i=0; i<n; i++) {
      val[i] = sc.nextInt();
    }
      System.out.println(knapSack(wt, val, W, n));
  }
  
  public static int knapSack(int[] wt, int[] val, int W, int n) {
    int[][] dp = new int[n+1][W+1];
    
    //initialisation
    for(int i=0; i<n+1; i++) {
      for(int j=0; j<W+1; j++) {
        if(i==0 || j==0) {
          dp[i][j] = 0;
        }
      }
    }
    
    //choice diagram code
    for(int i=1; i<n+1; i++) {
      for(int j=1; j<W+1; j++) {
        if(wt[i-1] <= j) {
          dp[i][j] = Math.max(val[i-1] + dp[i-1][j-wt[i-1]], dp[i-1][j]);
        } else {
          dp[i][j] = dp[i-1][j];
        }
      }
    }
    return dp[n][W];
  }
}