
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	final long MOD = (long) (1e9 + 7);

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[][] x = new int[N][];
		int[][] y = new int[N][];
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextInt();
			x[i] = new int[A[i]];
			y[i] = new int[A[i]];
			for (int j = 0; j < A[i]; ++j) {
				x[i][j] = sc.nextInt();
				y[i][j] = sc.nextInt();
				--x[i][j];
			}
		}
		int ans = 0;
		out: for (int s = 0; s < 1 << N; ++s) {
			for (int shift = 0; shift < N; ++shift) {
				if ((s >> shift) % 2 != 1)
					continue;
				for (int j = 0; j < A[shift]; ++j) {
					if ((s >> x[shift][j]) % 2 != y[shift][j])
						continue out;
				}
			}
			ans = Math.max(ans, Integer.bitCount(s));
		}
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
