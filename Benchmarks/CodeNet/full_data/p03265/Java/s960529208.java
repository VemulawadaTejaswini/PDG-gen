import java.util.Scanner;

/**
 * 解説通りに作成したソースコード
 */
public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int x1 = scanner.nextInt(), y1 = scanner.nextInt();
			int x2 = scanner.nextInt(), y2 = scanner.nextInt();
			int xDiff = x2 - x1, yDiff = y2 - y1;
			System.out.println((x2 - yDiff) + " " + (y2 + xDiff) + " " + (x1 - yDiff) + " " + (y1 + xDiff));
		}
	}
}
