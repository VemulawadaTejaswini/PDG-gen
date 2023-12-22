
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
		String[] wkArray = new String[3];

		try {
			StringBuffer buff = new StringBuffer();
			scanner = new Scanner(System.in);
			for (int i = 0; i < 3; i++) {
				wkArray[i] = scanner.next();
			}

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (i == j) {
						buff.append((wkArray[i].toCharArray())[j]);
					}
				}
			}

			System.out.println(buff.toString());

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveB() {
		Scanner scanner = null;
		int startNum = 0;
		int endNum = 0;

		try {
			scanner = new Scanner(System.in);
			startNum = scanner.nextInt();
			endNum = scanner.nextInt();

			int count = 0;
			for (int i = startNum; i <= endNum; i++) {
				char[] num = Integer.toString(i).toCharArray();
				if (num[0] == num[4] && num[1] == num[3]) {
					count++;
				}
			}

			System.out.println(count);

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