import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static String Y = "Yes";
	public static String N = "No";
	public static String I = "IMPOSSIBLE";
	public static String B = "Bad";
	public static String G = "Good";
	public static long MOD = (long) (Math.pow(10, 9) + 7);
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = ni();

		int counter = 0;

		HashMap<Long, Integer> hs = new HashMap<>();
		// int[] clist = new int[1000000000];

		for (int i = 0; i < n; i++) {
			long num = nl();
			if (hs.get(num) == null) {
				hs.put(num, 1);
			} else {

				int now = hs.get(num);
				if (now == (int) num) {
					counter++;

				} else {

					hs.put(num, hs.get(num) + 1);
				}
			}
			//			if (clist[num - 1] <= num) {
			//				clist[num - 1]++;
			//			} else {
			//				count++;
			//			}
		}

		for (Long key : hs.keySet()) {
			if (key != (int) hs.get(key)) {
				counter += (int) hs.get(key);
			}
		}

		out(counter);

	}

	public static int count(String search, String text) {
		int nsearch = search.length();
		int ntext = text.length();
		int count = 0;

		for (int i = 0; i <= ntext - nsearch + 1; i++) {
			for (int j = i + nsearch - 1; j < ntext; j++) {
				if (search.equals(text.substring(i, j + 1))) {
					count++;
				}
			}
		}

		return count;
	}

	/*
	 * 以下メソッド集
	 */
	static int ni() {
		return sc.nextInt();
	}

	static long nl() {
		return sc.nextLong();
	}

	static double nd() {
		return sc.nextDouble();
	}

	static String n() {
		return sc.next();
	}

	static char[] nc() {
		return sc.next().toCharArray();
	}

	static int kaijo(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * kaijo(n - 1);
		}
	}

	static int fib(int n) {
		return (n == 1 || n == 0) ? n : fib(n - 2) + fib(n - 1);
	}

	static long lcm(long m, long n) {

		return m * n / gcd(m, n);
	}

	static int lcm(int m, int n) {

		return m * n / gcd(m, n);
	}

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

	static void out(char info) {
		System.out.println(info);
	}

	static void out(Object obj) {
		System.out.println(obj.toString());
	}

	static void outn(String info) {
		System.out.print(info);
	}

	static void outn(int info) {
		System.out.print(info);
	}

	static void outn(double info) {
		System.out.print(info);
	}

	static void outn(long info) {
		System.out.print(info);
	}

	static void outn(char info) {
		System.out.print(info);
	}

	static int max(int a, int b) {
		return Math.max(a, b);
	}

	static long max(long a, long b) {
		return Math.max(a, b);
	}

	static int min(int a, int b) {
		return Math.min(a, b);
	}

	static long min(long a, long b) {
		return Math.min(a, b);
	}
}

class XY {
	int h;
	int c;

	XY(int h, int c) {
		this.h = h;
		this.c = c;
	}
}
