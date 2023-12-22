import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static final long MOD = 1_000_000_007;

	public static void main(String[] args) {
		int H = sc.nextInt();
		int W = sc.nextInt();
		boolean[][] a = new boolean[H][W];
		for (int i = 0; i < H; i++) {
			char[] row = sc.next().toCharArray();
			for (int j = 0; j < W; j++) {
				a[i][j] = row[j] == '.';
			}
		}
		long[][] dp = new long[H][W];
		dp[0][0] = 1;
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (!a[i][j]) continue;
				if (i > 0) dp[i][j] += dp[i - 1][j];
				if (j > 0) dp[i][j] += dp[i][j - 1];
				if (dp[i][j] >= MOD) dp[i][j] -= MOD;
			}
		}
		System.out.println(dp[H - 1][W - 1]);
	}


}