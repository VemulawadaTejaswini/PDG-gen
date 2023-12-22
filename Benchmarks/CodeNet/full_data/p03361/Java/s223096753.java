import java.util.*;
import java.util.regex.*;

public class Main {
	
	public static void main(String... args) {
		System.out.println(canDraw(scanInt(), scanInt()) ? "Yes" : "No");
	}
	
	private static boolean canDraw(int H, int W) {
		ArrayList<Point> pList = new ArrayList<Point>();
		for (int i = 0; i < H; ++i) {
			String line = scanString();
			for (int j = 0; j < W; ++j) {
				char c = line.charAt(j);
				if (c == '#') {
					pList.add(new Point(i, j));
				}
			}
		}
		for (Point p : pList) {
			if (!hasRelation(p, pList)) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean hasRelation(Point p, ArrayList<Point> pList) {
		for (Point p2 : pList) {
			if (p.isRelation(p2)) {
				return true;
			}
		}
		return false;
	}
	
	private static class Point {
		private final int i;
		private final int j;
		
		private Point(int i, int j) {
			this.i = i;
			this.j = j;
		}
		
		private boolean isRelation(Point p) {
			if ((i == p.i && (j == p.j - 1 || j == p.j + 1))
					|| ((i == p.i - 1 || i == p.i + 1) && j == p.j)) {
				return true;
				
			}
			return false;
		}
	}
	
	private static final Scanner SC = new Scanner(System.in);

	private static int scanInt() {
		return SC.nextInt();
	}

	private static  String scanString() {
		return SC.next();
	}
}