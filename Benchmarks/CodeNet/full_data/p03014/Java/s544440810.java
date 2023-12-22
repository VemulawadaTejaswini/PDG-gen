

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] s = new String[h];

		for (int i = 0; i < h; i++) {
			s[i] = sc.next();
		}

		int[][] l = new int[h][w];
		int[][] r = new int[h][w];
		int[][] u = new int[h][w];
		int[][] d = new int[h][w];

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {

				if (s[i].substring(j, j + 1).equals("#")) {
					l[i][j] = 0;
					u[i][j] = 0;
					continue;
				}

				if (i == 0) {
					u[i][j] = 1;
					continue;
				}

				if (j == 0) {
					l[i][j] = 1;
					continue;
				}

				l[i][j] = l[i][j - 1] + 1;
				u[i][j] = u[i - 1][j] + 1;
			}
		}

		for (int i = h - 1; i >= 0; i--) {
			for (int j = w - 1; j >= 0; j--) {

				if (s[i].substring(j, j + 1).equals("#")) {
					r[i][j] = 0;
					d[i][j] = 0;
					continue;
				}

				if (j == w - 1) {
					r[i][j] = 1;
					continue;
				}

				if (i == h - 1) {
					d[i][j] = 1;
					continue;
				}

				r[i][j] = r[i][j + 1] + 1;
				d[i][j] = d[i + 1][j] + 1;
			}
		}

		int max = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				max = Math.max(max, l[i][j] + r[i][j] + u[i][j] + d[i][j] - 3);
			}
		}
		System.out.println(max);

	}

}
