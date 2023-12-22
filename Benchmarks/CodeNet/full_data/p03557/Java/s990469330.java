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
			ans += binarySearchA(a, b[i]) * binarySearchC(c, b[i]);
		}

		System.out.println(ans);

	}

	private static long binarySearchA(int[] array, int key) {
		int result = Arrays.binarySearch(array, key);
		// System.out.println(result);
		if (result >= 0) {
			return result;
		} else {

			return -(result + 1);
		}

	}

	private static long binarySearchC(int[] array, int key) {
		int result = Arrays.binarySearch(array, key);
		// System.out.println(result);
		if (result >= 0) {
			return array.length - (result + 1);
		} else {

			return array.length + (result + 1);
		}
	}

}
