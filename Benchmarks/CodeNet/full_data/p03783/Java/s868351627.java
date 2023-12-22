import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] l = new int[N];
		int[] r = new int[N];
		for (int i = 0; i < N; ++i) {
			l[i] = sc.nextInt() - 1;
			r[i] = sc.nextInt() - 1;
		}
		long[][] cost = new long[2][400];
		Arrays.fill(cost[1], 0);
		Arrays.fill(cost[0], Long.MAX_VALUE / 16);
		for (int i = 0; i < N; ++i) {
			for (int pos = 0; pos < 400; ++pos) {
				long MIN = Long.MAX_VALUE / 16;
				for (int j = Math.max(0, i > 0 ? (pos - (r[i - 1] - l[i - 1])) : 0); j <= r[i]; ++j) {
					MIN = Math.min(cost[(i + 1) % 2][j], MIN);
				}
				cost[i % 2][pos] = MIN + Math.abs(pos - l[i]);
			}
		}
		long ans = Long.MAX_VALUE / 16;
		for (int i = 0; i < 400; ++i) {
			ans = Math.min(ans, cost[(N - 1) % 2][i]);
		}
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}