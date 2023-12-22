import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	private static final long INF = Long.MAX_VALUE >> 1;

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			long l = scanner.nextLong();
			Route[][] routes = new Route[n][n];
			IntStream.range(0, n).forEach(i -> IntStream.range(0, n).forEach(j -> routes[i][j] = new Route(INF)));
			IntStream.range(0, n).forEach(i -> routes[i][i] = new Route(0L));
			IntStream.range(0, m).forEach(i -> {
				int from = scanner.nextInt() - 1;
				int to = scanner.nextInt() - 1;
				long c = scanner.nextLong();
				if (c <= l) {
					routes[from][to] = new Route(c, c);
					routes[to][from] = new Route(c, c);
				}
			});
			IntStream.range(0, n).forEach(i -> IntStream.range(0, n).forEach(j -> IntStream.range(0, n).forEach(k -> {
				if (routes[i][j].distance > routes[i][k].distance + routes[k][j].distance) {
					routes[i][j].distance = routes[i][k].distance + routes[k][j].distance;
					routes[i][j].paths.clear();
					routes[i][j].paths.addAll(routes[i][k].paths);
					routes[i][j].paths.addAll(routes[k][j].paths);
				}
			})));
			int q = scanner.nextInt();
			IntStream.range(0, q).map(i -> {
				int s = scanner.nextInt() - 1;
				int t = scanner.nextInt() - 1;
				if (routes[s][t].distance < INF) {
					int count = 0;
					long now = l;
					for (long path : routes[s][t].paths) {
						if (now < path) {
							if (path > l) {
								count = -1;
								break;
							} else {
								count++;
								now = l;
							}
						}
						now -= path;
					}
					return count;
				} else {
					return -1;
				}
			}).forEach(System.out::println);
		}
	}

	/**
	 * ノードの間の距離とルートを管理するクラス
	 */
	private static class Route {
		/** 総距離 */
		long distance;
		/** ノード間をたどるパスの距離一覧 */
		List<Long> paths = new ArrayList<>();

		Route(long distance, long... paths) {
			super();
			this.distance = distance;
			if (null != paths) {
				for (long path : paths) {
					this.paths.add(path);
				}
			}
		}
	}
}
