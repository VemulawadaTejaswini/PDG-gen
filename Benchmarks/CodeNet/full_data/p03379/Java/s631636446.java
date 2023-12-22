import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public int[] binarySearch(int[] a, int[] b, int n) {
		boolean[] check = new boolean[n];
		int[] aIndex = new int[n];

		for(int i = 0; i < n; i++) {
			int x = a[i];
			int index = binarySearch(check, b, x, 0, n - 1);
			aIndex[i] = index;
		}

		return aIndex;
	}

	public int binarySearch(boolean[] check, int[] a, int x, int low, int high) {
		int mid = (low + high) / 2;

		if(x == a[mid] && !check[mid]) {
			check[mid] = true;
			return mid;
		}

		if(low < high) {
			if(x < a[mid]) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
			return binarySearch(check, a, x, low, high);
		}

		return -1;
	}

	public void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] x = new int[n];
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}

		int[] y = Arrays.copyOf(x, x.length);

		Arrays.sort(x);

		int[] xIndex = binarySearch(y, x, n);

		for(int i = 0; i < n; i++) {
			int j = xIndex[i];
			if(j < (n / 2)) {
				System.out.println(x[n / 2]);
			}
			else {
				System.out.println(x[(n / 2) - 1]);
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
