import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// input
		int xRight = scan.nextInt();
		int xLeft = 0;
		int yUp = scan.nextInt();
		int yDown = 0;
		int num = scan.nextInt();
		for (int i = 0; i < num; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			switch (scan.nextInt()) {
			case 1:
				if (x > xLeft) {
					xLeft = x;
				}
				break;
			case 2:
				if (x < xRight) {
					xRight = x;
				}
				break;
			case 3:
				if (y > yDown) {
					yDown = y;
				}
				break;
			case 4:
				if (y < yUp) {
					yUp = y;
				}
			}
		}

		int width = 0;
		if (xRight > xLeft) {
			width = xRight - xLeft;
		}
		int height = 0;
		if (yUp > yDown) {
			height = yUp - yDown;
		}

		System.out.println(width * height);

	}
}
