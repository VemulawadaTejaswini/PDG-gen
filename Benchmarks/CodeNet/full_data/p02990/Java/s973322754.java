import java.util.*;
import java.lang.*;

public class Main{
	static int mod = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[][] dp = new long[2001][2001];
		for (int i = 0; i < 2001; i++) {
			dp[i][0] = 1;
		}
		for (int i = 0; i < 2001; i++) {
			for (int j = i + 1; j < 2001; j++) {
				dp[i][j] = 0;
			}
		}
		for (int i = 1; i < 2001; i++) {
			for (int j = 1; j < 2001; j++) {
				dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % mod;
			}
		}
		for (int i = 1; i <= k; i++) {
			System.out.println((dp[n - k + 1][i] * dp[k - 1][i - 1]) % mod);
		}
	}
}