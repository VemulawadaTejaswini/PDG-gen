
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] a = new int[n];
			int one = 0;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				if (a[i] == 1) {
					one = i;
				}
			}

			if (n == k) {
				System.out.println("1");
				return;
			}
			if (k == 2) {
				System.out.println(n - 1);
				return;
			}
			int result = n / (k - 1);
			if (0 < n % (k - 1)) {
				result++;
			}
			System.out.println(result);
		}
	}
}
