import java.util.*;

import java.io.*;
import java.math.BigInteger;

public class Main {
	FastScanner in;
	PrintWriter out;
	boolean systemIO = true;

	public class Fraction implements Comparable<Fraction> {
		long x;
		long y;

		public Fraction(long x, long y) {
			this.x = x;
			this.y = y;
		}

		public void norm() {
			long gcd = gcd(x, y);
			x /= gcd;
			y /= gcd;
		}

		@Override
		public int compareTo(Fraction o) {
			if (x > o.x) {
				return 1;
			}
			if (x < o.x) {
				return -1;
			}
			if (y > o.y) {
				return 1;
			}
			if (y < o.y) {
				return -1;
			}
			return 0;
		}
	}

	public Fraction sum(Fraction a, Fraction b) {
		Fraction c = new Fraction(a.x * b.y + a.y * b.x, a.y * b.y);
		c.norm();
		return c;
	}

	public long gcd(long x, long y) {
		if (y == 0) {
			return x;
		}
		if (x == 0) {
			return y;
		}
		return gcd(y, x % y);
	}
	
	public class Pair implements Comparable<Pair> {
		long x;
		long y;

		public Pair(long x, long y) {
			this.x = x;
			this.y = y;
		}
		
		public void add(Pair p) {
			x += p.x;
			y += p.y;
		}

		@Override
		public int compareTo(Pair o) {
//			if (x != o.x) {
//				return x - o.x;
//			}
//			return y - o.y;
			return 0;
		}
	}
	
	public class DSU {
		int[] sz;
		int[] p;
		
		public DSU(int n) {
			sz = new int[n];
			p = new int[n];
			for (int i = 0; i < p.length; i++) {
				p[i] = i;
				sz[i] = 1;
			}
		}
		
		public int get(int x) {
			if (x == p[x]) {
				return x;
			}
			int par = get(p[x]);
			p[x] = par;
			return par;
		}
		
		public boolean unite(int a, int b) {
			int pa = get(a);
			int pb = get(b);
			if (pa == pb) {
				return false;
			}
			if (sz[pa] < sz[pb]) {
				p[pa] = pb;
				sz[pb] += sz[pa];
			} else {
				p[pb] = pa;
				sz[pa] += sz[pb];
			}
			return true;
		}
	}

	
	
	public void solve() {
		long mod = 1000000007;
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		int[] na = new int[n * m + 1];
		int[] nb = new int[n * m + 1];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
			na[a[i]]++;
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = in.nextInt();
			nb[b[i]]++;
		}
		for (int i = 0; i < na.length; i++) {
			if (na[i] > 1) {
				out.println(0);
				return;
			}
		}
		for (int i = 0; i < nb.length; i++) {
			if (nb[i] > 1) {
				out.println(0);
				return;
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
//					a[i] = 0;
//					b[j] = 0;
//					na[0]++;
					na[a[i]]++;
//					nb[0]++;
					nb[b[j]]++;
				}
			}
		}
		long ans = 1;
		for (int i = 0; i < a.length; i++) {
			long th = 0;
			if (na[a[i]] == 2) {
				continue;
			}
			for (int j = 0; j < b.length; j++) {
				if (b[j] > a[i]) {
					th++;
				}
			}
			ans *= th;
			ans %= mod;
		}
		for (int i = 0; i < b.length; i++) {
			long th = 0;
			if (na[b[i]] == 2) {
				continue;
			}
			for (int j = 0; j < a.length; j++) {
				if (b[i] < a[j]) {
					th++;
				}
			}
			ans *= th;
			ans %= mod;
		}
		int c = 0;
		int d = 0;
		for (int i = n * m; i > 0; i--) {
			if (na[i] > 0) {
				c++;
			}
			if (nb[i] > 0) {
				d++;
			}
			if (na[i] == 0 && nb[i] == 0) {
				int mult = c * d - n * m + i;
				if (mult <= 0) {
					out.println(0);
					return;
				}
				ans *= mult;
				ans %= mod;
			}
		}
		out.println(ans);
	}

	public void run() {
		try {
			if (systemIO) {
				in = new FastScanner(System.in);
				out = new PrintWriter(System.out);
			} else {
				in = new FastScanner(new File("input.txt"));
				out = new PrintWriter(new File("output.txt"));
			}
			solve();

			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		FastScanner(File f) {
			try {
				br = new BufferedReader(new FileReader(f));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		FastScanner(InputStream f) {
			br = new BufferedReader(new InputStreamReader(f));
		}

		String nextLine() {
			try {
				return br.readLine();
			} catch (IOException e) {
				return null;
			}
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

	}

	// AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
	public static void main(String[] arg) {
		new Main().run();
	}
}