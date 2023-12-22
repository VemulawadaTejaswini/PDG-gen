import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		long start = System.currentTimeMillis();
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int q = scanner.nextInt();
			// init
			int[] sankasha = new int[n];
			for (int i = 0; i < n; i++) {
				sankasha[i] = k;
			}

			// calc
			for (int i = 0; i < q; i++) {
				int index = scanner.nextInt();
				for (int j = 0; j < n; j++) {
					if (j != index - 1) {
						sankasha[j]--;
					}
				}
			}

			for (int i = 0; i < n; i++) {
				System.out.println(sankasha[i] > 0 ? "Yes" : "No");
			}
//			long end = System.currentTimeMillis();
//			System.out.println((end - start) + "ms");
		}
	}
}
