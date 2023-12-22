import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final long MOD = 998244353;
		int N = sc.nextInt();
		int S = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++)
			A[i] = sc.nextInt();
		
		long[][][] dp = new long[3][N+1][S+1];
		dp[0][0][0] = 1;
		for(int i=0; i<N; i++) {
			dp[0][i+1][0] = (dp[0][i+1][0] + dp[0][i][0])%MOD;
			dp[1][i+1][0] = (dp[1][i+1][0] + dp[0][i][0])%MOD;
			if(A[i]<=S) {
				dp[1][i+1][A[i]] = (dp[1][i+1][A[i]] + dp[0][i][0])%MOD;
				dp[2][i+1][A[i]] = (dp[2][i+1][A[i]] + dp[0][i][0])%MOD;
			}
			for(int j=0; j<=S; j++) {
				dp[1][i+1][j] = (dp[1][i+1][j] + dp[1][i][j])%MOD;
				dp[2][i+1][j] = (dp[2][i+1][j] + dp[2][i][j])%MOD;
				dp[2][i+1][j] = (dp[2][i+1][j] + dp[1][i][j])%MOD;
			}
			for(int j=0; j+A[i]<=S; j++) {
				dp[1][i+1][j+A[i]] = (dp[1][i+1][j+A[i]] + dp[1][i][j])%MOD;
				dp[2][i+1][j+A[i]] = (dp[2][i+1][j+A[i]] + dp[1][i][j])%MOD;
			}
		}
		
		System.out.println(dp[2][N][S]);
		
		sc.close();
	}
	
}
