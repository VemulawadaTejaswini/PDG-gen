
import java.util.HashMap;
import java.util.Map;
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

		try {
			scanner = new Scanner(System.in);
			numA = scanner.nextInt();
			numB = scanner.nextInt();

			System.out.println((numA - 1) * (numB - 1));

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

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();

			int count = 0;
			for (int i = 1; i <= numN; i++) {
				if (i % 2 == 0) {
					continue;
				}
				int wk = i;
				Map<Integer, Integer> wkMap = new HashMap<Integer, Integer>();
				for (int j = 2; j < i;) {
					if (wk % j == 0) {
						wk /= j;
						wkMap.put(j, wkMap.get(j) == null ? 1 : wkMap.get(j) + 1);
					} else {
						j++;
					}
				}
				int wkRes = 1;
				for (Integer val1 : wkMap.values()) {
					wkRes *= (val1 + 1);
				}
				if (wkRes == 8) {
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
		char[] wkS;

		try {
			scanner = new Scanner(System.in);
			wkS = scanner.next().toCharArray();

			if (wkS[0] == '1') {
				System.out.println(wkS[1]);
			} else {
				System.out.println(wkS[0]);
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