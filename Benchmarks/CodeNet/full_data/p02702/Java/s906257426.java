import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static String Y = "Yes";
	public static String N = "No";
	public static String I = "IMPOSSIBLE";
	public static String B = "Bad";
	public static String G = "Good";
	public static long MOD = (long) (Math.pow(10, 9) + 7);
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String s = n();
		int n = s.length();

		long num = 0;

		int count = 0;

		for (int i = 0; i <= n - 4; i++) {
			num = Long.parseLong(s.substring(i, i + 4));
			if (num % 2019l == 0l) {
				count++;
			}
			//out("1:" + num);
			for (int j = i + 4; j < n; j++) {
				long a = num * 10l + Long.parseLong(s.substring(j, j + 1));
				//out("2:" + a);
				num = (num * 10l + Long.parseLong(s.substring(j, j + 1))) % 2019l;
				//out("3:" + num);
				if (num == 0l) {
					count++;
				}
			}
		}

		//		for (int i = 1; i <= 10000; i++) {
		//			//count += count("" + (2019 * i), s); // 4(s, 2019 * i);
		//			out(2019 * i);
		//		}

		out(count);

	}

	public static int countStringInString(String search, String text) {
		Pattern pattern = Pattern.compile(search);
		Matcher matcher = pattern.matcher(text);

		int stringOccurrences = 0;
		while (matcher.find()) {
			stringOccurrences++;
		}
		return stringOccurrences;
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
