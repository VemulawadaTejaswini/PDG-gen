import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	static int h, w, memo[][];
	static char field[][];
	static int INF = Integer.MAX_VALUE/2;
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		h = fs.nextInt(); w = fs.nextInt();
		field = new char[h][w];
		for(int i=0;i<h;i++) {
			String s = fs.next();
			for(int j=0;j<s.length();j++) {
				field[i][j]=s.charAt(j);
			}
		}
		//startだけ決めて、一番遠いところをゴールにする
		int ans = 0;
		memo = new int[h][w];
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				for(int k=0;k<h;k++) {
					Arrays.fill(memo[k], INF);					
				}
				if(field[i][j]=='#')continue;
				dfs(i,j, 0);
				ans = Math.max(ans, check());
			}
		}
		System.out.println(ans);
	}
	
	static int check() {
		int res = 0;
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				if(memo[i][j]==INF)continue;
				res = Math.max(res, memo[i][j]);
			}
		}
		return res;
	}
	
	static void dfs(int x, int y, int d) {
		if(memo[x][y]<=d)return;
		memo[x][y]= Math.min(memo[x][y], d);
		for(int i=0;i<4;i++) {
			int dx = DX[i]; int dy = DY[i];
			int nx = x + dx , ny = y + dy;
			if(0<=nx&&nx<h&&0<=ny&&ny<w) {
				if(memo[nx][ny]==1)continue;
				if(field[nx][ny]=='#')continue;
				dfs(nx, ny, d+1);
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