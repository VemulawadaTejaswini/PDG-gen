import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		int firstLength = S.length();

		while (true) {
			if (S.indexOf("01") != -1 || S.indexOf("10") != -1) {
				S = S.replaceAll("01", "");
				S = S.replaceAll("10", "");
			} else {
				break;
			}
		}

		System.out.println(firstLength- S.length());
	}
}