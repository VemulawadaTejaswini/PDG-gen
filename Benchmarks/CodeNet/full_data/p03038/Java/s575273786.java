import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] a = new int[n];

		long result = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);

		int b, c = 0;

		for (int i = 0; i < m; i++) {
			b = sc.nextInt();
			c = sc.nextInt();

			for (int j = 0; j < n; j++) {
				result = 0;
				if (a[j] < c) {
					a[j] = c;
					b--;
					result += a[j];
				} else if (b <= 0 || a[j] >= c) {
					result += a[j];
				}

			}

			Arrays.sort(a);

		}

		System.out.println(result);
	}

}
