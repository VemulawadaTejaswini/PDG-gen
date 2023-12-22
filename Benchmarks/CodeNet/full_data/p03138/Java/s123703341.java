import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		long[] b = Arrays.copyOf(a, n);
		long x = 0;
		long now = 0;
		while (x + Math.pow(2, now) <= k) {
			int sum = 0;
			for (int i = 0; i < n; i++) {
				if (b[i] % 2 == 0) {
					sum++;
				}
				b[i] /= 2;
			}
			if (n % 2 == 0) {
				if (sum > n / 2) {
					x += Math.pow(2, now);
				}
			} else {
				if (sum >= n / 2 + 1) {
					x += Math.pow(2, now);
				}
			}
			now++;
		}
		long ans = 0;
		for (int i = 0; i < n; i++) {
			ans += x ^ a[i];
		}
		System.out.println(ans);
	}
}