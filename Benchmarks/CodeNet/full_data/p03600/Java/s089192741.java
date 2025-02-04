import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		long ans = solve();
		System.out.println(ans);
	}

	public static long solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] dist = new int[n + 1][n + 1];
		int[][] odist = new int[n + 1][n + 1];
		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < n + 1; j++) {
				dist[i][j] = odist[i][j] = Integer.MAX_VALUE;
				if (i == j) dist[i][j] = odist[i][j] = 0;

			}
		}

		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				int cost = sc.nextInt();
				dist[row][col] = odist[row][col] = cost;
			}
		}

		sc.close();

		long total = 0;
		for (int k = 1; k < n + 1; k++) {
			for (int i = 1; i < n + 1; i++) {
				for (int j = 1; j < n + 1; j++) {
					if (k == i || k == j || i == j) continue;
					odist[i][j] = Math.min(odist[i][j], odist[i][k] + odist[k][j]);
					if (dist[i][j] == dist[i][k] + dist[k][j]) {
						total -= dist[i][j];
					}
				}
			}
		}

		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < n + 1; j++) {
				if (dist[i][j] != odist[i][j]) {
					return -1;
				}
				total += dist[i][j];
			}
		}
		return total / 2;

	}
}