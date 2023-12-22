import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		int[] a = new int[n];
		int min = 1001;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			if (a[i] < min) {
				min = a[i];
			}
			sum += a[i];
		}

		System.out.println((x-sum)/min + n);
	}
}
