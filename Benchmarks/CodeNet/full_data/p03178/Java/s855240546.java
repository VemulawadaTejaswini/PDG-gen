

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int m = 1000000007;
	
	static long dp[][][];
	

	// cons==0 means we are tighting the limit
	public static long Solve(String k,int D, int pos, int d, int f) {
		// Base Case
		int lmt = 9;
		if (f == 0)
			lmt = k.charAt(pos) - '0';

		if (pos == k.length() - 1) {
			long ans = 0;
			for (int d1 = 0; d1 <= lmt; d1++) {
				if(d1%D==d) ans++;
			}

			return ans%m;
		}

		if (dp[pos][d][f] != -1)
			return dp[pos][d][f];

		long ans = 0;
		for (int d1 = 0; d1 <= lmt; d1++) {
			int nf = f;
			if (f == 0 && d1 < k.charAt(pos) - '0')
				nf = 1;
			// System.out.println(d1+" "+nf);
			long res = Solve(k,D,pos + 1, (D+d-d1%D)%D, nf);
			ans = (ans+res)%m;

		}

		dp[pos][d][f] = ans%m;

		return dp[pos][d][f];
	}

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		String k = sc.next();
		int D=sc.nextInt();
		dp = new long[10001][101][2];
		for (int i = 0; i < dp.length; i++)
			for (int j = 0; j < dp[0].length; j++)
				Arrays.fill(dp[i][j], -1);

		long f1 = Solve(k,D,0, 0, 0);

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
