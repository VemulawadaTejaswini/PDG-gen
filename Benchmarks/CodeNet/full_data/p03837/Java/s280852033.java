import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];
		int[] b = new int[m];
		int[] c = new int[m];
		int[][] min = new int[n][n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(min[i], 1 << 20);
			min[i][i] = 0;
		}
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
			c[i] = sc.nextInt();
			min[a[i]][b[i]] = Math.min(min[a[i]][b[i]], c[i]);
			min[b[i]][a[i]] = Math.min(min[b[i]][a[i]], c[i]);
		}

		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					min[i][j] = Math.min(min[i][j], min[i][k] + min[k][j]);
				}
			}
		}

		boolean[] flag = new boolean[m];
		for (int k = 0; k < m; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (min[i][a[k]] + c[k] + min[b[k]][j] == min[i][j]) {
						flag[k] = true;
						break;
					}
				}
			}
		}

		int count = 0;
		for (int i = 0; i < m; i++) {
			if (flag[i]) {
				count++;
			}
		}
		System.out.println(m - count);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
