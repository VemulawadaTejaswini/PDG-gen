

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		no2();
	}

	static void no2() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			BigInteger f0 = new BigInteger("2");
			BigInteger f1 = new BigInteger("1");
			BigInteger f2 = null;

			if (n == 1) {
				System.out.println(f1);
				return;
			}

			for (int i = 3; i <= n+1; i++) {
				f2 = f0.add(f1);
				f0 = f1;
				f1 = f2;
			}

			System.out.println(f2);
		}
	}
}