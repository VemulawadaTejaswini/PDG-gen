import java.util.*;
import java.util.regex.*;

public class Main {
	
	public static void main(String... args) {
		System.out.println(toString(genPrimes(55555, scanInt())));
	}
	
	private static String toString(int... nums) {
		StringBuilder buff = new StringBuilder();
		for (int n : nums) {
			if (0 < buff.length()) buff.append(' ');
			buff.append(n);
		}
		return buff.toString();
	}
	
	private static int[] genPrimes(int max, int N) {
		int[] primes = new int[N];
		int p = 0;
		for (int i = 11; i <= max && p < N; i += 2) {
			if (i % 5 != 1) continue;
			if (isPrime(i)) {
				primes[p] = i;
				++p;
			}
		}
		return primes;
	}
	
	private static boolean isPrime(int n) {
		int m = n / 3;
		for (int i = 3; i < m; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static final Scanner SC = new Scanner(System.in);

	private static int scanInt() {
		return SC.nextInt();
	}

	private static  String scanString() {
		return SC.next();
	}
}
