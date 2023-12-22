import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.close();
		int yakusu = 0;

		for (int n = 1; n <= N; n = n + 2) {
			int count = 0;
			for (int m = 1; m <= n; m = m + 2) {
				if (n % m == 0) {
					count++;
				}

				if (count == 8) {
					yakusu++;
				}
			}
		}
		System.out.println(yakusu);
	}
}