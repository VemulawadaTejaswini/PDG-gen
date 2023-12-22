import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			long[] a = IntStream.range(0, n).mapToLong(i -> scanner.nextLong()).toArray();
			System.out.println(getResult(0, n, a));
		}
	}

	/**
	 * 配列のstartからlength個の数字の中でlength-1個の数字のgcdの最大値を計算する
	 * 
	 * @param start  開始位置
	 * @param length 処理する個数
	 * @param a      配列
	 * @return startからlength個の数字の中でlength-1個の数字のgcdの最大値
	 */
	private static long getResult(int start, int length, long[] a) {
		if (length >= 4) {
			return max(gcd(gcd(start, length / 2, a), getResult(start + length / 2, length - length / 2, a)),
					gcd(getResult(start, length / 2, a), gcd(start + length / 2, length - length / 2, a)));
		} else if (3 == length) {
			return max(gcd(a[start], a[start + 1]), gcd(a[start], a[start + 2]), gcd(a[start + 1], a[start + 2]));
		} else if (2 == length) {
			return max(a[start], a[start + 1]);
		}
		return 0L;
	}

	/**
	 * 配列のstartからlength個の数字のgcdを計算する
	 * 
	 * @param start  開始位置
	 * @param length 処理する個数
	 * @param a      配列
	 * @return
	 */
	private static long gcd(int start, int length, long[] a) {
		long result = a[start];
		for (int i = 1; i < length; i++) {
			result = gcd(result, a[start + i]);
		}
		return result;
	}

	/**
	 * mとnの最大公約数を返す
	 * 
	 * @param m
	 * @param n
	 * @return mとnの最大公約数
	 */
	private static long gcd(long m, long n) {
		if (0L == n) {
			return m;
		}
		return gcd(n, m % n);
	}

	/**
	 * 配列の最大値を計算する
	 * 
	 * @param a 配列
	 * @return 配列の最大値
	 */
	private static long max(long... a) {
		return Arrays.stream(a).max().getAsLong();
	}
}
