import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt(), w = scanner.nextInt();
		for (int i = 0; i < h; i++) {
			String string = scanner.next();
			System.out.println(string);
			System.out.println(string);
		}
		scanner.close();
	}
}