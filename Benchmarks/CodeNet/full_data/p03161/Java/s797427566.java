import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] input = new int[N];
    for (int i=0; i<N; i++) {
      input[i] = sc.nextInt();
    }
    System.out.println(minCost(N, K, input));
  }
  
  public static int minCost(int N, int K, int[] input) {
    if (N == 2) {
      return Math.abs(input[0] - input[1]);
    }
    int[] dp = new int[N];
    for (int i=2; i<N; i++) {
      int min = Integer.MAX_VALUE;
      for (int j=Math.max(0, i-K); j<i; j++) {
        int ap = Math.abs(input[i] - input[j]) + dp[j];
       	 if (min > ap) {
           min = ap;
         }
      }
      dp[i] = min;
    }
    return dp[N-1];
  }
}