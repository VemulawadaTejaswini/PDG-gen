import java.util.Scanner;

public class Main {
	static char[][] map;

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int H = s.nextInt();
			final int W = s.nextInt();

			map = new char[H][];
			for (int h = 0; h < H; h++) {
				map[h] = s.next().toCharArray();
			}

			int max = 0;
			for (int h = 0; h < H; h++) {
				for (int w = 0; w < W; w++) {
					if (map[h][w] == '#') {
						continue;
					}

					int tmp = 1;
					tmp += up(h - 1, w, 1);
					tmp += down(h + 1, w, 1);
					tmp += left(h, w - 1, 1);
					tmp += right(h, w + 1, 1);
					max = Math.max(max, tmp);
				}
			}
			System.out.println(max);
		}
	}

	static int up(int h, int w, int x) {
		if (h < 0) {
			return x - 1;
		}
		if (map[h][w] == '#') {
			return x - 1;
		}
		return up(h - 1, w, x + 1);
	}

	static int down(int h, int w, int x) {
		if (h >= map.length) {
			return x - 1;
		}
		if (map[h][w] == '#') {
			return x - 1;
		}
		return down(h + 1, w, x + 1);
	}

	static int left(int h, int w, int x) {
		if (w < 0) {
			return x - 1;
		}
		if (map[h][w] == '#') {
			return x - 1;
		}
		return left(h, w - 1, x + 1);
	}

	static int right(int h, int w, int x) {
		if (w >= map[h].length) {
			return x - 1;
		}
		if (map[h][w] == '#') {
			return x - 1;
		}
		return right(h, w + 1, x + 1);
	}
}
