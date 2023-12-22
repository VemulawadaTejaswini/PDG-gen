import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt() - 1;
		int b = sc.nextInt() - 1;
		char[][] c = new char[100][100];
		for (int i = 0; i < 50; i++) {
			for (int j = 0; j < 100; j++) {
				c[i][j] = '#';
			}
		}
		for (int i = 50; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				c[i][j] = '.';
			}
		}

		int h = 0;
		int w = 0;
		while (a > 0) {
			c[h][w] = '.';
			a--;
			w += 2;
			if (w >= 100) {
				h += 2;
				w = 0;
			}
			if (h >= 50) break;
		}

		h = 99;
		w = 0;
		while (b > 0) {
			c[h][w] = '#';
			b--;
			w += 2;
			if (w >= 100) {
				h -= 2;
				w = 0;
			}
			if (h < 50) break;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				sb.append(c[i][j]);
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
