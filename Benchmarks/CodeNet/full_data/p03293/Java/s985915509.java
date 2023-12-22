
import java.util.Arrays;
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

		try {
			scanner = new Scanner(System.in);
			int[] wk = new int[3];

			for (int i = 0; i < wk.length; i++) {
				wk[i] = scanner.nextInt();
			}

			Arrays.sort(wk);
			int res = Math.abs(wk[0] - wk[1]) + Math.abs(wk[1] - wk[2]);

			System.out.println(res);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveB() {
		Scanner scanner = null;
		char[] s;
		char[] t;

		try {
			scanner = new Scanner(System.in);
			s = scanner.next().toCharArray();
			t = scanner.next().toCharArray();

			Arrays.sort(s);
			Arrays.sort(t);
			//			int fail = 0;
			//			for (int i = 0; i < s.length; i++) {
			//				if (s[i] != t[i]) {
			//					fail++;
			//				}
			//			}

			System.out.println(String.valueOf(s).equals(String.valueOf(t)) ? "Yes" : "No");

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