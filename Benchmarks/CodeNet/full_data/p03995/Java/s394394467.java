import static java.lang.Math.*;
import static java.util.Arrays.*;
 
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
import static java.math.BigInteger.*;
 
public class Main {
	
	
	void solve() {
		int R = sc.nextInt();
		int C = sc.nextInt();
		int N = sc.nextInt();
		int[] r = new int[N];
		int[] c = new int[N];
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			r[i] = sc.nextInt();
			c[i] = sc.nextInt();
			a[i] = sc.nextInt();
		}
		
		int[][] x = new int[3][3];
		boolean ans = true;
		loop:
		for (int p = 0; p < N; p++) {
			for (int i = 0; i < 3; i++) for (int j = 0; j < 3; j++) x[i][j] = -1;
			x[1][1] = a[p];
			for (int i = 0; i < N; i++) if (i != p) {
				int s = r[i] < r[p] ? 0 : r[i] > r[p] ? 2 : 1;
				int t = c[i] < c[p] ? 0 : c[i] > c[p] ? 2 : 1;
				if (x[s][t] == -1 || x[s][t] == a[i]) {
					x[s][t] = a[i];
				} else {
					ans = false;
					break loop;
				}
			}
			if (!check(x[0][0], x[0][1], x[1][0], x[1][1])) { ans = false; break loop; }
			if (!check(x[0][1], x[0][2], x[1][1], x[1][2])) { ans = false; break loop; }
			if (!check(x[1][0], x[1][1], x[2][0], x[2][1])) { ans = false; break loop; }
			if (!check(x[1][1], x[1][2], x[2][1], x[2][2])) { ans = false; break loop; }
		}
		
		if (ans)
			out.println("Yes");
		else
			out.println("No");
	}
	
	boolean check(int a, int b, int c, int d) {
		int m = 0;
		if (a < 0) m++;
		if (b < 0) m++;
		if (c < 0) m++;
		if (d < 0) m++;
//		tr(a, b, c, d, m);
		if (m >= 2) return true;
		if (m == 0) {
			return a + d == b + c;
		}
		if (a == -1) { return b + c - d >= 0; }
		if (b == -1) { return a + d - c >= 0; }
		if (c == -1) { return a + d - b >= 0; }
		if (d == -1) { return b + c - a >= 0; }
		return false;
	}
	
	static void tr(Object... os) { System.err.println(deepToString(os)); }
	static void tr(int[][] as) { for (int[] a : as) tr(a); }
 
	void print(int[] a) {
		out.print(a[0]);
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