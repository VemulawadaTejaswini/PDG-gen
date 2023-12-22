import java.util.Scanner;

public class Main {

	static int n;
	static int[][] a;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[2][n];
		for(int i = 0 ; i < 2 ; i++) {
			for(int j = 0 ; j < n ; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int[][] dp = new int[2][n];
		dp[0][0] = a[0][0];
		dp[1][0] = a[0][0] + a[1][0];
		if(n == 2) dp[0][1] = a[0][0] + a[0][1];
		for(int i = 0 ; i < 2 ; i++) {
			for(int j = 1 ; j < n ; j++) {
				if(i == 0) {
					dp[i][j] = Math.max(dp[i][j - 1] + a[i][j], dp[i + 1][j] + a[i][j]);
				} else if(i == 1) {
					dp[i][j] = Math.max(dp[i - 1][j] + a[i][j], dp[i][j - 1] + a[i][j]);
				}
			}
		}
		System.out.println(dp[1][n - 1]);
	}
}
