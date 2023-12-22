import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			List<Point> points = new ArrayList<>(n);
			IntStream.range(0, n).forEach(i -> points.add(new Point(scanner.nextInt(), scanner.nextInt())));
			long min = Long.MAX_VALUE;
			// x座標でソートする
			points.sort((p1, p2) -> p1.x - p2.x);
			for (int i = 0; i < n - k + 1; i++) {
				int minY = Integer.MAX_VALUE, maxY = Integer.MIN_VALUE;
				for (int j = i; j < i + k; j++) {
					minY = Math.min(minY, points.get(j).y);
					maxY = Math.max(maxY, points.get(j).y);
				}
				min = Math.min(min, ((long) (points.get(i + k - 1).x - points.get(i).x)) * (maxY - minY));
			}
			// y座標でソートする
			points.sort((p1, p2) -> p1.y - p2.y);
			for (int i = 0; i < n - k + 1; i++) {
				int minX = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE;
				for (int j = i; j < i + k; j++) {
					minX = Math.min(minX, points.get(j).x);
					maxX = Math.max(maxX, points.get(j).x);
				}
				min = Math.min(min, ((long) (points.get(i + k - 1).y - points.get(i).y)) * (maxX - minX));
			}
			System.out.println(min);
		}
	}

	/**
	 * 座標を表すクラス
	 */
	private static class Point {
		int x;
		int y;

		Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
	}
}
