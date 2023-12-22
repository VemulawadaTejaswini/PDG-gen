import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Point> red = new ArrayList<Point>(n);
		for (int i = 0; i < n; i++) {
			Point p = new Point();
			p.x = sc.nextInt();
			p.y = sc.nextInt();
			red.add(p);
		}
		List<Point> blue = new ArrayList<Point>(n);
		for (int i = 0; i < n; i++) {
			Point p = new Point();
			p.x = sc.nextInt();
			p.y = sc.nextInt();
			blue.add(p);
		}
		sc.close();

		// blueをxの昇順にソート
		Collections.sort(blue, new Comparator<Point>() {
			public int compare(Point o1, Point o2) {
				return o1.x - o2.x;
			}
		});

		int ans = 0;
		for (int i = 0; i < n; i++) {
			Point p = blue.get(i);
			Point m = getYMaxRed(red, p.x, p.y);
			if (m != null) {
				red.remove(m);
				ans++;
			}
		}
		System.out.println(ans);
	}

	static class Point {
		int x, y;
	}

	static Point getYMaxRed(List<Point> red, int x, int y) {
		Point max = null;
		for (Point p : red) {
			if (p.x > x || p.y > y) {
				continue;
			}
			if (max == null || max.y < p.y) {
				max = p;
			}
		}
		return max;
	}
}
