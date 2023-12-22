import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ab = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int min = Math.min(x, y);
		int cost = 0;
		if ((a + b) > 2 * ab) {
			cost += ab * min * 2;
			x = x - min;
			y = y - min;
			if (x > y) {
				if (a > ab * 2) {
					cost += ab * 2 * x;
				} else {
					cost += a * x;
				}
			} else {
				if (b > ab * 2) {
					cost += ab * 2 * y;
				} else {
					cost += b * y;
				}
			}
		} else {
			cost += a * x + b * y;
		}
		System.out.println(cost);

	}
}