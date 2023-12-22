import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Point[] points = new Point[n];
		for (int i = 0; i < n; i++) {
			points[i] = new Point(sc.nextInt(), sc.nextInt());
		}
		HashMap<Point, Integer> map = new HashMap<>();
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				Point p;
				if (points[i].x < points[j].x) {
					p = new Point(points[j].x - points[i].x, points[j].y - points[i].y);
				} else if (points[i].x > points[j].x) {
					p = new Point(points[i].x - points[j].x, points[i].y - points[j].y);
				} else {
					p = new Point(0, Math.abs(points[i].y - points[j].y));
				}
				if (map.containsKey(p)) {
					int x = map.get(p);
					map.put(p, x + 1);
				} else {
					map.put(p, 1);
				}
			}
		}
		int max = 0;
		for (int x : map.values()) {
			max = Math.max(max, x);
		}
		System.out.println(n - max);
	}
	
	static class Point {
		int x;
		int y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public int hashCode() {
			return x + y;
		}
		
		public boolean equals(Object o) {
			Point p = (Point) o;
			return p.x == x && p.y == y;
		}
	}
}
