import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.close();

		if (N % 2 == 0) {
			System.out.println(N);
		} else if (N % 2 == 1) {
			System.out.println(N * 2);
		}
	}
}