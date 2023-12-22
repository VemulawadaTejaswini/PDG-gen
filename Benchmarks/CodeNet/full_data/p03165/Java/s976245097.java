import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	
	static char s[], t[];
	static int dp[][];
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		s = fs.next().toCharArray(); t = fs.next().toCharArray();
		dp = new int[s.length+1][t.length+1];
		for(int i=1;i<s.length+1;i++) {
			for(int j=1;j<t.length+1;j++) {
				if(s[i-1]==t[j-1]) dp[i][j] = dp[i-1][j-1]+1;
				else {
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
		//復元
		String ans = dfs(s.length,t.length,"");
		StringBuffer sb = new StringBuffer(ans);
		System.out.println(sb.reverse());
	}
	static String dfs(int x,int y,String res) {
		if(x==0&&y==0)return res;
		else if(x==0) {
			return dfs(x,y-1,res);
		}
		else if(y==0) {
			return dfs(x-1,y,res);			
		}
		else{
			if(dp[x-1][y-1] + 1 == dp[x][y] && s[x-1]==t[y-1]) {
				return dfs(x-1,y-1,res+s[x-1]);
			}
			else {
				if(dp[x-1][y]>=dp[x][y-1]) return dfs(x-1,y,res);
				else  return dfs(x,y-1,res);
			}
		}
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