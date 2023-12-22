import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] xy = sc.nextIntArrays(2, n - 1);

		RoutedTree rt = new RoutedTree(n);
		for (int i = 0; i < n - 1; i++) {
			int x = xy[0][i] - 1;
			int y = xy[1][i] - 1;

			rt.addEdge(x, y);
		}

		int root = 0;
		rt.dfs(root);

		long[] dp = new long[n];
		for (int i = n - 1; i >= 0; i--) {
			int e = rt.preorder[i];
			
			long tmp = 1;
			for (int next : rt.edges.get(e)) {
				if (next == rt.p[e]) {
					continue;
				}
				
				tmp *= dp[next] + 1;
				tmp %= m;
			}
			dp[e] = tmp;
		}

		
		long[] dp2 = Arrays.copyOf(dp, dp.length);
		for (int e : rt.preorder) {
			if (e == root) {
				continue;
			}
			
			int p = rt.p[e];
			long tmp = 1;
			for (int c : rt.edges.get(p)) {
				if (c == e) {
					continue;
				}
				
				tmp *= dp[c] + 1;
				tmp %= m;
			}

			dp2[e] *= tmp + 1;
			dp2[e] %= m;
		}
		
		for (long e : dp2) {
			pr.println(e);
		}
	}

	static class RoutedTree {
		int n;
		int m;
		List<List<Integer>> edges;
		
		int root;
		int[] p;
		int[] d;
		int[] preorder;
		
		RoutedTree(int n) {
			this.n = n;
			edges = new ArrayList<>(n);
			for (int i = 0; i < n; i++) {
				edges.add(new ArrayList<>());
			}

			root = -1;
			p = new int[n];
			d = new int[n];
			preorder = new int[n];
		}

		void addEdge(int u, int v) {
			edges.get(u).add(v);
			edges.get(v).add(u);
			m++;
		}

		void dfs(int root) {
			if (this.root == root) {
				return;
			}

			this.root = root;
			Arrays.fill(p, 0);
			Arrays.fill(d, 0);
			boolean[] used = new boolean[n];
			Deque<Integer> st = new ArrayDeque<>();
			st.push(root);
			p[root] = -1;
			d[root] = 0;
			int prei = 0;
			while (!st.isEmpty()) {
				int e = st.peek();
				
				if (used[e]) {
					// postorder
					
					st.pop();
				} else {
					// preorder
					for (int next : edges.get(e)) {
						if (next == p[e]) {
							continue;
						}

						p[next] = e;
						d[next] = d[e] + 1;
						st.push(next);
					}
					
					used[e] = true;
					preorder[prei++] = e;
				}
			}
		}
	}
	
	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);
			
		solve();
			
		pr.close();
		sc.close();
	}

	static class Scanner {
		BufferedReader br;

		Scanner (InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
		}

		private boolean isPrintable(int ch) {
			return ch >= '!' && ch <= '~';
		}

		private boolean isCRLF(int ch) {
			return ch == '\n' || ch == '\r' || ch == -1;
		}

		private int nextPrintable() {
			try {
				int ch;
				while (!isPrintable(ch = br.read())) {
					if (ch == -1) {
						throw new NoSuchElementException();
					}
				}

				return ch;
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		String next() {
			try {
				int ch = nextPrintable();
				StringBuilder sb = new StringBuilder();
				do {
					sb.appendCodePoint(ch);
				} while (isPrintable(ch = br.read()));

				return sb.toString();
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		int nextInt() {
			try {
				// parseInt from Integer.parseInt()
				boolean negative = false;
				int res = 0;
				int limit = -Integer.MAX_VALUE;
				int radix = 10;

				int fc = nextPrintable();
				if (fc < '0') {
					if (fc == '-') {
						negative = true;
						limit = Integer.MIN_VALUE;
					} else if (fc != '+') {
						throw new NumberFormatException();
					}
					fc = br.read();
				}
				int multmin = limit / radix;

				int ch = fc;
				do {
					int digit = ch - '0';
					if (digit < 0 || digit >= radix) {
						throw new NumberFormatException();
					}
					if (res < multmin) {
						throw new NumberFormatException();
					}
					res *= radix;
					if (res < limit + digit) {
						throw new NumberFormatException();
					}
					res -= digit;

				} while (isPrintable(ch = br.read()));

				return negative ? res : -res;
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		long nextLong() {
			try {
				// parseLong from Long.parseLong()
				boolean negative = false;
				long res = 0;
				long limit = -Long.MAX_VALUE;
				int radix = 10;

				int fc = nextPrintable();
				if (fc < '0') {
					if (fc == '-') {
						negative = true;
						limit = Long.MIN_VALUE;
					} else if (fc != '+') {
						throw new NumberFormatException();
					}
					fc = br.read();
				}
				long multmin = limit / radix;

				int ch = fc;
				do {
					int digit = ch - '0';
					if (digit < 0 || digit >= radix) {
						throw new NumberFormatException();
					}
					if (res < multmin) {
						throw new NumberFormatException();
					}
					res *= radix;
					if (res < limit + digit) {
						throw new NumberFormatException();
					}
					res -= digit;

				} while (isPrintable(ch = br.read()));

				return negative ? res : -res;
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		float nextFloat() {
			return Float.parseFloat(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			try {
				int ch;
				while (isCRLF(ch = br.read())) {
					if (ch == -1) {
						throw new NoSuchElementException();
					}
				}
				StringBuilder sb = new StringBuilder();
				do {
					sb.appendCodePoint(ch);
				} while (!isCRLF(ch = br.read()));

				return sb.toString();
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}
		
		int[] nextIntArray(int n) {
			int[] ret = new int[n];
			for (int i = 0; i < n; i++) {
				ret[i] = sc.nextInt();
			}
			
			return ret;
		}

		long[] nextLongArray(int n) {
			long[] ret = new long[n];
			for (int i = 0; i < n; i++) {
				ret[i] = sc.nextLong();
			}
			
			return ret;
		}

		int[][] nextIntArrays(int m, int n) {
			int[][] ret = new int[m][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					ret[j][i] = sc.nextInt();
				}
			}
			
			return ret;
		}

		void close() {
			try {
				br.close();
			} catch (IOException e) {
//				throw new NoSuchElementException();
			}
		}
	}

	static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
		
		void printInts(int... a) {
			StringBuilder sb = new StringBuilder(32);
			for (int i = 0, size = a.length; i < size; i++) {
				if (i > 0) {
					sb.append(' ');
				}
				sb.append(a[i]);
			}

			println(sb);
		}
		
		void printLongs(long... a) {
			StringBuilder sb = new StringBuilder(64);
			for (int i = 0, size = a.length; i < size; i++) {
				if (i > 0) {
					sb.append(' ');
				}
				sb.append(a[i]);
			}

			println(sb);
		}
		
		void printStrings(String... a) {
			StringBuilder sb = new StringBuilder(32);
			for (int i = 0, size = a.length; i < size; i++) {
				if (i > 0) {
					sb.append(' ');
				}
				sb.append(a[i]);
			}

			println(sb);
		}
	}
}
