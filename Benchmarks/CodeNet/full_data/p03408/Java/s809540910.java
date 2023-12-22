
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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
		int lineAB = 0;
		int lineBC = 0;
		int lineCA = 0;

		try {
			scanner = new Scanner(System.in);
			lineAB = scanner.nextInt();
			lineBC = scanner.nextInt();
			lineCA = scanner.nextInt();

			if (lineCA <= (lineAB + lineBC)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveB() {
		Scanner scanner = null;
		int n = 0;
		int m = 0;

		try {
			scanner = new Scanner(System.in);
			n = scanner.nextInt();

			Map<String, Integer> nArray = new HashMap<String, Integer>();
			for (int i = 0; i < n; i++) {
				String key = scanner.next();
				if (!nArray.containsKey(key)) {
					nArray.put(key, 1);
				} else {
					int count = nArray.get(key);
					nArray.put(key, ++count);
				}
			}

			m = scanner.nextInt();

			for (int i = 0; i < m; i++) {
				String key = scanner.next();
				if (nArray.containsKey(key)) {
					int count = nArray.get(key);
					nArray.put(key, --count);
				}
			}

			int maxCount = 0;
			for (Iterator<Integer> iterator = nArray.values().iterator(); iterator.hasNext();) {
				maxCount = Math.max(maxCount, iterator.next());
			}

			System.out.println(maxCount);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveB2() {
		Scanner scanner = null;
		int n = 0;
		int m = 0;

		try {
			scanner = new Scanner(System.in);
			n = scanner.nextInt();

			String[] nArray = new String[n];
			for (int i = 0; i < nArray.length; i++) {
				nArray[i] = scanner.next();
			}

			m = scanner.nextInt();

			String[] mArray = new String[m];
			for (int i = 0; i < mArray.length; i++) {
				mArray[i] = scanner.next();
			}

			System.out.println("");

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