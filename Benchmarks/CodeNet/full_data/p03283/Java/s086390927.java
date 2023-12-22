import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();
		int[][] a = new int[n + 1][n + 1];
		for (int i = 0; i < m; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			a[l][r]++;

		}

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				a[i][j] += a[i - 1][j];
			}
		}

		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				a[i][j] += a[i][j - 1];
			}
		}

		while (q-- > 0) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			System.out.println(a[r][r] - a[r][l - 1] - a[l - 1][r] + a[l - 1][l - 1]);
		}
	}
}
