import java.math.BigInteger;

public class Main {
	BigInteger n;
	BigInteger a[];

	Main(BigInteger a[]) {
		this.a = a;
	}

	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int n = s.nextInt();
		BigInteger a[] = new BigInteger[n];
		for (int i = 0; i < n; i++) {
			a[i] = BigInteger.valueOf(s.nextInt());
		}

		System.out.println(new Main(a).calc());
	}

	public BigInteger calc() {
		BigInteger b = BigInteger.ONE;
		for (int i = 0; i < a.length; i++) {
            b = b.multiply(a[i]).divide(b.gcd(a[i]));
		}
        BigInteger c = BigInteger.ZERO;
        for (int i = 0; i < a.length; i++) {
            c = c.add(b.divide(a[i]));
		}
		return c.mod(BigInteger.valueOf(1000000007));
	}

}
