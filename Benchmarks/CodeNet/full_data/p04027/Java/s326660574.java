import java.util.*;
import java.io.*;

public class Main 
{
	public static void main(String[] args) {new Main();}
	FS in = new FS();
	PrintWriter out = new PrintWriter(System.out);
	
	int n, c;
	long mod = (long)1e9 + 7;
       	int[] a, b;
	long[][] pre, dp;
	
	Main() {
		n = in.nextInt();
		c = in.nextInt();
		a = new int[n]; b = new int[n];
		for (int i = 0; i < n; a[i++] = in.nextInt());
		for (int i = 0; i < n; b[i++] = in.nextInt());

		pre = new long[n][c + 1];
		for (int i = 0; i < n; i++)
			for (int j = 0; j <= c; j++)
				for (int k = a[i]; k <= b[i]; k++) {
					pre[i][j] += pow(k, j);
					pre[i][j] %= mod;
				}

		dp = new long[n][c + 1];
		for (int i = 0; i < n; i++)
			Arrays.fill(dp[i], -1);
		out.println(dp(0, c));
		out.close();
	}
	
	long dp(int idx, int left) {
		if (left == 0)
			return 1;
		if (idx == n)
			return 0;
		if (dp[idx][left] != -1)
			return dp[idx][left];

		long ans = 0;
		for (int i = 0; i <= left; i++) {
			ans += mult(pre[idx][i], dp(idx + 1, left - i));
			ans %= mod;
		}
		return dp[idx][left] = ans;
	}

	long mult(long a, long b) {
		return (a % mod)*(b % mod) % mod;
	}

	long pow(long a, long b) {
		long res = 1L;
		while (b > 0) {
			if ((b & 1) == 0) {
				res *= res;
				res %= mod;
			}
			res *= a;
			res %= mod;
			b >>= 1;
		}
		return res;
	}
	
	class FS {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens()) {
				try { st = new StringTokenizer(br.readLine()); }
				catch (Exception e) {}
			} return st.nextToken();
		}
		int nextInt() { return Integer.parseInt(next()); }
		long nextLong() { return Long.parseLong(next()); }
		double nextDouble() { return Double.parseDouble(next()); }
	}
}
