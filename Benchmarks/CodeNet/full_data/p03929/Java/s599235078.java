import java.io.IOException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int count = 0;
		for (int i = 0; i < n - 2; i++) {
			for (int j = 1; j <= 5; j++) {
				int now = (i * 7) + j;
				long sum = (now + 0) + (now + 1) + (now + 2) +
						(now + 7) + (now + 8) + (now + 9) +
						(now + 14) + (now + 15) + (now + 16);

				if (sum % 11 == k) {
					count++;
				}
			}
		}
		for (int i = 1; i < 7 * n; i++) {
		}

		System.out.println(count);
	}
}
