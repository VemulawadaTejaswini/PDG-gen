import java.util.Scanner;

public class Main {

	public static boolean calcThisLevel(long[] a, long mod, long ans) {
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % mod == ans) {
				cnt++;
				a[i] -= ans;
			}
		}
		if (cnt == a.length * 2 / 3)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] a = new long[N];
		long MaxA = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextLong();
			if (a[i] > MaxA)
				MaxA = a[i];
		}
		MaxA *= 2;
		sc.close();

		if (N % 3 != 0) {
			System.out.println("No");
			return;
		}

		long mod = 2;
		long ans = 1;
		do {
			if (!calcThisLevel(a, mod, ans)) {
				System.out.println("No");
				return;
			}
			mod *= 2;
			ans *= 2;
		} while (mod < MaxA);

		System.out.println("Yes");
		return;
	}
}