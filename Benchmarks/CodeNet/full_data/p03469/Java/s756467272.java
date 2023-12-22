import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();

		for (int i = 0; i < 10; i++) {
			if (i == 3) {
				System.out.print("8");
			} else {
				System.out.print(s.charAt(i));
			}
		}

	}
}
