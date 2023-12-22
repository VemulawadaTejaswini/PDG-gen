import java.util.Scanner;

public class Main {
	private static final String[] words = {"dream", "erase", "dreamer", "eraser"};

	public static void main(String[] args) {
		String s;
		try (Scanner scanner = new Scanner(System.in)) {
			s = scanner.next();
		}

		String t = s;
		String temp = "";
		while (! t.equals(temp)) {
			temp = t;
			for (String word: Main.words) {
				t = t.replaceFirst(word + "$", "");
			}
		}

		if (t.isEmpty()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}