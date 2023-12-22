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
  
  public static int minCost(int N, int K, int[] h) {
    int[] dp = new int[N];
    for(int i=0;i<N;i++) {
			dp[i] = Integer.MAX_VALUE;
		}
    dp[0] = 0;
    dp[1] = Math.abs(h[1] - h[0]);
		for(int i=2;i<N;i++) {
			for(int j = Math.max(0, i-K);j<i;j++) {
				dp[i] = Math.min(dp[i], dp[j] + Math.abs(h[j] - h[i]));
			}
		}
    return dp[N-1];
  }
}