import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int max = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = getInt(sc);
		int[][] candies = new int[2][n];
		for (int i = 0; i < 2; i++) {
			candies[i] = getIntArray(sc);
		}
		ArrayDeque<Status> que = new ArrayDeque<>();
		que.add(new Status(0, 0, 0));

		move(candies, n - 1, que);
		System.out.println(max);
		max = 0;
	}

	private static void move(int[][] candies, int end, ArrayDeque<Status> statusQue) {
		while (!statusQue.isEmpty()) {
			Status status = statusQue.poll();
			if (status.row == 1 && status.col == end) {
				max = Math.max(max, status.candies + candies[status.row][status.col]);
				continue;
			}
			status.candies += candies[status.row][status.col];
			if (status.row < 1) {
				statusQue.add(new Status(status.row + 1, status.col, status.candies));
			}
			if (status.col < end) {
				statusQue.add(new Status(status.row, status.col + 1, status.candies));
			}
		}
	}

	/**
	 * *汎用メソッド<br>
	 * 入力した配列に対する順列を取得
	 *
	 * @param numArray
	 * @return
	 */
	private static List<Integer[]> getPermutation(int[] numArray) {
		List<Integer[]> permutation = new ArrayList<>();
		Integer[] ans = new Integer[numArray.length];
		boolean[] used = new boolean[numArray.length];

		return buildPermutaion(permutation, numArray, ans, used, 0);
	}

	/**
	 * *汎用メソッド(内部)<br>
	 * 入力した配列に対する順列を作成
	 *
	 * @param list
	 * @param numArray
	 * @param ans
	 * @param used
	 * @param depth
	 * @return
	 */
	private static List<Integer[]> buildPermutaion(List<Integer[]> list, int[] numArray, Integer[] ans, boolean[] used,
			int depth) {

		// 全部使い切った時=>できた順列を返す
		if (depth == numArray.length) {
			list.add(ans.clone());
			return list;
		}
		// 使い切っていない場合

		for (int i = 0; i < numArray.length; i++) {
			if (used[i]) {
				continue;
			}
			ans[depth] = numArray[i];
			used[i] = true;
			list = buildPermutaion(list, numArray, ans, used, depth + 1);

			used[i] = false;
		}

		return list;
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

class Status {
	int row = 0;
	int col = 0;
	int candies = 0;

	public Status(int row, int col, int candies) {
		this.row = row;
		this.col = col;
		this.candies = candies;
	}
}
