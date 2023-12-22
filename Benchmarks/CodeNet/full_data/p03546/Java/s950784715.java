import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int[][] c = new int[10][10];
		for (int i = 0; i < 10; ++i) {
			for (int j = 0; j < 10; ++j) {
				c[i][j] = sc.nextInt();
			}
		}
		int[][] A = new int[H][W];
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				A[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < 10; ++i) {
			for (int j = 0; j < 10; ++j) {
				for (int k = 0; k < 10; ++k) {
					c[j][k] = Math.min(c[j][k], c[j][i] + c[i][k]);
				}
			}
		}

		long ans = 0;
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				if (A[i][j] == -1)
					continue;
				ans += c[A[i][j]][1];
			}
		}
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
