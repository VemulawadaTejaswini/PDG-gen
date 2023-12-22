import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	private boolean c(int[] a, int[] b, int D) {
		double dist = 0;

		for (int i = 0; i < D; i++) {
			dist += (a[i] - b[i]) * (a[i] - b[i]);
		}

		dist = Math.sqrt(dist);
		if (dist == (int) dist) {
			return true;
		} else {
			return false;
		}
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int D = sc.nextInt();
		int[][] X = new int[N][];
		for (int i = 0; i < N; i++) {
			X[i] = nextIntArray(sc, D);
		}

		sc.close();

		int ans = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (c(X[i], X[j], D)) {
					ans++;
				}
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
