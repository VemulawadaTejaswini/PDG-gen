import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int w = in.nextInt();
		int h = in.nextInt();
		int n = in.nextInt();

		int maxX = w;
		int minX = 0;
		int maxY = h;
		int minY = 0;

		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			int a = in.nextInt();
			if (a == 1 && minX < x) {
				minX = x;
			} else if (a == 2 && maxX > x) {
				maxX = x;
			} else if (a == 3 && minY < y) {
				minY = y;
			} else if (a == 4 && maxY > y) {
				maxY = y;
			}
		}

		if (maxX < minX || maxY < minY) {
			System.out.println(0);

		} else {
			System.out.println((maxX - minX) * (maxY - minY));
		}
	}
}