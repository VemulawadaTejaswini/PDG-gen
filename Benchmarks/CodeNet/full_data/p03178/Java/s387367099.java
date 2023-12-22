import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static final long MOD = 1_000_000_007;

	public static void main(String[] args) {
		char[] S = sc.next().toCharArray();
		int N = S.length;
		int[] K = new int[N];
		for (int i = 0; i < N; i++) {
			K[i] = S[i] - '0';
		}
		int D = sc.nextInt();
		long[][] tight = new long[N + 1][D];
		long[][] free = new long[N + 1][D];
		tight[0][0] = 1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < D; j++) {
				for (int k = 0; k < K[i]; k++) {
					free[i + 1][(j + k) % D] += tight[i][j];
					if (free[i + 1][(j + k) % D] >= MOD) free[i + 1][(j + k) % D] -= MOD;
				}
				tight[i + 1][(j + K[i]) % D] += tight[i][j];
				if (tight[i + 1][(j + K[i]) % D] >= MOD) tight[i + 1][(j + K[i]) % D] -= MOD;
				for (int k = 0; k <= 9; k++) {
					free[i + 1][(j + k) % D] += free[i][j];
					if (free[i + 1][(j + k) % D] >= MOD) free[i + 1][(j + k) % D] -= MOD;
				}
			}
		}
		System.out.println((free[N][0] + tight[N][0] + MOD - 1) % MOD);
	}
}