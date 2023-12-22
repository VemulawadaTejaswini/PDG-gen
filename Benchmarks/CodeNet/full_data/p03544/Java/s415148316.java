import java.util.*;
import java.math.BigInteger;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt()-1;
		BigInteger[] c = {new BigInteger("2"), BigInteger.ONE};
		while (N-->0) {
			BigInteger t = c[0].add(c[1]);
			c[0] = c[1];
			c[1] = t;
		}
		System.out.println(c[1]);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}