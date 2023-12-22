
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
		String line = "";

		try {
			scanner = new Scanner(System.in);
			line = scanner.nextLine();

			char[] wkArray = line.toCharArray();
			StringBuffer buf = new StringBuffer();
			for (int i = 0; i < wkArray.length; i++) {
				switch (wkArray[i]) {
				case '1':
					buf.append(9);
					break;
				case '9':
					buf.append(1);
					break;
				default:
					buf.append(wkArray[i]);
					break;
				}

			}

			System.out.println(buf.toString());

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveB() {
		Scanner scanner = null;
		String line = "";

		try {
			scanner = new Scanner(System.in);
			line = scanner.nextLine();
			int start = Integer.parseInt(line);

			for (int outer = start; outer <= 999; outer++) {
				char[] wkArray = Integer.toString(outer).toCharArray();

				if (wkArray[0] == wkArray[1] && wkArray[1] == wkArray[2]) {
					System.out.println(outer);
					return;
				}
			}

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