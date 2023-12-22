import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String s = scanner.nextLine();
			int origLength = s.length();
			Pattern pattern = Pattern.compile("(01|10)");
			while (true) {
				int before = s.length();
				s = pattern.matcher(s).replaceAll("");
				if (s.length() == before) {
					break;
				}
			}
			System.out.println(origLength - s.length());
		}
	}
}