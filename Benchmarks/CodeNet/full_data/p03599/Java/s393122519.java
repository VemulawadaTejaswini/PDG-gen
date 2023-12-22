import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int a = sc.nextInt() * 100;
		int b = sc.nextInt() * 100;
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();

		int[] dp = new int[f + 1];

		Arrays.fill(dp, -1);
		dp[0] = 0;
		int max_w = Math.min(a, b);
		int max_s = 0;

		for (int i = 0; i < f + 1; i++) {

			if (i >= a) {
				if (dp[i - a] != -1)
					dp[i] = Math.max(dp[i], dp[i - a]);
			}

			if (i >= b) {
				if (dp[i - b] != -1)
					dp[i] = Math.max(dp[i], dp[i - b]);

			}
			if (i >= c) {
				if (dp[i - c] != -1)
					if ((dp[i - c] + c) * 100 <= e * (i-dp[i-c]-c)) {
						dp[i] = Math.max(dp[i], dp[i - c] + c);
					}
			}
			if (i >= d) {
				if (dp[i - d] != -1)
					if ((dp[i - d] + d) * 100 <= e * (i-dp[i-d]-d)) {
						dp[i] = Math.max(dp[i], dp[i - d] + d);
					}
			}

			if (dp[i] != -1 && dp[i] * max_w >= i * max_s) {
				max_w = i;
				max_s = dp[i];
			}
		}
		System.out.println(max_w + " " + max_s);

	}
}
