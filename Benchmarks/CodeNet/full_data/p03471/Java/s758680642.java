import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int correctNum = scanner.nextInt();
			int correctYen = scanner.nextInt();

			for (int x = correctNum; x >= 0; x--) {
				if (calc(x,0,0)> correctYen) {
					continue;
				}
				for (int y = 0; y <= correctNum - x; y++) {
					int z = correctNum - (x + y);
					int sumYen = 10000 * x + 5000 * y + 1000 * z;
					if (sumYen == correctYen) {
							System.out.print(String.valueOf(x) + " " + String.valueOf(y) + " " + String.valueOf(z));
							return;
					}
				}
			}
			System.out.print("-1 -1 -1");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}

	private static int calc(int x, int y, int z) {
		return 10000 * x + 5000 * y + 1000 * z;
	}
}
