import java.util.*;

public class Main {
	static long MOD = (long) 1e9 + 7;

	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		sc.close();

		long[][] dp = new long[3][n];
		dp[0][0] = a[0];
		dp[1][0] = b[0];
		dp[2][0] = c[0];
		for (int i = 1; i < n; i++) {
			dp[0][i] = Math.max(dp[1][i - 1], dp[2][i - 1]) + a[i];
			dp[1][i] = Math.max(dp[0][i - 1], dp[2][i - 1]) + b[i];
			dp[2][i] = Math.max(dp[0][i - 1], dp[1][i - 1]) + c[i];
		}
		System.out.println(Math.max(dp[0][n - 1], Math.max(dp[1][n - 1], dp[2][n - 1])));
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

	public static Integer[] arrayInteger(Scanner sc, int n) {
		Integer[] array = new Integer[n];
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
