import java.util.Scanner;

public class Main {
	long f(long x, long y) {
		if (x > y) {
			long tmp = x;
			x = y;
			y = tmp;
		}
		if (x == 0) {
			return -y;
		}
		return 2 * x * (y / x) + f(y % x, x);
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long x = sc.nextLong();

		System.out.println((n + f(n - x, x)));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
