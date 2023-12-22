import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long l = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n - 1; i++) {
			if (l <= a[i] + a[i + 1]) {
				System.out.println("Possible");
				for (int j = 0; j < i; j++) {
					System.out.println((j + 1));
				}
				for (int j = n - 2; i <= j; j--) {
					System.out.println((j + 1));
				}
				return;
			}
		}
		System.out.println("Impossible");
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
