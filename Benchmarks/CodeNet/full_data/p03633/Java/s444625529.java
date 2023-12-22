import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] t = new long[n];
		for(int i = 0 ; i < n ; i++) t[i] = sc.nextLong();
		long ans = 1;
		for(int i = 0 ; i < n ; i++) {
			ans = ans / gcd(ans, t[i]) * t[i];
		}
		System.out.println(ans);
	}

	static long gcd(long x, long y) {
		if(x < y) {
			long w = x;
			x = y;
			y = w;
		}
		if(y == 0) return x;
		return gcd(y, x % y);
	}

}
