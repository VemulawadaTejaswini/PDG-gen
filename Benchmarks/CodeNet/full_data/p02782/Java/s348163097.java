import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int r1 = Integer.parseInt(str[0]);
		int c1 = Integer.parseInt(str[1]);
		int r2 = Integer.parseInt(str[2]);
		int c2 = Integer.parseInt(str[3]);

		int dp[][] = new int[r2 + 1][c2 + 1];

		for (int i = 0; i <= r2; i++) {
			dp[i][0] = 1;
		}
		for (int j = 0; j <= c2; j++) {
			dp[0][j] = 1;
		}
		dp[0][0] = 0;

		long ans = 0;
		for (int i = 1; i <= r2; i++) {
			for (int j = 1; j <= c2; j++) {
				dp[i][j] = dp[i - 1][j] % 1000000007 + dp[i][j - 1] % 1000000007;

				if (i >= r1 && j >= c1) {
					ans += dp[i][j] % 1000000007;
				}
			}
		}
		System.out.println(ans % 1000000007);
	}
}
