import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	int min;

	public void solve() {
		int n = in.nextInt();
		int[] a = new int[n];
		int all = 0, sum = 0, min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
			sum += a[i];
			min = Math.min(min, a[i]);
		}
		all = sum;
		sum /= 2;
		if (min > 0)
			min = 0;
		this.min = min;
		boolean[] dp = new boolean[sum - min + 1];
		dp[pos(0)] = true;
		for (int i = 0; i < n; i++) {
			for (int j = pos(sum); j > min; j--) {
				if (0 <= pos(j) - a[i] && pos(j) - a[i] <= sum) {
					dp[pos(j)] = dp[pos(j)] || dp[pos(j) - a[i]];
				}
			}
		}
		if (dp[pos(sum)]) {
			System.out.println(all - sum);
		} else {
			for (int i = pos(sum) - 1; i > min; i--) {
				if (dp[pos(sum)]) {
					System.out.println((pos(sum) - 1 - i) * 2 + all % 2);
				}
			}
		}
	}

	public int pos(int i) {
		return i - min;
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}