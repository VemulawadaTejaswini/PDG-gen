import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long D = sc.nextLong();
		long ans = (B - A) / C + (B - A) / D - (B - A) / lcm(C, D);
		System.out.println(B - A - ans);
	}
	
	static long lcm(long m, long n) {
	    return m * n / gcd(m, n);
	}

	static long gcd (long a, long b) {
		return b > 0 ? gcd(b, a % b) : a;
	}
}
