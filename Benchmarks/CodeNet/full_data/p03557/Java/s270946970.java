import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] count) {

		Scanner scan = new Scanner(System.in);

		int n = Integer.parseInt(scan.next());

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(scan.next());
		}
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(scan.next());
		}
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = Integer.parseInt(scan.next());
		}

		scan.close();

		// start
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);

		long ans = 0;
		for (int i = 0; i < n; i++) {
			ans += (binarySearchA(a, b[i]) + 1) * (n - binarySearchC(c, b[i]));
		}

		System.out.println(ans);

	}

	private static long binarySearchA(int[] array, int key) {
		int ok = -1;
		int ng = array.length;

		while (ng - ok > 1) {
			int mid = (ok + ng) / 2;
			if (array[mid] < key) {
				ok = mid;
			} else {
				ng = mid;
			}
		}

		return ok;

	}

	private static long binarySearchC(int[] array, int key) {
		int ng = -1;
		int ok = array.length;

		while (ok - ng > 1) {
			int mid = (ok + ng) / 2;
			if (array[mid] > key) {
				ok = mid;
			} else {
				ng = mid;
			}
		}

		return ok;
	}

}
