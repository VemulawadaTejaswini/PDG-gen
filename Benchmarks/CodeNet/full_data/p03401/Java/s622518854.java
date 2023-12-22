import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int[] a = new int[n];
		int sum = 0, diff = 0, pre = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += Math.abs(pre - a[i]);
			pre = a[i];
		}
		sum += Math.abs(a[n - 1]);
		
		if ((a[0] < 0 && a[0] > a[1]) || (a[0] > 0 && a[0] < a[1])) {
			System.out.println(sum);
		} else {
			diff = a[0] * 2;
			System.out.println((int)Math.abs(sum - diff));
		}
		
		for (int i = 1; i < n - 1; i++) {
			if (((a[i] - a[i - 1]) >= 0 && (a[i + 1] - a[i] >= 0)) || ((a[i] - a[i - 1]) <= 0 && (a[i + 1] - a[i] <= 0))) {
				System.out.println(sum);
			} else {
				diff = Math.abs(a[i - 1] - a[i]) * 2;
				System.out.println((int)Math.abs(sum - diff));
			}
		}
		
		if ((a[n - 1] > 0 && a[n - 2] > a[n - 1]) || (a[n - 1] < 0 && a[n - 2] < a[n - 1])) {
			System.out.println(sum);
		} else {
			if ((a[n - 1] > 0 && a[n - 2] > 0) || (a[n - 1] < 0 && a[n - 2] < 0)) {
				diff = Math.abs(Math.abs(0 - a[n - 1]) - Math.abs(0 - a[n - 2])) * 2;
			} else {
				diff = Math.abs(a[n - 1]) * 2;
			}
			System.out.println((int)Math.abs(sum - diff));
		}
		
		sc.close();
	}
}
