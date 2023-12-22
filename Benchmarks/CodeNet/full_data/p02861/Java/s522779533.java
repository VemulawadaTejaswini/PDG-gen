import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] x = new double[N];
		double[] y = new double[N];
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextDouble();
			y[i] = sc.nextDouble();
		}

		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = i;
		}

		double d = 0.0;
		while (true) {
			for (int i = 0; i < N - 1; i++) {
				d += Math.sqrt(Math.pow(x[a[i + 1]] - x[a[i]], 2) + Math.pow(y[a[i + 1]] - y[a[i]], 2));
			}
			if (!nextPermutation(a)) break;
		}

		System.out.println(d / (double) fact(N));
	}

	private static int fact(int n) {
		if (n == 1) return 1;
		return n * fact(n - 1);
	}

	private static boolean nextPermutation(int[] a) {
		int n = a.length, k = n - 2, l = n - 1;
		while (k >= 0) {
			if (a[k] < a[k + 1]) break;
			k--;
		}
		if (k < 0) return false;
		while (a[l] <= a[k]) l--;
		swap(a, k, l);
		k++;
		n--;
		while (k < n) swap(a, k++, n--);
		return true;
	}

	private static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}
