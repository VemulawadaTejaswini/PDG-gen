import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int M = 1_000_000_007;
		
		long[][][] dp = new long[N+2][K+2][2];
		dp[0][0][0] = 1;
		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= K; j++) {
				dp[i + 1][j + 1][1] = (dp[i + 1][j + 1][1] + dp[i][j][0]) % M; //r -> b
				dp[i + 1][j][0] = (dp[i + 1][j][0] + dp[i][j][0]) % M; // r -> r
				dp[i + 1][j][0] = (dp[i + 1][j][0] + dp[i][j][1]) % M; // b -> r
			}
		}
		long[][] bb = new long[K+1][K+1];
		bb[0][0] = 1;
		long[] bit = new long[K + 2];
		add(bit, 0, 1);
		for (int i = 1; i <= K; i++) {
			long[] nbit = new long[K + 2];
			for (int j = 0; j <= K; j++) {
				bb[i][j] = sum(bit, j + 1) % M;
				add(nbit, j, bb[i][j]);
			}
			bit = nbit;
		}
		for (int i = 1; i <= K; i++) {
			System.out.println((dp[N + 1 - (K - i)][i][0] * bb[i][K - i]) % M);
		}
	}
	static void add(long[] vs, int k, long a) {
		for (int i = k + 1; i < vs.length; i += i & -i) {
			vs[i] += a;
		}
	}
	static long sum(long[] vs, int t) {
		long res = 0;
		for (int i = t; i > 0; i -= i & -i) {
			res += vs[i];
		}
		return res;
	}
}