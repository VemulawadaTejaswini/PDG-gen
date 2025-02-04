import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int n = sc.nextInt();
		int[] a = arrayInt(sc, n);
		sc.close();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}
		System.out.println(sum >= h ? "Yes" : "No");
	}

	public static int arrayMax(int[] array) {
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > ans)
				ans = array[i];
		}
		return ans;
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