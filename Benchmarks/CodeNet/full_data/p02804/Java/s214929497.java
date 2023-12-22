import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		Arrays.parallelSort(a);

		int mod = 1000000007;
		long[] p = new long[100001];
		long[] pi = new long[100001];
		p[0] = 1;
		pi[0] = 1;
		for (int i = 1; i < p.length; i++) {
			p[i] = p[i - 1] * i % mod;
			pi[i] = modinv(p[i], mod);
		}

		long sum1 = 0;
		long sum2 = 0;
		for (int i = 0; i < n; i++) {
			if (n - 1 - i >= k - 1) {
				long val = nCr(n - 1 - i, k - 1, mod, p, pi);
				sum1 += val * a[i];
				sum1 %= mod;
			}
			if (i >= k - 1) {
				long val = nCr(i, k - 1, mod, p, pi);
				sum2 += val * a[i];
				sum2 %= mod;
			}
		}
		if (sum2 < sum1) {
			sum2 += mod;
		}
		System.out.println(sum2 - sum1);
	}

	static long nCr(int n, int r, int m, long[] p, long[] pi) {
		return p[n] * pi[r] % m * pi[n - r] % m;
	}

	static long modinv(long a, long m) {
		long b = m;
		long u = 1;
		long v = 0;
		long tmp = 0;

		while (b > 0) {
			long t = a / b;
			a -= t * b;
			tmp = a;
			a = b;
			b = tmp;

			u -= t * v;
			tmp = u;
			u = v;
			v = tmp;
		}

		u %= m;
		if (u < 0) u += m;
		return u;
	}
}
