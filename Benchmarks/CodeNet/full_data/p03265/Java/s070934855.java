
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		
		int x3 = 0;
		int y3 = 0;
		int x4 = 0;
		int y4 = 0;
		
		if (x1 > x2) {
			int distance = Math.abs(x1 - x2);
			x3 = x2 - distance;
			x4 = x2;
			y3 = y1;
			int distanceY = Math.abs(y2 - y1);
			y4 = y1 - distanceY;
		} else if (x1 == x2) {
			int distance = Math.abs(y2 - y1);
			x3 = x1 - distance;
			x4 = x1 - distance;
			y3 = y2;
			y4 = y1;
		} else {
			x3 = x1;
			int distanceX = Math.abs(x2 -x1);
			x3 = x1 - distanceX;
			y4 = y2;
			int distanceY = Math.abs(y2 -y1);
			y3 = y2 + distanceY;
		}
		
		System.out.println(x3);
		System.out.println(y3);
		System.out.println(x4);
		System.out.println(y4);

		
	}
}