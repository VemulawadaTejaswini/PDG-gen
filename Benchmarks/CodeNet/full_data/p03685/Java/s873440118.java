import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int n = sc.nextInt();
		ArrayList<Point> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int r1 = sc.nextInt();
			int c1 = sc.nextInt();
			int r2 = sc.nextInt();
			int c2 = sc.nextInt();
			if (((r1 == 0 || r1 == r) || (c1 == 0 || c1 == c)) && ((r2 == 0 || r2 == r) || (c2 == 0 || c2 == c))) {
				list.add(new Point(r1, c1, i));
				list.add(new Point(r2, c2, i));
			}
		}
		Collections.sort(list, new Comparator<Point>() {
		public int compare(Point p1, Point p2) {
			if (p1.row == 0 || p1.col == c) {
				if (p2.row == 0 || p2.col == c) {
					return p1.row + p1.col - p2.row - p2.col;
				} else {
					return -1;
				}
			} else {
				if (p2.row == 0 || p2.col == c) {
					return 1;
				} else {
					return p2.row + p2.col - p1.row - p1.col;
				}
			}
		}
		});
		ArrayDeque<Point> deq = new ArrayDeque<>();
		for (Point p : list) {
			if (deq.size() > 0 && deq.getLast().idx == p.idx) {
				deq.pollLast();
			} else {
				deq.addLast(p);
			}
		}
		if (deq.size() == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
	static class Point {
		int row;
		int col;
		int idx;
		public Point(int row, int col, int idx) {
			this.row = row;
			this.col = col;
			this.idx = idx;
		}
		public String toString() {
			return "row:" + row + " col:" + col + " idx:" + idx;
		}
	}
}
