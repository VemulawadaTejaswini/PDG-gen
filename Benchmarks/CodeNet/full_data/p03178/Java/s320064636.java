

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static long m = 1000000007;

	static long dp[][][];
	static String a;
	static int div;

	// f==1 bound f==0 no bound
	public static long Solve(int pos, int sum, int f) {
		int lmt = f == 1 ? a.charAt(pos) - '0' : 9;

		if (pos == a.length() - 1) {
			int ans = 0;
			//System.out.println(sum+" "+lmt);
			for (int d = 0; d <= lmt; d++) {
				
				//System.out.println(sum+d);
				if (d%div==sum)
				{
					//System.out.println(sum+d);
					ans++;
				}
			}
			return ans;

		}
		if (dp[pos][sum][f] == -1) {
			long res = 0;
			for (int d = 0; d <= lmt; d++) {

				int nf = f;
				if (f == 1 && d < a.charAt(pos) - '0')
					nf = 0;

				res = (res + Solve(pos + 1, (div+sum-d%div)%div, nf)) % m;

			}
			dp[pos][sum][f]=res;

		}
		return dp[pos][sum][f];

	}

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		a = sc.next();
		div = sc.nextInt();

		dp = new long[10005][101][2];
		for (int i = 0; i < 10005; i++) {
			for (int j = 0; j < 101; j++) {
				Arrays.fill(dp[i][j], -1);
			}
		}
		
		System.out.println(Solve(0, 0, 1)-1);

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
