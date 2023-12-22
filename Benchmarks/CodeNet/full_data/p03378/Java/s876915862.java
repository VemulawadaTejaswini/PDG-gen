import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = getInt(sc);
		int m = getInt(sc);
		int x = getInt(sc);

		int[] janctions = getIntArray(sc);
		List<Integer> jancList = new ArrayList<Integer>();
		for (int janc : janctions) {
			jancList.add(janc);
		}

		int costToN = 0;
		for (int i = x; i <= n; i++) {
			if (jancList.contains(i)) {
				costToN++;
			}
		}

		int costToZero = 0;
		for (int i = x; i >= 0; i--) {
			if (jancList.contains(i)) {
				costToZero++;
			}
		}

		if (costToN < costToZero) {
			System.out.println(costToN);
		} else {
			System.out.println(costToZero);
		}

	}

	/**
	 * *汎用メソッド <br>
	 * スキャナーからの入力値をlongで返却
	 *
	 * @return
	 */
	public static long getLong(Scanner sc) {

		return Long.parseLong(sc.next());
	}

	/**
	 * *汎用メソッド <br>
	 * スキャナーからの入力値をintで返却
	 *
	 * @return
	 */
	public static int getInt(Scanner sc) {

		return Integer.parseInt(sc.next());
	}

	/**
	 * *汎用メソッド <br>
	 * スキャナーからの入力値をStringで返却
	 *
	 * @return
	 */
	public static String getString(Scanner sc) {

		return sc.next();
	}

	/**
	 * *汎用メソッド <br>
	 * スキャナーからの入力値をint配列で返却
	 *
	 * @return
	 */
	public static int[] getIntArray(Scanner sc) {
		String line = "";
		// 直前にnext()を実行していると改行コードだけ取ってしまうのでその対策
		while (line.equals("")) {
			line = sc.nextLine();
		}

		String[] strArray = line.split(" ");
		int[] intArray = new int[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}
		return intArray;
	}

}
