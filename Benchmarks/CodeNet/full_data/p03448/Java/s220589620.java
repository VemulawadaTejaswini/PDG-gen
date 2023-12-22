import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int a = sc.nextInt(); // 500円
		final int b = sc.nextInt(); // 100円
		final int c = sc.nextInt(); // 50円
		final int x = sc.nextInt();

		int count = 0;
		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= b; j++) {
				for (int k = 0; k <= c; k++) {
					final int sum = 500 * i + 100 * j + 50 * k;
					if (sum == x) {
						count++;
					}

				}
			}
		}

		System.out.print(count);

	}

}
