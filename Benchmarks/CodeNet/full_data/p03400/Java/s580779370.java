import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		final int d = sc.nextInt();
		final int x = sc.nextInt();

		int total = 0;
		for (int i = 0; i < n; i++) {

			final int a = sc.nextInt();
			int chocolate = 0;
			int date = 0;
			for (int j = 1; j <= 100; j++) {
				if (j == 1) {
					date = 1;
					chocolate++;
				} else if (j == 2) {
					date = date + 1;
					if (date > d) {
						break;
					} else {
						chocolate++;
					}
				} else {
					date = j * a + 1;
					if (date > d) {
						break;
					} else {
						chocolate++;
					}
				}
			}

			total = total + chocolate;

		}

		System.out.print(total + x);

	}

}
