
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x1 = Integer.parseInt(scan.next());
		int y1 = Integer.parseInt(scan.next());
		int x2 = Integer.parseInt(scan.next());
		int y2 = Integer.parseInt(scan.next());
		int dx1 = x2 - x1;
		int dy1 = y2 - y1;
		int dx2 = (int) (dx1 * Math.cos(Math.toRadians(90))) - (int) (dy1 * Math.sin(Math.toRadians(90)));
		int dy2 = (int) (dx1 * Math.sin(Math.toRadians(90))) + (int) (dy1 * Math.cos(Math.toRadians(90)));
		int x3 = x2 + dx2;
		int y3 = y2 + dy2;
		int x4 = x3 + (-1) * dx1;
		int y4 = y3 + (-1) * dy1;
		System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
	}
}
