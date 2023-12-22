import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt(), t = fs.nextInt();
		int food[][] = new int[n][2];
		for(int i=0;i<n;i++) {
			int a = fs.nextInt(), b = fs.nextInt();
			food[i][0] = a; food[i][1] = b;
		}
		
		int dp[][] = new int[n+1][t];
		for(int i=0;i<n;i++) {
			int a = food[i][0], b = food[i][1];
			for(int j=0;j<t;j++) {
				if(j - a > 0) {
					dp[i+1][j] = Math.max(dp[i][j], dp[i][j-a] + b);
				}
				else{
					dp[i+1][j] = dp[i][j];
				}
			}
		}
		int rdp[][] = new int[n+1][t];
		for(int i=0;i<n;i++) {
			int a = food[n-1-i][0], b = food[n-1-i][1];
			for(int j=0;j<t;j++) {
				if(j - a > 0) {
					rdp[i+1][j] = Math.max(rdp[i][j], rdp[i][j-a] + b);
				}
				else{
					rdp[i+1][j] = rdp[i][j];
				}
			}
		}
		
		int ans = 0;
		for(int i=0;i<n;i++) {
			int res = 0;
			int sum = 0;
			for(int j=0;j<t;j++) {
				if(i==0) {
					res = rdp[n-1][t-1]; 
					break;
				}
				if(i==n-1) {
					res = dp[n-1][t-1];
					break;
				}
				sum = dp[i][j] + rdp[n-i-1][t-j-1];
				res = Math.max(res, sum);
			}
			ans = Math.max(ans, res + food[i][1]);
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