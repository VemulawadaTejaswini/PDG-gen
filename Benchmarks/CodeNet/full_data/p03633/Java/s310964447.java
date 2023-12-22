import java.util.*;
import java.math.BigInteger;
// warm-up
public class Main {

	// GCD of two numbers
	// Euclid's algorithm
	static BigInteger GCD(BigInteger a, BigInteger b) {
		if (b.equals(BigInteger.ZERO)) return a;
		return GCD(b, a.mod(b));
	}

	// LCM of two numbers
	static BigInteger LCM(BigInteger a, BigInteger b) {
		return b.multiply(a).divide(GCD(a, b));
	}


	static void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger[] a = {sc.nextBigInteger(),sc.nextBigInteger()};
		BigInteger lcm = BigInteger.ZERO;
		a[1] = LCM(a[0], a[1]);
		n-=2;
		while (n-->0) {
			BigInteger b = a[1];
			a[1] = LCM(a[0], sc.nextBigInteger());
			a[0] = b;
		}
		System.out.println(a[1]);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}