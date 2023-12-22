import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	/** 左括弧 */
	private static final char LEFT = '(';

	/** 右括弧 */
	private static final char RIGHT = ')';

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			scanner.nextInt();
			int current = 0, noLeft = 0;
			char[] s = scanner.next().toCharArray();
			for (char c : s) {
				if (LEFT == c) {
					if (current >= 0) {
						current++;
					} else {
						noLeft -= current;
						current = 1;
					}
				} else {
					current--;
				}
			}
			if (current < 0) {
				noLeft -= current;
				current = 0;
			}
			System.out.println(repeat(LEFT, noLeft) + String.valueOf(s) + repeat(RIGHT, current));
		}
	}

	/**
	 * @param c 文字
	 * @param n 数
	 * @return 文字をn回繰り返した文字列
	 */
	private static String repeat(char c, int n) {
		StringBuilder sb = new StringBuilder();
		IntStream.range(0, n).forEach(i -> sb.append(c));
		return sb.toString();
	}
}
