import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int score=sc.nextInt();
		long dp[][][] = new long[55][55][2605];
		dp[0][0][0]=1;
		int mod = 1000000007;
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				for(int k=0; k<=score; k++) {
					{
						int nj=j;
						dp[i+1][nj][k+nj*2] += dp[i][j][k];
						dp[i+1][nj][k+nj*2] %=mod;
					}
					{
						int nj=j+1;
						dp[i+1][nj][k+nj*2] += dp[i][j][k];
						dp[i+1][nj][k+nj*2] %=mod;
					}
					{
						int nj=j;
						int x=j*2;
						long y = dp[i][j][k] * x;
						y %= mod;
						dp[i+1][nj][k+nj*2] += y;
						dp[i+1][nj][k+nj*2] %= mod;
					}
					if(j>=1) {
						int nj=j-1;
						int x=j*j;
						long y = dp[i][j][k] * x;
						y %= mod;
						dp[i+1][nj][k+nj*2] += y;
						dp[i+1][nj][k+nj*2] %= mod;
					}
				}
			}
		}
		System.out.println(dp[n][0][score]);
		sc.close();
	}
}
