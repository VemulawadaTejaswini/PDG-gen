import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long ab = gcd(a, b);
 
		long c = 0;
		for (long i = 2; i * i <= ab; i++) {
			if (ab % i != 0) continue;
			c++;
			while (ab % i == 0) {
				ab /= i;
			}
		}
		if (ab > 1) c++;
		System.out.println(c + 1);
	}
 
 
	private static long gcd(long a, long b) {
		while (a % b != 0) {
			long x = a % b;
			a = b;
			b = x;
		}
		return b;
	}
}