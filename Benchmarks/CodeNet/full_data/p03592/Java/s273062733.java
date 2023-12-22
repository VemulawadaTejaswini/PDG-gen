import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean result = false;
		int m = sc.nextInt();
		int n = sc.nextInt();
		int k = sc.nextInt();

		if (k == 0) {
			System.out.println("Yes");
			return;
		}

		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				int tmp = i * n + j * m - 2 * i * j;
				if (tmp == k) {
					System.out.println("Yes");
					return;
				}
			}
		}

		System.out.println("No");
	}
}