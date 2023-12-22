import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static long MOD = 1_000_000_007;

	public static void main(String[] args) {
		int N = sc.nextInt();
		boolean[][] A = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				A[i][j] = sc.nextInt() == 1;
			}
		}
		int[] dp = new int[1 << N];
		dp[0] = 1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < (1 << N); j++) {
				if (Integer.bitCount(j) != i) continue;
				for (int k = 0; k < N; k++) {
					if (!A[i][k]) continue;
					int next = j | (1 << k);
					if (next == j) continue;
					dp[next] += dp[j];
					if (dp[next] >= MOD) dp[next] -= MOD;
				}
			}
		}
		System.out.println(dp[(1 << N) - 1]);
	}
}