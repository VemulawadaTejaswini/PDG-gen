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
		int p, q;
		p = q = 0;
		max = min = a[0] - 1;
		for (int j = 0; j < n; j++) {
			int s = a[j] - j - 1;
			if (max < s) {
				max = s;
				p = j;
			}
			if (min > s) {
				min = s;
				q = j;
			}
		}
		int abs = 0;
		int max2 = a[p] - p - 1;
		int min2 = a[q] - q - 1;
		int r;
		for (int l = 0; l < n; l++) {
			abs = abs + Math.abs(a[l] - l - 1 - min2);
		}
		r = abs;
		for (int k = min2 + 1; k <= max2; k++) {
			abs = 0;
			for (int l = 0; l < n; l++) {
				abs = abs + Math.abs(a[l] - l - 1 - k);
			}
			if (r > abs)
				r = abs;
		}
		System.out.println(r);
	}
}
