import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		new Main(new Scanner(System.in), System.out, System.err).exec();
	}
	public final Scanner sc;
	public final PrintStream out, err;
	public Main(final Scanner sc, final PrintStream out, final PrintStream err) {
		this.sc = sc;this.out = out;this.err = err;
	}
	static public final long pair(int a, int b) {return (((long)a) << 32) + b;}
	static public final int getPair1(long v) {return (int)(v >> 32);}
	static public final int getPair2(long v) {return (int)(v & 0xFFFFFFFF);}

	static public final long quad(long a, long b, long c, long d) {
		return ((a&0xFFFF)<< 48) + ((b&0xFFFF)<< 32) + ((c&0xFFFF)<< 16) +(d&0xFFFF);}
	static public final int getQuad1(long v) {return (int)( v >> 48          );}
	static public final int getQuad2(long v) {return (int)((v >> 32) & 0xFFFF);}
	static public final int getQuad3(long v) {return (int)((v >> 16) & 0xFFFF);}
	static public final int getQuad4(long v) {return (int)( v        & 0xFFFF);}

	static public final long record(int e, int m, int i) {
		return quad(-1, e, m, i);
	}
	static public final int re(long record) {
		return getQuad2(record);
	}
	static public final int rm(long record) {
		return getQuad3(record);
	}
	static public final int ri(long record) {
		return getQuad4(record);
	}

	//------------------------------------------

	private int p;
	private int[] inv;
	private int[] fact;
	private int[] finv;
	public final int mod(long v) {
		return mod(v, p);
	}
	static public final int mod(long v, int M) {
		v %= M;
		return (int)(v < 0 ? v+M : v);
	}
	/**
	 * a * b (mod p)
	 * 事前にinitFactを行うこと。
	 */
	public final int mul(long a, long b) {
		return mod(a*b);
	}
	public final void initFact(double limit, double p) {
		initFact((int)limit, (int)p);
	}
	/**
	 * 集合数nの組み合わせ計算を高速化するため、事前に計算を行う。
	 * 組み合わせ数はpで割った余りを算出する。
	 */
	public final void initFact(int n, int p) {
		this.p = p;
		this.inv = new int[n+1];
		this.fact = new int[n+1];
		this.finv = new int[n+1];
		fact[1] = finv[1] = inv[0] = inv[1] = 1;
		for(int i=2;i<=n;i++) {
			int a = p / i;
			int b = p % i;
			inv[i]  = mul(-a, inv[b]);
			fact[i] = mul(fact[i-1], i);
			finv[i] = mul(finv[i-1], inv[i]);
		}
	}
	/**
	 * mCnを計算する。事前にinitFactを実行すること。
	 */
	public final int comb(int m, int n) {
		return mul(mul(fact[m], finv[n]), finv[m-n]);
	}
	/**
	 * a^b (mod M)を計算する。
	 */
	public static long pow(long a, long b, int M) {
		long ret = 1;
		long tmp = a;
		while (b > 0) {
			if ((b & 1) == 1) {
				ret = (ret * tmp) % M;
			}
			tmp = (tmp * tmp) % M;
			b = b >> 1;
		}
		return ret;
	}
	/**
	 * nCk (mod M)を計算する。
	 */
	public static int nCk(int n, int k, int M) {
		long ret = 1;
		int min = Math.min(k, n - k);
		// 分母
		for (int i = 1; i <= min; i++) {
			// a^-1 ≡ a^M-2  ※フェルマーの小定理
			ret = (ret * pow(i, M - 2, M)) % M;
		}
		// 分子
		for (int i = n - min + 1; i <= n; i++) {
			ret = (ret * i) % M;
		}
		return (int) ret;
	}
	//------------------------------------------
	static long lcm (long a, long b) {
		long temp;
		long c = a;
		c *= b;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return (long)(c/b);
	}

	//------------------------------------------

	static class DisjointSetUnion {
		public int[] parent;
		public int[] weight;
		public int count;

		public DisjointSetUnion(int nodes) {
			count = nodes;
			parent = new int[nodes];
			weight = new int[nodes];
			for (int i = 0; i < nodes; i++) {
				parent[i] = i;
				weight[i] = 1;
			}
		}
		//"find"
		public int root(int p) {
			while (p != parent[p]) {
				p = parent[p];
			}
			return p;
		}

		//"union"
		public void connect(int p, int q) {
			int rootP = root(p);
			int rootQ = root(q);
			if (rootP == rootQ) return;
			if (weight[rootP] < weight[rootQ]) {
				parent[rootP] = rootQ;
				weight[rootQ] += weight[rootP];
			} else {
				parent[rootQ] = rootP;
				weight[rootP] += weight[rootQ];
			}
			count--;
		}

		public boolean connected(int p, int q) {
			return root(p) == root(q);
		}
	}
	static class IntList{
		int tail = 0;
		final int[] element;
		public IntList(int cap) {
			element = new int[cap];
		}
		public int size() {
			return tail;
		}
		public int get(int index) {
			return element[index];
		}
		public void reset() {
			tail = 0;
		}
		public void add(int v) {
			element[tail++] = v;
		}
	}
	static class LongList{
		int tail = 0;
		int head = 0;
		final long[] element;
		public LongList(int cap) {
			element = new long[cap];
		}
		public int size() {
			return (element.length+tail-head)%element.length;
		}
		public long remove() {
			long v = element[head];
			head = (head+1)%element.length;
			return v;
		}
		public long get(int index) {
			return element[index];
		}
		public void reset() {
			head = 0;
			tail = 0;
		}
		public void add(long v) {
			element[tail] = v;
			tail = (tail+1)%element.length;
		}
		public boolean hasElement() {
			return this.size()!=0;
		}
	}

	static public class Cell{
		private boolean color;
		/**
		 * ここにたどり着いた時のコスト
		 */
		private long score;
		/**
		 * 直前にいたセルのR座標
		 */
		private int prevR;
		/**
		 * 直前にいたセルのC座標
		 */
		private int prevC;
		/**
		 * 現在通行中の同一色エリア
		 */
		private long area;
		public String toString() {
			return String.format("{clr=%s,scr=%d,pR=%d,pC=%d,area=(%d,%d,%d,%d)}",
					color?"W":"B", score, prevR, prevC,
							getQuad1(area),
							getQuad2(area),
							getQuad3(area),
							getQuad4(area)
							);
		}
	}
	static public final boolean WHITE = true;
	static public final boolean BLACK = false;
	static public final long SAME = 1;
	static public final long DIFF = 1000000000;
	static public final long INTR = 10000;
	public void exec() throws Exception{
		final int H = sc.nextInt();
		final int W = sc.nextInt();
		final Cell[][] G = new Cell[H][W];
		final LongList list = new LongList(H*W);
		for(int r=0;r<H;r++) {
			final String s = sc.next();
			for(int c=0;c<W;c++) {
				G[r][c] = new Cell();
				G[r][c].color = (s.charAt(c)=='.');
				G[r][c].score = Long.MAX_VALUE;
			}
		}
		G[0][0].score = 0;
		G[0][0].prevR = -1;
		G[0][0].prevC = -1;
		list.add(pair(0,0));
		while(list.hasElement()) {
			long point = list.remove();
			int r = getPair1(point);
			int c = getPair2(point);
//			err.println(r+","+c);
			search(list, G, r, c, r+1, c, H, W);
			search(list, G, r, c, r-1, c, H, W);
			search(list, G, r, c, r, c+1, H, W);
			search(list, G, r, c, r, c-1, H, W);
		}
//		for(int r=0;r<H;r++) {
//			for(int c=0;c<W;c++) {
//				out.print(G[r][c].toString());
//			}
//			out.println();
//		}
		list.reset();
		Cell cell = G[H-1][W-1];
		int count = 0;
		while(true) {
			list.add(cell.area);
			if(cell.color == BLACK) {
				count++;
			}
			if(cell.prevR == -1) {
				break;
			}
			cell = G[cell.prevR][cell.prevC];
		}
		out.println(count);
	}
	private void search(LongList list, Cell[][] G, int r, int c, int dr, int dc, int H, int W) {
		// 縦がはみ出ている場合は無視
		if(dr < 0 || H <= dr) {
			return;
		}
		// 横がはみ出ている場合は無視
		if(dc < 0 || W <= dc) {
			return;
		}
		final Cell c1 = G[r][c];
		final Cell c2 = G[dr][dc];
		if(c1.color == c2.color) {
			long newscore = c1.score+SAME;
			if(c2.score <= newscore) {
				// スコア更新しないので探索中止
				return;
			}
			c2.score = newscore;
			c2.prevR = c1.prevR;
			c2.prevC = c1.prevC;
			c2.area = marge(c1.area, dr, dc);
		}else {
			long newscore = c1.score+DIFF;
			if(contains(c1.area, dr, dc)) {
				// 移動範囲で色転換がある場合はコスト高めにする。
				newscore += INTR;
			}
			if(c2.score <= newscore) {
				// スコア更新しないので探索中止
				return;
			}
			c2.score = newscore;
			c2.prevR = r;
			c2.prevC = c;
			c2.area = quad(dr,dc,dr,dc);
		}
		// 到着点が右下が起点の場合は無視
		if(dr == H-1 && dc == W-1) {
			return;
		}
		list.add(pair(dr, dc));
	}
	private boolean contains(long area, int dr, int dc) {
		final int r0 = Math.min(getQuad1(area), dr);
		final int c0 = Math.min(getQuad2(area), dc);
		final int r1 = Math.max(getQuad3(area), dr);
		final int c1 = Math.max(getQuad4(area), dc);
		return r0 <= dr && dr <= r1 && c0 <= dc && dc <= c1;
	}
	private long marge(long area, int dr, int dc) {
		final int r0 = Math.min(getQuad1(area), dr);
		final int c0 = Math.min(getQuad2(area), dc);
		final int r1 = Math.max(getQuad3(area), dr);
		final int c1 = Math.max(getQuad4(area), dc);
		return quad(r0, c0, r1, c1);
	}
}
