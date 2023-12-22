
import java.util.Arrays;
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
			int[][] koufukuArray = new int[numDay][3];

			for (int i = 0; i < numDay; i++) {
				dayArray[i][0] = scanner.nextInt();
				dayArray[i][1] = scanner.nextInt();
				dayArray[i][2] = scanner.nextInt();
			}

			koufukuArray[0][0] = dayArray[0][0];
			koufukuArray[0][1] = dayArray[0][1];
			koufukuArray[0][2] = dayArray[0][2];
			for (int i = 1; i < dayArray.length; i++) {
				Arrays.fill(koufukuArray[i], Integer.MIN_VALUE);
				for (int j = 0; j < 3; j++) {
					for (int k = 0; k < 3; k++) {
						if (j == k) {
							continue;
						}
						koufukuArray[i][j] = Math.max(dayArray[i][j] + koufukuArray[i - 1][k], koufukuArray[i][j]);
					}
				}
			}

			int koufuku = 0;
			for (int i = 0; i < 3; i++) {
				koufuku = Math.max(koufukuArray[koufukuArray.length - 1][i], koufuku);
			}

			System.out.println(koufuku);
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}