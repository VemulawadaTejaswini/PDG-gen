import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int x = scanner.nextInt();
		int a[] = new int[n + 1];

		for (int i = 0; i < m; i++) {
			a[scanner.nextInt()] = 1;
		}

		int left = 0;
		for (int i = 0; i <= x; i++) {
			left += a[i];
		}

		int right = 0;
		for (int i = x; i <= n; i++) {
			right += a[i];
		}

		System.out.println(Math.min(left, right));
	}
}
