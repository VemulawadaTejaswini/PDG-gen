import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		double output = 0;

		if (n == 1) {

			output = 1;

		} else if (n == 2) {

			output = 0.5;
		}

		if (n % 2 == 1) {

			output = (n / 2 + 1) / n;

		} else {
			System.out.println((n / 2) / n);

			output = (n / 2) / 2;

		}

		System.out.println(output);
	}

}