import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	private static int upperBound(int[] a, int st, int ed, int k) {
		if (st == ed - 1) {
			if (a[st] <= k) {
				return st + 1;
			} else {
				return st;
			}
		}

		int m = (ed - st) / 2 + st;
		if (a[m] <= k) {
			// 右側
			return upperBound(a, m, ed, k);
		} else {
			// 左側
			return upperBound(a, st, m, k);
		}
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();

		int[] A = nextIntArray(sc, N);
		int[] B = nextIntArray(sc, N);
		int[] C = nextIntArray(sc, N);

		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);

		sc.close();

		int[] x = new int[N];
		for (int b = 0; b < N; b++) {
			x[b] = N - upperBound(C, 0, N, B[b]);
		}

		for (int b = N - 2; b >= 0; b--) {
			x[b] += x[b + 1];
		}

		int ans = 0;

		for (int a = 0; a < N; a++) {
			int i = upperBound(B, 0, N, A[a]);
			if (i < x.length) {
				ans += x[i];
			}
		}
		out.println(ans);
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray(Scanner sc, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
