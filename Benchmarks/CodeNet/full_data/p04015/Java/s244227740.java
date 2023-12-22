import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt(), a = fs.nextInt();
		int x[] = fs.nextIntArray(n);
		long dp[][][] = new long[n+1][n+1][2520];
		dp[0][0][0] = 1;
		for(int i=1;i<n+1;i++) {
			int now = x[i-1];
			for(int j=0;j<=i;j++) {
				for(int k=0;k<2501;k++) {
					if(j==0) {
						dp[i][j][k] = dp[i-1][j][k];
						continue;
					}
					if(k-now>=0) dp[i][j][k] =  dp[i-1][j-1][k-now] + dp[i-1][j][k];
					else dp[i][j][k] = dp[i-1][j][k];
				}
			}
		}
		long ans = 0;
		for(int i=1;i<=n;i++) {
			if(i*a>2500)continue;
			ans += dp[n][i][i*a];
		}
		System.out.println(ans);
	}
}

//高速なScanner
class FastScanner {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScanner(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}