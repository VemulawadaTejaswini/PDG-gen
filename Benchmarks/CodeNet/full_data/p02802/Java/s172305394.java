import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] p = new int[m];
		String s[] = new String[m];
		for (int i = 0; i < m; i++) {
			p[i] = sc.nextInt();
			s[i] = sc.next();
		}
		sc.close();
		int[] pen = new int[n];
		boolean[] aca = new boolean[n];
		for (int i = 0; i < n; i++) {
			pen[i] = -1;
		}

		for (int i = 0; i < m; i++) {
			int tmp = p[i] - 1;
			if (s[i].equals("WA")) {
				if (!aca[tmp]) {
					pen[tmp] = pen[tmp] == -1 ? 1 : pen[tmp] + 1;
				}
			} else {
				pen[tmp] = pen[tmp] == -1 ? 0 : pen[tmp];
				aca[tmp] = true;
			}
		}

		int ac = 0;
		int wa = 0;
		for (int i = 0; i < n; i++) {
			if (pen[i] >= 0) {
				ac++;
				wa += pen[i];
			}
		}
		System.out.println(ac + " " + wa);

	}

	public static long modFactorial(long n, long mod) {
		long ans = 1;
		for (int i = 1; i <= n; i++) {
			ans *= i;
			ans %= mod;
		}
		return ans;
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
