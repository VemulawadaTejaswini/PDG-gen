import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int k = scanner.nextInt();
			int x = scanner.nextInt();
			System.out.println((k * 500 >= x) ? "Yes" : "No");
		}
	}
}
