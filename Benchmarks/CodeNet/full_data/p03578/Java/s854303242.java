import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			execute(scanner);
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static void execute(Scanner scanner) {
		int n = scanner.nextInt();
		int[] d = new int[n];
		for (int i = 0; i < n; i++) {
			d[i] = scanner.nextInt();
		}
		int m = scanner.nextInt();
		int[] t = new int[m];
		for (int i = 0; i < m; i++) {
			t[i] = scanner.nextInt();
		}
		Arrays.sort(d);
		Arrays.sort(t);
		int j = 0;
		for (int i = 0; i < m; i++) {
			while (j < n && t[i] != d[j]) {
				j++;
			}
			if (j < n && t[i] == d[j]) {
				j++;
				continue;
			}
			if (j == n) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
