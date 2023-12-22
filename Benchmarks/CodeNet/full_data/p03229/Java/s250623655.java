
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		int a[], b[];

		n = sc.nextInt();

		a = new int[n];
		b = new int[n];

		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
		}
		int min = 0;
		for (int i = 0; i < n; ++i) {
			min = i;
			for (int j = i + 1; j < n; ++j) {
				if (a[min] > a[j])
					min = j;
			}
			if (min != i) {
				int tmp = a[i];
				a[i] = a[min];
				a[min] = tmp;
			}
		}
		for (int i = 0; i < n; ++i) {
			if (2 * (i + 1) < n) {
				b[i] = a[2 * (i + 1)];
			} else if (2 * (i + 1) < n + 2) {
				b[i] = a[0];
			} else {
				b[i] = a[2 * (n - i) - 1];
			}
		}

		if (n % 2 == 0) {
			int tmp = b[n / 2 + 1];
			b[n / 2 + 1] = b[n - 1];
			b[n - 1] = tmp;
		}

		int sum = 0;
		for (int i = 0; i < n - 1; ++i) {
			sum += Math.abs(b[i] - b[i + 1]);
		}

		System.out.println(sum);
		sc.close();
	}

}
