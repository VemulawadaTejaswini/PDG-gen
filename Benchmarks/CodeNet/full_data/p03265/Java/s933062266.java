import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		
		int X = x2 - x1;
		int Y = y2 - y1;
		
		int x3 = x2 - Y;
		int y3 = y2 + X;
		int x4 = x3 - X;
		int y4 = y3 - Y;
		
		System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
		
	}
}
