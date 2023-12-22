import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		final int MOD = 1_000_000_007;

		long[] a = new long[n];

		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sc.next());
		}

		long sum = 0;

		for (int i = 0; i < 30; i++) {
			long cnt0 = 0;
			long cnt1 = 0;
			long key = (long) Math.pow(2, i);
			for (int j = 0; j < n; j++) {
				if ((a[j] & key) == key) {
					cnt1++;
				} else {
					cnt0++;
				}
			}

			long tmp = cnt1 * cnt0;
			tmp %= MOD;
			tmp *= (key%MOD);
			tmp %= MOD;

			sum += tmp;
			sum %= MOD;

		}
		System.out.println(sum);
		sc.close();

	}
}