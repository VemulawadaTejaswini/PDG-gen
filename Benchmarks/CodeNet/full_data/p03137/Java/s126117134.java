import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] X = nextIntArray(sc, M);

		sc.close();

		if (N >= M) {
			out.println(0);
			return;
		}

		Arrays.sort(X);

		int[] r = new int[M - 1];
		for (int i = 0; i < M - 1; i++) {
			r[i] = Math.abs(X[i + 1] - X[i]);
		}

		Arrays.sort(r);

		// 距離の長いN-1個の区間は通らないようにする
		long fuyou = 0;
		for (int i = 0; i < N - 1; i++) {
			fuyou += r[(M - 1) - 1 - i];
		}

		out.println(Math.abs(X[M - 1] - X[0]) - fuyou);

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
