import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int l = n - k + 1;

		int s = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print(i % l == 0 ? s - l + 1 : 1);
			System.out.print(i == n - 1 ? "\n" : " ");
		}

	}

}
