import java.math.BigInteger;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		BigInteger ans = BigInteger.ZERO;
		BigInteger bmod = new BigInteger("1000000007");
		BigInteger bmod2 = new BigInteger("1000000005");

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] substr = str.split(" ", 0);

		int n = Integer.parseInt(substr[0]);
		int a = Integer.parseInt(substr[1]);
		int b = Integer.parseInt(substr[2]);

		//scan.close();
		ans = modPow(2, n, bmod).subtract(BigInteger.ONE);
		ans = ans.subtract(conbModPow2(n, a, b, bmod, bmod2));
		if (ans.compareTo(BigInteger.ZERO) == -1) {
			ans = ans.add(bmod);
		}
		if (ans.compareTo(BigInteger.ZERO) == -1) {
			ans = ans.add(bmod);
		}
		System.out.println(ans.toString());
	}

	static public BigInteger modPow(int m, int n, BigInteger bmod)
	{
		BigInteger bm = BigInteger.valueOf((long)m);
		BigInteger bn = BigInteger.valueOf((long)n);

		return bm.modPow(bn, bmod);
	}

	static public BigInteger conbModPow2(int n, int a, int b, BigInteger bmod, BigInteger bmod2)
	{
		BigInteger bm1 = factorial(a);
		BigInteger bm3 = bm1.multiply(factorialN2A(b, b-a));

		BigInteger bp1 = bm1.modPow(bmod2, bmod);
		BigInteger bp2 = bm3.modPow(bmod2, bmod);

		BigInteger bm2 = factorialN2A(n, a);
		BigInteger bm4 = bm2.multiply(factorialN2A(n-a, b-a));

		bm2 = bm2.multiply(bp1).remainder(bmod);
		bm4 = bm4.multiply(bp2).remainder(bmod);

		return bm2.add(bm4);
	}

	static public int conbModPow(int n, int a, int mod)
	{
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
