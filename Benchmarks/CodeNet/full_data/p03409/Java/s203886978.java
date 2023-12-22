import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int count = scanner.nextInt();
			List<Point> redList = new ArrayList<>(count);
			for (int i = 0; i < count; i++) {
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				redList.add(new java.awt.Point(x, y));
			}

			List<Point> blueList = new ArrayList<>(count);
			for (int i = 0; i < count; i++) {
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				blueList.add(new java.awt.Point(x, y));
			}

			C c = new C();
			Collections.sort(redList, c);
			Collections.sort(blueList, c);

			int result = 0;
			for (int i = redList.size() - 1; i >= 0; i--) {
				int index = check(redList.get(i), blueList);
				if (index >= 0) {
					result++;
					blueList.remove(index);
				}
			}

			System.out.println(result);
		}
	}

	private static int check(Point red, List<Point> blueList) {
		for (int i = blueList.size() - 1; i >= 0; i--) {
			Point blue = blueList.get(i);
			if (red.x < blue.x && red.y < blue.y) {
				return i;
			}
		}

		return -1;
	}

	private static class C implements Comparator<Point> {
		@Override
		public int compare(Point o1, Point o2) {
			int result = o1.x - o2.x;
			if (result != 0) {
				return result;
			}
			return o1.y - o2.y;
		}
	}
}
