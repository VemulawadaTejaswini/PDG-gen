import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static String Y = "Yes";
	public static String N = "No";
	public static long MOD = (long) (Math.pow(10, 9) + 7);
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = ni();
		long a[] = new long[n];
		long b[] = new long[n];

		long s = 0;
		int count = 0;

		long sumA = 0;
		long sumB = 0;

		for (int i = 0; i < n; i++) {
			a[i] = nl();
			sumA += a[i];
		}

		for (int i = 0; i < n; i++) {
			b[i] = nl();
			sumB += b[i];
		}

		if (sumA < sumB) {
			out(-1);
			return;
		}

		/*
		 * ここまで準備
		 */
		ArrayList<Long> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			if (a[i] < b[i]) {
				count++;
				s += b[i] - a[i];
			} else {
				list.add(a[i] - b[i]);
			}
		}

		long[] num = new long[list.size()];
		int aa = 0;
		for (long l : list) {
			num[aa++] = l;
		}

		num = sort(num);
		if (s == 0) {
			out(0);
			return;
		}

		for (int i = num.length - 1; i >= 0; i--) {

			s -= num[i];
			count++;
			if (s < 0) {
				break;
			}

		}
		out(count);

	}

	/*
	 * 以下メソッド集
	 */
	static double[] sort(double[] r) {
		Arrays.sort(r);
		return r;
	}

	static void debug() {
		out("---");
	}

	static void debug(long a) {
		out("-------");
		out(a);
		out("-------");
	}

	static void debug(String a) {
		out("-------");
		out(a);
		out("-------");
	}

	static long[] sort(long[] n) {
		Arrays.sort(n);
		return n;
	}

	static int ketasuu(int n) {
		String str = "" + n;
		return str.length();
	}

	static int account(String str) {
		String target = "AC";
		int count = 0;
		int len = str.length();
		for (int i = 0; i < len - 1; i++) {
			if (target.equals(str.substring(i, i + target.length()))) {
				count++;
			}
		}
		return count;
	}

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

	static double max(double d, double e) {
		return Math.max(d, e);
	}

	static long max(long a, long b) {
		return Math.max(a, b);
	}

	static long min(long d, long e) {
		return Math.min(d, e);
	}

	static int min(int a, int b) {
		return (int) Math.min(a, b);
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
