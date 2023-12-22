
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().solve();

	}

	private long getValue(long remainWeight, int currentI) {

		if (currentI == itemNum) {
			return 0;
		} else if (remainWeight < arrayItem[currentI][0]) {
			return getValue(remainWeight, currentI + 1);
		} else {
			long kati1 = getValue(remainWeight - arrayItem[currentI][0], currentI + 1) + arrayItem[currentI][1];
			long kati2 = getValue(remainWeight, currentI + 1);
			return Math.max(kati1, kati2);
		}
	}

	private long[][] arrayItem;
	private long[][] arrayMemo;
	private int itemNum = 0;
	private int weightTotalNum = 0;

	private void solve() {
		Scanner scanner = null;

		try {
			scanner = new Scanner(System.in);
			itemNum = scanner.nextInt();
			weightTotalNum = scanner.nextInt();

			arrayItem = new long[itemNum][2];
			arrayMemo = new long[itemNum][2];
			for (int i = 0; i < arrayItem.length; i++) {
				arrayItem[i][0] = scanner.nextInt();
				arrayItem[i][1] = scanner.nextInt();
			}

			System.out.println(getValue(weightTotalNum, 0));
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}