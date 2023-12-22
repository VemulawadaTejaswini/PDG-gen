import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int a = scanner.nextInt() / 2;
		int two = numFact2(a);
		long lcm = a;
		for (int i = 1; i < n; i++) {
			a = scanner.nextInt() / 2;
			lcm = lcm(lcm, a);
			if (numFact2(a) != two || lcm > m) {
				System.out.println(0);
				return;
			}

		}
		System.out.println((m / lcm + 1) / 2);
	}

	static int numFact2(int x) {
		int count = 0;
		while (x % 2 == 0) {
			count++;
			x /= 2;
		}
		return count;
	}

	static long lcm(long x, long y) {
		return x * y / gcd(x, y);
	}

	static long gcd(long x, long y) {
		if (x % y == 0)
			return y;
		return gcd(y, x % y);
	}

}
