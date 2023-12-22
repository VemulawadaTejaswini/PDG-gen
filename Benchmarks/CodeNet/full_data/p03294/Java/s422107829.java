import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextLong();
		long x = 1, y = 1;
		for(int i = 0 ; i < n ; i++) {
			x = gcd_lcm.gcd(x, a[i]); // 最大公約数
			y = gcd_lcm.lcm(y, a[i]); // 最小公倍数
		}
		long z = y - 1;
		long zz = y + 1;
		long w = 0;
		long ww = 0;
		for(int i = 0 ; i < n ; i++) {
			w += z % a[i];
			ww += zz % a[i];
		}
		System.out.println(Math.max(w, ww));
	}
}

class gcd_lcm {
	static long gcd(long a, long b) {
		if(b == 0) return a;
		return gcd(b, a % b);
	}
	static long lcm(long a, long b) {
		return a / gcd(a, b) * b;
	}
}