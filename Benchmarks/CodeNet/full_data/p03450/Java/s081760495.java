import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 解説どおりに作成したソースコード
 */
public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			if (0 == m) {
				System.out.println("Yes");
				return;
			}
			int[][] g = new int[n][n];
			// 初期化
			IntStream.range(0, n).forEach(i -> {
				Arrays.fill(g[i], Integer.MAX_VALUE);
				g[i][i] = 0;
			});
			IntStream.range(0, m).forEach(i -> {
				int l = scanner.nextInt() - 1;
				int r = scanner.nextInt() - 1;
				int d = scanner.nextInt();
				g[l][r] = d;
				g[r][l] = -d;
			});
			System.out.println(checkDfs(g) ? "Yes" : "No");
		}
	}

	private static boolean checkDfs(final int[][] g) {
		for (int i = 0; i < g.length; i++) {
			for (int j = 0; j < g.length; j++) {
				if (i != j) {
					for (int k = 0; k < g.length; k++) {
						if ((g[i][k] != Integer.MAX_VALUE) && (g[k][j] != Integer.MAX_VALUE)) {
							if (g[i][j] == Integer.MAX_VALUE) {
								g[i][j] = g[i][k] + g[k][j];
							} else {
								if (g[i][j] != (g[i][k] + g[k][j])) {
									return false;
								}
							}
						}
					}
				}
			}
		}
		return true;
	}
}
