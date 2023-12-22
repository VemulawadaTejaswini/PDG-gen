import java.util.Scanner;
import java.lang.Math;
class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		int max, min;
		max = min = a[0];
		for (int j = 0; j < n; j++) {
			if (max < a[j])
				max = a[j];
			if (min > a[j])
				min = a[j];
		}
		int abs, min2;
		abs = 0;
		int t = min - max;
		for (int m = 0; m < n; m++) {
			abs = abs + Math.abs(a[m] - m - 1 - t);
		}
		min2 = abs;
		for (int k = t + 1; k <= max; k++) {
			abs = 0;
			for (int l = 0; l < n; l++) {
				abs = abs + Math.abs(a[l] - l - 1 - k);
			}
			if (min2 > abs)
					min2 = abs;
		}

		System.out.println(min2);
	}
}
