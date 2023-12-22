

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int N, A;
	static long[][][] dp;
	static int[] a;

	static long solve(int i, int j, int k) {
		if (i == N)
			return j != 0 && j * A == k ? 1 : 0;
		if (dp[i][j][k] != -1)
			return dp[i][j][k];
		long take = solve(i + 1, j + 1, k + a[i]);
		long leave = solve(i + 1, j, k);
		return dp[i][j][k] = take + leave;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		A = sc.nextInt();
		a = new int[N];
		for (int i = 0; i < N; i++)
			a[i] = sc.nextInt();
		dp = new long[N][N][2501];
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				Arrays.fill(dp[i][j], -1);
		System.out.println(solve(0, 0, 0));
	}

}
