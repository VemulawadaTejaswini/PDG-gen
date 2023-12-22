import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<U> aa = new ArrayList<>();
		ArrayList<U> bb = new ArrayList<>();
		ArrayList<U> cc = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			long a = in.nextLong();
			long b = in.nextLong();

			U u = new U();
			u.a = a;
			u.b = b;

			aa.add(u);
			bb.add(u);
			cc.add(u);
		}
		Collections.sort(aa, (u1, u2) -> {
			if (u1.a > u2.a) {
				return 1;
			} else if (u1.a < u2.a) {
				return -1;
			} else if (u1.b > u2.b) {
				return 1;
			} else if (u1.b < u2.b) {
				return -1;
			} else {
				return 0;
			}
		});
		Collections.sort(bb, (u1, u2) -> {
			if (u1.b > u2.b) {
				return 1;
			} else if (u1.b < u2.b) {
				return -1;
			} else if (u1.a > u2.a) {
				return 1;
			} else if (u1.a < u2.a) {
				return -1;
			} else {
				return 0;
			}
		});
		BigInteger r = BigInteger.ZERO;
		U u;
		while (!cc.isEmpty()) {
			for (int i = 0; i < n; i++) {
				u = aa.get(i);
				if (cc.remove(u)) {
					r = r.add(BigInteger.valueOf(u.a));
					//aa.remove(u);
					//bb.remove(u);
					break;
				}
			}
			for (int i = 0; i < n; i++) {
				u = bb.get(i);
				if (cc.remove(u)) {
					r = r.subtract(BigInteger.valueOf(u.b));
//					aa.remove(u);
//					bb.remove(u);
					break;
				}
			}
		}


		in.close();
		System.out.println(r);
	}

}

class U {
	long a;
	long b;
}