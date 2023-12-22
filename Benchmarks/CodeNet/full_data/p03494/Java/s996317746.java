
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
		char[] wk;

		try {
			scanner = new Scanner(System.in);
			wk = scanner.nextLine().toCharArray();

			int res = 0;
			for (int i = 0; i < wk.length; i++) {
				if (wk[i] == '1') {
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

	private int divide(int[] wk) {
		boolean divide = true;
		int res = 0;
		for (int i = 0; i < wk.length && divide; i++) {
			if (wk[i] % 2 == 0 && wk[i] > 0) {
				wk[i] = wk[i] / 2;
			} else {
				divide = false;
			}
		}
		if (divide) {
			res = divide(wk) + 1;
		}
		return res;
	}

	private void solveB() {
		Scanner scanner = null;
		int n = 0;

		try {
			scanner = new Scanner(System.in);
			n = scanner.nextInt();

			int[] wk = new int[n];

			for (int i = 0; i < wk.length; i++) {
				wk[i] = scanner.nextInt();
			}

			System.out.println(divide(wk));

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveC() {
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