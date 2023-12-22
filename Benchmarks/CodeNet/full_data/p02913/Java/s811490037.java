import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			char[] s = scanner.next().toCharArray();
			int max = 0;
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (s[i] == s[j]) {
						max = Math.max(max, sameLength(s, i, j));
					}
				}
			}
			System.out.println(max);
		}
	}

	/**
	 * @param s
	 * @param i
	 * @param j
	 * @return sのiからの部分列とjからの部分列の一致する最大の長さ
	 */
	private static int sameLength(char[] s, int i, int j) {
		for (int k = 1; k < Math.min(s.length - j, j - i); k++) {
			if (s[i + k] != s[j + k]) {
				return k;
			}
		}
		return Math.min(s.length - j, j - i);
	}
}
