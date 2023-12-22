import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int gojyu = 50;
		int hyaku = 100;
		int gohyaku = 500;
		int count = 0;

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();

		for (int i1 = 0; i1 <= A; i1++) {

			for (int i2 = 0; i2 <= B; i2++) {

				for (int i3 = 0; i3 <= C; i3++) {

					if (X - (i3 * gojyu + i2 * hyaku + i1 * gohyaku) == 0) {

						count++;

					}

				}

			}

		}

		System.out.println(count);
		sc.close();
	}
}