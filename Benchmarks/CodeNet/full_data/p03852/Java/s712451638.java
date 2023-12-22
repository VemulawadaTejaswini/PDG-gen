import java.util.Scanner;

public class Main {
	/**
	 * UOIAUAI
	 * @param c
	 */
	public static void main(String... args) {
		try (Scanner sc = new Scanner(System.in)) {
			String c = sc.next();
			String ans = "consonant";
			String[] vowels = {"a", "i", "u", "e", "o"};
			for (String vowel : vowels) {
				if (c.equals(vowel)) {
					ans = "vowel";
					break;
				}
			}
			System.out.println(ans);
		}
	}
}