import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;

import java.io.*;

public class Main {
	int[] di = {0, 1, 0, -1};
	int[] dj = {1, 0, -1, 0};
	char[][] t;
	void solve() {
		int H = sc.nextInt();
		int W = sc.nextInt();
		t = new char[H+2][W+2];

		for (int i = 0; i < H+2; i++) Arrays.fill(t[i], '.');
		
		for (int i = 1; i <= H; i++) t[i] = ("." + sc.next() + ".").toCharArray();
		for (int i = 1; i <= H; i++) for (int j = 1; j <= W; j++) {
			if (t[i][j] == 'X') {
				if (i == 1 || i == H || j == 1 || j == W) {
					out.println(-1);
					return;
				} else {
					for (int k = 0; k < 4; k++) {
						int ni = i + di[k];
						int nj = j + dj[k];
						if (t[ni][nj] == '.') t[ni][nj] = '#';
					}
				}
			}
		}
		for (int i = 0; i < H+2; i++) tr(new String(t[i]));
		
		mark = new boolean[H+2][W+2];
		bfs(0, 0);
//		tr(mark);
		int ans = 0;
		for (int i = 0; i < H+2; i++) for (int j = 0; j < W+2; j++) {
			if (mark[i][j] && t[i][j] == '#') ans++;
		}
		
//		tr((H-2)*2 + (W-2)*2);
		ans = min(ans, (H-2)*2 + (W-2)*2);
		out.println(ans);
	}
	
	int[] q = new int[128 * 128 * 2];
	boolean[][] mark;
	void bfs(int r, int c) {
		int sp = 0;
		mark[r][c] = true;
		q[sp++] = r;
		q[sp++] = c;
		
		while (sp > 0) {
			c = q[--sp];
			r = q[--sp];
			for (int k = 0; k < 4; k++) {
				int nr = r + di[k];
				int nc = c + dj[k];
				if (0 <= nr && nr < mark.length && 0 <= nc && nc < mark[0].length) {
					if (!mark[nr][nc]) {
						mark[nr][nc] = true;
						 if (t[nr][nc] == '.') {
							q[sp++] = nr;
							q[sp++] = nc;
						 }
					}
				}
			}
		}
	}
	
	static void tr(Object... os) { System.err.println(deepToString(os)); }
	static void tr(int[][] as) { for (int[] a : as) tr(a); }
	static void tr(boolean[][] as) { for (boolean[] a : as) {
		for (boolean b : a) {
			System.err.print(b ? 1 : 0);
		}
		System.err.println();
		}
	}

	void print(int[] a) {
		if (a.length > 0) out.print(a[0]);
		for (int i = 1; i < a.length; i++) out.print(" " + a[i]);
		out.println();
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	MyScanner sc = null;
	PrintWriter out = null;
	public void run() throws Exception {
		sc = new MyScanner(System.in);
		out = new PrintWriter(System.out);
		for (;sc.hasNext();) {
			solve();
			out.flush();
		}
		out.close();
	}

	class MyScanner {
		String line;
		BufferedReader reader;
		StringTokenizer tokenizer;

		public MyScanner(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream));
			tokenizer = null;
		}
		public void eat() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					line = reader.readLine();
					if (line == null) {
						tokenizer = null;
						return;
					}
					tokenizer = new StringTokenizer(line);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
		public String next() {
			eat();
			return tokenizer.nextToken();
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		public boolean hasNext() {
			eat();
			return (tokenizer != null && tokenizer.hasMoreElements());
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++) a[i] = nextInt();
			return a;
		}
	}
}