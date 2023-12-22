import java.util.*;
import java.math.BigInteger;
// warm-up
// Reconciled???
public class Main {

	static BigInteger fact (BigInteger n) {
		BigInteger p = BigInteger.ONE;
		BigInteger m = new BigInteger("1000000007");
		int no = n.intValue();
		while (no-->0) {
			p = p.multiply(n).mod(m);
			n = n.subtract(BigInteger.ONE);
		}
		return p;
	}

	static void solve() {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger(), b = sc.nextBigInteger(), s = BigInteger.ZERO;
		BigInteger m = new BigInteger("1000000007");
		if (Math.abs(a.intValue()-b.intValue())==1) s = fact(a).multiply(fact(b)).mod(m); 
		else if (a.intValue()==b.intValue()) s = fact(a).multiply(fact(b)).multiply(new BigInteger("2")).mod(m);
		else { System.out.println(0); System.exit(0); }
		System.out.println(s);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}