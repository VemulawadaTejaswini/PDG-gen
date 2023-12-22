
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//		new Main().solveA();
		//		new Main().solveB();
		new Main().solveC();
		// new Main().solveD();
	}

	private void solveA() {
		Scanner scanner = null;
		int numN = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();

			int[] height = new int[numN];
			for (int i = 0; i < numN; i++) {
				height[i] = scanner.nextInt();
			}

			int[] costArray = new int[numN];
			Arrays.fill(costArray, Integer.MAX_VALUE);
			costArray[0] = 0;
			for (int i = 0; i < height.length; i++) {
				for (int j = 1; j <= 2 && j + i < numN; j++) {
					int cost = Math.min(Math.abs(height[i + j] - height[i]) + costArray[i], costArray[i + j]);
					costArray[i + j] = cost;
				}
			}

			System.out.println(costArray[numN - 1]);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveB() {
		Scanner scanner = null;
		int numN = 0;
		int numK = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();
			numK = scanner.nextInt();

			int[] height = new int[numN];
			for (int i = 0; i < numN; i++) {
				height[i] = scanner.nextInt();
			}

			int[] costArray = new int[numN];
			Arrays.fill(costArray, Integer.MAX_VALUE);
			costArray[0] = 0;
			for (int i = 0; i < height.length; i++) {
				for (int j = 1; j <= numK && j + i < numN; j++) {
					int cost = Math.min(Math.abs(height[i + j] - height[i]) + costArray[i], costArray[i + j]);
					costArray[i + j] = cost;
				}
			}

			System.out.println(costArray[numN - 1]);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveC() {
		Scanner scanner = null;
		int dayNum = 0;

		try {
			scanner = new Scanner(System.in);
			dayNum = scanner.nextInt();

			int[][] koufukuBase = new int[dayNum][3];

			for (int i = 0; i < dayNum; i++) {
				koufukuBase[i][0] = scanner.nextInt();
				koufukuBase[i][1] = scanner.nextInt();
				koufukuBase[i][2] = scanner.nextInt();
			}

			int[][] koufukuArray = new int[dayNum][3];

			for (int i = 0; i < koufukuBase.length; i++) {
				if (i == 0) {
					koufukuArray[i][0] = koufukuBase[i][0];
					koufukuArray[i][1] = koufukuBase[i][1];
					koufukuArray[i][2] = koufukuBase[i][2];
				} else {
					koufukuArray[i][0] = Math.max(koufukuBase[i][0] + koufukuArray[i - 1][1], koufukuBase[i][0] + koufukuArray[i - 1][2]);
					koufukuArray[i][1] = Math.max(koufukuBase[i][1] + koufukuArray[i - 1][0], koufukuBase[i][1] + koufukuArray[i - 1][2]);
					koufukuArray[i][2] = Math.max(koufukuBase[i][2] + koufukuArray[i - 1][0], koufukuBase[i][2] + koufukuArray[i - 1][1]);
				}

			}
			int cnt = 0;
			for (int i = 0; i < 3; i++) {
				cnt = Math.max(koufukuArray[dayNum - 1][i], cnt);
			}

			System.out.println(cnt);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveD() {
		Scanner scanner = null;
		int lineAB = 0;
		int lineBC = 0;
		int lineCA = 0;

		try {
			scanner = new Scanner(System.in);
			lineAB = scanner.nextInt();

			System.out.println("");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}