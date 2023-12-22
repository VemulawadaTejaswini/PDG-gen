import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	long a, b, c, d;
	Set<Long> counts = new HashSet<>();

	Main(long a, long b, long c, long d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	boolean simulate() {
		if (b > d || a < b) {
			// そもそも持続不可能
			return false;
		}
		long count = a % b;
		counts.add(count);
		boolean result = false;
		while (true) {
			// 夜のフェーズ
			if (count <= c) {
				count += d;
			}
			// 昼のフェーズ
			if (count >= b) {
				count = count % b;
			} else {
				result = false;
				break;
			}
			// この段階でジャッジ
			if (counts.contains(count)) {
				result = true;
				break;
			}
			counts.add(count);
			// System.out.println(count);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = Integer.parseInt(in.nextLine());
		long[] a = new long[t];
		long[] b = new long[t];
		long[] c = new long[t];
		long[] d = new long[t];
		for (int i = 0; i < t; ++i) {
			String[] tokens = in.nextLine().split(" ");
			a[i] = Long.parseLong(tokens[0]);
			b[i] = Long.parseLong(tokens[1]);
			c[i] = Long.parseLong(tokens[2]);
			d[i] = Long.parseLong(tokens[3]);
		}
		for (int i = 0; i < t; ++i) {
			// Main ins = new Main(a[i], b[i], c[i], d[i]);

			if (calc(a[i], b[i], c[i], d[i])) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		in.close();

	}

	private static boolean calc(long a, long b, long c, long d) {
		if (b <= d && a >= b) {
			if (b == d) {
				if (a % b > c && c < b) {
					return false;
				} else {
					return true;
				}
			} else {
				long start = (long) Math.floor((double) (c - a % b) / (double) (d - b));
				start *= (d - b);
				start -= (d - b);
				for (long i = a % b + start; i < b; i = i + (d - b)) {
					if (c < i && i < b) {
						return false;
					}
				}
				return true;
			}
		}
		return false;
	}

	private static long gcd(long m, long n) {
		if (m < n)
			return gcd(n, m);
		if (n == 0)
			return m;
		return gcd(n, m % n);
	}

}