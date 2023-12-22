import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	final long MODULO = 1_000_000_000 + 7;
	int n;
	int[] a;

	void run() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		long[] fac = new long[n + 1];
		long[] revfac = new long[n + 1];
		long[] rev = new long[n + 1];
		fac[0] = 1;
		for (int i = 1; i < fac.length; ++i) {
			fac[i] = (fac[i - 1] * i) % MODULO;
		}
		rev[0]=1;
		for (int i = 1; i < rev.length; ++i) {
			rev[i] = (MODULO - rev[(int) MODULO % i] * (MODULO / i) % MODULO) % MODULO;
		}
		revfac[0] = 1;
		for (int i = 1; i < revfac.length; ++i) {
			revfac[i] = (revfac[i - 1] * rev[i]) % MODULO;
		}

		a = new int[n + 1];
		int m = -1;
		boolean[] f = new boolean[n];
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt() - 1;
			if (f[a[i]]) {
				m = a[i];
			} else {
				f[a[i]] = true;
			}
		}
		int k1 = 0, k2 = 0, k3 = 0;
		int i;
		for (i = 0; i < n; ++i) {
			if (a[i] == m) {
				break;
			}
			++k1;
		}
		for (i = i + 1; i < n; ++i) {
			if (a[i] == m) {
				break;
			}
			++k2;
		}
		k3 = n - 1 - (k1 + k2);
		for (int len = 1; len <= n + 1; ++len) {
			if (len == 1) {
				System.out.println(n);
				continue;
			}
			long ans = 0;
			ans = comb(n - 1, len, fac, revfac);
			ans = (ans + comb(n - 1, len - 2, fac, revfac)) % MODULO;
			ans = (ans + 2 * comb(n - 1, len - 1, fac, revfac)) % MODULO;
			ans = (ans - comb(k1 + k3, len - 1, fac, revfac) + MODULO) % MODULO;
			System.out.println(ans);
		}

	}

	long comb(int n, int k, long[] fac, long[] revfac) {
		if (n < k)
			return 0;
		return fac[n] * revfac[k] % MODULO * revfac[n - k] % MODULO;
	}

	long pow(long a, long n) {
		long ret = 1;
		for (; n > 0; n >>= 1, a = (a * a) % MODULO) {
			if (n % 2 == 1)
				ret = (ret * a) % MODULO;
		}
		return ret;
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
