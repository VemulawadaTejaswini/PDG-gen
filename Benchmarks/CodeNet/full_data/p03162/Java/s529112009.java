
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		dPA();

	}

	private static void dPA() {
		Scanner scanner = null;
		int numDay = 0;

		try {
			scanner = new Scanner(System.in);
			numDay = scanner.nextInt();
			int[][] dayArray = new int[numDay][3];
			int[][] koufukuArray = new int[numDay + 1][3];

			for (int i = 0; i < numDay; i++) {
				dayArray[i][0] = scanner.nextInt();
				dayArray[i][1] = scanner.nextInt();
				dayArray[i][2] = scanner.nextInt();
			}

			for (int i = 0; i < numDay; i++) {

				for (int j = 0; j < 3; j++) {
					for (int k = 0; k < 3; k++) {
						if (j == k) {
							continue;
						}
						if (i != 0) {
							koufukuArray[i][j] = Math.max(koufukuArray[i - 1][k] + dayArray[i][j], koufukuArray[i][j]);
						} else {
							koufukuArray[i][j] = dayArray[i][j];
						}

					}
				}
			}

			int koufuku = 0;
			for (int i = 0; i < 3; i++) {
				koufuku = Math.max(koufuku, koufukuArray[numDay - 1][i]);
			}

			System.out.println(koufuku);
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}