
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//		new Main().solveA();
		//		new Main().solveB();
		//		new Main().solveC();
		new Main().solveC2();
		// new Main().solveD();
	}

	private void solveA() {
		Scanner scanner = null;
		String[] stringS = new String[4];

		try {
			scanner = new Scanner(System.in);
			stringS = scanner.next().split("");

			int res = 0;
			for (int i = 0; i < stringS.length; i++) {
				if (stringS[i].equals("+")) {
					res++;
				} else if (stringS[i].equals("-")) {
					res--;
				}
			}

			System.out.println(res);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveB() {
		Scanner scanner = null;
		int numN = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();

			int wkN = 0;
			int tmp = numN;
			while (tmp != 0) {
				wkN += tmp % 10;
				tmp /= 10;
			}

			System.out.println(numN % wkN == 0 ? "Yes" : "No");

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
		int[] wk;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();
			numK = scanner.nextInt();
			wk = new int[numN];

			for (int i = 0; i < wk.length; i++) {
				wk[i] = scanner.nextInt();
			}

			Arrays.sort(wk);

			int res = 0;
			int wkN = numN;
			while (wkN > 0) {
				if (res == 0) {
					wkN = wkN - numK;
					res++;
				} else {
					wkN = wkN - (numK - 1);
					res++;
				}
			}
			System.out.println(res);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveC2() {
		Scanner scanner = null;
		int numN = 0;
		int numK = 0;
		int[] wk;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();
			numK = scanner.nextInt();
			wk = new int[numN];

			int wkN = numN - numK;
			int wkK = numK - 1;
			int res = 1 + (wkN % wkK == 0 ? (wkN / wkK) : (wkN / wkK) + 1);
			System.out.println(res);

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