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
	static private final long pair(int a, int b) {return (((long)a) << 32) + b;}
	static private final int upper(long v) {return (int)(v >> 32);}
	static private final int lower(long v) {return (int)(v & 0xFFFFFFFF);}

	//-----------------------------------------

	static public final long load(int end, int length) {
		return pair(end, length);
	}
	static public final int end(long load) {
		return upper(load);
	}
	static public final int length(long load) {
		return lower(load);
	}
	static public final long score(int count, int last) {
		return pair(count, last);
	}
	static public final int count(long score) {
		return upper(score);
	}
	static public final int last(long score) {
		return lower(score);
	}

	//------------------------------------------

	private int p;
	private int[] inv;
	private int[] fact;
	private int[] finv;
	public final int mod(int v) {
		v %= p;
		return v < 0 ? v+p : v;
	}
	public final int mod(long v) {
		v %= p;
		return (int)(v < 0 ? v+p : v);
	}
	public final int mul(int a, int b) {
		return mod((long)a*b);
	}
	public final int mul(long a, long b) {
		return mod((long)a*b);
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
			fact[i] = mul(fact[i-1], i);
			int a = p / i;
			int b = p % i;
			inv[i] = mul(-a, inv[b]);
			finv[i] = mul(finv[i-1], inv[i]);
		}
	}
	public final int comb(int m, int n) {
		return mul(mul(fact[m], finv[n]), finv[m-n]);
	}

	//------------------------------------------

	public void exec() throws Exception{
		final int X = sc.nextInt();
		final int Y = sc.nextInt();

		initFact(1e6, 1e9+7);

		if((2*X-Y)%3 != 0) {
			out.println(0);
			return;
		}
		if((2*Y-X)%3 != 0) {
			out.println(0);
			return;
		}
		final int LARGE = Math.max((2*X-Y)/3, (2*Y-X)/3);
		final int MIN   = Math.min((2*X-Y)/3, (2*Y-X)/3);

		out.println(comb(LARGE+MIN, MIN));
	}
}
