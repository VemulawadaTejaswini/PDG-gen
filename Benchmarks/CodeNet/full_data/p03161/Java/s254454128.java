
import java.util.*;

public class Main {

	public static void main(String args[]) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		int arr[] = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = scn.nextInt();

		}

		// System.out.println(Naughty_Monkey(arr, k, n));
		int[] dp = new int[n + 1];
		System.out.println(Naughty_MonkeyTD(arr, k, n, dp));
//		System.out.println(Arrays.toString(dp));

	}

	public static int Naughty_Monkey(int[] arr, int k, int n) {
		int dp[] = new int[n + 1];
		// For every other Building 2 <= i < n, the Naughty Monkey can jump from the (i
		// - 1), (i - 2)...(i - k)th building
		for (int i = 2; i <= n; i++) {

			dp[i] = Integer.MAX_VALUE;
			for (int j = i - 1; j >= 1 && (i - j) <= k; j--) {
				dp[i] = Math.min(dp[i], Math.abs(arr[i] - arr[j]) + dp[j]);
			}

		}
		// return minimum cost to reach nth building
		return dp[n];

	}

	public static int Naughty_MonkeyTD(int[] arr, int k, int i, int dp[]) {
		if (i == 1 || i == 0) {
			return 0;
		}
		if(dp[i]!=0) {
			return dp[i];
		}
		// For every other Building 2 <= i < n, the Naughty Monkey can jump from the (i
		// - 1), (i - 2)...(i - k)th building

		int ans = Integer.MAX_VALUE;
		for (int j = i - 1; j >= 1 && (i - j) <= k; j--) {
			ans = Math.min(ans, Math.abs(arr[i] - arr[j]) + Naughty_MonkeyTD(arr, k, j, dp));

		}
		dp[i] = ans;
		return ans;

	}
}
