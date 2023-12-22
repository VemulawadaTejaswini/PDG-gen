import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		Arrays.sort(a);
		for (int i = 1; i < n; i++) {
			if (a[i] == a[i - 1]) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
