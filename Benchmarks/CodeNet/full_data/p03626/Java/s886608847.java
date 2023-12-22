import java.util.*;
import java.math.BigInteger;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String r = sc.next();
		String q = sc.next();
		BigInteger t = BigInteger.ONE;
		BigInteger m = new BigInteger("1000000007");
		BigInteger two = new BigInteger("2");
		BigInteger three = new BigInteger("3");
		int p = -1; // Previous config 0 - 2x1, 1 - 1x2
		for (int i=0; i<N; i++) {
			if (r.charAt(i)==q.charAt(i)) {
				if (p==-1) t = new BigInteger("3");
				if (p==0) t = t.multiply(two).mod(m);
				p=0;
			} else { 
				if (p==-1) t = new BigInteger("6");
				if (p==0) t = t.multiply(two).mod(m);
				if (p==1) t = t.multiply(three).mod(m);
				p=1; i++;
			}
		}
		System.out.println(t);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}