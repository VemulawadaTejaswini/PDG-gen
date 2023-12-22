import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = getInt(sc);
		int b = getInt(sc);
		int m = getInt(sc);

		int[] freezer = new int[a];
		int[] microwave = new int[b];

		int minFreezer = Integer.MAX_VALUE;
		int minMicrowave = Integer.MAX_VALUE;

		for (int i = 0; i < a; i++) {
			int price = getInt(sc);
			freezer[i] = price;
			if (price < minFreezer) {
				minFreezer = price;
			}
		}

		for (int i = 0; i < b; i++) {
			int price = getInt(sc);
			microwave[i] = price;
			if (price < minMicrowave) {
				minMicrowave = price;
			}
		}

		// 割引券不使用
		int min = minFreezer + minMicrowave;

		// 割引券使用
		for (int i = 0; i < m; i++) {
			int couponF = getInt(sc);
			int couponM = getInt(sc);
			int discount = getInt(sc);
			int price = freezer[couponF - 1] + microwave[couponM - 1] - discount;
			if (price < min) {
				min = price;
			}
		}
		System.out.println(min);

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
