
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		//				new Main().solveA();
		new Main().solveB();
		//		new Main().solveC();
		// new Main().solveD();
	}

	private void solveA() {
		Scanner scanner = null;
		int numA = 0;
		int numB = 0;
		int numC = 0;
		int numD = 0;

		try {
			scanner = new Scanner(System.in);
			numA = scanner.nextInt();
			numB = scanner.nextInt();
			numC = scanner.nextInt();
			numD = scanner.nextInt();

			boolean canTalk = false;

			canTalk = ((Math.abs(numA - numB) <= numD && Math.abs(numB - numC) <= numD)
					|| Math.abs(numA - numC) <= numD);

			System.out.println(canTalk ? "Yes" : "No");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveB() {
		Scanner scanner = null;
		int numX = 0;

		try {
			scanner = new Scanner(System.in);
			numX = scanner.nextInt();

			int max = 0;
			for (int i = 1; i <= numX; i++) {
				for (int j = 1; j < 10; j++) {
					if (Math.pow(i, j) <= numX) {
						max = Math.max(max, (int) Math.pow(i, j));
					} else {
						break;
					}
				}
			}

			System.out.println(max);
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static class StrComparator implements Comparable<String> {

		@Override
		public int compareTo(String o) {
			// TODO 自動生成されたメソッド・スタブ
			return 0;
		}

	}

	/**
	 * 文字列を切り出す作業を実際にやってみると、文字列長はnumKまででいいことがわかる。
	 *abcoder
	*
	*a
	*ab
	*abc
	*abco
	*abcod
	*--abcode
	*--abcoder
	*b
	*bc
	*bco
	*bcod
	*bcode
	*--bcoder
	*co
	*cod
	*code
	*coder

	*/

	private void solveC() {
		Scanner scanner = null;
		String s = "";
		int numK = 0;

		try {
			scanner = new Scanner(System.in);
			s = scanner.next();
			numK = scanner.nextInt();
			Set<String> wk = new HashSet<String>();

			String wkS = "";
			for (int i = 0; i < s.length(); i++) {
				int max = i + numK < s.length() ? i + numK : s.length();
				for (int j = i; j <= max; j++) {
					wkS = s.substring(i, j);
					if (wkS != null && !wkS.equals("")) {
						wk.add(wkS);
					}
				}
			}

			List<String> wkList = new ArrayList<String>();
			for (String string : wk) {
				wkList.add(string);
			}

			Collections.sort(wkList);

			System.out.println(wkList.get(numK - 1));

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