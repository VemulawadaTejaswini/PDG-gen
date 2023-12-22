import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int MOD = 998244353;
		int N = sc.nextInt();
		int[] a = new int[N];
		int sum = 0;
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		long all = 1;
		for(int i = 0; i < N; i++)
			all = all * 3 % MOD;
		long[][] dp = new long[N+1][sum+1];
		dp[0][0] = 1;
		long[][] dp2 = new long[N+1][sum+1];
		dp2[0][0] = 1;
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j + a[i-1] <= sum; j++) {
				dp[i][j] += dp[i-1][j] * 2;
				dp[i][j] %= MOD;
				dp[i][j+a[i-1]] += dp[i-1][j];
				dp[i][j+a[i-1]] %= MOD;
				dp2[i][j] += dp2[i-1][j];
				dp2[i][j] %= MOD;
				dp2[i][j+a[i-1]] = dp2[i-1][j];
				dp2[i][j+a[i-1]] %= MOD;
			}
		}
		long no = 0;
		if(sum % 2 == 0)
			no = MOD - dp2[N][sum/2];
		for(int i = (sum+1)/2; i <= sum; i++)
			no = (no + dp[N][i]) % MOD;
		System.out.println((all - no*3 + MOD) % MOD);
		
	}

}
