import java.util.Scanner;

public class Main {
	private static final String[] reversedWords = {"maerd", "esare", "remaerd", "resare"};

	public static void main(String[] args) {
		String s;
		try (Scanner scanner = new Scanner(System.in)) {
			s = new StringBuffer(scanner.next()).reverse().toString();
		}

		String t = new StringBuffer(s).reverse().toString();
		String temp = "";
		while (! t.equals(temp)) {
			temp = t;
			for (String word: Main.reversedWords) {
				t = t.replaceFirst(word, "");
			}
		}

		if (t.isEmpty()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}