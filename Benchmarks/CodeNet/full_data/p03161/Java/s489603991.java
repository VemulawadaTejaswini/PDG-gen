
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//		new Main().dPA();
		new Main().dPA2();

	}

	private void dPA() {
		Scanner scanner = null;
		int numFrog = 0;

		try {
			scanner = new Scanner(System.in);
			numFrog = scanner.nextInt();
			int[] heightArray = new int[numFrog];

			for (int i = 0; i < numFrog; i++) {
				heightArray[i] = scanner.nextInt();
			}

			int[] koufukuArray = new int[numFrog];
			for (int i = 0; i < heightArray.length; i++) {
				if (i != 0 && i != 1) {
					int val1 = Math.abs(heightArray[i] - heightArray[i - 1]);
					int val2 = Math.abs(heightArray[i] - heightArray[i - 2]);
					koufukuArray[i] = Math.min(koufukuArray[i - 1] + val1, koufukuArray[i - 2] + val2);
				} else if (i == 0) {
					koufukuArray[i] = 0;
				} else if (i == 1) {
					koufukuArray[i] = koufukuArray[i - 1] + Math.abs(heightArray[i] - heightArray[i - 1]);
				}

			}
			System.out.println(koufukuArray[koufukuArray.length - 1]);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void dPA2() {
		Scanner scanner = null;
		int numFrog = 0;
		int jump = 2;

		try {
			scanner = new Scanner(System.in);
			numFrog = scanner.nextInt();
			int[] heightArray = new int[numFrog];

			for (int i = 0; i < numFrog; i++) {
				heightArray[i] = scanner.nextInt();
			}

			int[] cost = new int[numFrog];
			Arrays.fill(cost, Integer.MAX_VALUE);

			cost[0] = 0;

			for (int i = 0; i < heightArray.length; i++) {

				for (int j = 1; j <= jump; j++) {
					if (i + j < heightArray.length) {
						cost[i + j] = Math.min(cost[i + j], Math.abs(heightArray[i + j] - heightArray[i]) + cost[i]);
					}
				}

			}
			System.out.println(cost[cost.length - 1]);
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}