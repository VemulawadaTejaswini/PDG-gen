import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		Integer[] a = new Integer[n];
		Integer[] b = new Integer[n];
		Integer[] c = new Integer[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(c);
		long ans = 0, aa, cc;
		for (int i = 0; i < n; i++) {
			aa = ~Arrays.binarySearch(a, b[i], (x, y) -> x.compareTo(y) >= 0 ? 1 : -1);
			cc = n - ~Arrays.binarySearch(c, b[i], (x, y) -> x.compareTo(y) > 0 ? 1 : -1);
			ans += aa * cc;
		}
		System.out.println(ans);
	}
}