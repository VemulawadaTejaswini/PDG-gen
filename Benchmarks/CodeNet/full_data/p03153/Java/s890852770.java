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
	
//	public class Pair implements Comparable<Pair> {
//		long x;
//		long y;
//
//		public Pair(long x, long y) {
//			this.x = x;
//			this.y = y;
//		}
//		
//		public void add(Pair p) {
//			x += p.x;
//			y += p.y;
//		}
//
//		@Override
//		public int compareTo(Pair o) {
////			if (x != o.x) {
////				return x - o.x;
////			}
////			return y - o.y;
//			return 0;
//		}
//	}
	
	public class DSU {
		int groups;
		int[] sz;
		int[] p;
		
		public DSU(int n) {
			sz = new int[n];
			p = new int[n];
			groups = n;
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
			groups--;
			return true;
		}
	}

	public class Edge implements Comparable<Edge> {
		long w;
		int grl;
		int grr;
		
		public Edge(long w, int grl, int grr) {
			this.w = w;
			this.grl = grl;
			this.grr = grr;
		}

		@Override
		public int compareTo(Edge o) {
			if (w > o.w) {
				return 1;
			}
			if (w < o.w) {
				return -1;
			}
			if (grl != o.grl) {
				return grl - o.grl;
			}
			return grr - o.grr;
		}
	}
	
	public class Pair {
		long x;
		int gr;

		public Pair(long x, int gr) {
			this.x = x;
			this.gr = gr;
		}
		
		public Pair clone() {
			return new Pair(x, gr);
		}
	}
	
	public void solve() {
		int n = in.nextInt();
		long d = in.nextLong();
		DSU dsu = new DSU(n);
		long ans = 0;
		long[] minus = new long[n];
		long[] plus = new long[n];
		for (int i = 0; i < minus.length; i++) {
			long x = in.nextLong();
			plus[i] = x + i * d;
			minus[i] = x - i * d;
		}
		while (dsu.groups > 1) {
			Pair[] minl = new Pair[n];
			Pair[] minl2 = new Pair[n];
			Pair[] minr = new Pair[n];
			Pair[] minr2 = new Pair[n];
			minl[0] = new Pair(Long.MAX_VALUE / 2, -1);
			minl2[0] = new Pair(Long.MAX_VALUE / 2, -1);
			minr[n - 1] = new Pair(Long.MAX_VALUE / 2, -1);
			minr2[n - 1] = new Pair(Long.MAX_VALUE / 2, -1);
			for (int i = 0; i < n - 1; i++) {
				minl[i + 1] = minl[i].clone();
				minl2[i + 1] = minl2[i].clone();
				int gr = dsu.get(i);
				if (minus[i] < minl[i + 1].x || (minus[i] == minl[i + 1].x && gr < minl[i + 1].gr)) {
					if (gr != minl[i + 1].gr) {
						minl2[i + 1] = minl[i + 1].clone();
					}
					minl[i + 1].x = minus[i];
					minl[i + 1].gr = gr; 
				} else if (gr != minl[i + 1].gr && (minus[i] < minl2[i + 1].x || (minus[i] == minl2[i + 1].x && gr < minl2[i + 1].gr))) {
					minl2[i + 1].x = minus[i];
					minl2[i + 1].gr = gr;
				}
			}
			for (int i = n - 1; i > 0; i--) {
				minr[i - 1] = minr[i].clone();
				minr2[i - 1] = minr2[i].clone();
				int gr = dsu.get(i);
				if (plus[i] < minr[i - 1].x || (plus[i] == minr[i - 1].x && gr < minr[i - 1].gr)) {
					if (gr != minr[i - 1].gr) {
						minr2[i - 1] = minr[i - 1].clone();
					}
					minr[i - 1].x = plus[i];
					minr[i - 1].gr = gr; 
				} else if (gr != minr[i - 1].gr && (plus[i] < minr2[i - 1].x || (plus[i] == minr2[i - 1].x && gr < minr2[i - 1].gr))) {
					minr2[i - 1].x = plus[i];
					minr2[i - 1].gr = gr;
				}
			}
			HashMap<Integer, Edge> map = new HashMap<>();
			for (int i = 0; i < minus.length; i++) {
				int grl = dsu.get(i);
				int grr = -1;
				long x = minus[i];
				if (minr[i].gr != grl) {
					if (minr[i].x < Long.MAX_VALUE / 2) {
						x += minr[i].x;
						grr = minr[i].gr;
					} else {
						continue;
					}
				} else {
					if (minr2[i].x < Long.MAX_VALUE / 2) {
						x += minr2[i].x;
						grr = minr2[i].gr;
					} else {
						continue;
					}
				}
				Edge e = new Edge(x, grl, grr);
				if (!map.containsKey(grl)) {
					map.put(grl, e);
				} else {
					if (map.get(grl).compareTo(e) > 0) {
						map.put(grl, e);
					}
				}
			}
			for (int i = 0; i < minus.length; i++) {
				int grr = dsu.get(i);
				int grl = -1;
				long x = plus[i];
				if (minl[i].gr != grr) {
					if (minl[i].x < Long.MAX_VALUE / 2) {
						x += minl[i].x;
						grl = minl[i].gr;
					} else {
						continue;
					}
				} else {
					if (minl2[i].x < Long.MAX_VALUE / 2) {
						x += minl2[i].x;
						grl = minl2[i].gr;
					} else {
						continue;
					}
				}
				Edge e = new Edge(x, grl, grr);
				if (!map.containsKey(grr)) {
					map.put(grr, e);
				} else {
					if (map.get(grr).compareTo(e) > 0) {
						map.put(grr, e);
					}
				}
			}
			for (int i : map.keySet()) {
				Edge e = map.get(i);
				if (dsu.unite(e.grl, e.grr)) {
					ans += e.w;
				}
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