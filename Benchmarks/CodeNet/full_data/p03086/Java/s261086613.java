import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String input = sc.next();
			char[] chars = input.toCharArray();
			System.out.println(count(chars));
		}
	}

	private static int count(char[] chars) {
		int len = chars.length;
		int maxCount = 0;
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (isATGC(chars[i])) {
				count++;
			} else {
				maxCount = count > maxCount ? count : maxCount;
				count = 0;
			}
		}
		maxCount = count > maxCount ? count : maxCount;
		return maxCount;
	}

	private static boolean isATGC(char c) {
		return (c == 'A' || c == 'C' || c == 'G' || c == 'T');
	}
}
