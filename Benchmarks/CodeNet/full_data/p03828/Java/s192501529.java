import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		long[] cnt = new long[n + 1];
		final int MOD = 1000000007;

		for (int i = 2; i <= n; i++) {
			int tmp = i;
			int div = 2;
			while (tmp != 1) {
				if (tmp % div == 0) {
					cnt[div]++;
					tmp /= div;
				} else {
					div++;
				}
			}
		}

		long sum = 1;
		for (int i = 2; i <= n; i++) {
			sum *= (cnt[i] + 1);
			sum %= MOD;
			//			System.out.println(cnt[i]);
		}

		System.out.println(sum);
		sc.close();
	}
}