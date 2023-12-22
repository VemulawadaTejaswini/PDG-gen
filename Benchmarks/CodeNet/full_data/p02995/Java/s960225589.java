import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long D = sc.nextLong();
		
		System.out.println(count(B, C, D) - count(A-1, C, D));
		sc.close();
	}
	
	static long gcd(long a, long b) {
		return a==0 ? b : gcd(b%a, a);
	}
	
	static long lcm(long a, long b) {
		return a*b/gcd(a,b);
	}
	
	static long count(long x, long c, long d) {
		return x - x/c - x/d + x/lcm(c,d);
	}
}