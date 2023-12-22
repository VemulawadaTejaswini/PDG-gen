import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

class ModInteger {
	public static long MOD = 1_000_000_007;
	private long x;

	public ModInteger(long n) {
		x = (n % MOD);
	}

	/** 和 */
	public ModInteger add(long augend) {
		return new ModInteger((x + augend) % MOD);
	}

	/** 和 */
	public ModInteger add(ModInteger augend) {
		return add(augend.x);
	}

	/** 逆元 */
	public ModInteger inv() {
		return pow(MOD - 2);
	}

	/** 商 */
	public ModInteger divide(long divisor) {
		return divide(new ModInteger(divisor));
	}

	/** 商 */
	public ModInteger divide(ModInteger divisor) {
		return multiply(divisor.inv());
	}

	/** 積 */
	public ModInteger multiply(long muultiplicand) {
		return new ModInteger((x * muultiplicand) % MOD);
	}

	/** 積 */
	public ModInteger multiply(ModInteger multiplicand) {
		return multiply(multiplicand.x);
	}

	/** 累乗 O(logN) */
	public ModInteger pow(long n) {
		// 繰り返し二乗法
		if (n == 0) {
			return new ModInteger(1);
		}
		ModInteger a = pow(n / 2);
		a = a.multiply(a);
		if (n % 2 == 1) {
			a = a.multiply(x);
		}
		return a;
	}

	/** 差 */
	public ModInteger subtract(long subtrahend) {
		return new ModInteger((x - subtrahend + MOD) % MOD);
	}

	/** 差 */
	public ModInteger subtract(ModInteger subtrahend) {
		return subtract(subtrahend.x);
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof ModInteger) {
			return x == ((ModInteger) o).x;
		}
		return false;
	}

	public boolean equals(long l) {
		return x == (l % MOD);
	}

	@Override
	public int hashCode() {
		return Long.hashCode(x);
	}

	public int compareTo(long val) {
		return Long.compare(x, val);
	}

	public int compareTo(ModInteger val) {
		return compareTo(val.x);
	}

	public long longValue() {
		return x;
	}

	@Override
	public String toString() {
		return Long.toString(x);
	}

	public static ModInteger valueOf(long x) {
		return new ModInteger(x);
	}

}

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public ModInteger nCr(ModInteger n, ModInteger r) {
		ModInteger ans = new ModInteger(1);

		while (!r.equals(0)) {
			ans = ans.multiply(n);
			ans = ans.divide(r);

			n = n.subtract(1);
			r = r.subtract(1);
		}

		return ans;
	}

	public ModInteger nCr(long n, long r) {
		return nCr(new ModInteger(n), new ModInteger(r));
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();

		ModInteger.MOD = 1000000007;

		sc.close();

		ModInteger nn = new ModInteger(2).pow(n).subtract(1);
		ModInteger x = nCr(n, a);
		ModInteger y = nCr(n, b);

		ModInteger ans = nn.subtract(x.add(y));
		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
