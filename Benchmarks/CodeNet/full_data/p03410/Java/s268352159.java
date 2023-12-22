
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] a = new long[n], b = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextLong();
		}
		for (int i = 0; i < n; i++) {
			b[i] = in.nextLong();
		}

		long ans = 0;
		for (int k = 29; k >= 0; k--) {
			long tmp = 0;
			for (int i = 0; i < n; i++) {
				a[i] %= (1 << (k+1));
				b[i] %= (1 << (k+1));
			}

			Arrays.sort(b);

			int t = 1 << k;
			for (int i = 0; i < n; i++) {
				tmp += lowerBound(b, 2*t - a[i]) - lowerBound(b, 1*t - a[i]);
				tmp += lowerBound(b, 4*t - a[i]) - lowerBound(b, 3*t - a[i]);
			}

			if (tmp % 2 == 1) {
				ans |= 1 << k;
			}
		}

		System.out.println(ans);
		in.close();
	}

	public static int lowerBound(long[] a, long obj) {
		int l = 0, r = a.length - 1;
		while (r - l >= 0) {
			int c = (l + r) / 2;
			if (obj <= a[c]) {
				r = c - 1;
			} else {
				l = c + 1;
			}
		}
		return l;
	}

}