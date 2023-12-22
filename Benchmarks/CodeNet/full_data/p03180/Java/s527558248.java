import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int[][] A = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		long[] dp = new long[1 << N];
		for (int i = 0; i < (1 << N); i++) {
			for (int j = 0; j < N; j++) {
				if ((i & (1 << j)) == 0) continue;
				for (int k = j + 1; k < N; k++) {
					if ((i & (1 << k)) == 0) continue;
					dp[i] += A[j][k];
				}
			}
		}
		for (int i = 1; i < (1 << N); i++) {
			int mask = (1 << N) - 1 - i;
			for (int j = mask; j > 0; j = (j - 1) & mask) {
				dp[i | j] = Math.max(dp[i | j], dp[i] + dp[j]);
			}
		}
		System.out.println(dp[(1 << N) - 1]);
	}
}