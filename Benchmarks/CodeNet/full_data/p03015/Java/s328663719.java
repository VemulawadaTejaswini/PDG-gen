import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		String L = fs.next();
		int len = L.length();
		long dp[][] = new long[len][2]; //上からi桁目、未満フラグ。値は場合の数
		dp[0][0]=2;//先頭は絶対1なので 
		dp[0][1]=1;
		for(int i=1;i<len;i++) {
			int now = L.charAt(i) - '0';
			if(now == 0) {
				dp[i][0] = dp[i-1][0];
				dp[i][1] = dp[i-1][1] * 3 % mod;
			}
			else {
				dp[i][0] = dp[i-1][0]*2%mod;
				dp[i][1] = (dp[i-1][1]*3 %mod + dp[i-1][0])%mod;
			}
		}
		long ans = (dp[len-1][0] + dp[len-1][1]) % mod;
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