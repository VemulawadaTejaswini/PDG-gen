import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int q = scanner.nextInt();
			scanner.nextLine();
			long[] s = new long[a];
			for (int i = 0; i < a; i++) {
				s[i] = scanner.nextLong();
				scanner.nextLine();
			}
			long[] t = new long[b];
			for (int i = 0; i < b; i++) {
				t[i] = scanner.nextLong();
				scanner.nextLine();
			}
			long[] result = new long[q];
			for (int i = 0; i < q; i++) {
				long x = scanner.nextLong();
				result[i] = nearest(x, s, t);
			}
			Arrays.stream(result).forEach(System.out::println);
		}
	}

	private static long nearest(long x, long[] s, long[] t) {
		long s1 = 0L, s2 = 0L;
		if (x <= s[0]) {
			s1 = s2 = s[0];
		} else if (x >= s[s.length - 1]) {
			s1 = s2 = s[s.length - 1];
		} else {
			for (int i = 1; i < s.length; i++) {
				if ((x >= s[i - 1]) && (x <= s[i])) {
					s1 = s[i - 1];
					s2 = s[i];
					break;
				}
			}
		}
		long t1 = 0L, t2 = 0L;
		if (x <= t[0]) {
			t1 = t2 = t[0];
		} else if (x >= t[t.length - 1]) {
			t1 = t2 = t[t.length - 1];
		} else {
			for (int i = 1; i < t.length; i++) {
				if ((x >= t[i - 1]) && (x <= t[i])) {
					t1 = t[i - 1];
					t2 = t[i];
					break;
				}
			}
		}
		return min(distance(x, s1, t1), distance(x, s1, t2), distance(x, s2, t1), distance(x, s2, t2));
	}

	private static long distance(long x, long s1, long t1) {
		return Math.abs(s1 - t1) + min(Math.abs(s1 - x), Math.abs(t1 - x));
	}

	private static long min(long... x) {
		long min = Long.MAX_VALUE;
		for (long number : x) {
			min = Math.min(min, number);
		}
		return min;
	}
}