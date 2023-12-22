import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n + 1];
		int d = 0;
		long r = 1, ans = 1;

		for (int i = 0; i < m; i++) {
			int p = sc.nextInt();
			a[p - 1] = 1;
		}

		for (int i = 0; i < n; i++) {
			if (a[i] == 1) {
				d++;
				if (d >= 2) {
					// 2段続いたら無理
					ans = 0;
					break;
				} else {
					// 1段壊れてたらそこまでのパターンを計算
					r = calc(r);
					ans = (ans * r) % 1000000007;
					r = 0;
				}
			} else if (i == (n - 1)) {
				// 最後の段でそこまでのパターンを計算
				r++;
				r = calc(r);
				ans = (ans * r) % 1000000007;
			} else {
				// 壊れてない段を数え続ける
				d = 0;
				r++;
			}
		}

		System.out.println(ans);

		sc.close();
	}

	static private long calc(final long count) {

		long a = 0, sum = 1, pre = 1, now = 1;

		if (count <= 2) {
			sum = 1;
		} else {
			while (a < count - 2) {
				a++;
				sum = pre + now;
				pre = now;
				now = sum;
			}
		}
		return sum;
	}
}
