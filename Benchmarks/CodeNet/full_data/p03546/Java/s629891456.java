import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		Solver solver = new Solver();
		solver.solve();
		solver.exit();
	}

	static class FastScanner {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;
		private boolean hasNextByte() {
			if (ptr < buflen) {
				return true;
			}else{
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) {
					return false;
				}
			}
			return true;
		}
		private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
		private boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
		private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
		public boolean hasNext() { skipUnprintable(); return hasNextByte();}
		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while(isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
		public long nextLong() {
			if (!hasNext()) throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) {
				throw new NumberFormatException();
			}
			while(true){
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				}else if(b == -1 || !isPrintableChar(b)){
					return minus ? -n : n;
				}else{
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}
	}

	static class Solver {
		FastScanner sc = new FastScanner();
		public Solver() { }

		String ns() { return sc.next(); }
		String[] ns(int n) {
			String a[] = new String[n];
			for(int i = 0; i < n; i ++) { a[i] = ns(); }
			return a;
		}
		String[][] ns(int n, int m) {
			String a[][] = new String[n][m];
			for(int i = 0; i < n; i ++) { a[i] = ns(m); }
			return a;
		}
		char[] nc(int n) {
			char a[] = new char[n];
			String str = ns();
			for(int i = 0; i < n; i ++) { a[i] = str.charAt(i); }
			return a;
		}
		char[][] nc(int n, int m) {
			char a[][] = new char[n][m];
			for(int i = 0; i < n; i ++) { a[i] = nc(m); }
			return a;
		}
		boolean[] nb(int n, char t) {
			boolean a[] = new boolean[n];
			char c[] = nc(n);
			for(int i = 0; i < n; i ++) { a[i] = c[i] == t; }
			return a;
		}
		boolean[][] nb(int n, int m, char t) {
			boolean a[][] = new boolean[n][m];
			for(int i = 0; i < n; i ++) { a[i] = nb(m, t); }
			return a;
		}
		int ni() { return (int)sc.nextLong(); }
		int[] ni(int n) {
			int a[] = new int[n];
			for(int i = 0; i < n; i ++) { a[i] = ni(); }
			return a;
		}
		int[][] ni(int n, int m) {
			int a[][] = new int[n][m];
			for(int i = 0; i < n; i ++) { a[i] = ni(m); }
			return a;
		}
		long nl() { return sc.nextLong(); }
		long[] nl(int n) {
			long a[] = new long[n];
			for(int i = 0; i < n; i ++) { a[i] = nl(); }
			return a;
		}
		long[][] nl(int n, int m) {
			long a[][] = new long[n][m];
			for(int i = 0; i < n; i ++) { a[i] = nl(m); }
			return a;
		}

		PrintWriter out = new PrintWriter(System.out);
		PrintWriter err = new PrintWriter(System.err);
		void prt() { out.print(""); }
		void prt(int a) { out.print(a); }
		void prt(long a) { out.print(a); }
		void prt(double a) { out.print(a); }
		void prt(String a) { out.print(a); }
		void prtln() { out.println(""); }
		void prtln(int a) { out.println(a); }
		void prtln(long a) { out.println(a); }
		void prtln(double a) { out.println(a); }
		void prtln(String a) { out.println(a); }
		void prtln(int... a) { for(int element : a){ prt(element+" "); } prtln(); }
		void prtln(long... a) { for(long element : a){ prt(element+" "); } prtln(); }
		void prtln(double... a) { for(double element : a){ prt(element+" "); } prtln(); }
		void prtln(String... a) { for(String element : a){ prt(element+" "); } prtln(); }
		void prtln(int[][] a) { for(int[] element : a){ prtln(element); } }
		void prtln(long[][] a) { for(long[] element : a){ prtln(element); } }
		void prtln(double[][] a) { for(double[] element : a){ prtln(element); } }
		void prtln(String[][] a) { for(String[] element : a){ prtln(element); } }
		void errprt() { err.print(""); }
		void errprt(int a) { err.print(a); }
		void errprt(long a) { err.print(a); }
		void errprt(double a) { err.print(a); }
		void errprt(String a) { err.print(a); }
		void errprt(boolean a) { errprt(a ? "#" : "."); }
		void errprtln() { err.println(""); }
		void errprtln(int a) { err.println(a); }
		void errprtln(long a) { err.println(a); }
		void errprtln(double a) { err.println(a); }
		void errprtln(String a) { err.println(a); }
		void errprtln(boolean a) { errprtln(a ? "#" : "."); }
		void errprtln(int... a) { for(int element : a){ errprt(element+" "); } errprtln(); }
		void errprtln(long... a) { for(long element : a){ errprt(element+" "); } errprtln(); }
		void errprtln(double... a) { for(double element : a){ errprt(element+" "); } errprtln(); }
		void errprtln(String... a) { for(String element : a){ errprt(element+" "); } errprtln(); }
		void errprtln(boolean... a) { for(boolean element : a){ errprt(element); } errprtln(); }
		void errprtln(int[][] a) { for(int[] element : a){ errprtln(element); } }
		void errprtln(long[][] a) { for(long[] element : a){ errprtln(element); } }
		void errprtln(double[][] a) { for(double[] element : a){ errprtln(element); } }
		void errprtln(String[][] a) { for(String[] element : a){ errprtln(element); } }
		void errprtln(boolean[][] a) { for(boolean[] element : a){ errprtln(element); } }
		void reply(boolean b) { prtln(b ? "Yes" : "No"); }
		void REPLY(boolean b) { prtln(b ? "YES" : "NO"); }

		void exit() { out.flush(); err.flush(); System.exit(0); }

		int min(int a, int b) { return Math.min(a, b); }
		long min(long a, long b) { return Math.min(a, b); }
		double min(double a, double b) { return Math.min(a, b); }
		int min(int... x) {
			int min = x[0];
			for(int val : x) { min = min(min, val); }
			return min;
		}
		long min(long... x) {
			long min = x[0];
			for(long val : x) { min = min(min, val); }
			return min;
		}
		double min(double... x) {
			double min = x[0];
			for(double val : x) { min = min(min, val); }
			return min;
		}
		int max(int a, int b) { return Math.max(a, b); }
		long max(long a, long b) { return Math.max(a, b); }
		double max(double a, double b) { return Math.max(a, b); }
		int max(int... x) {
			int max = x[0];
			for(int val : x) { max = max(max, val); }
			return max;
		}
		long max(long... x) {
			long max = x[0];
			for(long val : x) { max = max(max, val); }
			return max;
		}
		double max(double... x) {
			double max = x[0];
			for(double val : x) { max = max(max, val); }
			return max;
		}
		long sum(int... a) {
			long sum = 0;
			for(int element : a) { sum += element; }
			return sum;
		}
		long sum(long... a) {
			long sum = 0;
			for(long element : a) { sum += element; }
			return sum;
		}
		double sum(double... a) {
			double sum = 0;
			for(double element : a) { sum += element; }
			return sum;
		}

		long abs(double x) { return (long)Math.abs(x); }
		long round(double x) { return Math.round(x); }
		long floor(double x) { return (long)Math.floor(x); }
		long ceil(double x) { return (long)Math.ceil(x); }
		double sqrt(double x) { return Math.sqrt(x); }
		double pow(double x, double y) { return Math.pow(x, y); }
		long pow(long x, long y) { return (long)Math.pow(x, y); }
		int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); }
		long gcd(long a, long b) { return b == 0 ? a : gcd(b, a % b); }

		void fill(int array[], int x) { Arrays.fill(array, x); }
		void fill(long array[], long x) { Arrays.fill(array, x); }
		void fill(double array[], double x) { Arrays.fill(array, x); }
		void fill(boolean array[], boolean x) { Arrays.fill(array, x); }
		void fill(int array[][], int x) { for(int a[] : array) { fill(a, x); } }
		void fill(long array[][], long x) { for(long a[] : array) { fill(a, x); } }
		void fill(double array[][], double x) { for(double a[] : array) { fill(a, x); } }
		void fill(boolean array[][], boolean x) { for(boolean a[] : array) { fill(a, x); } }

		long INF = (long)1e+15;
		boolean isINF(long a) { return abs(a) > INF / 1000; }
		boolean isPlusINF(long a) { return a > 0 && isINF(a); }
		boolean isMinusINF(long a) { return isPlusINF(- a); }


		// mods
		long MOD = pow(10, 9) + 7;
		public long mod(long i) { return i % MOD + ((i % MOD) < 0 ? MOD : 0); }
		
		long pow_m(long x, long y) {
			if (y == 0) { return 1;
			}else {
				long tmp = pow_m(x, y / 2);
				return mod(mod(tmp * tmp) * (y % 2 == 0 ? 1 : x));
			}
		}
		
		long inv(long x) { return pow_m(x, MOD - 2); }
		
		int MAX_FACT = 5_000_100;
		long fact[];
		long invFact[];
		void prepareFact() {
			fact = new long[MAX_FACT];
			Arrays.fill(fact, 0);
			invFact = new long[MAX_FACT];
			Arrays.fill(invFact, 0);
			fact[0] = 1;
			int maxIndex = min(MAX_FACT, (int)MOD);
			for(int i = 1; i < maxIndex; i ++) { fact[i] = mod(fact[i - 1] * i); }
			invFact[maxIndex - 1] = inv(fact[maxIndex - 1]);
			for(int i = maxIndex - 1; i > 0; i --) { invFact[i - 1] = mod(invFact[i] * i); }
		}
		
		long P(int n, int r) {
			if(n < 0 || r < 0 || n < r) { return 0; }
			return mod(fact[n] * invFact[n - r]);
		}
		long C(int n, int r) {
			if(n < 0 || r < 0 || n < r) { return 0; }
			return mod(P(n, r) * invFact[r]);
		}
		long H(int n, int r) { return C((n - 1) + r, r); }

		// grid
		class Grid {
			int h;
			int w;

			Grid() {  }
			Grid(int h, int w) {
				this.h = h;
				this.w = w;
			}
		}


		// graph
		class Graph {
			int numNode;
			int numEdge;
			Edge edges[];
			Node nodes[];
			Node reversedNodes[];

			Graph(int numNode, int numEdge, Edge edges[], boolean directed) {
				this.numNode = numNode;
				this.numEdge = numEdge;
				this.edges = edges;
				nodes = new Node[numNode];
				reversedNodes = new Node[numNode];
				for(int i = 0; i < numNode; i ++) {
					nodes[i] = new Node(i);
					reversedNodes[i] = new Node(i);
				}

				for(Edge edge : edges) {
					nodes[edge.source].add(edge.target, edge.cost);
					if(directed) {
						reversedNodes[edge.target].add(edge.source, edge.cost);
					}else {
						nodes[edge.target].add(edge.source, edge.cost);
					}
				}
			}

			void clearNodes() {
				for(Node n : nodes) { n.clear(); }
				for(Node n : reversedNodes) { n.clear(); }
			}
		}

		class Node {
			int id;
			ArrayList<Edge> edges = new ArrayList<Edge>();

			Node(int id) {
				this.id = id;
			}
			void add(int target, long cost) {
				edges.add(new Edge(id, target, cost));
			}
			void clear() {
				edges.clear();
			}
		}

		class Edge implements Comparable<Edge> {
			int source;
			int target;
			long cost;
			Edge(int source, int target, long cost) {
				this.source = source;
				this.target = target;
				this.cost = cost;
			}

			@Override
			public int compareTo(Edge e) {
				return Long.compare(this.cost, e.cost);
			}
		}

