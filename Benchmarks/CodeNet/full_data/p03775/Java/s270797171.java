import java.util.Scanner;

public class Main {
	int digit(long k) {
		int ret = 0;
		while (0 < k) {
			k /= 10;
			ret++;
		}
		return ret;
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long min = 1 << 20;
		for (long i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				min = Math.min(min, Math.max(digit(i), digit(n / i)));
			}
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
