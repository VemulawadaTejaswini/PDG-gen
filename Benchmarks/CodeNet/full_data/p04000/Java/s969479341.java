import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static int[] results = new int[10];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		boolean[][] points = new boolean[a][b];
		for (int i = 0; i < a; ++i) {

			for (int j = 0; j < b; ++j) {
				points[i][j] = false;
			}
		}
		int n = in.nextInt();
		for (int i = 0; i < n; ++i) {
			int x = in.nextInt();
			int y = in.nextInt();
			points[x - 1][y - 1] = true;

		}
		display(points, a, b);
		test(points, a, b);
		for (int i = 0; i < 10; ++i) {
			System.out.println(results[i]);
		}

	}

	public static void test(boolean[][] points, int a, int b) {
		for (int i = 0; i < a - 2; ++i) {
			for (int j = 0; j < b - 2; ++j) {
				int k = 0;
				for (int p = 0; p < 3; ++p) {
					for (int q = 0; q < 3; ++q) {
						if (points[i+p][j+q] == true) {
							k += 1;
						}
					}
				}

				results[k] += 1;
			}
		}
	}

	public static void display(boolean[][] points, int a, int b) {
		// System.out.println(a);
		// System.out.println(b);
		for (int i = 0; i < a; ++i) {
			for (int j = 0; j < b; ++j) {

				// 0 for white, 1 for black
				boolean flag = points[i][j];
				// System.out.println(i + "," + j + " " + flag);
			}
		}
	}

}
