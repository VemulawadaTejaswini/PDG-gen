

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		long x = sc.nextInt();
		long y = sc.nextInt();

		long a = 0;
		long b = 0;

		long d = Math.abs(x) - Math.abs(y);
		a = Math.abs(d);
		if (d <= 0) {
			if (x * y < 0) {
				b++;
			} else {
				if (y < 0) {
					b += 2;
				}
			}
		} else {
			if (x * y > 0) {
				b++;
			}
			if (x > y) {
				b++;
			}
		}
		// 出力
		U.out("" + (a + b));
	}

	static class U {
		public static final long MS = 1_000;
		public static final long NS = 1_000_000;

		public static void err(int n) {
			System.err.println(n);
		}

		public static long time() {
			return System.nanoTime();
		}

		// output
		static PrintWriter o = new PrintWriter(System.out);

		public static void add(String s) {
			o.append(s);
		}

		public static void out(String s) {
			o.append(s);
			o.flush();
		}
	}
}