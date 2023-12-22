import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		int[] ws = new int[n + 1];
		long[] vs = new long[n + 1];
		for (int i = 1; i < n + 1; i++) {
			ws[i] = sc.nextInt();
			vs[i] = sc.nextLong();
		}

		long[][] dp = new long[n + 1][w + 1];
		for (int i = 1; i < n + 1; i++) {
			for (int j = 0; j < w + 1; j++) {
				if (ws[i] > j) {
					dp[i][j] = dp[i - 1][j];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - ws[i]] + vs[i]);
				}
			}
		}

		//for (int i = 0; i < n + 1; i++) {
		//	for (int j = 0; j < w + 1; j++) {
		//		System.out.print(dp[i][j]);
		//		System.out.print(" ");
		//	}
		//	System.out.println();
		//}

		System.out.println(dp[n][w]);
	}
}
