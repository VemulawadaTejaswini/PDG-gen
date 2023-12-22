import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] S = new int[N];
		int[] T = new int[M];
		for(int i = 0; i < N; i++)
			S[i] = sc.nextInt();
		for(int i = 0; i < M; i++)
			T[i] = sc.nextInt();
		long[][] dp = new long[N+1][M+1];
		int mod = 1000_000_007;
		for(int i = 1; i <= N; i++) {
			for(int j = 1;  j <= M; j++) {
				if(S[i-1] == T[j-1])
					dp[i][j] = dp[i-1][j] + dp[i][j-1] + 1;
				else
					dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1] + mod;
				dp[i][j] %= mod;
			}
		}
		System.out.println(dp[N][M] + 1);
	}

}
