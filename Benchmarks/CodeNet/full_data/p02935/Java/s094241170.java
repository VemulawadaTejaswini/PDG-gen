import java.util.*;
import java.io.*;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static final double EPS = 1e-9;
	static long mod = (int) 1e9 + 7;
	static int inf = (int) 1e9 + 2;
	static long[] fac;
	static int[] si;
	static ArrayList<Integer> primes;
	static TreeSet<Integer>[] ad;
	static ArrayList<pair>[] d;
	static edge[] ed;
	static boolean f;
	static int n, m;
	static int[][] a;
	static Queue<Integer>[] can;
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
	    int n=sc.nextInt();
	    double []a=new double [n];
	    for(int i=0;i<n;i++)
	    	a[i]=sc.nextInt();
	    Arrays.sort(a);
	   // System.out.println(Arrays.toString(a));
	    double ans=a[0];
	    for(int i=1;i<n;i++) {
	    //	System.out.println(ans+" "+a[i]);
	    	ans=(ans+a[i])/2;
	    	//System.out.println(ans);
	    }
	    out.print(ans);
		out.close();
	}

	// 1-based DS, OOP
	static class SegmentTree {
		int N; // the number of elements in the array as a power of 2 (i.e. after padding)
		int[] array, sTree, lazy;
		boolean[] isLeaf;

		SegmentTree(int[] in) {
			array = in;
			N = in.length - 1;
			sTree = new int[N << 1]; // no. of nodes = 2*N - 1, we add one to cross out index zero
			lazy = new int[N << 1];
			isLeaf = new boolean[N << 1];
			Arrays.fill(lazy, -1);
			build(1, 1, N);
		}

		void build(int node, int b, int e) // O(n)
		{
			if (b == e) {
				sTree[node] = array[b];
				isLeaf[node] = true;
			} else {
				int mid = b + e >> 1;
				build(node << 1, b, mid);
				build(node << 1 | 1, mid + 1, e);
				sTree[node] = (sTree[node << 1] + sTree[node << 1 | 1]) % 2010;
			}
		}

		void update_point(int index, int val) // O(log n)
		{
			index += N - 1;
			sTree[index] += val;
			while (index > 1) {
				index >>= 1;
				sTree[index] = sTree[index << 1] + sTree[index << 1 | 1];
			}
		}

		void update_range(int i, int j, int val) // O(log n)
		{
			update_range(1, 1, N, i, j, val);
		}

		void update_range(int node, int b, int e, int i, int j, int val) {
			if (i > e || j < b)
				return;
			if (b >= i && e <= j) {
				if (b == e) {
					sTree[node] = (sTree[node] * sTree[node]) % 2010;
				} else {
					sTree[node] = ((sTree[node] * sTree[node]) % 2010
							- (sTree[node << 1] * sTree[node << 1 | 1] * 2) % 2010 + 2010) % 2010;
					lazy[node] = 1;
				}
			} else {
				int mid = b + e >> 1;
				propagate(node, b, mid, e);
				update_range(node << 1, b, mid, i, j, val);
				update_range(node << 1 | 1, mid + 1, e, i, j, val);
				sTree[node] = (sTree[node << 1] + sTree[node << 1 | 1]) % 2010;
			}
		}

		void propagate(int node, int b, int mid, int e) {
			if (lazy[node] == 1) {
				lazy[node << 1] = lazy[node];
				lazy[node << 1 | 1] = lazy[node];
				if (isLeaf[node << 1])
					sTree[node << 1] = sTree[node << 1] * sTree[node << 1] % 2010;
				else
					sTree[node << 1] = ((sTree[node << 1] * sTree[node << 1]) % 2010
							- (sTree[(node << 1) << 1] * sTree[(node << 1) << 1 | 1] * 2) % 2010 + 2010) % 2010;
				if (isLeaf[node << 1 | 1])
					sTree[node << 1 | 1] = sTree[node << 1 | 1] * sTree[node << 1 | 1] % 2010;
				else
					sTree[node << 1 | 1] = ((sTree[node << 1 | 1] * sTree[node << 1 | 1]) % 2010
							- (sTree[(node << 1 | 1) << 1] * sTree[(node << 1 | 1) << 1 | 1] * 2) % 2010 + 2010) % 2010;
				lazy[node] = -1;
			}
		}

		int query(int i, int j) {
			return query(1, 1, N, i, j);
		}

		int query(int node, int b, int e, int i, int j) // O(log n)
		{
			if (i > e || j < b)
				return 0;
			if (b >= i && e <= j)
				return sTree[node];
			int mid = b + e >> 1;
			propagate(node, b, mid, e);
			int q1 = query(node << 1, b, mid, i, j);
			int q2 = query(node << 1 | 1, mid + 1, e, i, j);
			return (q1 + q2) % 2010;

		}

	}

	static Queue<Integer> k, k1;
	static boolean hg = false;

	static class Edge implements Comparable<Edge> {
		int node, cost;

		Edge(int a, int b) {
			node = a;
			cost = b;
		}

		public int compareTo(Edge e) {
			return cost - e.cost;
		}
	}

	static void ifCan(int i) {
		if (i == 6) {
			hg = true;
			for (int j : k)
				k1.add(j);
			return;
		} else if (k.contains(i))
			ifCan(i + 1);
		else {
			if (!hg) {
				for (int p : can[i]) {
					if (!k.contains(p)) {
						k.add(i);
						k.add(p);
						ifCan(i + 1);
						k.remove(i);
						k.remove(p);
					}
				}
			}
		}
	}

	static class qu implements Comparable<qu> {
		int a;
		int b;

		qu(int a, int b) {
			this.a = a;
			this.b = b;
		}

		public String toString() {
			return a + " " + b;
		}

		@Override
		public int compareTo(qu o) {
			return b - o.b;
		}
	}

	static class pair {
		int to;
		int number;

		pair(int t, int n) {
			number = n;
			to = t;
		}

		public String toString() {
			return to + " " + number;
		}
	}

	static void con() {
		for (int i = 0; i < n; i++)
			d[i] = new ArrayList();
		for (int i = 0; i < m; i++) {
			if (in[i]) {
				edge w = ed[i];
				d[w.from].add(new pair(w.to, w.number));
				d[w.to].add(new pair(w.from, w.number));
			}
		}
	}

	static boolean[] in;

	/*
	 * static void mst() { Arrays.sort(ed); UnionFind uf=new UnionFind(n); for(int
	 * i=0;i<m;i++) { edge w=ed[i]; if(!uf.union(w.from, w.to)) continue;
	 * in[i]=true; } }
	 */
	static class edge implements Comparable<edge> {
		int from;
		int to;
		int number;

		edge(int f, int t, int n) {
			from = f;
			to = t;
			number = n;
		}

		public String toString() {
			return from + " " + to + " " + number;
		}

		public int compareTo(edge f) {
			return number - f.number;
		}
	}

	static class seg implements Comparable<seg> {
		int a;
		int b;

		seg(int s, int e) {
			a = s;
			b = e;
		}

		public String toString() {
			return a + " " + b;
		}

		public int compareTo(seg o) {
			// if(a==o.a)
			return o.b - b;
			// return
		}
	}

	static long power(int i) {
		// if(i==0)
		// return 1;
		long a = 1;
		for (int k = 0; k < i; k++)
			a *= i;
		return a;
	}

	static void seive() {
		si = new int[1000001];
		primes = new ArrayList<>();
		int N = 1000001;
		si[1] = 1;
		for (int i = 2; i < N; i++) {
			if (si[i] == 0) {
				si[i] = i;
				primes.add(i);
			}
			for (int j = 0; j < primes.size() && primes.get(j) <= si[i] && (i * primes.get(j)) < N; j++)
				si[primes.get(j) * i] = primes.get(j);

		}
	}

	static long inver(long x) {
		int a = (int) x;
		long e = (mod - 2);
		long res = 1;
		while (e > 0) {
			if ((e & 1) == 1) {
				// System.out.println(res*a);
				res = (int) ((1l * res * a) % mod);
			}
			a = (int) ((1l * a * a) % mod);
			e >>= 1;
		}
		// out.println(res+" "+x);
		return res % mod;
	}

	static long fac(int n) {
		if (n == 0)
			return fac[n] = 1;
		if (n == 1)
			return fac[n] = 1;
		long ans = 1;
		for (int i = 1; i <= n; i++)
			fac[i] = ans = (i % mod * ans % mod) % mod;
		return ans % mod;
	}

	static long gcd(long a, long b) {

		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	static class unionfind {
		int[] p;
		int[] size;

		unionfind(int n) {
			p = new int[n];
			size = new int[n];

			for (int i = 0; i < n; i++) {
				p[i] = i;
			}
			Arrays.fill(size, 1);
		}

		int findSet(int v) {
			if (v == p[v])
				return v;
			return p[v] = findSet(p[v]);
		}

		boolean sameSet(int a, int b) {
			a = findSet(a);
			b = findSet(b);
			if (a == b)
				return true;
			return false;
		}

		int max() {
			int max = 0;
			for (int i = 0; i < size.length; i++)
				if (size[i] > max)
					max = size[i];
			return max;
		}

		boolean combine(int a, int b) {
			a = findSet(a);
			b = findSet(b);
			if (a == b)
				return true;
			if (size[a] > size[b]) {
				p[b] = a;
				size[a] += size[b];

			} else {
				p[a] = b;
				size[b] += size[a];
			}
			return false;
		}
	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public Scanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public char nextChar() throws IOException {
			return next().charAt(0);
		}

		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}