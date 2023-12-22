import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		String s = fs.next();
		int len = s.length();
		char c[] = s.toCharArray();
		int a[] = new int[len];
		for(int i=0;i<len;i++) {
			a[i] = c[i] - '0';
		}
		
		
		long dp[][] = new long[len+1][2];
		dp[0][0] = 1;
		for(int i=0;i<len;i++) {
			if(a[i]==0) {
				dp[i+1][0] = plus(dp[i+1][0],dp[i][0]);
				dp[i+1][1] = plus(dp[i+1][1],mul(dp[i][1],3));
			}
			else {
				dp[i+1][0] = plus(dp[i+1][0], mul(dp[i][0],2));
				dp[i+1][1] = plus(dp[i+1][1], mul(dp[i][1],3));
				dp[i+1][1] = plus(dp[i+1][1], dp[i][0]);
			}
		}
		System.out.println(plus(dp[len][0],dp[len][1]));
	}
	
	//MOD culculations
	static long plus(long x, long y) {
		return (x + y) % mod;
	}

	static long sub(long x, long y) {
		return (x - y + mod) % mod;
	}

	static long mul(long x, long y) {
		return (x * y) % mod;
	}

	static long div(long x, long y) {
		return x * modpow(y, mod - 2) % mod;
	}

	static long modpow(long x, long y) {
		if (y == 0)
			return 1;
		if (y % 2 == 1)
			return (x * modpow(x, y - 1)) % mod;
		long root = modpow(x, y / 2);
		return root * root % mod;
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