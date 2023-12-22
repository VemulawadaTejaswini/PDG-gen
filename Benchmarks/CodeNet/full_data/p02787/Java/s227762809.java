import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int h = fs.nextInt(), n = fs.nextInt();
		int mag[][] = new int[n][2];
		for(int i=0;i<n;i++) {
			mag[i][0] = fs.nextInt();
			mag[i][1] = fs.nextInt();
		}
		
		int dp[] = new int[h+10]; //hを倒すときの最小魔力
		Arrays.fill(dp, Integer.MAX_VALUE/2);
		dp[0] = 0;
		for(int i=1;i<=h;i++) {
			for(int j=0;j<n;j++) {
				int a = mag[j][0], b = mag[j][1];
				if(a>=i) {
					dp[i] = Math.min(dp[i], b);
				}else {
					dp[i] = Math.min(dp[i], dp[i-a] + b);
				}
			}
		}
		System.out.println(dp[h]);
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