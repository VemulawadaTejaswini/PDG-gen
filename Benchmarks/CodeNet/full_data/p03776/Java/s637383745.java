import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		long[] v = new long[n];
		for (int i = 0; i < n; i++) {
			v[i] = sc.nextLong();
		}
		sc.close();

		Arrays.sort(v);
		reverse(v);
		long va = v[a - 1];
		int big = 0;
		int eq = 0;
		long sum = 0;
		for (int i = 0; i < n; i++) {
			if (v[i] > va) {
				big++;
			} else if (v[i] == va) {
				eq++;
			}
			if (i < a) {
				sum += v[i];
			}
		}
		BigDecimal bs = BigDecimal.valueOf(sum);
		BigDecimal ba = BigDecimal.valueOf(a);
		System.out.println(bs.divide(ba, 25, BigDecimal.ROUND_HALF_UP).toPlainString());

		if (big > 0) {
			System.out.println(nCr(eq, a - big));
		} else {
			long ans = 0;
			int end = Math.min(eq, b);
			for (int i = a; i <= end; i++) {
				ans += nCr(eq, i);
			}
			System.out.println(ans);
		}
	}

	static long nCr(int n, int r) {
		long val = 1;
		for (int i = 1; i <= r; i++) {
			val = val * (n - i + 1) / i;
		}
		return val;
	}

	static void reverse(long[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			long tmp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = tmp;
		}
	}
}
