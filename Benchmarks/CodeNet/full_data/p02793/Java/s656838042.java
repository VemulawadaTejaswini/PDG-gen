import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		BigInteger[] a = new BigInteger[n];
		for (int i = 0; i < n; i++) {
			a[i] = new BigInteger(sa[i]);
		}
		br.close();

		BigInteger m = BigInteger.valueOf(1000000007);
		BigInteger lcm = BigInteger.ONE;
		for (int i = 0; i < n; i++) {
			lcm = lcm.multiply(a[i]).divide(lcm.gcd(a[i]));
		}
		lcm = lcm.mod(m);

		BigInteger ans = BigInteger.ZERO;
		for (int i = 0; i < n; i++) {
			BigInteger val = lcm.multiply(a[i].modInverse(m));
			ans = ans.add(val);
			ans = ans.mod(m);
		}
		System.out.println(ans);
	}
}
