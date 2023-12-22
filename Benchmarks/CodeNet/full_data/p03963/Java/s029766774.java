import java.util.*;
import java.math.BigInteger;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger k = sc.nextBigInteger();
		BigInteger t = BigInteger.ONE;
		for (int i=0; i<n; i++) {
			t=t.multiply(k);
			k=k.subtract(BigInteger.ONE);
		}
		System.out.println(t);
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}