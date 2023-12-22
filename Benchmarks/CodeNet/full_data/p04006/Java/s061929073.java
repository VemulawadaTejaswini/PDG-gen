import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		new Main().solver();
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long x = sc.nextLong();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		long[][] min_cost = new long[n][n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(min_cost[i], 1L << 60);
		}

		long[] total_cost = new long[n];
		for (int i = 0; i < n; i++) {
			total_cost[i] += x * i;
		}
		// min_cost[i][j]:i番目のスライムの作るのに必要なコストの最小値
		// （但し魔法はj回使うものとして、魔法のコストは含まない)
		for (int j = 0; j < n; j++) {
			for (int k = 0; k < n; k++) {
				int pos = (j + n - k) % n;
				if (k > 0)
					min_cost[j][k] = min_cost[j][k - 1];
				min_cost[j][k] = Math.min(min_cost[j][k], a[pos]);
				total_cost[k] += min_cost[j][k];
			}
		}

		long ans = 1L << 60;
		for (int i = 0; i < n; i++) {
			ans = Math.min(ans, total_cost[i]);
		}
		System.out.println(ans);
	}

	void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}
