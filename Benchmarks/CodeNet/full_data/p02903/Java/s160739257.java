

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int[][] ans = new int[h][w];
		boolean flg = true;

		if (h == 1 || w == 1) {

			if (h == 1) {
				if (b != 0) {
					flg = false;
				} else {
					for (int i = 0; i < w; i++) {
						if (i < a)
							ans[0][i] = 0;
						else
							ans[0][i] = 1;
					}
				}
			}

			if (w == 1) {
				if (a != 0) {
					flg = false;
				} else {
					for (int i = 0; i < h; i++) {
						if (i < b)
							ans[i][0] = 0;
						else
							ans[i][0] = 1;
					}
				}
			}
		} else {

			if ((a == 0 && b != 0) || a != 0 && b == 0)
				flg = false;
			else {

				for (int i = 0; i < h; i++) {
					for (int j = 0; j < w; j++) {

						if (i < b) {
							if (j < a)
								ans[i][j] = 0;
							else
								ans[i][j] = 1;
						} else {
							if (j < a)
								ans[i][j] = 1;
							else
								ans[i][j] = 0;
						}
					}
				}
			}
		}

		if (flg) {
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					System.out.print(ans[i][j]);
				}
				System.out.println();
			}
		} else {
			System.out.println("No");
		}

	}

}
