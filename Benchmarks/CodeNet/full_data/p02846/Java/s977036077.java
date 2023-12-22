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

	public void exec() throws Exception{
		final long T1 = sc.nextLong();
		final long T2 = sc.nextLong();
		long A1 = sc.nextLong();
		long A2 = sc.nextLong();
		long B1 = sc.nextLong();
		long B2 = sc.nextLong();
		long AD = T1*A1+T2*A2;
		long BD = T1*B1+T2*B2;
		if(AD==BD){
			// 合計で同じ距離を進む場合、T1+T2倍数時点で毎回であう。
			out.println("infinity");
			return;
		}
		if(AD<BD) {
			// 早いほうをAにする。
			long tmp = A1;
			A1 = B1;
			B1 = tmp;
			tmp = A2;
			A2 = B2;
			B2 = tmp;
			AD = T1*A1+T2*A2;
			BD = T1*B1+T2*B2;
		}
//		err.println(A1+","+A2+","+AD);
//		err.println(B1+","+B2+","+BD);
		if(A1>B1) {
			// トータルでAのほうが早いかつ、初動もAのほうが早い場合、
			// Bはいつまでも追いつくことができないため、回数は0回になる。
			out.println(0);
			return;
		}
		// それ以外の場合、初動の位置が、T1での移動で追いつく範囲であれば、
		// 出会うことがあるが、それ以上離れてしまった場合、初動の追い上げでも出会うことはない。
		long diff = AD - BD; // T1+T2で話される距離。
//		err.println("diff = "+diff);

		long N = ((T1)*(B1-A1)) / diff; // 何回まで追いつく可能性があるか。
		long mod = ((T1)*(B1-A1)) % diff; // ピッタリか判定する。
//		err.println("N = "+N);
		if(mod == 0) {
			// ピッタリの場合、あと1回。原点抜かすのでー1．
			out.println(N*2);
		}else {
			//　ピッタリではない場合、あと2回、原点抜かすのでー１．
			out.println(N*2+1);
		}
	}
}
