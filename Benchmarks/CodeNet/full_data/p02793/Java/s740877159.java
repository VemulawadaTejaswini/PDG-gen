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
			a[i] = BigInteger.valueOf(Integer.parseInt(sa[i]));
		}
		br.close();

		BigInteger lcm = BigInteger.ONE;
		for (int i = 0; i < n; i++) {
			lcm = lcm.divide(lcm.gcd(a[i])).multiply(a[i]);
		}

		BigInteger ans = BigInteger.ZERO;
		for (int i = 0; i < n; i++) {
			ans = ans.add(lcm.divide(a[i]));
		}
		BigInteger m = BigInteger.valueOf(1000000007);
		System.out.println(ans.mod(m));
	}
}
