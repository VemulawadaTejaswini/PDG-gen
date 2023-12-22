import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		int firstLength = S.length();

		while (true) {
			boolean found = false;
			if (S.indexOf("01") != -1) {
				S = S.replaceAll("01", "");
				found = true;
			}
			if (S.indexOf("10") != -1) {
				S = S.replaceAll("10", "");
				found = true;
			}
			if (!found) {
				break;
			}
		}

		System.out.println(firstLength - S.length());
	}
}