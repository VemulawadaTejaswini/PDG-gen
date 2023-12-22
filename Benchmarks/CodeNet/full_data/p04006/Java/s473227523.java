import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long x = sc.nextInt();
		long[] a = new long[n];
		long[] b = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			b[i] = a[i];
		}

		int max = 0;
		for (int i = 1; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				count += Math.max(0, b[j] - a[(j - i + n) % n]);
			}
			if (x <= count) {
				max = i;
				for (int j = 0; j < n; j++) {
					b[j] = Math.min(b[j], a[(j - i + n) % n]);
				}
			}
		}
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += b[i];
		}
		System.out.println(sum + x * max);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
