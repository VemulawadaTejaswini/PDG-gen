
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main implements Runnable { // クラス名はMain1

	static int mod = 1000000000 + 7; //10^9+7
	int[] dx = { 1, 0, -1, 0 }, dy = { 0, 1, 0, -1 }; //4 directions

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024 * 1024 * 1024).start(); // 16MBスタックを確保して実行
	}

	public void run() {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc = new InputReader(System.in);

		try {
			/**
			 * Bit 全探索
				//Nは要素数 (bit全探索)
				//計算量はO(2^N) Nが0-20~25 (30は多分無理)くらいまでしか使えない
				Out: for (int bit = 0; bit < (1 << N); bit++) {
					System.out.println(Integer.toBinaryString(bit));
					In: for (int j = 0; j < N; j++) {
						System.out.println(1 & (bit >> j));
						//1が立ってれば対象。例えば101だったら1桁目と3桁目は選ばれている
						//「二進数iをjだけ右にビットシフトしたときの、iの1桁目と1とでビット論理積をとって、演算結果が1であるなら処理を実行する」
						if ((1 & bit >> j) == 1) {
						}
					}
				}
			 *
			 * 表示系
			 *   System.out.println();
			 *   System.out.println("i:" + i + " ,j:" + j);
			 *   System.out.println(Arrays.toString(A));
			 *
			 * Sort (Arrays)
			 *  Integer[] A = new Integer[N];
			 *    Desc : Arrays.sort(A , Collections.reverseOrder());
			 *    Asc  : Arrays.sort(A);
			 *
			 * 定義系
			 *   int[] s = new int[M];
			 *   ArrayDeque<Integer> deq= new ArrayDeque<>();//先頭と末尾への要素の追加・先頭と末尾の要素の取り出しと削除が定数時間
			 *   ArrayList<Integer> arr = new ArrayList<Integer>();//定数時間
			 *   HashMap<Integer,Integer> hm = new HashMap<>(); //定数時間
			 *
			 *   //要素の追加と、最小の要素の取り出しと削除が対数時間
			 *   PriorityQueue<Integer> pq = new PriorityQueue<>();//昇順
			 *   PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //逆順。降順
			 *
			 *   TreeSet<Integer> ts = new TreeSet<>();//対数時間(重複はできない)
			 *
			 * 文字系
			 *   String S = sc.next().trim();
			 *   for (char i = 'a'; i <= 'z'; i++) {}
			 *   S.substring(1,2);//あいうえお → い
			 *   S.substring(0,1); // 1文字目をとりたいとき
			 *   文字列のSort
			 *    String sorted = S.chars().sorted().collect(StringBuilder::new,StringBuilder::appendCodePoint, StringBuilder::append) .toString();
			 */
			// long l = sc.nextLong();
			//String S = sc.next().trim();
			//int N = sc.nextInt();
			//int[] A = new int[N];
			int N = sc.nextInt();
			int M = sc.nextInt();

			Edge[] e = new Edge[M];
			UnionFindTree uft = new UnionFindTree(N);

			for (int i = 0; i < M; i++) {
				Edge edge = new Edge();
				edge.i = i;
				edge.a = sc.nextInt();
				edge.b = sc.nextInt();
				e[i] = edge;
			}

			Arrays.sort(e);

			//out.println(uft.group);

			e[0].ans = multiple(N, N - 1) / 2;

			for (int i = 0; i < M - 1; i++) {
				//out.println("a:" + e[i].a + " ,b:" + e[i].b + " ,group:" + uft.group);
				//out.println("a:" + uft.find(e[i].a - 1) + " " + uft.size[uft.find(e[i].a - 1)]);
				//out.println("b:" + uft.find(e[i].b - 1) + " " + uft.size[uft.find(e[i].b - 1)]);
				//out.println(Arrays.toString(uft.parent));
				//out.println(Arrays.toString(uft.size));
				//out.println(Arrays.toString(uft.rank));
				if (uft.group == 1) {
					e[i + 1].ans = 0;
				} else {
					if (uft.find(e[i].a - 1) == uft.find(e[i].b - 1)) {
						e[i + 1].ans = e[i].ans;
					} else {
						long asize = uft.size[uft.find(e[i].a - 1)];
						long bsize = uft.size[uft.find(e[i].b - 1)];
						e[i + 1].ans = e[i].ans - multiple(asize, bsize);
					}
				}

				uft.unite(e[i].a - 1, e[i].b - 1);
			}

			for (int i = M - 1; i >= 0; i--) {
				out.println(e[i].ans);
			}

			//Flushしてからcloseするのが無難
			out.flush();
			out.close();

		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			throw new RuntimeException();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}

	}

	private long multiple(long a, long b) {
		long ans = 0;
		try {
			ans = Math.multiplyExact(a, b);
			return ans;
		} catch (ArithmeticException ae) {
			throw new ArithmeticException();
		}
	}

	public static long comb(long a, long b) {
		if (a < b)
			return 0;
		long res = 1;
		long inv = pow(fact(Math.min(b, a - b)), mod - 2);
		for (long i = a; i > a - Math.min(b, a - b); i--) {
			res *= i;
			res %= mod;
		}
		res *= inv;
		res %= mod;
		return res;
	}

	public static long pow(long x, long n) {
		long res = 1;
		while (n > 0) {
			if ((n & 1) == 1) {
				res *= x;
				res %= mod;
			}
			x *= x;
			x %= mod;
			n >>= 1;
		}
		return res;
	}

	public static long fact(long n) {
		long res = 1;
		while (n > 0) {
			res *= n;
			res %= mod;
			n--;
		}
		return res;
	}

	class Edge implements Comparable<Edge> {

		public int i;
		public int a;
		public int b;
		public long ans;

		@Override
		public int compareTo(Edge o) {
			return o.i - this.i;
		}
	}

	class UnionFindTree {

		int[] parent; //インデックスにとノードを対応させ、そのルートノードのインデックスを格納
		int[] rank; //parentと同様に、木の高さを格納
		int[] size; //木の要素の数を格納。最新はparentのindexに
		int group;

		public UnionFindTree(int n) {
			this.parent = new int[n];
			this.rank = new int[n];
			this.size = new int[n];
			group = n;

			for (int i = 0; i < n; i++) {
				makeSet(i);
			}
		}

		public void makeSet(int i) {
			parent[i] = i;
			rank[i] = 0; //集合の高さ
			size[i] = 1;
		}

		public void unite(int x, int y) {
			int xRoot = find(x);
			int yRoot = find(y);
			if (xRoot == yRoot)
				return;
			group--;
			//xが属する木の方が大きい場合
			if (rank[xRoot] > rank[yRoot]) {
				parent[yRoot] = xRoot; //yの親をxに更新
				size[xRoot] += size[yRoot];

			} else if (rank[xRoot] < rank[yRoot]) {
				parent[xRoot] = yRoot;
				size[yRoot] += size[xRoot];
			} else {
				parent[yRoot] = xRoot;
				rank[xRoot]++; //同じ高さの木がルートの子として着くから大きさ++;
				size[xRoot] += size[yRoot];
			}
		}

		//引数の属する木のルートのidを返す
		public int find(int i) {
			if (i != parent[i]) {
				parent[i] = find(parent[i]);
			}
			return parent[i];
		}

		//同じ木に属しているか
		public boolean same(int x, int y) {
			return find(x) == find(y);
		}

		// via Oland https://atcoder.jp/contests/abc120/submissions/4452920
		public int size(int i) {
			return size[find(i)];
		}

		public int getGroup() {
			return group;
		}
	}

	// 高速なScanner
	static class InputReader {
		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;

		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}

		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}

		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}

		public boolean hasNext() {
			skip();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}
}
