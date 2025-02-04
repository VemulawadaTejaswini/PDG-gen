import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 解説どおりに実装したソースコード
 */
public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int[] a = new int[n], b = new int[n], c = new int[n];
			IntStream.range(0, n).forEach(i -> a[i] = scanner.nextInt());
			IntStream.range(0, n).forEach(i -> b[i] = scanner.nextInt());
			IntStream.range(0, n).forEach(i -> c[i] = scanner.nextInt());
			Arrays.sort(a);
			// Arrays.sort(b);
			Arrays.sort(c);
			System.out.println(IntStream.range(0, n).map(i -> getLessCount(b[i], a) * getGreaterCount(b[i], c)).sum());
		}
	}

	/**
	 * 配列の中で入力数字より小さい数字の数を返す
	 * 
	 * @param i 数字
	 * @param a 配列
	 * @return 配列の中で入力数字より小さい数字の数
	 */
	private static int getLessCount(int i, int[] a) {
		int result = Arrays.binarySearch(a, i);
		if (result < 0) {
			result = (-result) - 1;
		} else {
			while ((a[result] == i) && (result >= 0)) {
				result--;
			}
			result++;
		}
		return result;
	}

	/**
	 * 配列の中で入力数字より大きい数字の数を返す
	 * 
	 * @param i 数字
	 * @param a 配列
	 * @return 配列の中で入力数字より大きい数字の数
	 */
	private static int getGreaterCount(int i, int[] a) {
		int result = Arrays.binarySearch(a, i);
		if (result < 0) {
			result = (-result) - 1;
		} else {
			while ((a[result] == i) && (result < a.length)) {
				result++;
			}
		}
		return a.length - result;
	}
}
