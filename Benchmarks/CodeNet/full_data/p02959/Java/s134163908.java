import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = arrayInt(sc, n + 1);
		int[] b = arrayInt(sc, n);
		sc.close();
		int[] reva = new int[n + 1];
		int[] revb = new int[n];
		for (int i = 0; i < n; i++) {
			revb[i] = b[n - i - 1];
		}
		for (int i = 0; i < n + 1; i++) {
			reva[i] = a[n - i];
		}
		int wa = 0;
		for (int i = 0; i < n + 1; i++) {
			wa += a[i];
		}
		int prev = 0;
		for (int i = 0; i < n; i++) {
			if (reva[i] > prev) {
				reva[i] -= prev;
				prev = 0;
			} else {
				reva[i] = 0;
			}
			if (reva[i] > revb[i]) {
				reva[i] -= revb[i];
				prev = 0;
			} else {
				prev = revb[i] - reva[i];
				reva[i] = 0;
			}
		}
		if (reva[n] > prev) {
			reva[n] -= prev;
			prev = 0;
		} else {
			reva[n] = 0;
		}
		int wa2 = 0;
		for (int i = 0; i < n + 1; i++) {
			wa2 += reva[i];
		}
		System.out.println(wa - wa2);
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
