import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int x = scanner.nextInt();

			if (x - a <= b) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
