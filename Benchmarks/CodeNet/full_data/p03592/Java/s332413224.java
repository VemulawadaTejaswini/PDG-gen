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
				int num = 0;
				if (i == 1 || j == i) {
					num = (i * n) + (j * m) - (i * j);
				} else {
					num = (i * n) + (j * m) - (2 * i * j);
				}
				if (k == num) {
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
