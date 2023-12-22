import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if (a > b) {
				System.out.println(a + Math.max(a - 1, b));
			} else {
				System.out.println(b + Math.max(a, b - 1));
			}
		}
	}
}
