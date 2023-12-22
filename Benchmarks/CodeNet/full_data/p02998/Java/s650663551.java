import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<List<Integer>> xyList = new ArrayList<>();
		int maxX = 0, maxY = 0, x, y;
		for (int i = 0; i < n; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			List<Integer> xy = new ArrayList<>();
			xy.add(x);
			xy.add(y);
			xyList.add(xy);
			maxX = x > maxX ? x : maxX;
			maxY = y > maxY ? y : maxY;
		}

		int count = 0;
		boolean addFlag = true;
		while (addFlag) {
			addFlag = false;
			for (int i = 1; i <= maxX; i++) {
				for (int j = 1; j <= maxY; j++) {
					if (addCheck(xyList, i, j)) {
						List<Integer> xy = new ArrayList<>();
						xy.add(i);
						xy.add(j);
						xyList.add(xy);
						addFlag = true;
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

	private static boolean addCheck(List<List<Integer>> points, int x, int y) {
		for (List<Integer> point : points) {
			if (x == point.get(0) && y == point.get(1)) {
				return false;
			}
		}

		for (List<Integer> sameX : points) {
			if (x != sameX.get(0)) {
				continue;
			}
			for (List<Integer> sameY : points) {
				if (y != sameY.get(1)) {
					continue;
				}
				for (List<Integer> dPoint : points) {
					if (dPoint.get(0) == sameY.get(0) && dPoint.get(1) == sameX.get(1)) {
						return true;
					}
				}
			}
		}

		return false;
	}
}
