import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
			}
			boolean zero = true;
			boolean match = true;
			for (int i = 0; i < n; i++) {
				b[i] = scanner.nextInt();
				if (b[i] != 0) {
					zero = false;
				}
				if (a[i] != b[i]) {
					match = false;
				}
			}

			if (match) {
				System.out.println(0);
				return;
			}

			if (zero) {
				System.out.println(2);
				return;
			}

			long result = 0;
			while (true) {
				int minDiff = Integer.MAX_VALUE;
				match = true;
				for (int i = 0; i < n; i++) {
					int temp = a[i] - b[i];
					if (temp == 0) {
						continue;
					}
					if (temp <= b[i]) {
						System.out.println(-1);
						return;
					}
					if (temp < minDiff) {
						minDiff = temp;
					}
				}

				if (minDiff == Integer.MAX_VALUE) {
					System.out.println(result);
					return;
				}

				result += Math.pow(2, minDiff);
				for (int i = 0; i < n; i++) {
					if (a[i] == b[i]) {
						continue;
					}
					int temp = a[i] % minDiff;
					if (temp < b[i]) {
						continue;
					}
					a[i] = temp;
				}
			}
		}
	}
}
