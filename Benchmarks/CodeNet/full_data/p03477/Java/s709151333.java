import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt(), d = scanner.nextInt();
			int left = a + b, right = c + d;
			System.out.println((left == right) ? "Balanced" : (left > right) ? "Left" : "Right");
		}
	}
}
