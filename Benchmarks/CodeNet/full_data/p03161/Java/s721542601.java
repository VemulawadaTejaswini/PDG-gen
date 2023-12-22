
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		dPA();

	}

	private static void dPA() {
		Scanner scanner = null;
		int numFrog = 0;
		int numK = 0;

		try {
			scanner = new Scanner(System.in);
			numFrog = scanner.nextInt();
			numK = scanner.nextInt();
			int[] heightArray = new int[numFrog];

			for (int i = 0; i < numFrog; i++) {
				heightArray[i] = scanner.nextInt();
			}

			int[] koufukuArray = new int[numFrog];
			Arrays.fill(koufukuArray, Integer.MAX_VALUE);
			koufukuArray[0] = 0;
			koufukuArray[1] = Math.abs(heightArray[1] - heightArray[0]);
			for (int i = 0; i < heightArray.length; i++) {
				for (int j = 1; j <= numK; j++) {
					if (i + j >= heightArray.length) {
						break;
					}
					int val1 = Math.abs(heightArray[i + j] - heightArray[i]);
					koufukuArray[i + j] = Math.min(koufukuArray[i + j], val1 + koufukuArray[i]);
				}
			}
			System.out.println(koufukuArray[koufukuArray.length - 1]);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}