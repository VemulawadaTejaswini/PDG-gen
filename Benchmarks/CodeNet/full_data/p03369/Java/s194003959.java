import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		int x = 700;

		if (string.charAt(0) == 'o') {
			x += 100;
		}
		if (string.charAt(1) == 'o') {
			x += 100;
		}
		if (string.charAt(2) == 'o') {
			x += 100;
		}

		System.out.println(x);
	}
}
