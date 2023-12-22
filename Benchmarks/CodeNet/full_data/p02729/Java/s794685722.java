import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 数値
		int n = sc.nextInt();
		int m = sc.nextInt();
		int count = 0;

		if (n < 2) {

		} else {
			count += n * (n - 1) / 2;
		}

		if (m < 2) {

		} else {
			count += m * (m - 1) / 2;
		}

		out(count);

	}

	/*
	 * 以下メソッド集
	 */

	static long gcd(long a, long b) {
		return (b == 0) ? a : gcd(b, a % b);
	}

	static int gcd(int a, int b) {
		return (b == 0) ? a : gcd(b, a % b);
	}

	static void out(String info) {
		System.out.println(info);
	}

	static void out(int info) {
		System.out.println(info);
	}

	static void out(double info) {
		System.out.println(info);
	}

	static void out(long info) {
		System.out.println(info);
	}

}
