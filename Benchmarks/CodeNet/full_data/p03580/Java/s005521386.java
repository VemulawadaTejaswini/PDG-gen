import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		int[] a = new int[n];
		int[] sz = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = s[i] - '0';
		}
		for (int i = 0; i < n; ++i) {
			if (a[i] == 1) {
				sz[i] = (i > 0 ? sz[i - 1] : 0) + a[i];
			}
		}

		int[] dp = new int[n];
		for (int i = 2; i < n; ++i) {
			dp[i] = dp[i - 1];
			if (a[i] == 0)
				continue;
			if (a[i - 1] == 0 && a[i - 2] == 1) {
				for (int d = 0; d < 3 && sz[i - 2] - d > 0; ++d) {
					dp[i] = Math.max(dp[i],
							(sz[i - 2] - d) + (i - 2 - (sz[i - 2] - d) >= 0 ? dp[i - 2 - (sz[i - 2] - d)] : 0));
				}
			}
			if (i - sz[i] - 1 >= 0 && a[i - sz[i] - 1] == 1) {
				dp[i] = Math.max(dp[i], sz[i] + (i - 2 - sz[i] >= 0 ? dp[i - sz[i] - 2] : 0));
			}
		}
		System.out.println(dp[n - 1]);
	}

}
