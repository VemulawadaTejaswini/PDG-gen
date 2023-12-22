
import java.util.*;

public class Main {
	static int dp[][];

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scn.nextInt();
		}
		Boolean dp[] = new Boolean[k + 1];
		dp[0] = false;

		for (int i = 1; i <= k; i++) {
			boolean res = false;
			for (int j = 0; j < a.length; j++) {
				if (i - a[j] >= 0 && dp[i - a[j]] != null) {
					res = res | !dp[i - a[j]];
				}
			}
			dp[i] = res;
		}
		System.out.println(dp[k]?"First":"Second");
	}

	
	private static boolean solve(int k, int p, int[] a, Boolean[][] dp) {
		if (k == 0) {
			return true;
		}

		if (dp[k][p] != null) {
			return dp[k][p];
		}
		boolean res = false;
		for (int i = 0; i < a.length; i++) {
			if (k - a[i] >= 0) {
				res = res || !solve(k - a[i], (p + 1) % 2, a, dp);
			}

		}
		dp[k][p] = res;
		return res;

	}

}