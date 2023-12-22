import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		if (s.charAt(0) != 'A') {
			System.out.println("WA");
			return;
		}
		int count = 0;

		for (int i = 2; i < s.length() - 1; i++) {
			if (s.charAt(i) == 'C') {
				count++;
			}
		}
		if (count != 1) {
			System.out.println("WA");
			return;
		}
		for (int i = 1; i < s.length(); i++) {

			if (Character.isUpperCase(s.charAt(i))
					&& s.charAt(i) != 'C') {
				System.out.println("WA");
				return;
			}
		}
		System.out.println("AC");

	}
}