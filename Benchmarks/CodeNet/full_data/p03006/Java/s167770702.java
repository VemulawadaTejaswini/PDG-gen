import java.awt.Point;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		Point[] points = new Point[n];
		for (int i = 0; i < n; i++) {
			points[i] = new Point(scn.nextInt(), scn.nextInt());
		}
		
		scn.close();
		
		Comparator<Point> localComp = new Comparator<Point>() {
			public int compare(Point a, Point b) {
				return comparePoints(a, b);
			}
		};
		
		Arrays.sort(points, localComp);
		
		int maxEqual = 1, currEqual = 1;
		Point lastDiff = new Point(0, 0);
		for (int i = 1; i < n; i++) {
			if (points[i].x - points[i - 1].x == lastDiff.x && points[i].y - points[i - 1].y == lastDiff.y) {
				currEqual++;
			} else {
				maxEqual = (currEqual > maxEqual) ? currEqual : maxEqual;
				currEqual = 1;
				lastDiff.x = points[i].x - points[i - 1].x;
				lastDiff.y = points[i].y - points[i - 1].y;
			}
		}
		maxEqual = (currEqual > maxEqual) ? currEqual : maxEqual;
		System.out.println(((n - 1) - maxEqual == 0) ? 1 : (n - 1) - maxEqual);
	}
	
	public static int comparePoints(Point a, Point b) {
		return (int)Math.sqrt((double)((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y))); 
	}
}