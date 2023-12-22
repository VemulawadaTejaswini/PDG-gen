import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();
		int sum = 0;
		int count = 1;

		for (int i = 0; i < n; i++) {
			int d = sc.nextInt();
			sum += d;

			if (sum <= x) {
				count++;
			}
		}

		System.out.println(count);

		sc.close();

	}
}
