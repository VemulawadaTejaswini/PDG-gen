import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a[] = new int[n];
		int copy[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			copy[i] = a[i];
		}
		Arrays.sort(copy);

		for (int i = 0; i < n; i++) {
			int remove = a[i];

			if (remove == copy[n - 1]) {
				System.out.println(copy[n - 2]);
			} else {
				System.out.println(copy[n - 1]);
			}
		}
	}
}