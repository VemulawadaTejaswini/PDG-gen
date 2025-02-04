import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class Main {

	/** すべての色の種類 */
	private static int MAX_COLORS = 8;

	/** 自由の色の番号 */
	private static int FREE_COLOR = 9;

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			Set<Integer> colorSet = new HashSet<>();
			int freeColorCount = IntStream.range(0, n).map(i -> {
				int color = getColor(scanner.nextInt());
				if (FREE_COLOR != color) {
					colorSet.add(color);
					return 0;
				}
				return 1;
			}).sum();
			int min = (colorSet.size() == 0 && freeColorCount > 0) ? 1 : colorSet.size();
			int max = Math.min(colorSet.size() + freeColorCount, MAX_COLORS);
			System.out.println(min + " " + max);
		}
	}

	/**
	 * @param n 入力数字
	 * @return 入力数字に該当する色ナンバー
	 */
	private static int getColor(int n) {
		if (n >= 3200) {
			return FREE_COLOR;
		}
		return n / 400;
	}
}
