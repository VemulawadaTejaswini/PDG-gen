import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();

		// a >= b にする
		if ( a < b ) {
			long temp = a;
			a = b;
			b = temp;
		}
		
		long gcd = getGCD(a, b);
		HashSet<Long> set = new HashSet<>();
		long div = 1L;
		while ( div <= gcd ) {
			if ( a % div == 0 && b % div == 0 ) {
				a /= div;
				b /= div;
				set.add(div);
				gcd /= div;
			}
			div++;
		}
		System.out.println(set.size());
		in.close();
	}

	private static long getGCD(long a, long b) {
		long r = a % b;
		if ( r == 0 ) {
			return b;
		} else {
			return getGCD(b, r);
		}
	}
}