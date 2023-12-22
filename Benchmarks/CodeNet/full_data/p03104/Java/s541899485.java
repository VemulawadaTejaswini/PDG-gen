import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		sc.close();

		if (a == 0) {
			System.out.println(f(b));
		} else {
			System.out.println(f(b) ^ f(a - 1));
		}
	}

	static long f(long x) {
		long start = x / 4 * 4;
		long ret = 0;
		for (long i = start; i <= x; i++) {
			ret ^= i;
		}
		return ret;
	}
}
