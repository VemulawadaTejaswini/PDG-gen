import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		Arrays.parallelSort(a);

		int sup = a[n - 1];
		int inf = -1;
		int mid;
		while (sup - inf > 1) {
			mid = (sup + inf) / 2;
			if (count(mid, n, a) <= m) {
				sup = mid;
			} else {
				inf = mid;
			}
			;
		}

		long sum = 0;
		for (int i = 0; i < n; i++) {
			while (a[i] > sup) {
				a[i] >>= 1;
				m--;
			}
			sum += a[i];
		}

		sum -= (long) (sup - sup / 2) * m;

		System.out.println(sum);
	}

	static int count(int threshold, int n, int[] a) {
		int count = 0;
		for (int i = 0, x; i < n; i++) {
			x = a[i];
			while (x > threshold) {
				x >>= 1;
				count++;
			}
		}
		return count;
	}

}
