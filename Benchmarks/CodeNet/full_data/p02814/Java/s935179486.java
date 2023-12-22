import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		long lcm = 1;
		for (int i = 0; i < n; i++) {
			lcm = lcm(lcm, a[i] / 2);
			if (lcm > m) {
				System.out.println(0);
				return;
			}
		}

		for (int i = 0; i < n; i++) {
			if (lcm % a[i] == 0) {
				System.out.println(0);
				return;
			}
		}
		System.out.println(m / lcm - m / 2 / lcm);
	}

	static long lcm(long a, long b) {
		BigInteger ba = BigInteger.valueOf(a);
		BigInteger bb = BigInteger.valueOf(b);
		return ba.multiply(bb).divide(ba.gcd(bb)).longValue();
	}
}
