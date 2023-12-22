import java.util.Scanner;

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
		for (int m = 0; m < n; m++) {
			abs = abs + Math.abs(a[m] - m - min);
		}
		min2 = abs;
		for (int k = min + 1; k <= max; k++) {
			for (int l = 0; l < n; l++) {
				abs = abs + Math.abs(a[l] - l - k);
			}
			if (min2 > abs)
					min2 = abs;
		}

		System.out.println(min2);
	}
}
