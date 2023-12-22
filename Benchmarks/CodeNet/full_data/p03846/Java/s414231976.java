import java.util.Arrays;
import java.util.Scanner;

public class Main {
	boolean check(int[] a) {
		int n = a.length;
		if (a.length % 2 == 0) {
			int k = 1;
			for (int i = 0; i < n; i++) {
				if (a[i] != k) {
					return false;
				}
				if (i % 2 != 0) {
					k += 2;
				}
			}
		} else {
			int k = 0;
			for (int i = 0; i < n; i++) {
				if (a[i] != k) {
					return false;
				}
				if (i % 2 == 0) {
					k += 2;
				}
			}
		}
		return true;
	}

	long pow(int k, long MOD) {
		if (k == 0) {
			return 1;
		}
		long t = pow(k / 2, MOD);
		t *= t;
		t %= MOD;
		if (k % 2 != 0) {
			t *= 2;
			t %= MOD;
		}
		return t;
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		long MOD = 1_000_000_000 + 7;
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		if (check(a)) {
			System.out.println(pow(n / 2, MOD));
		} else {
			System.out.println(0);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
