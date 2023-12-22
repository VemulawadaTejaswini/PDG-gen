import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char req = scanner.next().charAt(0);
		scanner.close();
		System.out.println((char)(req + 1));

	}
}
