
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	final long MODULO = 1_000_000_000 + 7;

	public void run() {
		Scanner sc = new Scanner(System.in);
		long K = sc.nextLong();
		long K_ = K;
		int N = 50;
		long[] a = new long[N];
		Arrays.fill(a, K / 50 + N - 1);
		K -= K / 50 * 50;
		while (K > 0) {
			Arrays.sort(a);
			a[0] += N;
			for (int i = 1; i < N; ++i) {
				--a[i];
			}
			Arrays.sort(a);
			--K;
		}
		System.out.println(N);
		for (int i = 0; i < N; ++i) {
			System.out.print(a[i] + (i == N - 1 ? "\n" : " "));
		}
	}

	long f(long[] a, long k) {
		int n = a.length;
		long s = 0;
		for (int i = 0; i < n; ++i) {
			if (a[i] + k <= n - 1) {
				continue;
			} else {
				long res = a[i] + k - (n - 1);
				s += (res + n) / (n + 1);
			}
		}
		return k - s;

	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
