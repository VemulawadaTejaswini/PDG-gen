import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int apple = scanner.nextInt();
		int piece = scanner.nextInt();
		int applePie = 0;
		piece = apple*3 + piece;
		do {
			applePie++;
			piece = piece-2;
		} while (piece >= 1);
		System.out.println(applePie);
	}
}