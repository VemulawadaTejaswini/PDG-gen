import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = scan.nextInt();
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < k - i; j++) {
				if (k == (i * n) + (j * m)) {
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
