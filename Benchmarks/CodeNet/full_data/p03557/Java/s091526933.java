import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			execute(scanner);
		}
	}

	private static void execute(Scanner scanner) {
		int n = scanner.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			c[i] = scanner.nextInt();
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					if ((a[i] < b[j]) && (b[j] < c[k])) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
