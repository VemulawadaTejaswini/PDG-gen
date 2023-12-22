import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = gcd(a, b);
		int count = 1;
		for (long i = 2; i * i <= x; i++) {
			if (x % i == 0) {
				count++;
				while (x % i == 0) {
					x /= i;
				}
			}
		}
		if (x > 1) {
			count++;
		}
		System.out.println(count);
	}
	
	static long gcd(long a, long b) {
		if (a % b == 0) {
			return b;
		} else {
			return gcd(b, a % b);
		}
	}
}
