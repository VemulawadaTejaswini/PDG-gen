import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	static int n = scanner.nextInt();
	static int a[][] = new int[2][n];

	@SuppressWarnings("resource")
	public static void main(String args[]) {

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = scanner.nextInt();
			}
		}

		dfs(0, 0, a[0][0]);

		int max = 0;
		for (int i = 0; i < scores.size(); i++) {
			max = Math.max(scores.get(i), max);
		}

		System.out.println(max);
	}

	static List<Integer> scores = new ArrayList<>();

	private static void dfs(int x, int y, int score) {
		if (x == n - 1 && y == 1) {
			scores.add(score);
			return;
		}

		try {
			score += a[y + 1][x];
			dfs(x, y + 1, score);
			score -= a[y + 1][x];
		} catch (Exception e) {

		}
		try {
			score += a[y][x + 1];
			dfs(x + 1, y, score);
		} catch (Exception e) {

		}

	}
}