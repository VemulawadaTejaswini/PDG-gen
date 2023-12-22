import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		String op = scanner.next();
		int b = scanner.nextInt();

		if (op.charAt(0) == '+') {
			System.out.println(a + b);
		} else {
			System.out.println(a - b);
		}

	}
}
