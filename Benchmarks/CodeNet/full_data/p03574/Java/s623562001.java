import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	private static final char BOMB = '#';

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int h = scanner.nextInt(), w = scanner.nextInt();
			char[][] s = new char[h][];
			IntStream.range(0, h).forEach(i -> s[i] = scanner.next().toCharArray());
			IntStream.range(0, h).forEach(i -> IntStream.range(0, w).forEach(j -> calcCount(i, j, h, w, s)));
			IntStream.range(0, h).forEach(i -> System.out.println(s[i]));
		}
	}

	private static void calcCount(int i, int j, int h, int w, char[][] s) {
		if (BOMB != s[i][j]) {
			int count = 0;
			if (i > 0) {
				if (j > 0) {
					count += (BOMB == s[i - 1][j - 1]) ? 1 : 0;
				}
				count += (BOMB == s[i - 1][j]) ? 1 : 0;
				if (j < w - 1) {
					count += (BOMB == s[i - 1][j + 1]) ? 1 : 0;
				}
			}
			if (j > 0) {
				count += (BOMB == s[i][j - 1]) ? 1 : 0;
			}
			if (j < w - 1) {
				count += (BOMB == s[i][j + 1]) ? 1 : 0;
			}
			if (i < h - 1) {
				if (j > 0) {
					count += (BOMB == s[i + 1][j - 1]) ? 1 : 0;
				}
				count += (BOMB == s[i + 1][j]) ? 1 : 0;
				if (j < w - 1) {
					count += (BOMB == s[i + 1][j + 1]) ? 1 : 0;
				}
			}
			s[i][j] = (char) ('0' + count);
		}
	}
}
