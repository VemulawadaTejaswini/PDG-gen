package atcoder;

import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();

		System.out.println(ans(n,a,b));
		sc.close();
	}
	
	public static long ans(long n, long a, long b) {
		if (a > b) {
			return 0;
		}
		if (n == 1) {
			if (a == b) {
				return 1;
			}
			return 0;
		}
		return (b-a) * (n-2) + 1;
	}
}