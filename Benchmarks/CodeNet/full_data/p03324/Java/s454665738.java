import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int D = scanner.nextInt();
		int N = scanner.nextInt();
		scanner.close();

		if (N == 100) {
			N = 101;
		}

		if (D == 0) {
			System.out.println(N);
		} else if (D == 1) {
			System.out.println(N * 100);
		} else if (D == 2) {
			System.out.println(N * 10000);
		}
	}
}