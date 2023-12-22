import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			execute(scanner);
		}
	}

	private static void execute(Scanner scanner) {
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		System.out.println((x - z) / (y + z));
	}
}
