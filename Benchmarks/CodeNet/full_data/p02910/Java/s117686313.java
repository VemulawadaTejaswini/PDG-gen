import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int n = s.length();
		for (int i = 1; i <= n; i++) {
			if ((i % 2 == 1 && s.charAt(i - 1) == 'L') || (i % 2 == 0 && s.charAt(i - 1) == 'R')) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

}
