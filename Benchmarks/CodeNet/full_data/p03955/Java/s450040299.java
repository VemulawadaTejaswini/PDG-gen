import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[3][n];
		int b[] = new int[n];
		boolean c[] = new boolean[n];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt() - 1;
			}
		}

		for (int i = 0; i < n; i++) {
			if (a[0][i] / 3 == a[1][i] / 3 && a[1][i] / 3 == a[2][i] / 3 && a[1][i] % 3 == 1) {
				b[i] = a[0][i] / 3;
				if (a[0][i] % 3 == 0 && a[2][i] % 3 == 2) {
					c[i] = true;
				} else if (a[0][i] % 3 == 2 && a[2][i] % 3 == 0) {
					c[i] = false;
				} else {
					System.out.println("No");
					return;
				}
			} else {
				System.out.println("No");
				return;
			}
		}

		for (int i = 0; i < n; i++) {
			if ((b[i] - i) % 2 != 0) {
				System.out.println("No");
				return;
			}
		}

		int d = 0;
		int r = 0;
		for (int i = 0; i < n; i++) {
			int dd = (b[i] - i) / 2;
			if (dd < 0) {
				dd = -dd;
			}
			d += dd;
			if ((dd % 2 == 0) != c[i]) {
				r += 1;
			}
		}
		if (d % 2 != 0 || d / 2 != r) {
			System.out.println("No");
			return;
		}

		System.out.println("Yes");
	}
}
