import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Long[] a = new Long[n];
		Long[] b = new Long[n];
		Long[] c = new Long[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextLong();
		}
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextLong();
		}

		Arrays.sort(a);
		Arrays.sort(c);

		long ans = 0L;
		for (int i = 0; i < n; i++) {
			ans += binarySearch(b[i], a) * (n - binarySearch(b[i] + 1, c));
		}
		System.out.println(ans);
	}

	private static long binarySearch(long key, Long[] a) {

		int left = 0;
		int right = a.length;
		int mid;

		while (left < right) {
			mid = (left + right) / 2;
			if (key == a[mid]) {
				return mid;
			} else if (key < a[mid]) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		return right;
	}
}
