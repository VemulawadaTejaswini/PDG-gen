package atcoder.abc077;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			int[] c = new int[n];

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
			Arrays.sort(b);
			Arrays.sort(c);

			long ans = 0;
			for (int i = 0; i < b.length; i++) {
				int b_value = b[i];

				//b_valueより小さいaの個数を求める
				int a_index = lower_bound(a, b_value);

				//b_valueより大きいcの個数を求める
				int c_index = upper_bound(c, b_value);

				ans += (long)(a_index) * (long)(n - c_index);
			}

			System.out.println(ans);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static int lower_bound(int[] arr, int value) {
		int l = 0;
		int r = arr.length - 1;

		while (l <= r) {
			int pivot = l + (r - l) / 2;
			if (arr[pivot] < value) {
				l = pivot + 1;
			} else {
				r = pivot - 1;
			}
		}

		return l;
	}

	private static int upper_bound(int[] arr, int value) {
		int l = 0;
		int r = arr.length - 1;

		while (l <= r) {
			int pivot = l + (r - l) / 2;
			if (arr[pivot] <= value) {
				l = pivot + 1;
			} else {
				r = pivot - 1;
			}
		}

		return l;
	}

}
