import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int x = scanner.nextInt();
			int a = scanner.nextInt(), b = scanner.nextInt();
			System.out.println((Math.abs(a - x) > Math.abs(b - x)) ? "B" : "A");
		}
	}
}
