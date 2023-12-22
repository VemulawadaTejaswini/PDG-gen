import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static PrintWriter out = new PrintWriter(System.out);

	static int R,C;
	static int g[][];
	static int dp[][][];
	public static void main(String[] args) {
		FS in = new FS();
		R = in.nextInt();
		C = in.nextInt();
		g = new int[R][C];
		for(int i = 0; i < R; i++) {
			char cc[] = in.next().toCharArray();
			for(int j = 0; j < C; j++) {
				g[i][j] = cc[j] == '.' ? 0 : 1;
			}
		}
		dp = new int[2][R][C];
		for(int a[][] : dp)
			for(int b[] : a)
				Arrays.fill(b, -1);
		int res = -1;
		if(g[0][0] == 0) res = go(0,0,0);
		else res = 1 + go(1,0,0);
		out.println(res);
		out.close();
	}
	static int go(int st, int r, int c) {
		if(r == R-1 && c == C-1) return 0;
		if(dp[st][r][c] != -1) return dp[st][r][c];
		int res = 123123;
		// go right
		if(c < C-1) {
			int cur = 0;
			if(st == 0 && g[r][c+1] == 1) cur++;
			res = Math.min(res, cur + go(g[r][c+1], r, c+1));
		}
		if(r < R-1) {
			int cur = 0;
			if(st == 0 && g[r+1][c] == 1) cur++;
			res = Math.min(res, cur + go(g[r+1][c], r+1, c));
		}
		
		return dp[st][r][c] = res;
	}
	
	static class FS{
		BufferedReader br;
		StringTokenizer st;
		public FS() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String next() {
			while(st == null || !st.hasMoreElements()) {
				try {st = new StringTokenizer(br.readLine());}
				catch(Exception e) { throw null;}
			}
			return st.nextToken();
		}
		int nextInt() { return Integer.parseInt(next());}
		double nextDouble() { return Double.parseDouble(next());}
		long nextLong() { return Long.parseLong(next());}
		int[] NIA(int n) {
			int r[] = new int[n];
			for(int i = 0; i < n; i++) r[i] = nextInt();
			return r;
		}
		long[] NLA(int n) {
			long r[] = new long[n];
			for(int i = 0; i < n; i++) r[i] = nextLong();
			return r;
		}
		char[][] grid(int r, int c){
			char res[][] = new char[r][c];
			for(int i = 0; i < r; i++) {
				char l[] = next().toCharArray();
				for(int j = 0; j < c; j++) {
					res[i][j] = l[j];
				}
			}
			return res;
		}
	}
	
}
