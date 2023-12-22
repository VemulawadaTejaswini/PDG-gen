import java.util.Scanner;
import java.util.Arrays;

public class Main {
	
	//read input
	public static void main(String[] args) {
		int N = 0;
		int W = 0;
		
		Scanner sc = new Scanner(System.in);
		
		 N = sc.nextInt();
		 int[] v = new int[N+1]; //0 to v
		 W = sc.nextInt();
		 int[] w = new int[N+1]; //0 to W
		
		for(int i = 1; i <= N; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		
		long[][] dp = new long[N+1][W+1]; //dp[i][j] max value from 1 to i with max weight j
		for (int i = 1; i <= N; ++i) {
			for(int j = 1; j <= W; ++j) {
				dp[i][j] = Math.max(dp[i-1][j], (j-w[i] >= 0) ? dp[i-1][j-w[i]] + v[i] : 0);
			}	
		}
		
	   
	   System.out.println(dp[N][W]);
	}
}