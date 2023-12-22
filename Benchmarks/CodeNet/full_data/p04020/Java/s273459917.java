import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i]/2;
			a[i] %= 2;
		}
		for (int i = 1; i < n; i++) {
			if (a[i] + a[i - 1] == 2) {
				sum++;
				a[i] = a[i - 1] = 0;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
