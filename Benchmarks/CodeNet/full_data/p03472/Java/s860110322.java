import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long h = Integer.parseInt(sc.next());
		long[] a = new long[n];
		long[] b = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sc.next());
			b[i] = Long.parseLong(sc.next());
		}
		Arrays.sort(a);
		Arrays.sort(b);
		int ans = 0;
		for (int i = n - 1; i >= 0 && a[n - 1] <= b[i]; i--) {
			h -= b[i];
			ans++;
			if (h <= 0)
				break;
		}
		while (h > 0) {
			h -= a[n - 1];
			ans++;
		}
		System.out.println(ans);
	}
}