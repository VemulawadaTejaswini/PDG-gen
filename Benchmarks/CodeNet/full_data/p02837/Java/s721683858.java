import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	boolean check(int[] q) {
		for (int i = 0; i < q.length; i++) {
			if (q[i] == 1) {
				// i の証言をしらべる
				for (int j = 0; j < A[i]; j++) {
					if (q[x[i][j]] != y[i][j]) {
						return false;
					}
				}
			}
		}
		return true;
	}

	int N;
	int[] A;
	int[][] x, y;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		N = sc.nextInt();

		A = new int[N];
		x = new int[N][];
		y = new int[N][];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			x[i] = new int[A[i]];
			y[i] = new int[A[i]];
			for (int j = 0; j < A[i]; j++) {
				x[i][j] = sc.nextInt() - 1;
				y[i][j] = sc.nextInt();
			}
		}

		sc.close();

		int ans = 0;
		for (int i = 0; i <= (2 << N); i++) {
			int[] q = new int[N];
			for (int j = 0; j < N; j++) {
				q[j] = (i >> j) & 0x01;
			}
			if (check(q)) {
				ans = Math.max(ans, cnt(q));
			}
		}

		out.println(ans);
	}

	int cnt(int[] a) {
		int result = 0;
		for (int n : a) {
			if (n == 1) {
				result++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
