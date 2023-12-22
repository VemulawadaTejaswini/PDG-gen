
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
		int numX = 0;

		try {
			scanner = new Scanner(System.in);
			numA = scanner.nextInt();
			numB = scanner.nextInt();
			numX = scanner.nextInt();

			if (numX - numA <= numB && numA <= numX) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveB() {

		try (Scanner scanner = new Scanner(System.in)) {
			int numN = scanner.nextInt();
			int numM = scanner.nextInt();
			int numX = scanner.nextInt();

			Set<Integer> wk = new HashSet<Integer>();

			for (int i = 0; i < numM; i++) {
				wk.add(scanner.nextInt());
			}
			int res1 = 0;
			for (int i = numX; i <= numN; i++) {
				if (wk.contains(i)) {
					res1++;
				}

			}
			int res2 = 0;
			for (int i = 0; i <= numX; i++) {
				if (wk.contains(i)) {
					res2++;
				}

			}

			System.out.println(Math.min(res1, res2));

		}
	}

	private void solveC() {

		try (Scanner scanner = new Scanner(System.in)) {
			int numN = scanner.nextInt();
			//入力値
			long[] wk = new long[numN];
			//中央値算出用の配列
			long[] wk2 = new long[numN];

			for (int i = 0; i < wk.length; i++) {
				wk[i] = scanner.nextInt();
				wk2[i] = wk[i];
			}

			//中央値の算出
			Arrays.sort(wk2);

			//中央値の準備（１：中央値より大きい位置が除外された時の中央値　２：中央値より小さい値が除外された時の中央値）
			long m1 = wk2[(numN / 2) - 1];
			long m2 = wk2[(numN / 2)];

			for (int i = 0; i < wk.length; i++) {
				if (wk[i] <= m1) {
					System.out.println(wk2[numN / 2]);
				} else {
					System.out.println(wk2[(numN / 2) - 1]);
				}
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