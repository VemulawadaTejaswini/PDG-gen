import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x[][] = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				x[i][j] = 0;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				for (int k = -1; k <= 1; k++) {
					for (int l = -1; l <= 1; l++) {
						if (i + k < 0 || i + k > n - 1 || j + l < 0 || j + l > m - 1) continue;
						if (x[i + k][j + l] == 1) {
							x[i + k][j + l] = 0;
						} else {
							x[i + k][j + l] = 1;
						}
					}
				}
			}
		}

		long ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (x[i][j] == 1) ans++;
			}
		}

		System.out.println(ans);

		sc.close();

	}

}