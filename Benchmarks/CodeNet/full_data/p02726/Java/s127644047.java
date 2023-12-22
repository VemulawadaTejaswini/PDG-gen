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

	public void exec() throws Exception{
		final int N = sc.nextInt();
		final int X = sc.nextInt();
		final int Y = sc.nextInt();
		final int M = (Y-X)+1; // 円内エッジ数かつノード数
		final int L = X-1; // 左側エッジ数
		final int R = N-Y; // 右側エッジ数
		final int C = M/2; // 円内最短距離
		final int A = L+R+1; //左端、右端間のエッジ数

		// k=1 はエッジの総数
		out.println(N);

		// k=2 は円の円周＋外部からの分岐
		int sum = 0;
		if(C >= 2) {
			sum += M;
		}
		sum += L;
		if(L > 0) {
			// 円に入って分岐する
			sum += 1;
		}
		sum += R;
		if(R > 0) {
			sum += 1;
		}
		out.println(sum);

		// k>=3;
		for(int k=3;k<N;k++) {
			sum = 0;
			if(C >= k) {
				// 円周の分
				sum += M;
			}
			if(L > 0 && R > 0 && A >= k) {
				// 直線が存在していて、距離がk以上の場合
				sum += A-k+1;
				if(L >= k-1) {
					sum--; // 円内を端とする場合がある。
				}
				if(R >= k-1) {
					sum--;
				}
			}
			if(L > 0 && L+C>=k) {
				int minL = Math.min(L, k-1);
				int minC = Math.min(C, k-1);
				sum += (minL+minC-k+1)*2;
				if(M%2==0) {
					sum--;
				}
			}
			if(R > 0 && R+C>=k) {
				int minR = Math.min(R, k-1);
				int minC = Math.min(C, k-1);
				sum += (minR+minC-k+1)*2;
				if(M%2==0) {
					sum--;
				}
			}
			out.println(sum);
		}
	}
}
