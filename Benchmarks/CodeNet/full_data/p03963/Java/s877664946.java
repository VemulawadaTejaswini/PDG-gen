import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int n, m;
	int[] dp;

	int dp(int k) {
		if (0 <= dp[k]) {
			return dp[k];
		}
		if (k == 0) {
			return m;
		}

		int ret = 0;
		ret += dp(k - 1) * (m - 1);
		return dp[k] = ret;
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		dp = new int[n];
		Arrays.fill(dp, -1);

		System.out.println(dp(n - 1));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
