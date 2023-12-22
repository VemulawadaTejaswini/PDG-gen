import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n - 1];
		int[] b = new int[n - 1];
		int[] in = new int[n];
		for (int i = 0; i < n - 1; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			in[a[i] - 1]++;
			in[b[i] - 1]++;
		}
		sc.close();
		int k = arrayMax(in);
		System.out.println(k);
		int[] ver = new int[n];
		int[][] color = new int[n][k];
		for (int i = 0; i < n - 1; i++) {// loop for edges
			ver[a[i] - 1]++;
			ver[b[i] - 1]++;
			for (int j = 0; j < k; j++) {
				if (color[a[i] - 1][j] != 1 && color[b[i] - 1][j] != 1) {
					System.out.println(j + 1);
					color[a[i] - 1][j] = 1;
					color[b[i] - 1][j] = 1;
					break;
				}
			}
		}
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
