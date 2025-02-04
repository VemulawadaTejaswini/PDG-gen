import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ans = new int[n];
		for (int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			ans[tmp - 1] = i + 1;
		}
		sc.close();
		for (int i = 0; i < n; i++) {
			System.out.print(ans[i]);
			if (i < n - 1)
				System.out.print(" ");
		}
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
