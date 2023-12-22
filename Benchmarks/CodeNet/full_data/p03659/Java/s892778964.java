import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			long x;
			long y;
			long result = Long.MAX_VALUE;
			for (int i = 1; i < n; i++) {
				x = 0;
				y = 0;
				for (int j = 0; j < i; j++) {
					x += a[j];
				}
				for (int j = i; j < n; j++) {
					y += a[j];
				}
				if (Math.abs(x - y) < result) {
					result = Math.abs(x - y);
				}
			}

			System.out.println(result);
		}
	}
}