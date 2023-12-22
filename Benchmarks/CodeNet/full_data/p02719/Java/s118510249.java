import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		sc.close();
		if (n == 0) {
			System.out.println(0);
			return;
		}

		long bn = Long.MAX_VALUE;
		while (true) {
			bn = n;
			n = m(n, k);
			if (bn >= n) {
				n = Math.min(k - n, n);
				System.out.println(n);
				break;
			}
		}

	}

	public static long m(long n, long k) {
		return n - ((long) (n / k)) * k;
	}
}
