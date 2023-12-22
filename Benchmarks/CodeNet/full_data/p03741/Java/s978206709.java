import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		long sum = 0, cost = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
			if (i % 2 == 0) {
				if (sum >= 0) {
					cost += sum + 1;
					sum = -1;
				}
			} else {
				if (sum <= 0) {
					cost += -sum + 1;
					sum = 1;
				}
			}
		}

		sum = 0;
		long cost1 = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
			if (i % 2 == 0) {
				if (sum <= 0) {
					cost1 += -sum + 1;
					sum = 1;
				}
			} else {
				if (sum >= 0) {
					cost1 += sum + 1;
					sum = -1;
				}
			}
		}

		System.out.println((cost >= cost1) ? cost1 : cost);
	}
}