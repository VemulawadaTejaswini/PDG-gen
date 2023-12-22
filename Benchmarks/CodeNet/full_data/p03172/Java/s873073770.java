import java.util.Scanner;

public class Main {

	static long mod = 1000_000_007;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(), K = in.nextInt();
		int a[] = new int[N + 1];
		int capa[] = new int[N + 1];
		for ( int i = 1; i <= N; i++ ) {
			a[i] = in.nextInt();
			capa[i] += a[i] + capa[i - 1];
		}
		in.close();

		long dp[][] = new long[N + 1][K + 1];
		for ( int n = 0; n <= N; n++ ) {
			dp[n][0] = 1;
		}

		for ( int n = 1; n <= N; n++ ) {
			if ( a[n] == 0 ) {
				dp[n] = dp[n - 1];
			}
			for ( int k = 1; k <= K; k++ ) {

				if ( k <= capa[n] / 2 ) {
					dp[n][k] = (dp[n][k - 1] + dp[n - 1][k]) % mod;
				} else if ( k <= capa[n] ) {
					dp[n][k] = dp[n][capa[n] - k] % mod;
				} else {
					break;
				}
			}
		}
		System.out.println(dp[N][K]);
	}
}