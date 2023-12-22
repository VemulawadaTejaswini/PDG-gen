import java.util.*;

public class Main {

	public static long gcd(long a, long b) {
		if (a < b) {
			long tmp = a;
			a = b;
			b = tmp;
		}
		if (b == 1)
			return b;
		long r = a % b;
		if (r == 0)
			return b;
		return gcd(b, r);
	}

	public static long lcd(long a, long b) {
		long g = gcd(a, b);
		return (a / g) * b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong(), d = sc.nextLong();
		sc.close();
		long g = lcd(c, d);
		long f = 0;
		if (a % c == 0)
			f = 1;
		long cnt = (b / c) - (a / c) + f;
		f = 0;
		if (a % d == 0)
			f = 1;
		cnt += (b / d) - (a / d) + f;
		f = 0;
		if (a % g == 0)
			f = 1;
		cnt -= (b / g) - (a / g) + f;
		cnt = b - a + 1 - cnt;
		System.out.println(cnt);
	}
}
