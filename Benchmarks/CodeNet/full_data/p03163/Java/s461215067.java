import java.util.*;
public class Main {
   private static int dp[];
  public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int sumw = sc.nextInt();
        int[] wgt = new int[n];
        int[] val = new int[n];
		long[][] dp = new long[n+1][sumw+1];
        for (int i = 0; i < n; i++) {
        	wgt[i] = sc.nextInt();
        	val[i] = sc.nextInt();
        }
		for (int i = 0; i < n; ++i) {
        	for (int w = 0; w <= sumw; ++w) {
        		if (w - wgt[i] >= 0) {
        			dp[i+1][w]=chmax(dp[i][w],dp[i][w - wgt[i]]+val[i]);
        		} else {
	        		dp[i+1][w]=chmax(dp[i+1][w],dp[i][w]);
	        	}
        	}
        }
		System.out.println(dp[n][sumw]);
	}

	private static long chmax(long i, long j) {
		return Math.max(i, j);
	}
}

