import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve(new Scanner(System.in));
	}
	
	public void solve(Scanner sc) {
		int x1 = Integer.parseInt(sc.next());
		int y1 = Integer.parseInt(sc.next());
		int x2 = Integer.parseInt(sc.next());
		int y2 = Integer.parseInt(sc.next());
		
		int dx = x1 - x2;
		int dy = y1 - y2;
		
		int x3, x4, y3, y4;
		x3 = x2 + dy;
		y3 = y2 - dx;
		x4 = x1 + dy;
		y4 = y1 - dx;
		System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
	}
}
