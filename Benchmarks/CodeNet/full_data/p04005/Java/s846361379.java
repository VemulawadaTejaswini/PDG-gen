import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int A = scanner.nextInt(), B = scanner.nextInt(), C = scanner.nextInt();
		double D = A / 2.0;
		int x = C * B;
		System.out.println(((int) Math.abs(x * Math.ceil(D) - x * Math.floor(D))));
	}
}
