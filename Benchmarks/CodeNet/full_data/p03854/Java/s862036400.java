import java.util.Scanner;

public class Main {
	private static final String[] reversedWords = {"dream", "dreamer", "erase", "eraser"};

	public static void main(String[] args) {
		String s;
		try (Scanner scanner = new Scanner(System.in)) {
			s = scanner.next();
		}

		boolean canObtain = s.replace("eraser",  "")
				.replace("erase",   "")
				.replace("dreamer", "")
				.replace("dream",   "")
				.isEmpty();

		if (canObtain) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}