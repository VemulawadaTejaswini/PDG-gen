import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = scan.nextInt();
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
//				System.out.println((i * n) + (j * m) - (2 * i * j));
				int num = (i * n) + (j * m) - (2 * i * j);
				if (k == num || k == n * m - num) {
					System.out.println("Yes");
					return;
				}

			}
		}
		System.out.println("No");
	}
	public static void main(String[] args) {
		new Main().run();
	}
}
