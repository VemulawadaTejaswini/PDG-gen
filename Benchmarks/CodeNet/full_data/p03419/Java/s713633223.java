import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long ans = 0;
		if (n > m) {
			n ^= m;
			m ^= n;
			n ^= m;
		}
		if (n > 2 && m > 2) {
			System.out.println((n - 2) * (m - 2));
		} else if (n == 2 && m >= 1) {
			System.out.println(0);
		} else if (n == 1 && m == 1) {
			System.out.println(1);
		} else if (n == 1 && m >= 2) {
			System.out.println(m - 2);
		} else {
			throw new AssertionError();
		}
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
