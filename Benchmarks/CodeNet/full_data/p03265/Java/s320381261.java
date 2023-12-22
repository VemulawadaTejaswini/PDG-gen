import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int x1, y1, x2, y2, x3, y3, x4, y4;
		x1 = stdin.nextInt();
		y1 = stdin.nextInt();
		x2 = stdin.nextInt();
		y2 = stdin.nextInt();
		
//		System.out.println(x1);
//		System.out.println(y1);
//		System.out.println(x2);
//		System.out.println(y2);
		
		x3 = x2 - (y2 - y1);
		y3 = y2 + (x2 - x1);
		x4 = x3 - (y3 - y2);
		y4 = y3 + (x3 - x2);
		
//		System.out.println(x3);
//		System.out.println(y3);
//		System.out.println(x4);
//		System.out.println(y4);
		
		System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);

	}

}
