
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
		String s = "";

		try {
			scanner = new Scanner(System.in);
			s = scanner.next();

			char[] wk = s.toCharArray();

			int cntA = 0;
			int cntB = 0;
			int cntC = 0;

			for (int i = 0; i < wk.length; i++) {
				char c = wk[i];
				if (c == 'a' && cntA == 0) {
					cntA++;
				} else if (c == 'b' && cntB == 0) {
					cntB++;
				} else if (c == 'c' && cntC == 0) {
					cntC++;
				}
			}

			System.out.println((cntA + cntB + cntC) == 3 ? "Yes" : "No");

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
		int numK = 0;

		try {
			scanner = new Scanner(System.in);
			numA = scanner.nextInt();
			numB = scanner.nextInt();
			numK = scanner.nextInt();

			List<Integer> wk = new ArrayList<Integer>();
			for (int i = numA; i <= numB; i++) {
				if (i < numA + numK || numB - numK < i) {
					wk.add(i);
				}
			}

			for (int i = 0; i < wk.size(); i++) {
				System.out.println(wk.get(i));
			}

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveC() {
		Scanner scanner = null;

		try {
			scanner = new Scanner(System.in);
			int[] wk = new int[3];
			wk[0] = scanner.nextInt();
			wk[1] = scanner.nextInt();
			wk[2] = scanner.nextInt();

			Arrays.sort(wk);

			int m3 = wk[2] * 3;
			boolean isEqual = (wk[0] + wk[1] + wk[2]) % 2 == m3 % 2;

			int targetNum = 0;
			int res = 0;
			if (isEqual) {
				targetNum = wk[2];
			} else {
				targetNum = wk[2] + 1;
			}

			boolean isPlusOne = false;
			for (int i = 0; i < wk.length; i++) {
				res += (targetNum - wk[i]) / 2;
				if (!isPlusOne) {
					isPlusOne = (targetNum - wk[i]) % 2 != 0;
				}
			}

			if (isPlusOne) {
				res++;
			}

			System.out.println(res);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private int getMaxKouyaku(int a, int b) {
		int val1 = 0;
		int val2 = 0;
		if (a < b) {
			val1 = b;
			val2 = a;
		} else {
			val1 = a;
			val2 = b;
		}

		int amari = val1 % val2;
		while (amari != 0) {
			val1 = val2;
			val2 = amari;
			amari = val1 % val2;
		}

		return val2;
	}

	private int getMinKoubai(int a, int b) {

		return a * b / getMaxKouyaku(a, b);

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