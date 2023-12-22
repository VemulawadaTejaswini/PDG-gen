import java.util.Scanner;

public class Main {

	static int h, w, n, a[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		h = sc.nextInt();
		w = sc.nextInt();
		n = sc.nextInt();
		a = new int[n];
		for (int i = 0; i < n; ++i)
			a[i] = sc.nextInt();
		sc.close();

		int ans[][];
		ans = new int[h][w];
		int key = 0, max;

		for (int i = 0; i < h; ++i) {
			max = a[key];
			for (int j = 0; j < w; ++j) {
				if (i % 2 == 0) {
					if (max > j) {
						ans[i][j] = key + 1;
						a[key]--;
					} else {
						++key;
						if (j != w - 1) {
							max = a[key] + j;
							ans[i][j] = key + 1;
							a[key]--;
						}
					}
				} else {
					if (max > j) {
						ans[i][w - j - 1] = key + 1;
						a[key]--;
					} else {
						++key;
						if (j != w - 1) {
							max = a[key] + j;
							ans[i][w - j - 1] = key + 1;
							a[key]--;
						}
					}
				}
			}
		}

		for (int i = 0; i < h; ++i) {
			for (int j : ans[i])
				System.out.print(j + " ");
			System.out.println();
		}
	}

}
