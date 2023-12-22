import java.util.*;

public class Main{
	final int INF = Integer.MAX_VALUE;
	void solve(){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int W = scan.nextInt();
		int[] w = new int[n];
		int[] v = new int[n];
		for(int i = 0; i < n; i++) {
			w[i] = scan.nextInt();
			v[i] = scan.nextInt();
		}
		long[][] dp = new long[n + 1][100001];
		for(int i = 0; i < n + 1; i++) {
			for(int j = 0; j < 100001; j++) {
				dp[i][j] = INF;
			}
		}
		dp[0][0] = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 100001; j++) {
				if(j < v[i]) dp[i + 1][j] = dp[i][j];
				else dp[i + 1][j] = Math.min(dp[i][j], dp[i][j - v[i]] + w[i]);
			}
		}
		for(int i = 100000; i >= 0; i--) {
			if(dp[n][i] <= W) {
				System.out.println(i);
				return;
			}
		}
		scan.close();
	}

	public static void main(String[] args){
		new Main().solve();
	}
}
 