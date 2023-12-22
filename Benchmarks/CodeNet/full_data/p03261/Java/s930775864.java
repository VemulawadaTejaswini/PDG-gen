
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set<String> saidWords = new HashSet<String>();

		int n = scanner.nextInt();
		scanner.nextLine();
		String wi_1 = scanner.nextLine();
		boolean isSafe = true;
		for (int i = 1; i < n && isSafe; i++) {
			String wi = scanner.nextLine();
			if (!wi.startsWith(wi_1.substring(wi_1.length()-1))) {
				isSafe = false;
			}
			if (saidWords.contains(wi)) {
				isSafe = false;
			}
			saidWords.add(wi);
			wi_1 = wi;
		}

		if (isSafe) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}