import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		int[] w = new int[N];
		long[] v = new long[N];
		for(int i = 0; i < N; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		long[][] dp = new long[N+1][W+1];
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j <= W; j++)
				dp[i][j] = dp[i-1][j];
			for(int j = 0; j <= W; j++) {
				if(j+w[i-1] <= W)
					dp[i][j+w[i-1]] = Math.max(dp[i][j+w[i-1]], dp[i-1][j]+v[i-1]);
				else
					break;
			}
		}
		System.out.println(dp[N][W]);

	}

}