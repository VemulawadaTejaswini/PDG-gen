import java.io.*;
import java.util.*;

class Main {

	private static long f(long n, long x) {
		if (n < 0) return 0;
		return n / x + 1;

	}

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		System.out.println(f(b, x) - f(a - 1, x));
	}
}
