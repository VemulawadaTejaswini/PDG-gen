
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
		int numX = 0;
		int numA = 0;
		int numB = 0;

		try {
			scanner = new Scanner(System.in);
			numX = scanner.nextInt();
			numA = scanner.nextInt();
			numB = scanner.nextInt();

			System.out.println((numX - numA) % numB);

			System.out.println("");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveB() {
		Scanner scanner = null;
		int numA = 0;
		int numB = 0;
		int numC = 0;
		int numX = 0;

		try {
			scanner = new Scanner(System.in);
			numA = scanner.nextInt();
			numB = scanner.nextInt();
			numC = scanner.nextInt();
			numX = scanner.nextInt();

			int res = 0;
			for (int i = 0; i <= numA; i++) {
				for (int j = 0; j <= numB; j++) {
					for (int k = 0; k <= numC; k++) {
						if (i * 500 + j * 100 + k * 50 == numX) {
							res++;
						}
					}
				}
			}

			System.out.println(res);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private int getAme(int[][] wk, int x, int y) {
		int res = 0;

		if (x >= 2 || y >= wk[0].length) {
			return 0;
		}

		int val1 = getAme(wk, x + 1, y) + wk[x][y];
		int val2 = getAme(wk, x, y + 1) + wk[x][y];

		res = Math.max(val1, val2);
		return res;
	}

	private void solveC() {
		Scanner scanner = null;
		int numN = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();

			int[][] wk = new int[2][numN];

			for (int i = 0; i < wk.length; i++) {
				for (int j = 0; j < numN; j++) {
					wk[i][j] = scanner.nextInt();
				}
			}

			System.out.println(getAme(wk, 0, 0));

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveD() {
		Scanner scanner = null;
		int numN = 0;
		int numK = 0;
		int numS = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();

			System.out.println("");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}