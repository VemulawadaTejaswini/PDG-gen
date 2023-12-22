import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s = scanner.next();

		System.out.println((n - s.replaceAll("ABC", "").length()) / 3);

	}

}
