import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	static BigInteger m = BigInteger.valueOf(1000000007);

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		BigInteger lcm = BigInteger.ONE;
		for (int i = 0; i < n; i++) {
			BigInteger ba = BigInteger.valueOf(a[i]);
			BigInteger gcd = lcm.gcd(ba);
			lcm = lcm.divide(gcd).multiply(ba);
		}

		lcm = lcm.mod(m);
		long lcm2 = lcm.longValue();
		int mod = 1000000007;
		long ans = 0;
		for (int i = 0; i < n; i++) {
			ans += lcm2 * modinv(a[i], mod);
			ans %= mod;
		}
		System.out.println(ans);
	}

//	static long lcm(long a, long b) {
//		BigInteger ba = BigInteger.valueOf(a);
//		BigInteger bb = BigInteger.valueOf(b);
//		return ba.multiply(bb).divide(ba.gcd(bb)).mod(m).longValue();
//	}

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
