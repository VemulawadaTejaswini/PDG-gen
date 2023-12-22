import java.util.Scanner;

public class Main {

	public static boolean calcThisLevel(long[] a, long[] b, long mod, long ans) {
		// bがひとつ前の位の10として
		// 0がすべて一致するか，
		// 0がすべて1になるかしないといけない
		int cnt = 0;
		int mode = 0;
		for (int i = 0; i < a.length; i++) {
			// System.out.println(a[i] + ":" + a[i] % mod);
			if (b[i] == 0) {
				if (mode == 0 && a[i] == 0)
					mode = 2;
				else
					mode = 1;
				if (mode == 1 && a[i] == 0)
					return false;
				if (mode == 2 && a[i] == 1)
					return false;
			}

			if (a[i] % mod == ans) {
				cnt++;
				a[i] -= ans;
				b[i] = 1;
			} else {
				b[i] = 0;
			}
		}
		if (cnt == a.length * 2 / 3)
			return true;
		else
			return false;
	}

	public static boolean calcThisLevel1st(long[] a, long[] b, long mod, long ans) {
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			// System.out.println(a[i] + ":" + a[i] % mod);

			if (a[i] % mod == ans) {
				cnt++;
				a[i] -= ans;
				b[i] = 1;
			} else {
				b[i] = 0;
			}
		}
		if (cnt == a.length * 2 / 3)
			return true;
		else
			return false;
	}

	public static boolean check0(long[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] a = new long[N];
		long[] b = new long[N];
		long MaxA = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextLong();
			b[i] = 0;
			if (a[i] > MaxA)
				MaxA = a[i];
		}
		MaxA *= 2;
		sc.close();

		// 9
		// 3 2 3 3 2 3 1 0 1
		// これでNoが出せないそれがWA
		// というか嘘解法

		if (check0(a)) {
			System.out.println("Yes");
			return;
		}

		if (N % 3 != 0) {
			System.out.println("No");
			return;
		}

		long mod = 2;
		long ans = 1;
		do {
			if (mod == 2) {
				if (!calcThisLevel1st(a, b, mod, ans)) {
					System.out.println("No");
					return;
				}
			} else {
				if (!calcThisLevel(a, b, mod, ans)) {
					System.out.println("No");
					return;
				}
			}
			mod *= 2;
			ans *= 2;
		} while (mod < MaxA);

		System.out.println("Yes");
		return;
	}
}