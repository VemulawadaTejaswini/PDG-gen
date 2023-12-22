import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();


		int lengthX = x1 - x2;
		int lengthY = y1 -y2;


		int x3 = x2 + lengthY;
		int y3 = y2 - lengthX;

		int x4 = x1 + lengthY;
		int y4 = y1 - lengthX;

		System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
	}

}
