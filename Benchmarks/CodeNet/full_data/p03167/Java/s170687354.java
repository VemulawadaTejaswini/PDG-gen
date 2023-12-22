import java.util.*;

public class Main {
	static long MOD = (long) 1e9 + 7;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] grid = new int[h][w];
		for (int i = 0; i < h; i++) {
			String line = sc.next();
			for (int j = 0; j < w; j++) {
				grid[i][j] = (line.charAt(j) == '.' ? 0 : 1);
			}
		}
		sc.close();

		final long MOD = 1000000007l;
		long[][] ans = new long[h][w];
		ans[0][0] = 1;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (grid[i][j] == 0 && (i != 0 || j != 0)) {
					ans[i][j] = (i >= 1 ? ans[i - 1][j] : 0) + (j >= 1 ? ans[i][j - 1] : 0);
					ans[i][j] %= MOD;
				}
			}
		}
		/*
		 * for (int i = 0; i < h; i++) { for (int j = 0; j < w; j++) {
		 * System.out.print(ans[i][j] + " "); } System.out.println(); }//
		 */
		System.out.println(ans[h - 1][w - 1]);
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
