import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static int n, k;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		n = Integer.parseInt(sa[0]);
		k = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		Arrays.parallelSort(a);
		int not = -1;
		int need = n;

		while (Math.abs(need - not) > 1) {
			int mid = (need + not) / 2;
			if (isNeed(a, mid)) {
				need = mid;
			} else {
				not = mid;
			}
		}
		System.out.println(need);
	}

	static boolean isNeed(int[] a, int mid) {
		boolean[][] dp = new boolean[n + 1][k + 1];
		dp[0][0] = true;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= k; j++) {
				dp[i + 1][j] |= dp[i][j];
				if (i != mid && j <= k - a[i]) {
					dp[i + 1][j + a[i]] |= dp[i][j];
				}
			}
		}
		for (int j = k - a[mid]; j < k; j++) {
			if (dp[n][j]) {
				return true;
			}
		}
		return false;
	}
}
