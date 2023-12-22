import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] d = arrayLong(sc, n);
		sc.close();
		Arrays.sort(d);
		long ans = 0;
		long mod = 998244353l;
		int prev = -1;
		int prevnum = 0;
		int prevnumprev = 0;
		// System.out.println(Arrays.toString(d));
		for (int i = 0; i < n; i++) {
			if (prev == -1) {
				if (d[i] == 0) {
					prev = 0;
					prevnum = 1;
				} else {
					break;
				}
			} else if (prev == 0) {
				if (d[i] == 0) {
					break;
				} else if (d[i] == 1) {
					prev = 1;
					ans = 1;
					prevnumprev = prevnum;
					ans *= prevnumprev;
				} else {
					break;
				}
			} else {
				if (d[i] == prev) {
					prevnum++;
					ans *= prevnumprev;
					ans %= mod;
				} else if (d[i] - 1 == prev) {
					prevnumprev = prevnum;
					prevnum = 1;
					ans *= prevnumprev;
					ans %= mod;
					prev++;
				} else {
					ans = 0;
					break;
				}
			}
		}
		System.out.println(ans);
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
