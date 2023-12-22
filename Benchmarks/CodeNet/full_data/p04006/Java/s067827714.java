import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long x = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}

		long sum = 0;
		for (int i = 0; i < n; i++) {
			long tmp = a[i];
			for (int j = 0; j < n; j++) {
				tmp = Math.min(tmp, a[j] + x * ((j - i + n) % n));
			}
			sum += tmp;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
