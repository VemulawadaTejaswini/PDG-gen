
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		dPA();

	}

	private static void dPA() {
		Scanner scanner = null;
		int numAshiba = 0;
		int numK = 0;

		try {
			scanner = new Scanner(System.in);
			numAshiba = scanner.nextInt();
			numK = scanner.nextInt();
			int[] heightArray = new int[numAshiba];
			int[] koufukuArray = new int[numAshiba];
			Arrays.fill(koufukuArray, Integer.MAX_VALUE);

			for (int i = 0; i < numAshiba; i++) {
				heightArray[i] = scanner.nextInt();
			}
			koufukuArray[0] = 0;
			for (int i = 0; i < numAshiba; i++) {
				for (int j = 1; j <= numK; j++) {
					if (i + j >= numAshiba)
						continue;
					koufukuArray[i + j] = Math.min(koufukuArray[i] + Math.abs(heightArray[i] - heightArray[i + j]),
							koufukuArray[i + j]);
				}
			}

			System.out.println(koufukuArray[numAshiba - 1]);
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}