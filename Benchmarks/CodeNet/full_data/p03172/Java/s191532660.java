import java.util.Scanner;

public class Main {

	static int mod = (int) 1e9 + 7;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt();
		int a[] = new int[n + 1];
		int capa[] = new int[n + 1];
		for ( int i = 1; i <= n; i++ ) {
			a[i] = in.nextInt();
			capa[i] += a[i] + capa[i - 1];
		}
		in.close();

		long dp[][] = new long[n + 1][k + 1];
		for ( int r = 0; r <= n; r++ ) {
			dp[r][0] = 1;
		}

		for ( int r = 1; r <= n; r++ ) {
			for ( int c = 1; c <= k; c++ ) {

				if ( c <= capa[r] / 2 ) {
					dp[r][c] = (dp[r][c - 1] + dp[r - 1][c]) % mod;
				} else if ( c <= capa[r] ) {
					dp[r][c] = dp[r][capa[r] - c];
				} else {
					break;
				}
			}
		}
		System.out.println(dp[n][k] % mod);
	}
}