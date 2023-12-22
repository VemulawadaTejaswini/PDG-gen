import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		sc.close();

		String s2 = s1.substring(0, (s1.length() - 1) / 2);
		String s3 = s1.substring((s1.length() + 3) / 2 - 1);
		boolean result = isPalindrome(s1) && isPalindrome(s2) && isPalindrome(s3);

		System.out.println(result ? "Yes" : "No");
	}

	private static boolean isPalindrome(String text) {
		for (int i = 0; i < text.length(); i++) {
			String s1 = text.substring(i, i + 1);
			String s2 = text.substring(text.length() - i - 1, text.length() - i);
			if (!s1.equals(s2)) {
				return false;
			}
		}

		return true;
	}
}
