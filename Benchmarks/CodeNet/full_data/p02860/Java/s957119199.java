import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if (n % 2 == 1) {
			System.out.println("No");
			return;
		}

		String s = scanner.next();
		for (int i = 0; i < n / 2; i++) {
			if (s.charAt(i) != s.charAt(i + n / 2)) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

}
