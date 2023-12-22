import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	private static final long INF = Long.MAX_VALUE >> 1;

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			long l = scanner.nextLong();
			long[][] distances = new long[n][n];
			IntStream.range(0, n).forEach(i -> Arrays.fill(distances[i], INF));
			IntStream.range(0, n).forEach(i -> distances[i][i] = 0L);
			IntStream.range(0, m).forEach(i -> {
				int from = scanner.nextInt() - 1;
				int to = scanner.nextInt() - 1;
				long c = scanner.nextLong();
				distances[from][to] = distances[to][from] = c;
			});
			IntStream.range(0, n).forEach(i -> IntStream.range(0, n).forEach(j -> IntStream.range(0, n)
					.forEach(k -> distances[i][j] = Math.min(distances[i][j], distances[i][k] + distances[k][j]))));
			int q = scanner.nextInt();
			IntStream.range(0, q).map(i -> {
				int s = scanner.nextInt() - 1;
				int t = scanner.nextInt() - 1;
				if (distances[s][t] < INF) {
					return (int) ((distances[s][t] + l - 1) / l - 1);
				} else {
					return -1;
				}
			}).forEach(System.out::println);
		}
	}
}
