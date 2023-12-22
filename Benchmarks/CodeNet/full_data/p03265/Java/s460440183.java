import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = 0;
		int y3 = 0;
		int x4 = 0;
		int y4 = 0;

		int X = x2 - x1;
		int Y = y2 - y1;
	
		x3 = x2 - Y;
		y3 = y2 + X;
		
		x4 = x3 - X;
		y4 = y3 - Y;
	
		System.out.println(x3 +" "+y3+" "+x4+" "+y4);
	}
	

}
