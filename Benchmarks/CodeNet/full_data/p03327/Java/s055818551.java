import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			System.out.println((n > 999) ? "ABD" : "ABC");
		}
	}
}
