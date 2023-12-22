import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] a = arrayLong(sc, n);
		sc.close();
		Arrays.sort(a);
		long mod = 1000000007l;
		long ans = 0;
		Combination cmb = new Combination(n + 1);
		long com = 0;
		for (int i = 0; i < n - k + 1; i++) {
			com += cmb.getComb(k - (2 - i), i);
			com %= mod;
			ans += com * a[i + k - 1];
			ans -= com * a[k - i];
			ans %= mod;
		}
		System.out.println(ans);
	}

	public static long modFactorial(long n, long mod) {
		long ans = 1;
		for (int i = 1; i <= n; i++) {
			ans *= i;
			ans %= mod;
		}
		return ans;
	}

	public static int arrayMax(int[] array) {
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > ans)
				ans = array[i];
		}
		return ans;
	}

	public static int[] arrayInt(Scanner sc, int n) {
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		return array;
	}

	public static long[] arrayLong(Scanner sc, int n) {
		long[] array = new long[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextLong();
		}
		return array;
	}

	public static double[] arrayDouble(Scanner sc, int n) {
		double[] array = new double[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextDouble();
		}
		return array;
	}
}

class Combination {
	static final int MOD = 1000000007;
	long[] fac;
	long[] finv;
	long[] inv;

	public Combination(int size) {
		fac = new long[size];
		finv = new long[size];
		inv = new long[size];
		fac[0] = 1;
		fac[1] = 1;
		finv[0] = 1;
		finv[1] = 1;
		inv[1] = 1;
		for (int i = 2; i < size; i++) {
			fac[i] = fac[i - 1] * i % MOD;
			inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
			finv[i] = finv[i - 1] * inv[i] % MOD;
		}
	}

	public long getComb(int n, int k) {
		if (n < k || n < 0 || k < 0) {
			return 0;
		}
		return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
	}
}