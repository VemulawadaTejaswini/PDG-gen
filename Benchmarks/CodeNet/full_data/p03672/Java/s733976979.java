import java.util.Scanner;

public class Main {
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		string = string.substring(0, string.length() - 1);
		boolean same = false;
		while (!same) {
			if (string.length() % 2 != 0) {
				string = string.substring(0, string.length() - 1);
			}
			for (int i = 0; i < string.length() / 2; i++) {
				if (string.charAt(i) == string.charAt(i + string.length() / 2)) {
					same = true;
				} else {
					same = false;
					break;
				}
			}
			if (same) {
				break;
			}
			string = string.substring(0, string.length() - 1);
		}
		System.out.println(string.length());
		scanner.close();
	}
}
