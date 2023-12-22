import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int max = Math.max(a + b, a - b);
		max = Math.max(max, a * b);

		System.out.println(max);

	}
}
