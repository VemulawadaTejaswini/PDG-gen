import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int[] x = new int[n];
		for(int i = 0 ; i < n ; i++) x[i] = sc.nextInt();
		long[][][] dp = new long[n + 1][n + 1][2501];
		dp[0][0][0] = 1;
		// dp[i][j][k]:i枚のカードからj枚のカードを選んだときの和がkになる選び方の総数
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				for(int k = 0 ; k <= 2500 ; k++) {
					// x[i]枚目のカードを選んだ時
					if(k + x[i] <= 2500) dp[i + 1][j + 1][k + x[i]] += dp[i][j][k];
					// x[i]枚目のカードを選ばない時
					dp[i + 1][j][k] += dp[i][j][k];
				}
			}
		}
		// dp[n][i][i * a]:n枚のカードからi枚のカードを選んだときの和がi * aになる選び方の総数を求める
		long ans = 0;
		for(int i = 1 ; i <= n ; i++) {
			ans += dp[n][i][i * a];
		}
		System.out.println(ans);
	}
}
