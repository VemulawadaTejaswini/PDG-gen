import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		long ans = Long.MAX_VALUE;
		int end = 1 << n;
		for (int i = 0; i < end; i++) {
			long val = 0;
			int now = 0;
			int cnt = 0;
			for (int j = 0; j < n; j++) {
				if ((i >> j & 1) == 1) {
					val += Math.max(now + 1 - a[j], 0);
					now = Math.max(now + 1, a[j]);
					cnt++;
				} else {
					now = Math.max(now, a[j]);
				}
			}
			if (cnt >= k) {
				ans = Math.min(ans, val);
			}
		}
		System.out.println(ans);
	}
}