long[] dijkstra(Node nodes[], int start) {
	long dist[] = new long[nodes.length];
	Arrays.fill(dist, INF);
	dist[start] = 0;

	Queue<Edge> q = new PriorityQueue<Edge>();
	q.add(new Edge(start, start, dist[start]));

	while(!q.isEmpty()) {
		Edge crt = q.poll();

		if(dist[crt.target] < crt.cost) { continue; }
		for(Edge e : nodes[crt.target].edges) {
			if(dist[e.target] > dist[e.source] + e.cost) {
				dist[e.target] = dist[e.source] + e.cost;
				q.add(new Edge(e.source, e.target, dist[e.target]));
			}
		}
	}

	return dist;
}

public void solve() {
	int h = ni();
	int w = ni();
	long need[][] = nl(10, 10);
	int crtNumber[][] = ni(h, w);
	long bucket[] = new long[15];
	fill(bucket, 0);
	for(int i = 0; i < h; i ++) {
		for(int j = 0; j < w; j ++) {
			bucket[(crtNumber[i][j] + 11) % 11] ++;
		}
	}

	int numNode = 20;
	int numEdge = 10 * 10 + 10;
	Edge edges[] = new Edge[numEdge];
	for(int i = 0; i < 10; i ++) {
		for(int j = 0; j < 10; j ++) {
			edges[i * 10 + j] = new Edge(i, 10 + j, need[i][j]);
		}
	}
	for(int i = 0; i < 10; i ++) {
		edges[10 * 10 + i] = new Edge(10 + i, i, 0);
	}
	Graph g = new Graph(numNode, numEdge, edges, true);
	long needToOne[] = new long[10];
	for(int i = 0; i < 10; i ++) {
		needToOne[i] = dijkstra(g.nodes, i)[11];
	}

	long ans = 0;
	for(int i = 0; i < 10; i ++) {
		ans += needToOne[i] * bucket[i];
	}
	prtln(ans);
}



	}
}