import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = arrayInt(sc, n);
		sc.close();
		Arrays.sort(d);
		int[] rui = new int[n];
		for (int i = 0; i < n; i++) {
			rui[d[i]]++;
		}
		long ans = 1;
		long mod = 998244353l;
		boolean can = true;
		boolean end = false;
		if (rui[0] != 1) {
			can = false;
		}
		for (int i = 1; i < n; i++) {
			ans *= Math.pow(rui[i - 1], rui[i]);
			ans %= mod;
			if (rui[i] == 0) {
				end = true;
			}
			if (rui[i] != 0 && end) {
				can = false;
			}
		}
		System.out.println(can ? ans : 0);
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
