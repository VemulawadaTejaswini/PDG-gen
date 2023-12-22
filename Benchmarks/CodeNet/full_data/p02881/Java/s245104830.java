import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		long save = n;
		ArrayList<Long> list = new ArrayList<Long>();
		long ans = Long.MAX_VALUE;
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				long tmp = i + (n / i);
				if (tmp < ans) {
					ans = tmp;
				}
			}
		}
		System.out.println(ans - 2);
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
