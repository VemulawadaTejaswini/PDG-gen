
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

		try {
			scanner = new Scanner(System.in);

			System.out.println((scanner.nextInt() - scanner.nextInt()) + 1);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveB() {
		Scanner scanner = null;
		int numH = 0;
		int numW = 0;

		try {
			scanner = new Scanner(System.in);
			numH = scanner.nextInt();
			numW = scanner.nextInt();

			char[][] wk = new char[numH][numW];

			char[] def = new char[numW];
			for (int i = 0; i < numW; i++) {
				def[i] = '@';
			}

			int index = Integer.MAX_VALUE;
			for (int i = 0; i < numH; i++) {
				String wkS = scanner.next();
				if (wkS.indexOf('#') < 0) {
					wk[i] = def;
				} else {
					index = Math.min(i, index);
					wk[i] = wkS.toCharArray();
				}
			}
			char[] wk1 = wk[index];
			for (int i = 0; i < numW; i++) {
				if (wk1[i] == '.') {
					int count = 0;
					for (int j = 0; j < numH; j++) {
						if (wk[j][i] == '.' || wk[j][i] == '@') {
							count++;
						}
					}
					if (count == numH) {
						for (int j = 0; j < numH; j++) {
							wk[j][i] = '@';
						}
					}
				}
			}
			for (int i = 0; i < numH; i++) {
				StringBuilder builder = new StringBuilder();
				for (int j = 0; j < numW; j++) {
					if (wk[i][j] != '@') {
						builder.append(wk[i][j]);
					}
				}
				if (builder.length() != 0) {
					System.out.println(builder.toString());
				}
			}

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	/**
	 * Cは、とりあえず|r|に移動して|r|+|r+numK|-|r|
	 * を右と左から実施する。
	 * |  1---N  | 0 |  1---N  |
	 * というように、0より大きい場合も0より小さい場合もあるので。
	 */
	private void solveC() {
		Scanner scanner = null;
		int numN = 0;
		int numK = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();
			numK = scanner.nextInt();

			if (numK == 1) {
				System.out.println(0);
				return;
			}
			int[] wk = new int[numN];
			for (int i = 0; i < numN; i++) {
				wk[i] = scanner.nextInt();
			}

			int plusNumK = numK - 1;
			int res = Integer.MAX_VALUE;
			for (int i = 0; i < wk.length - plusNumK; i++) {
				res = Math.min(res, Math.abs(wk[i]) + Math.abs(wk[i] - wk[i + plusNumK]));
			}

			for (int i = wk.length - 1; i >= plusNumK; i--) {
				res = Math.min(res, Math.abs(wk[i]) + Math.abs(wk[i] - wk[i - plusNumK]));
			}
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