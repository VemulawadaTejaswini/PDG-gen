import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];

		int sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}

		int min = Integer.MAX_VALUE;
		int tmp = sum;
		for (int i = 0; i < n - 1; i++) {
			sum -= a[i];
			min = Math.min(min, Math.abs(tmp - sum - sum));
		}

		System.out.println(min);

		sc.close();

	}

}