

import java.util.Arrays;
import java.util.Scanner;

class Main {

	Scanner sc = new Scanner(System.in);
	final static long LNF = 1L << 60;
	final static double EPS = 1e-9;

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		int n = ni();
		int m = ni();
		int c = ni();

		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = ni();
		}

		int ans = 0;
		for (int i = 0; i < n; i++) {
			int total = 0;
			for (int j = 0; j < m; j++) {
				int a = ni();
				total += b[j] * a;
			}
			if (total + c > 0) {
				++ans;

			}

		}
		System.out.println(ans);
	}

	int ni() {
		return Integer.parseInt(sc.next());
	}

	long nl() {
		return sc.nextLong();
	}

	double nd() {
		return Double.parseDouble(sc.next());
	}

	void debug(Object... os) {
		System.out.println(Arrays.deepToString(os));
	}

	static class Util {
		static <T extends Comparable<T>> T max(T a, T b) {
			if (a.compareTo(b) > 0) {
				return a;
			} else {
				return b;
			}
		}

		static <T extends Comparable<T>> T min(T a, T b) {
			if (a.compareTo(b) < 0) {
				return a;
			} else {
				return b;
			}
		}
	}

}
