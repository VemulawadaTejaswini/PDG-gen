import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n + 1];
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		int min = 999999;
		int sum2 = 0;

		for (int i = 1; i <= n; i++) {

			sum2 += a[i];
			if (min > Math.abs(sum - sum2 - sum2)) {
				min = Math.abs(sum - sum2 - sum2);
			}

		}
		System.out.println(min);
	}
}