import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1[] = br.readLine().split("");
		String str2[] = br.readLine().split("");

		int n = str1.length;
		int m = str2.length;

		int dp[][] = new int[n + 1][m + 1];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (str1[i].equals(str2[j])) {
					dp[i + 1][j + 1] = Math.max(dp[i + 1][j + 1], dp[i][j] + 1);
				}
				dp[i + 1][j + 1] = Math.max(dp[i + 1][j + 1], dp[i + 1][j]);
				dp[i + 1][j + 1] = Math.max(dp[i + 1][j + 1], dp[i][j + 1]);
			}
		}

		String ans = "";
		int i = n;
		int j = m;
		while (i > 0 && j > 0) {
			if (dp[i][j] == dp[i - 1][j]) {
				--i;
			} else if (dp[i][j] == dp[i][j - 1]) {
				--j;
			} else {
				ans = str1[i - 1] + ans;
				--i;
				--j;
			}
		}

		System.out.println(ans);
	}
}
