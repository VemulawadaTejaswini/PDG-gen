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

		int last = -1;
		for (int i = 0; i < n - 1; i++) {
			if (l <= a[i] + a[i + 1]) {
				last = i;
			}
		}
		if (0 <= last) {
			System.out.println("Possible");
			for (int j = 0; j < last; j++) {
				System.out.println((j + 1));
			}
			for (int j = n - 2; last <= j; j--) {
				System.out.println((j + 1));
			}
		} else {
			System.out.println("Impossible");
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
