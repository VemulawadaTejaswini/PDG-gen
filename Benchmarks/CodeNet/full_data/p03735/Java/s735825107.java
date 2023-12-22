import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	
	final long INF = 1001001001;
	void solve() {
		int N = sc.nextInt();
		int[][] p = new int[N][2];
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			p[i][0] = Math.min(x, y);
			p[i][1] = Math.max(x, y);
		}
		sort(p, new Comparator<int[]>(){
			@Override
			public int compare(int[] a, int[] b) {
				if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
				return Integer.compare(a[1], b[1]);
			}
		});
		long Rmax = 0, Bmax = 0;
		long Rmin = INF, Bmin = INF;
		for (int i = 0; i < N; i++) {
			Rmax = max(Rmax, p[i][0]);
			Rmin = min(Rmin, p[i][0]);
			
			Bmax = max(Bmax, p[i][1]);
			Bmin = min(Bmin, p[i][1]);
		}
		long ans = (Rmax - Rmin) * (Bmax - Bmin);
		long Gmax = max(Rmax, Bmax);
		long Gmin = min(Rmin, Bmin);
		
		long c1 = INF, c2 = 0;
		for (int i = 0; i < N; i++) {
			if (p[i][0] == Gmin) {
				c1 = min(c1, p[i][1]);
				c2 = max(c2, p[i][1]);
			}
			if (p[i][1] == Gmax) {
				c1 = min(c1, p[i][0]);
				c2 = max(c2, p[i][0]);
			}
		}
		
		ans = min(ans, (Gmax - Gmin) * f(p, c1));
		ans = min(ans, (Gmax - Gmin) * f(p, c2));
		ans = min(ans, (Gmax - Gmin) * f(p, (c1 + c2)/2));
		out.println(ans);
	}
	
	long f(int[][]p, long c) {
		long max = 0;
		long min = INF;
		for (int i = 0; i < p.length; i++) {
			int k = abs(p[i][0] - c) < abs(p[i][1] - c) ? p[i][0] : p[i][1];
			max = max(max, k);
			min = min(min, k);
		}
		return max - min;
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