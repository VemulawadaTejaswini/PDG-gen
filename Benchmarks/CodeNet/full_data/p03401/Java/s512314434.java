
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
		int numA = 0;
		int numB = 0;
		int numC = 0;
		int numD = 0;

		try {
			scanner = new Scanner(System.in);
			numA = scanner.nextInt();
			numB = scanner.nextInt();
			numC = scanner.nextInt();
			numD = scanner.nextInt();

			int wkBus = numA < numB ? numA : numB;
			int wkTrain = numC < numD ? numC : numD;

			System.out.println(wkBus + wkTrain);

			System.out.println("");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveB() {
		Scanner scanner = null;
		int numN = 0;
		int numD = 0;
		int numX = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();
			numD = scanner.nextInt();
			numX = scanner.nextInt();

			int[] wk = new int[numN];

			for (int i = 0; i < wk.length; i++) {
				wk[i] = scanner.nextInt();
			}

			int res = numX;
			for (int i = 0; i < numN; i++) {
				for (int j = 0; j < numD; j++) {
					//System.out.println((i + 1) + ":人目");
					if (j == 0) {
						//System.out.println(j + 1 + " :day");
						res++;
					} else {
						int day = (j) * wk[i] + 1;
						if (day <= numD) {
							//System.out.println(day + " :day");
							res++;
						} else {
							break;
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

	private int getInt(int i) {
		if (i < 0)
			return 0;

		return i;
	}

	private void solveC() {
		Scanner scanner = null;
		int numN = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();

			int[] wk = new int[numN + 1];
			int[] result = new int[numN + 1];

			wk[0] = 0;
			for (int i = 1; i <= numN; i++) {
				wk[i] = scanner.nextInt();
			}

			int[] wkN = new int[numN];
			for (int i = 1; i <= numN; i++) {
				for (int j = 1; j <= numN; j++) {
					if (i == j) {
					} else if (i + 1 == j) {
						result[i] += Math.abs(wk[j] - wk[j - 2]);
					} else {
						result[i] += Math.abs(wk[j] - wk[j - 1]);
					}

					if (j == wk.length - 1) {
						if (i == j) {
							result[i] += Math.abs(wk[j - 1] - wk[0]);
						} else {
							result[i] += Math.abs(wk[j] - wk[0]);
						}
					}
				}
			}

			for (int i = 0; i < result.length; i++) {
				if (i == 0)
					continue;
				System.out.println(result[i]);
			}

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