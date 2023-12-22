
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//		new Main().dPA();
		//		new Main().dPA2();
		new Main().dPA3();

	}

	private void dPA() {
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

	private void dPA2() {
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

	private void dPA3() {
		Scanner scanner = null;
		int n = 0;
		int k = 0;

		try {
			scanner = new Scanner(System.in);
			n = scanner.nextInt();
			k = scanner.nextInt();
			int[] heightArray = new int[n];
			int[] cost = new int[n];
			Arrays.fill(cost, Integer.MAX_VALUE);

			for (int i = 0; i < n; i++) {
				heightArray[i] = scanner.nextInt();
			}
			cost[0] = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 1; j <= k; j++) {
					if (i + j < n) {
						cost[i + j] = Math.min(cost[i + j], Math.abs(heightArray[i + j] - heightArray[i]) + cost[i]);
					}
				}
			}

			System.out.println(cost[n - 1]);
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}