

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int m = 1000000007;
	static String k;
	static int d;
	static long dp[][][];
	

	// cons==0 means we are tighting the limit
	public static long Solve(int pos, int sum, int f) {
		// Base Case
		int lmt = 9;
		if (f == 0)
			lmt = k.charAt(pos) - '0';

		if (pos == k.length() - 1) {
			int ans = 0;
			for (int d1 = 0; d1 <= lmt; d1++) {
				if(d1%d==sum) ans++;
			}

			return ans;
		}

		if (dp[pos][sum][f] != -1)
			return dp[pos][sum][f];

		long ans = 0;
		for (int d1 = 0; d1 <= lmt; d1++) {
			int nf = f;
			if (f == 0 && d1 < k.charAt(pos) - '0')
				nf = 1;
			// System.out.println(d1+" "+nf);
			long res = Solve(pos + 1, (sum-d1%d+d)%d, nf);
			ans = (ans+res)%m;

		}

		dp[pos][sum][f] = ans;

		return dp[pos][sum][f];
	}

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		k = sc.next();
		d=sc.nextInt();
		dp = new long[10001][101][2];
		for (int i = 0; i < dp.length; i++)
			for (int j = 0; j < dp[0].length; j++)
				Arrays.fill(dp[i][j], -1);

		long f1 = Solve(0, 0, 0);

		System.out.println(f1-1);

	}

	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		String next() {
			while (!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		int[] readArray(int n) {
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

	}

}
