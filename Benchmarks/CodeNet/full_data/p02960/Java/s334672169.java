import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.nextLine().toCharArray();
		int[][] dp = new int[s.length + 1][13];

		int m = 1_000_000_007;

		dp[0][0] = 1;
		for (int i = 0; i < s.length; i++) {
			int a = (s[i] == '?') ? -1 : s[i] - '0';
			for (int j = 0; j < 10; j++) {
				if (a != -1 && a != j) continue;
				for (int k = 0; k < 13; k++) {
					dp[i + 1][(k * 10 + j) % 13] += dp[i][k] % m;
				}
			}
		}

		//for (int i = 0; i < dp.length; i++) {
		//	for (int j = 0; j < 13; j++) {
		//		System.out.print(dp[i][j]);
		//		System.out.print(" ");
		//	}
		//	System.out.println();
		//}
		System.out.println(dp[s.length][5]);
	}
}
