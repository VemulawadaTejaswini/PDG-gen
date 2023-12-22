
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		dPA();

	}

	private static void dPA() {
		Scanner scanner = null;
		int numFlog = 0;

		try {
			scanner = new Scanner(System.in);
			numFlog = scanner.nextInt();
			int[] heightArray = new int[numFlog];

			for (int i = 0; i < numFlog; i++) {
				heightArray[i] = scanner.nextInt();
			}

			int[] koufukuArray = new int[numFlog];
			koufukuArray[0] = 0;
			koufukuArray[1] = Math.abs(heightArray[1] - heightArray[0]);
			for (int i = 2; i < heightArray.length; i++) {
				int val1 = Math.abs(heightArray[i] - heightArray[i - 1]);
				int val2 = Math.abs(heightArray[i] - heightArray[i - 2]);
				koufukuArray[i] = Math.min(koufukuArray[i - 1] + val1, koufukuArray[i - 2] + val2);
			}
			System.out.println(koufukuArray[koufukuArray.length - 1]);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}