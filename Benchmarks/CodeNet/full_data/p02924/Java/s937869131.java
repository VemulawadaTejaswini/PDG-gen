import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		System.out.println(solve(1, N));
	}

	private static long solve(long a, long b) {
		if (a >= b) return 0;
		if (b == 2) return 1;

		long p = 1;
		for (long i = 2; i * i <= b + 1; i++) {
			if ((b + 1) % i == 0) {
				p = (b + 1) / i;
				break;
			}
		}

		long v = b * (b - 1) / 2 - (p - 1) * (p - 2) / 2;
		return solve(a, p - 1) + v;
	}
}
