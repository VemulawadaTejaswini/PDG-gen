import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		int[] t = new int[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
			t[i] = sc.nextInt();
		}
		String x = sc.next();
		sc.close();
		int ans = 0;
		boolean b = false;
		for (int i = 0; i < n; i++) {
			if (b) {
				ans += t[i];
			}
			if (s[i].equals(x)) {
				b = true;
			}
		}
		System.out.println(ans);
	}

	// 配列要素数が1だと前触れなくバグるので注意！！！REりたくなければ要素数を保証するか例外処理を入れろ！！！
	public static long gcd(final long[] param) {
		final int len = param.length;
		long g = gcd(param[0], param[1]);
		for (int i = 1; i < len - 1; i++) {
			g = gcd(g, param[i + 1]);
		}
		return g;
	}

	public static long gcd(long a, long b) {
		// a > b にする(swap)
		if (a < b) {
			a = a ^ b;
			b = a ^ b;
			a = a ^ b;
		}
		// ユークリッドの互除法
		long r = -1;
		while (r != 0) {
			r = a % b;
			a = b;
			b = r;
		}

		return a; // b には r=0 の値が入るため、a を返す
	}

	public static long lcm(long m, long n) {
		return m * n / gcd(m, n);
	}

	public static long lcm(final int[] param) {
		final int len = param.length;
		long l = lcm(param[0], param[1]);
		for (int i = 1; i < len - 1; i++) {
			l = lcm(l, param[i + 1]);
		}
		return l;
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
