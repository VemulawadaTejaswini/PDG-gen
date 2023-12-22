import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		long count = 0;
		for (int i = 1; i < n; i++) {
			int sum = a[i] + a[i - 1];
			int k = Math.max(0, sum - x);
			count += k;
			a[i] -= k;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
