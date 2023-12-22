package test;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[][] dp = new int[N + 1][3];
		int[][] table = new int[N][3];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				table[i][j] =sc.nextInt();
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if(j==k)continue;
					dp[i + 1][k] = Math.max(dp[i + 1][k], dp[i][j] + table[i][k]);
				}
			}
		}

		int ans = 0;
		for (int i = 0; i < 3; i++) {
			 ans = Math.max(ans, dp[N][i]);
		}

		System.out.println(ans);

	}
}
