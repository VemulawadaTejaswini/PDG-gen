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
		v %= p;
		return (int)(v < 0 ? v+p : v);
	}
	public final int mul(long a, long b) {
		return mod(a*b);
	}
	public final void initFact(double limit, double p) {
		initFact((int)limit, (int)p);
	}
	public final void initFact(int limit, int p) {
		this.p = p;
		this.inv = new int[limit+1];
		this.fact = new int[limit+1];
		this.finv = new int[limit+1];
		fact[1] = finv[1] = inv[0] = inv[1] = 1;
		for(int i=2;i<=limit;i++) {
			int a = p / i;
			int b = p % i;
			inv[i]  = mul(-a, inv[b]);
			fact[i] = mul(fact[i-1], i);
			finv[i] = mul(finv[i-1], inv[i]);
		}
	}
	public final int comb(int m, int n) {
		return mul(mul(fact[m], finv[n]), finv[m-n]);
	}

	//------------------------------------------

	static public class Record{
		public Record(int N) {
			this.target = new int[N];
			this.type = new int[N];
		}
		int num;
		int[] target;
		int[] type;
		public void add(int target, int type) {
			this.target[num] = target;
			this.type[num] = type;
			num++;
		}
	}

	public void exec() throws Exception{
		final int N = sc.nextInt();
		Record[] records = new Record[N+1];

		for(int i=1;i<=N;i++) {
			records[i]=new Record(N);
			final int A = sc.nextInt();
			for(int a=0;a<A;a++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				records[i].add(x, y);
			}
		}
		int pattern[] = new int[N+1];
		int loop = (0x2<<N)-1;
		int max = 0;
		for(int p=0;p<=loop;p+=0x2) {
			for(int t=1;t<=N;t++) {
				pattern[t]=(p>>t)&0x1;
			}
			boolean allOk = true;;
			int cnt = 0;
			for(int t=1;t<=N;t++) {
				if(pattern[t]==0) {
					// 嘘つきの検証はしない。
					continue;
				}
				Record r = records[t];
				boolean honest=true;
				// 正直者候補の証言とパターンが一致しているか判定する。
				for(int i=0;i<r.num;i++) {
					if(pattern[r.target[i]]!=r.type[i]) {
						honest=false;
						break;
					}
				}
				if(honest) {
					cnt++;
				}else {
					// 正直者が嘘つきだったので成立しない。
					allOk = false;
					break;
				}
			}
			if(allOk) {
				max = Math.max(max, cnt);
			}
		}
		out.println(max);
	}
}
