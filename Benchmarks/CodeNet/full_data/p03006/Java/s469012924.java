import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	int N;
	long[] x, y;

	private int calc(long p, long q) {
		boolean[] b = new boolean[N];

		int result = 0;

		for (int i = 0; i < N; i++) {
			if (!b[i]) {
				result++;
			}

			// x[i]-p, [y]-q を探し、あればb[j]をtrueにする
			for (int j = 0; j < N; j++) {
				if (i == j) {
					continue;
				}

				if (x[j] == x[i] - p && y[j] == y[i] - q) {
					b[j] = true;
				}
			}
		}
		return result;
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		N = sc.nextInt();

		x = new long[N];
		y = new long[N];

		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}

		sc.close();

		int ans = Integer.MAX_VALUE;

		// p,qの候補の列挙
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i == j) {
					continue;
				}
				long p = x[i] - x[j];
				long q = y[i] - y[j];

				ans = Math.min(ans, calc(p, q));

			}
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
