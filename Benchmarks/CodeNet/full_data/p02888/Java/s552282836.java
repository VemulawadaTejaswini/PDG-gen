import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);
		int count = 0;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				int ab = a[i] + a[j];
				int idx = lowerBound(a, ab);
				count += (idx - j);
			}
		}
		System.out.println(count);
	}

	private static int lowerBound(int[] a, int x) {
		int l = 0;
		int r = a.length;
		while (r - l > 1) {
			int mid = (l + r) / 2;
			if (a[mid] < x) {
				l = mid;
			} else {
				r = mid;
			}
		}
		return l;
	}
}
