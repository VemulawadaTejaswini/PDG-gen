import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	/** 座標の最大値 */
	private static final int MAX = 100;

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int[] x = new int[n], y = new int[n], h = new int[n];
			IntStream.range(0, n).forEach(i -> {
				x[i] = scanner.nextInt();
				y[i] = scanner.nextInt();
				h[i] = scanner.nextInt();
			});
			for (int i = 0; i <= MAX; i++) {
				for (int j = 0; j <= MAX; j++) {
					int ch = check(n, x, y, h, i, j);
					if (ch > 0) {
						System.out.println(i + " " + j + " " + ch);
						return;
					}
				}
			}
		}
	}

	/**
	 * 指定されたcx,cyでHを計算する
	 * 
	 * @param n  座標数
	 * @param x  X座標の一覧
	 * @param y  Y座標の一覧
	 * @param h  hの一覧
	 * @param cx
	 * @param cy
	 * @return 指定されたcx,cyで計算したH、計算できない場合は−1
	 */
	private static int check(int n, int[] x, int[] y, int[] h, int cx, int cy) {
		int ch = -1;
		for (int i = 0; i < n; i++) {
			if (h[i] > 0) {
				ch = Math.abs(x[i] - cx) + Math.abs(y[i] - cy) + h[i];
				break;
			}
		}
		for (int i = 0; i < n; i++) {
			if (h[i] != Math.max(ch - Math.abs(x[i] - cx) - Math.abs(y[i] - cy), 0)) {
				return -1;
			}
		}
		return ch;
	}
}
