import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt(), M = sc.nextInt(), A[] = new int[M], B[] = new int[M];
		for (int i = 0;i < M;++ i) {
			A[i] = sc.nextInt() - 1;
			B[i] = sc.nextInt() - 1;
		}
		UnionFindTree unionFind = new UnionFindTree(N);
		long ans[] = new long[M];
		ans[M] = (long)N * (N - 1) / 2;
		for (int i = M - 1;i > 0;-- i) {
			ans[i] = ans[i + 1];
			if (!unionFind.isUnion(A[i], B[i])) {
				ans[i] -= (long)unionFind.getSize(A[i]) * unionFind.getSize(B[i]);
				unionFind.unite(A[i], B[i]);
			}
		}
		for (int i = 1;i <= M;++ i) out.println(ans[i]);
		out.flush();
	}

	/**
	 * 素集合データ構造です。<br>
	 * 連結成分の個数や大きさを取得することができます。
	 * @author 31536000
	 */
	public class UnionFindTree {
		private int[] parent; // 負ならばデータ数、正ならば親のindex

		/**
		 * size個の頂点を持つ森を作ります。
		 * @param size 頂点数
		 */
		public UnionFindTree(int size) {
			this.parent = new int[size];
			Arrays.fill(this.parent, -1);
		}

		/**
		 * その頂点がどの頂点を根とする連結成分に属しているかを求めます。<br>
		 * 計算量はO(α(N))です。
		 * @param n 根を求めたい頂点
		 * @return 根となっている頂点
		 */
		public int find(int n) {
			while(parent[n] >= 0 && parent[parent[n]] >= 0) n = parent[n] = parent[parent[n]]; // 経路圧縮
			return parent[n] >= 0 ? parent[n] : n;
		}

		/**
		 * 指定した頂点同士を連結します。<br>
		 * 計算量はO(α(N))です。
		 * @param l 連結したい頂点
		 * @param r 連結したい頂点
		 * @return この関数によって連結されたならtrue、既に連結だったならfalse
		 */
		public boolean unite(int l, int r) {
			l = find(l);
			r = find(r);
			if (l == r) return false; // 最初から連結
			if (parent[l] >= parent[r]) { // rの方が大きい
				parent[r] += parent[l]; // 大きい方へ小さい方をマージする
				parent[l] = r;
			} else {
				parent[l] += parent[r]; // 大きい方へ小さい方をマージする
				parent[r] = l;
			}
			return true;
		}

		/**
		 * 指定した2個の頂点が連結か判定します。<br>
		 * 計算量はO(α(N))です。
		 * @param l 判定したい頂点
		 * @param r 判定したい頂点
		 * @return lとrが連結ならばtrue
		 */
		public boolean isUnion(int l, int r) {
			return find(l) == find(r);
		}

		/**
		 * 指定した頂点を含む連結成分の要素数を求めます。<br>
		 * 計算量はO(α(N))です。
		 * @param n 要素数を求めたい連結成分の要素
		 * @return 頂点nを含む連結成分の要素数
		 */
		public int getSize(int n) {
			return -parent[find(n)];
		}

		/**
		 * 連結成分の個数を求めます。<br>
		 * 計算量はO(N)です。
		 * @return 連結成分の個数
		 */
		public int getUnion() {
			int ret = 0;
			for (int i : parent) if (i < 0) ++ ret;
			return ret;
		}
	}
	public class FastScanner {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int read = 0;
		private int length = 0;

		private boolean hasNextByte() {
			if (read < length) return true;
			else {
				try {
					read = 0;
					length = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return length > 0;
		}

		private int readByte() {
			return hasNextByte() ? buffer[read++] : -1;
		}

		private boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		private boolean isNumber(int c) {
			return '0' <= c && c <= '9';
		}

		public boolean hasNext() {
			while (hasNextByte() && !isPrintableChar(buffer[read])) read++;
			return hasNextByte();
		}

		public char nextChar() {
			if (!hasNextByte())  throw new NoSuchElementException();
			return (char)readByte();
		}

		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b;
			while (isPrintableChar(b = readByte())) sb.appendCodePoint(b);
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
			if (!isNumber(b)) throw new NumberFormatException();
			while (true) {
				if (isNumber(b)) {
					n *= 10;
					n += b - '0';
				} else if (b == -1 || !isPrintableChar(b)) return minus ? -n : n;
				else throw new NumberFormatException();
				b = readByte();
			}
		}

		public int nextInt() {
			long nl = nextLong();
			if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
			return (int) nl;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public int[] nextInt(int width) {
			int[] ret = new int[width];
			for (int i = 0;i < width;++ i) ret[i] = nextInt();
			return ret;
		}

		public long[] nextLong(int width) {
			long[] ret = new long[width];
			for (int i = 0;i < width;++ i) ret[i] = nextLong();
			return ret;
		}

		public int[][] nextInt(int width, int height) {
			int[][] ret = new int[height][width];
			for (int i = 0, j;i < height;++ i) for (j = 0;j < width;++ j) ret[j][i] = nextInt();
			return ret;
		}

		public long[][] nextLong(int width, int height) {
			long[][] ret = new long[height][width];
			for (int i = 0, j;i < height;++ i) for (j = 0;j < width;++ j) ret[j][i] = nextLong();
			return ret;
		}
	}
}