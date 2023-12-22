
import java.util.Arrays;
import java.util.Scanner;

class Main {
	int n;
	long[] a;
	long grundy = 0;

	void run() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new long[n];
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
			grundy ^= a[i];
		}
		boolean[] flip = new boolean[64];
		for (int i = 0; i < n; ++i) {
			flip[cnt(a[i] & -a[i])] = true;
		}
		int ans = 0;
		while (grundy > 0) {
			long c = 1;
			while (2 * c <= grundy) {
				c <<= 1;
			}
			if (!flip[cnt(c)]) {
				System.out.println(-1);
				return;
			} else {
				++ans;
				while (c > 0) {
					grundy ^= c;
					c /= 2;
				}
			}
		}
		System.out.println(ans);
	}

	int cnt(long x) {
		int ret = 0;
		while (x > 0) {
			++ret;
			x /= 2;
		}
		return ret;
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}