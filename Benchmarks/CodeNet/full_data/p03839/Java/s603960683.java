

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextLong();
		}
		long[] acm = new long[n];
		long[] opt = new long[n];
		acm[0] = a[0];
		opt[0] = (a[0] > 0 ? a[0] : 0);
		for (int i = 1; i < n; ++i) {
			acm[i] = acm[i - 1] + a[i];
			opt[i] = opt[i - 1] + (a[i] > 0 ? a[i] : 0);
		}
		long ans = 0;
		for (int i = 0; i + k - 1 < n; ++i) {
			// [0,i)[i,i+k)[i+k,n)
			long sub = opt[n - 1] - (opt[i + k - 1] - (i > 0 ? opt[i - 1] : 0));
			ans = Math.max(ans, sub);
			ans = Math.max(ans, sub + acm[i + k - 1] - (i > 0 ? acm[i - 1] : 0));
		}
		System.out.println(ans);

	}
}
