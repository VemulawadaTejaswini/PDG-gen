import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n];
		for (int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}
		Arrays.sort(d);
		int m = sc.nextInt();
		int[] t = new int[m];
		for (int i = 0; i < m; i++) {
			t[i] = sc.nextInt();
		}
		Arrays.sort(t);
		sc.close();

		System.out.println(solve(n, d, m, t));
	}

	public static String solve(int n, int[] d, int m, int[] t) {
		int cur = 0;
		for (int i = 0; i < m; i++) {
			if (t[i] > d[cur]) {
				cur++;
				i--;
			} else if (t[i] == d[cur]) {
				cur++;
			} else if (t[i] < d[cur]) {
				return "NO";
			}
		}
		return "YES";
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
