import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();
		long fizzBuzzSum = 0;

		for (int i = 0; i <= number; i++) {

			if (i % 3 != 0 && i % 5 != 0 && i % 15 != 0) {
				fizzBuzzSum = fizzBuzzSum + i;
			}

		}

		System.out.println(fizzBuzzSum);

		scanner.close();
	}

}
