import java.math.BigInteger;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		int ans = 0;
		int mod = 1000000007;
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] substr = str.split(" ", 0);

		int n = Integer.parseInt(substr[0]);
		int a = Integer.parseInt(substr[1]);
		int b = Integer.parseInt(substr[2]);

		scan.close();
		ans = modPow(2, n, mod) - 1;
		ans = ans - conbModPow2(n, a, b, mod);
		if (ans < 0) {
			ans += mod;
		}
		if (ans < 0) {
			ans += mod;
		}

		System.out.println(ans);
	}

	static public int modPow(int m, int n, int mod)
	{
		BigInteger bm = BigInteger.valueOf((long)m);
		BigInteger bn = BigInteger.valueOf((long)n);
		BigInteger bmod = BigInteger.valueOf((long)mod);

		return bm.modPow(bn, bmod).intValue();
	}

	static public int conbModPow2(int n, int a, int b, int mod)
	{
		BigInteger bn = BigInteger.valueOf((long)n);
		BigInteger bmod = BigInteger.valueOf((long)mod);
		BigInteger bmod2 = BigInteger.valueOf((long)mod-2);

		BigInteger bm1 = factorial(a);
		BigInteger bm3 = bm1.multiply(factorialN2A(b, b-a));

		BigInteger bp1 = bm1.modPow(bmod2, bmod);
		BigInteger bp2 = bm3.modPow(bmod2, bmod);

		BigInteger bm2 = factorialN2A(n, a);
		BigInteger bm4 = bm2.multiply(factorialN2A(n-a, b-a));

		bm2 = bm2.multiply(bp1).remainder(bmod);
		bm4 = bm4.multiply(bp2).remainder(bmod);

		return bm2.add(bm4).intValue();
	}

	static public int conbModPow(int n, int a, int mod)
	{
		BigInteger bn = BigInteger.valueOf((long)n);
		BigInteger bmod = BigInteger.valueOf((long)mod);
		BigInteger bmod2 = BigInteger.valueOf((long)mod-2);

		BigInteger bm1 = factorial(a);
		BigInteger bp = bm1.modPow(bmod2, bmod);

		BigInteger bm2 = factorialN2A(n, a);
		bm2 = bm2.multiply(bp);
		bm2 = bm2.remainder(bmod);

		return bm2.intValue();
	}

	static BigInteger factorialN2A (int n, int a) {
		BigInteger[] ar = new BigInteger[a];
		for (int i=0; i<a; i++) {
			ar[i] = BigInteger.valueOf(n-a+i+1);
		}
		int t = 1;
		int length = ar.length;
		while (t <= length) {
			for (int i=0; i<length; i+=(t<<1)) {
				if (t+i < length) {
					ar[i] = ar[i].multiply(ar[i+t]);
				}
			}
			t = t<<1;
		}
		return ar[0];

	}

	static BigInteger factorial (int n) {
		BigInteger[] ar = new BigInteger[n];
		for (int i=0; i<n; i++) {
			ar[i] = BigInteger.valueOf(i+1);
		}
		int t = 1;
		int length = ar.length;
		while (t <= length) {
			for (int i=0; i<length; i+=(t<<1)) {
				if (t+i < length) {
					ar[i] = ar[i].multiply(ar[i+t]);
				}
			}
			t = t<<1;
		}
		return ar[0];
	}
}
