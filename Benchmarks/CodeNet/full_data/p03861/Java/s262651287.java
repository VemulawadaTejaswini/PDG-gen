import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();

		if (x > b) {
			System.out.println(0);
			return;
		}

		if (a % x == 0) {
			System.out.println((b - a) / x + 1);
			return;
		}

		if (a == b) {
			System.out.println((a % x == 0) ? 1 : 0);
			return;
		}

		long c = b - a - (x - a % x);
		if (c < 0) {
			System.out.println(0);
			return;
		}

		System.out.println(c / x + 1);
	}
}
