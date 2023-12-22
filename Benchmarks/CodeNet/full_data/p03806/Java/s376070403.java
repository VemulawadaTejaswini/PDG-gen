import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int n;
	int ma, mb;
	int[] a, b, c;
	int[][][] dp;

	int dp(int k, int ta, int tb) {
		if (k == 0 && ta == a[0] && tb == b[0]) {
			return c[0];
		}
		if (k == 0 && ta == 0 && tb == 0) {
			return 0;
		}
		if (k < 0 || ta < 0 || tb < 0) {
			return 1 << 20;
		}
		if (dp[k][ta][tb] < (1 << 20)) {
			return dp[k][ta][tb];
		}

		int ret = 1 << 20;
		ret = Math.min(ret, dp(k - 1, ta, tb));
		ret = Math.min(ret, dp(k - 1, ta - a[k], tb - b[k]) + c[k]);
		return dp[k][ta][tb] = ret;
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		ma = sc.nextInt();
		mb = sc.nextInt();
		a = new int[n];
		b = new int[n];
		c = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		dp = new int[n][401][401];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 401; j++) {
				Arrays.fill(dp[i][j], 1 << 20);
			}
		}
		int min = 1 << 20;
		for (int i = 1; i <= 400; i++) {
			if (400 < ma * i || 400 < mb * i) {
				break;
			}
			min = Math.min(min, dp(n - 1, ma * i, mb * i));
		}

		if (min < (1 << 20)) {
			System.out.println(min);
		} else {
			System.out.println(-1);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
