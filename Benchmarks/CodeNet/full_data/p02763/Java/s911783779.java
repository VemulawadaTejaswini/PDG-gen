import java.io.PrintStream;
import java.util.Arrays;
import java.util.Comparator;
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
	static public final int getPari2(long v) {return (int)(v & 0xFFFFFFFF);}

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



	public void exec() throws Exception{
		final int N = sc.nextInt();
		final String str = sc.next();
		final int[] S = new int[N+1];
		for(int i=1;i<=N;i++) {
			S[i] = str.charAt(i-1)-'a';
		}
		final int Q = sc.nextInt();

		class Query{
			public Query(int type, int q1, int q2) {
				this.type = type;
				this.q1 = q1;
				this.q2 = q2;
			}
			int type;
			int q1, q2;
		}
		int rangeCount = 0;
		Query[] queries = new Query[Q];
		for(int i=0;i<Q;i++) {
			final int type = sc.nextInt();
			if(type == 1) {
				final int a = sc.nextInt();
				final int b = sc.next().charAt(0)-'a';
				queries[i] = new Query(type, a, b);
			}else {
				final int a = sc.nextInt();
				final int b = sc.nextInt();
				queries[i] = new Query(type, a, b);
				rangeCount++;
			}
		}
		class Range implements Comparable<Range>{
			Range(int left, int right){
				this.left = left;
				this.right = right;
			}
			int left;
			int right;
			int[] nums = new int[26];
			public boolean contains(int point) {
				return left <= point && point <= right;
			}
			@Override
			public int compareTo(Range o) {
				final int diffLeft = Integer.compare(this.left, o.left) ;
				if(diffLeft != 0) {
					return diffLeft;
				}
				final int diffRight = Integer.compare(this.right, o.right);
				if(diffRight != 0) {
					return diffRight;
				}
				// 全く同じ範囲だった場合
				return Integer.compare(this.nums.hashCode(), o.nums.hashCode());
			}
		}

		// 計測範囲を特定
		int tail = 0;
		Range[] ranges = new Range[rangeCount];
		Range[] leftSortedRanges = new Range[rangeCount];
		Range[] rightSortedRanges = new Range[rangeCount];
		for(int i=0;i<Q;i++) {
			if(queries[i].type==2) {
				ranges[tail] = leftSortedRanges[tail] = rightSortedRanges[tail] = new Range(queries[i].q1, queries[i].q2);
				tail++;
			}
		}
		Arrays.sort(leftSortedRanges, new Comparator<Range>() {
			@Override
			public int compare(Range o1, Range o2) {
				final int diffLeft = Integer.compare(o1.left, o2.left) ;
				if(diffLeft != 0) {
					return diffLeft;
				}
				final int diffRight = Integer.compare(o1.right, o2.right);
				if(diffRight != 0) {
					return diffRight;
				}
				// 全く同じ範囲だった場合
				return Integer.compare(o1.nums.hashCode(), o2.nums.hashCode());
			}
		});
		Arrays.sort(rightSortedRanges, new Comparator<Range>() {
			@Override
			public int compare(Range o1, Range o2) {
				final int diffRight = Integer.compare(o1.right, o2.right);
				if(diffRight != 0) {
					return diffRight;
				}
				final int diffLeft = Integer.compare(o1.left, o2.left) ;
				if(diffLeft != 0) {
					return diffLeft;
				}
				// 全く同じ範囲だった場合
				return Integer.compare(o1.nums.hashCode(), o2.nums.hashCode());
			}
		});

		// 初期状態での各レンジの文字数を集計する。
		int leftHead = 0;
		int rightHead = 0;
		int[] num = new int[26];
		for(int i=1;i<=N;i++) {
			while(leftHead < rangeCount && leftSortedRanges[leftHead].left == i) {
				System.arraycopy(num, 0, leftSortedRanges[leftHead].nums, 0, 26);
				leftHead++;
			}
			num[S[i]]++;
			while(rightHead < rangeCount && rightSortedRanges[rightHead].right == i) {
				for(int s=0;s<26;s++) {
					rightSortedRanges[rightHead].nums[s] = num[s] - rightSortedRanges[rightHead].nums[s];
				}
				rightHead++;
			}
		}

		// クエリを処理する。
		tail = 0;
		for(int q = 0; q<Q; q++) {
			Query query = queries[q];
			if(query.type == 1) {
				for(Range range : ranges) {
					if(range.contains(query.q1)) {
						range.nums[S[query.q1]]--;
						range.nums[query.q2]++;
					}
				}
				S[query.q1] = query.q2;
//				err.println(Arrays.toString(S));
			}else {
				int c = 0;
				for(int i=0;i<26;i++) {
					if(ranges[tail].nums[i] > 0) {
						c++;
					}
				}
				out.println(c);
				tail++;
			}
		}
	}
}
