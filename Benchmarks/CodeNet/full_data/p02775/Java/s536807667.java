import java.util.*;
import java.io.*;

//yukicoderの５円玉が使われる問題でも解きやすかったた考え方
//繰り下がりが発生した場合は、今の桁の数nowを10-nowとみる
public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		String s = fs.next();
		StringBuffer sb = new StringBuffer(s);
		s = sb.reverse().toString();

		s = s+"0";
		char c[] = s.toCharArray();
		int n = s.length();
		int dp[][] = new int[n+1][2];
		int INF = Integer.MAX_VALUE/2;
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<2;j++)dp[i][j] = INF;
		}
		dp[0][0]=0;
		for(int i=0;i<n;i++) {
			int now = c[i] - '0';
			for(int j=0;j<2;j++) {
				int ni = i+1, nj = 0;
				now += j; 
				//ぴったり払う場合
				dp[ni][nj] = Math.min(dp[ni][nj], dp[i][j]+now);
				
				//繰り下がりで払う場合
				nj ++;
				int rnow = 10 - now;
				dp[ni][nj] = Math.min(dp[ni][nj], dp[i][j]+rnow);
				
			}
		}
		int ans = dp[n][0];
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