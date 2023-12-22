import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;

import java.io.*;

public class Main {
	void solve() {
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		PersistentUnionFind[] history = new PersistentUnionFind[M+1];
		history[0] = new PersistentUnionFind();
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			history[i+1] = history[i].link(a, b);
		}
		
		int Q = sc.nextInt();
		for (int qqq = 0; qqq < Q; qqq++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			int z = sc.nextInt();
			
			int lo = 0;
		    int hi = N + 1;
		    while (hi - lo > 1) {
		      int mid = (hi + lo) / 2;
		      if (possible(history[mid], x, y, z)) hi = mid; else lo = mid;
		    }
		    out.println(hi);
		}
	}
	
	boolean possible(PersistentUnionFind p, int x, int y, int z) {
		x = p.root(x);
		y = p.root(y);
		if (x == y) return -p.get(x) >= z;
		else return -p.get(x) + -p.get(y) >= z;
	}
	
	class PersistentUnionFind {

		private Node data;

		/** コンストラクタ */
		public PersistentUnionFind() {
			data = new Node();
		}
		public PersistentUnionFind(Node node) {
			data = node;
		}

		public int root(int x) {
			int dx = get(x);
			if (dx < 0) return x;
			int rdx = root(dx);
			data = set(x, rdx);
			return rdx;
		}
		
		public PersistentUnionFind link(int x, int y) {
			x = root(x);
			y = root(y);
			if (x != y) {
				int dy = get(y);
				int dx = get(x);
				if (dy > dx) {
					int t = dy; dy = dx; dx = t;
				}
				PersistentUnionFind im = new PersistentUnionFind(set(y, dy + dx));
				return new PersistentUnionFind(im.set(x, y));
			} else {
				Node newNode = new Node(data.val);
				newNode.ch[0] = data.ch[0];
				newNode.ch[1] = data.ch[1];
				return new PersistentUnionFind(newNode);
			}
		}

		// 0-indexed
		private int get(int index) {
			return data.get(index + 1);
		}

		private Node set(int index, int val) {
			index++;
			int order = 1;
			while (index > 1) {
				order = (order << 1) + (index & 1);
				index >>= 1;
			}
			Node newNode = data.set(order, val);
			return newNode;
		}

		class Node {
			static final int defaultValue = -1;
			Node[] ch = new Node[2];
			public int val;
			public Node() { this.val = defaultValue; }
			public Node(int val) { this.val = val; }
			
			int get(int index) {
				int order = 1;
				while (index > 1) {
					order = (order << 1) + (index & 1);
					index >>= 1;
				}
				Node node = this;
				for (; order > 1;) {
					node = node.ch[order & 1];
					order >>= 1;
					if (node == null) return defaultValue;
				}
				return node.val;
			}

			Node set(int order, int val) {
				Node alter = new Node(this.val);
				if (order == 1) {
					alter.val = val;
					alter.ch[0] = this.ch[0];
					alter.ch[1] = this.ch[1];
					return alter;
				}
				int f = order & 1;
				Node next = ch[f];
				if (next == null) next = new Node();
				alter.ch[f] = next.set(order >> 1, val);
				alter.ch[1-f] = this.ch[1-f];
				return alter;
			}
			
			void debug(int index, int depth) {
				String indent = "";
				for (int i = 0; i < depth; i++) indent += "|...";
				System.out.println(indent + "(" + (index - 1) + ")" + this.val);
				if (ch[0] != null) ch[0].debug(2 * index + 0, depth + 1);
				if (ch[1] != null) ch[1].debug(2 * index + 1, depth + 1);
			}
		}
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