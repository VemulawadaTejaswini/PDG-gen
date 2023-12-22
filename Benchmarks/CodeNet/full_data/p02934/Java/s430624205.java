import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();


		double number = 0;
		for (int i = 0; i < N; i++) {
			double A = scanner.nextDouble();
			number = number + ( 1 / A);
		}

		log(1 / number);

	}

	private static void log(String str) {
		System.out.println(str);
	}

	private static void log(int str) {
		System.out.println(str);
	}

	private static void log(double str) {
		System.out.println(str);
	}

}