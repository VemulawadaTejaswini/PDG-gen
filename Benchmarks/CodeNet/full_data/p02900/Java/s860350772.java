import java.util.ArrayList;
import java.util.Arrays;
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

		int gcd = (int)getGCD(a, b);
		boolean primeNumber[] = new boolean[gcd + 1];
		Arrays.fill(primeNumber, true);
		primeNumber[0] = primeNumber[1] = false;
		ArrayList<Integer> plist = new ArrayList<Integer>();

		int idx = 2;
		while ( idx <= gcd ) {
			while ( idx < gcd && primeNumber[idx] == false ) {
				idx++;
			}
			plist.add(idx);
			for ( int i = idx * 2; i <= gcd; i += idx ) {
				primeNumber[i] = false;
			}
			idx++;
		}
		
		long cnt = 1;
		for ( Integer div : plist ) {
			if ( a % div == 0 && b % div == 0 ) cnt++;
			else continue;

			while ( a % div == 0 && b % div == 0 ) {
				a /= div;
				b /= div;
			}
		}

		System.out.println(cnt);
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