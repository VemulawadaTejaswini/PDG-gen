import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char[] s = br.readLine().toCharArray();
		br.close();

		int[] a = new int[s.length];
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == 'R') {
				if (c1 >= c2) {
					if (c1 >= c3) {
						a[i] = 0;
					} else {
						a[i] = 1;
					}
				} else {
					if (c1 >= c3) {
						a[i] = 1;
					} else {
						a[i] = 2;
					}
				}
				c1++;
			} else if (s[i] == 'G') {
				if (c2 >= c3) {
					if (c2 >= c1) {
						a[i] = 0;
					} else {
						a[i] = 1;
					}
				} else {
					if (c2 >= c1) {
						a[i] = 1;
					} else {
						a[i] = 2;
					}
				}
				c2++;
			} else {
				if (c3 >= c1) {
					if (c3 >= c2) {
						a[i] = 0;
					} else {
						a[i] = 1;
					}
				} else {
					if (c3 >= c2) {
						a[i] = 1;
					} else {
						a[i] = 2;
					}
				}
				c3++;
			}
		}

		int mod = 998244353;
		long[] p = new long[n + 1];
		long[] pi = new long[n + 1];
		p[1] = 1;
		pi[1] = 1;
		for (int i = 2; i < p.length; i++) {
			p[i] = p[i - 1] * i % mod;
			pi[i] = modinv(p[i], mod);
		}

		long ans = 1;
		int[] cnt = new int[3];
		int[] same = new int[3];
		for (int i = 0; i < s.length; i++) {
			if (a[i] == 1) {
				same[2] = Math.max(cnt[2], same[2]);
				ans *= p[Math.max(cnt[2], 1)];
				ans %= mod;
				if (same[0] > 1 && same[1] > 1 && same[2] > 1) {
					ans *= pi[Math.max(Math.max(same[0], same[1]), same[2])];
					ans %= mod;
					Arrays.fill(same, 0);
				}
				same[0] = Math.max(cnt[0], same[0]);
				ans *= p[Math.max(cnt[0], 1)];
				ans %= mod;
				cnt[0] = 0;
				cnt[2] = 0;
			} else {
				same[1] = Math.max(cnt[1], same[1]);
				ans *= p[Math.max(cnt[1], 1)];
				ans %= mod;
				cnt[1] = 0;
			}
			cnt[a[i]]++;
		}
		System.out.println(ans * p[n] % mod);
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
