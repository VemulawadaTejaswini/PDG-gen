

import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long dif = b-a;
		long ans = dif - dif/c - dif/d + dif/lcm(c,d);
		if(a%c == 0 || a%d == 0) {
			if(b%c == 0 || b%d == 0) {
				ans --;
			}
		}
		System.out.println(ans);
		sc.close();
	}
	private static long lcm(long m, long n) {
	    return m * n / gcd(m, n);
	}
	private static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
}
