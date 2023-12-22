import java.util.*;

public class Main {
	static int n, w;
	static int[] wt, val;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		w = sc.nextInt();
		wt = new int[n];
		val = new int[n];
		long [][] dp = new long[n][w+1];
		for(int i = 0; i < n; i++) {
			wt[i] = sc.nextInt();
			val[i] = sc.nextInt();
			Arrays.fill(dp[i], -1);
		}
		dp[n-1][w] = solve(w, n-1, dp);
		System.out.println(dp[n-1][w]);
	}

	public static long solve(int awt, int item, long[][] dp) {
		if(dp[item][awt] != -1) {
			return dp[item][awt];
		}
		if(item == 0) {
			if(awt >= wt[item]) {
				return dp[item][awt] = val[item];
			} else {
				return dp[item][awt] = 0;
			}
		} else if(awt <= 0) {
			return ((dp[item][awt]=0));
		} else if(awt >= wt[item]) {
			return dp[item][awt] = max(
					solve(awt-wt[item], item-1, dp) + val[item],
					solve(awt, item-1, dp)
			);
		} else {
			return dp[item][awt] = solve(awt, item-1, dp);
		}
	}
	public static long max(long a, long b) {
		return Math.max(a, b);
	}
}