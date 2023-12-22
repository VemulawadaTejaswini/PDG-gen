import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = arrayInt(sc, n);
		int[] b = arrayInt(sc, n);
		sc.close();
		Arrays.sort(a);
		Arrays.sort(b);
		boolean ans = true;
		for (int i = 0; i < n; i++) {
			if (a[i] > b[i]) {
				ans = false;
				break;
			}
		}
		System.out.println(ans ? "Yes" : "No");
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
