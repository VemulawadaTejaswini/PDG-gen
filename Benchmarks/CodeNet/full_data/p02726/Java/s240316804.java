import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int[][] costs = new int[n][n];
			IntStream.range(0, n).forEach(i -> Arrays.fill(costs[i], Integer.MAX_VALUE >> 1));
			IntStream.range(0, n).forEach(i -> {
				costs[i][i] = 0;
				if (i > 0) {
					costs[i - 1][i] = costs[i][i - 1] = 1;
				}
			});
			int x = scanner.nextInt() - 1, y = scanner.nextInt() - 1;
			costs[x][y] = costs[y][x] = 1;
			warshallFloyd(costs, n);
			int[] answer = new int[n - 1];
			Arrays.fill(answer, 0);
			IntStream.range(0, n).forEach(i -> IntStream.range(0, i).forEach(j -> answer[costs[i][j] - 1]++));
			Arrays.stream(answer).forEach(System.out::println);
		}
	}

	/**
	 * ノード関の移動コストを計算する
	 * 
	 * @param costs ノード関の移動コストの配列
	 * @param n     ノードの総数
	 */
	private static void warshallFloyd(int[][] costs, int n) {
		IntStream.range(0, n).forEach(k -> IntStream.range(0, n).forEach(j -> IntStream.range(0, n)
				.forEach(i -> costs[i][j] = Math.min(costs[i][j], costs[i][k] + costs[k][j]))));
	}
}
