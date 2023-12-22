import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		sc.close();

		int diffx = x2 - x1;
		int diffy = y2 - y1;
		int x3 = x2 - diffy;
		int y3 = y2 + diffx;
		int x4 = x3 - diffx;
		int y4 = y3 - diffy;

		System.out.println(String.format("%d %d %d %d", x3, y3, x4, y4));
	}
}
