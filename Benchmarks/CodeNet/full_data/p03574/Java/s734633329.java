import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] map = new char[h][w];
		for (int i = 0; i < h; i++) {
			map[i] = sc.next().toCharArray();
		}
		find(map, h, w);
		show(map, h, w);
	}

	private static void show(char[][] map, int h, int w) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				sb.append(map[i][j]);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}

	private static void find(char[][] map, int h, int w) {
		int[] dw = { -1, 0, 1, -1, 1, -1, 0, 1 };
		int[] dh = { 1, 1, 1, 0, 0, -1, -1, -1 };
		int ww, hh;
		char cnt = '0';
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (map[i][j] == '#')
					continue;
				cnt = '0';
				for (int k = 0; k < 8; k++) {
					ww = dw[k] + j;
					hh = dh[k] + i;
					if (ww >= 0 && ww < w && hh >= 0 && hh < h) {
						if (map[hh][ww] == '#') {
							cnt++;
						}
					}
				}
				map[i][j] = cnt;
			}
		}
	}
}
