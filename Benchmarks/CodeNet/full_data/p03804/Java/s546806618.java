import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[] a = new String[n];
		String[] b = new String[m];
		for (int i = 0; i < n; i++) {
			a[i] = sc.next();
		}
		for (int i = 0; i < m; i++) {
			b[i] = sc.next();
		}
		for (int l = 0; l < n - m + 1; l++) {
			for (int k = 0; k < n - m + 1; k++) {
				int count = 0;
				for (int i = 0; i < m; i++) {
					for (int j = 0; j < m; j++) {
						if (a[i + k].charAt(j + l) == b[i].charAt(j)) {
							count++;
						}
					}
				}
				if (count == m * m) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}