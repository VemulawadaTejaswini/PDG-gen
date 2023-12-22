import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeSet<Point> reds = new TreeSet<>(new Comparator<Point>() {
		public int compare(Point p1, Point p2) {
			if (p1.x == p2.x) {
				return p1.y - p2.y;
			} else {
				return p1.x - p2.x;
			}
		}
		});
		for (int i = 0; i < n; i++) {
			reds.add(new Point(sc.nextInt(), sc.nextInt()));
		}
		PriorityQueue<Point> blues = new PriorityQueue<>(new Comparator<Point>() {
		public int compare(Point p1, Point p2) {
			if (p1.x == p2.x) {
				return p1.y - p2.y;
			} else {
				return p1.x - p2.x;
			}
		}
		});
		for (int i = 0; i < n; i++) {
			blues.add(new Point(sc.nextInt(), sc.nextInt()));
		}
		int count = 0;
		while (blues.size() > 0) {
			Point p =blues.poll();
			NavigableSet<Point> set = reds.headSet(p, false);
			if (set == null) {
				continue;
			}
			TreeSet<Point> searchSet = new TreeSet<Point>(new Comparator<Point>() {
			public int compare(Point p1, Point p2) {
				if (p1.y == p2.y) {
					return p1.x - p2.x;
				} else {
					return p1.y - p2.y;
				}
			}
			});
			searchSet.addAll(set);
			Point x = searchSet.lower(p);
			if (x == null) {
				continue;
			}
			reds.remove(x);
			count++;
		}
		System.out.println(count);
	}
	
	static class Point {
		int x;
		int y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public String toString() {
			return "x:" + x +" y:" + y;
		}
	}
}
