import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long x = sc.nextLong();
		sc.close();

		if (x <= n) {
			System.out.println(0);
			return;
		}

		long[] pTotal = new long[n + 1];
		pTotal[0] = 1;
		for (int i = 1; i <= n; i++) {
			pTotal[i] = pTotal[i - 1] * 2 + 1;
		}

		long total = (long) Math.pow(2, n + 2) - 3;
		if (total - n <= x) {
			System.out.println(pTotal[n]);
			return;
		}

		int n2 = n;
		long x2 = x;
		long ans = 0;
		while (n2 >= 0) {
			if (n2 == 0) {
				ans += pTotal[n2];
				break;
			}
			long mid = total / 2 + 1;
			n2--;
			if (x2 == mid) {
				ans += pTotal[n2] + 1;
				break;
			}
			if (x2 > mid) {
				ans += pTotal[n2] + 1;
				x2 -= mid;
			} else {
				x2--;
			}
			if (x2 == 0) {
				break;
			}
			total -= mid + 1;
		}
		System.out.println(ans);
	}
}
