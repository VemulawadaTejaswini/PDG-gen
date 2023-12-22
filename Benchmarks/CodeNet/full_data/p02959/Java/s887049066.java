import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		int[] b = new int[n + 1];
		for (int i = 0; i < n + 1; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		b[n] = 0;
		sc.close();
		long ans = 0;
		for (int i = n; i >= 0; i--) {
			if (a[i] > 0) {
				if (a[i] >= b[i]) {
					a[i] -= b[i];
					ans += b[i];
					b[i] = 0;
				} else {// 斃しきれる
					ans += a[i];
					a[i] = 0;
				}
			}
			if (a[i] > 0) {
				if (i != 0) {
					if (a[i] >= b[i - 1]) {
						a[i] -= b[i - 1];
						ans += b[i - 1];
						b[i] = 0;
					} else {// 斃しきれる
						ans += a[i];
						b[i - 1] -= a[i];
						a[i] = 0;
					}
				}
			}
		}
		System.out.println(ans);
	}

	public static int[] arrayInt(Scanner sc, int n) {
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		return array;
	}

	public static long[] arrayLong(Scanner sc, int n) {
		long[] array = new long[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextLong();
		}
		return array;
	}

	public static double[] arrayDouble(Scanner sc, int n) {
		double[] array = new double[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextDouble();
		}
		return array;
	}
}
