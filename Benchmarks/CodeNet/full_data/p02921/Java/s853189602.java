import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String s = scanner.next();
			String t = scanner.next();

			int result = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == t.charAt(i)) {
					result++;
				}
			}

			System.out.println(result);
		}
	}
}