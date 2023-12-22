
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

			if (numN > 999) {
				System.out.println("ABD");
			} else {
				System.out.println("ABC");
			}

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

		try {
			scanner = new Scanner(System.in);
			numA = scanner.nextInt();
			numB = scanner.nextInt();

			int wk = numB - numA;

			int res = 0;
			for (int i = 1; i < wk; i++) {
				res += i;
			}

			System.out.println(res - numA);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private int checkCash(int powC, int currentI, int currentCash) {

		if (currentCash < powC || currentI < 1) {
			return currentCash;
		}

		int res = 0;
		int wk = (int) Math.pow(powC, currentI);

		if (wk > currentCash) {
			if (powC == 9) {
				res = checkCash(6, currentI, currentCash);
			} else if (powC == 6) {
				res = checkCash(9, currentI - 1, currentCash);
			} else {
				res = checkCash(powC, currentI, currentCash);
			}
		} else {
			do {
				currentCash -= wk;
				cntC++;
				System.out.println("powC : " + powC + " / currentI : " + currentI + " / currentCash : " + currentCash);
			} while (wk < currentCash);
			if (powC == 9) {
				res = checkCash(6, currentI, currentCash);
			} else if (powC == 6) {
				res = checkCash(9, currentI - 1, currentCash);
			} else {
				res = checkCash(powC, currentI, currentCash);
			}
		}
		return res;
	}

	private int cntC = 0;

	private void solveC() {
		Scanner scanner = null;
		int numN = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();

			int wk = numN;
			boolean wCon = true;
			int cash = checkCash(9, 10, numN);
			cash = checkCash(1, 6, cash);

			System.out.println(cntC);

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