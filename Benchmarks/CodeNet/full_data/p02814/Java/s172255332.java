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

		BigInteger bm = BigInteger.valueOf(m);
		BigInteger b = BigInteger.ONE;
		for (int i = 0; i < n; i++) {
			BigInteger ai = BigInteger.valueOf(a[i] / 2);
			BigInteger gcd = b.gcd(ai);
			b = b.multiply(ai).divide(gcd);
			if (b.compareTo(bm) > 0) {
				System.out.println(0);
				return;
			}
		}

		int lcm = b.intValue();
		for (int i = 0; i < n; i++) {
			if (lcm % (a[i] / 2) == 0) {
				System.out.println(0);
				return;
			}
		}
		System.out.println(m / lcm - m / 2 / lcm);
	}
}
