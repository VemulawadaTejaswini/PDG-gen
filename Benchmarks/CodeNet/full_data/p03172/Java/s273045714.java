import java.util.Arrays;
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

//		Arrays.sort(a);
//		for ( int i = 1; i <= N; i++ ) {
//			capa[i] += a[i] + capa[i - 1];
//		}

		long dp[][] = new long[N + 1][K + 1];
		for ( int n = 0; n <= N; n++ ) {
			dp[n][0] = 1L;
			Arrays.fill(dp[n], 1, K + 1, 0);
		}

		for ( int n = 1; n <= N; n++ ) {
			if ( a[n] == 0 ) {
				dp[n] = dp[n - 1];
				continue;
			}
			for ( int k = 1; k <= K; k++ ) {

				if ( k <= a[n] ) {
					dp[n][k] = (dp[n][k - 1] + dp[n - 1][k]) % mod;
				} else /*if ( k <= a[n] )*/ {
					dp[n][k] = (dp[n][k - 1] + dp[n - 1][k] - dp[n - 1][k - a[n] - 1]) % mod;
				} 
			}
		}

//		for ( long[] ls : dp ) {
//			for ( long l : ls ) {
//				System.out.print(l + " ");
//			}
//			System.out.println();
//		}
		System.out.println(dp[N][K] % mod);
	}
}
