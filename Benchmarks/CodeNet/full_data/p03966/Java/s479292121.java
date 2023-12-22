import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a = sc.nextInt();
		long b = sc.nextInt();
		for (int i = 1; i < n; i++) {
			long aa = sc.nextInt();
			long bb = sc.nextInt();
			if ((double)a  * bb >= (double)b * aa) {
				if (a % aa != 0) {
					a += aa - (a % aa);
				}
				b = a / aa * bb;
			} else {
				if (b % bb != 0) {
					b += bb - (b % bb);
				}
				a = b / bb * aa;
			}
		}
		System.out.println(a + b);
	}
}
