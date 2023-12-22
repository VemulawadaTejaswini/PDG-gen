
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//		new Main().solveA();
		new Main().solveB();
		// new Main().solveC();
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

			if (numA + numB == numC + numD) {
				System.out.println("Balanced");
			} else if (numA + numB > numC + numD) {
				System.out.println("Left");
			} else if (numA + numB < numC + numD) {
				System.out.println("Right");
			}

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveB() {
		Scanner scanner = null;
		int numN = 0;
		int numA = 0;
		int numB = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();
			numA = scanner.nextInt();
			numB = scanner.nextInt();

			int res = 0;
			for (int i = 1; i <= numN; i++) {

				int wk = 0;
				int tmp = i;
				while (tmp != 0) {
					wk += tmp % 10;
					tmp /= 10;
				}
				if (numA <= wk && wk <= numB) {
					res += i;
				}

			}

			System.out.println(res);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveC() {
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