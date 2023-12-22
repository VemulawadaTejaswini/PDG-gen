import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();

			int amari = a % b;
			if ((a < b) || ((d + amari) < b)) {
				System.out.println("No");
				continue;
			}

			boolean result = false;
			int max = 0;

			int counter = 10;

			while (true) {
				counter++;
				a = a - b;
				if (a < 0) {
					break;
				}
				if (a <= c) {
					a = a + d;
					if (max < a) {
						max = a;
					}
				}

				if (a == max && counter <= 1) {
					result = true;
					break;
				}
			}
			if (result) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}

	}
}