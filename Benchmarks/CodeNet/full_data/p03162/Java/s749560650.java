
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
				koufukuArray[i][0] = Math.max(dayArray[i][0] + koufukuArray[i - 1][1], dayArray[i][0] + koufukuArray[i - 1][2]);
				koufukuArray[i][1] = Math.max(dayArray[i][1] + koufukuArray[i - 1][0], dayArray[i][1] + koufukuArray[i - 1][2]);
				koufukuArray[i][2] = Math.max(dayArray[i][2] + koufukuArray[i - 1][0], dayArray[i][2] + koufukuArray[i - 1][1]);
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