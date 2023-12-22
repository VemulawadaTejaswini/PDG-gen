import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}

		int max = 0;
		for (int i = 0; i <= 100000; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (a[j] == i || a[j] - 1 == i || a[j] + 1 == i) {
					count++;
				}
			}
			max = Math.max(max, count);
		}
		
		System.out.println(max);
	}
}
