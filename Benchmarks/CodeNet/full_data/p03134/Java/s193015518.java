import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static final long MOD = 998244353;
	static int N;
	static int[] blue;

	public static void main(String[] args) {
		char[] S = sc.next().toCharArray();
		N = S.length;
		blue = new int[N];
		for (int i = 0; i < N; i++) {
			blue[i] = S[i] - '0';
		}
		int[] max = greedy();
		for (int i = 0; i < N; i++) {
			blue[i] = 2 - blue[i];
		}
		int[] min = greedy();
		for (int i = 1; i <= 2 * N; i++) {
			min[i] = i - min[i];
		}
//		System.err.println(Arrays.toString(max));
//		System.err.println(Arrays.toString(min));
		long[][] dp = new long[2][2 * N + 1];
		dp[0][0] = 1;
		for (int i = 0, t = 0; i < 2 * N; i++, t ^= 1) {
			Arrays.fill(dp[t ^ 1], 0);
			for (int j = min[i]; j <= max[i]; j++) {
				dp[t ^ 1][j] += dp[t][j];
				if (dp[t ^ 1][j] >= MOD) dp[t ^ 1][j] -= MOD;
				dp[t ^ 1][j + 1] += dp[t][j];
				if (dp[t ^ 1][j + 1] >= MOD) dp[t ^ 1][j + 1] -= MOD;
			}
		}
		System.out.println(dp[0][max[2 * N]]);
	}

	static int[] greedy() {
		int[] count = blue.clone();
		int[] ret = new int[2 * N + 1];
		for (int i = 0; i < 2 * N; i++) {
			if (count[0] > 0) {
				ret[i + 1] = ret[i] + 1;
			} else {
				ret[i + 1] = ret[i];
			}
			if (count[0] > 0) count[0]--;
			for (int j = 1; j < N; j++) {
				if (count[j] > 0) {
					count[j - 1]++;
					count[j]--;
				}
			}
		}
		return ret;
	}
}
