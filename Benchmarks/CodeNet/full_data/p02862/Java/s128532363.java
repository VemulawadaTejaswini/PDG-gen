import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int X = sc.nextInt();
		int Y = sc.nextInt();

		sc.close();

		
		
		int b = 2 * X - Y;
//		if ((X+Y) % 3 != 0) {
		if ((b % 3 != 0)) {
			out.println(0);
			return;
		}
		b /= 3;

		int a = X - 2 * b;
//		int a = (2*Y - X)/3;

		if(a<0 || b<0) {
			out.println(0);
			return;
		}
		
		ModInteger bunshi = new ModInteger(a + b).factorial();
		ModInteger bunbo = new ModInteger(a).factorial().multiply(new ModInteger(b).factorial());

		out.println(bunshi.divide(bunbo));

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}

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

	/** 階乗 N!のときO(N) */
	public ModInteger factorial() {
		long ans = 1;
		for (long n = 2; n <= x; n++) {
			ans *= n;
			ans %= MOD;
		}
		return new ModInteger(ans);
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
