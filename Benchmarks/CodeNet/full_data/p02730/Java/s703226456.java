import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 数値
		String s = sc.next();
		boolean ok = false;
		if (s.equals((new StringBuilder(s).reverse()).toString())) {

			String ss = s.substring(0, (s.length() - 1) / 2);
			if (ss.equals((new StringBuilder(ss).reverse()).toString())) {
				String sss = s.substring((s.length() + 3) / 2 - 1, s.length());
				if (sss.equals((new StringBuilder(sss).reverse()).toString())) {
					ok = true;
				}
			}
		}
		if (ok) {
			out("Yes");
		} else {
			out("No");
		}

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
