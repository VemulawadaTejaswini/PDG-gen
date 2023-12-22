import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	static int h, w;
	static int[][] d;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		h = sc.nextInt();
		w = sc.nextInt();
		int x = 0, y = 0;
		char[][] map = new char[h][w];
		d = new int[h][w];
		for (int i = 0; i < h; i++) {
			map[i] = sc.next().toCharArray();
			Arrays.fill(d[i], Integer.MAX_VALUE);
		}
		map[0][0] = 'f';

		d[0][0] = 1;
		solve(map, x, y);
		int score;
		if (d[h - 1][w - 1] != Integer.MAX_VALUE) {
			int cnt = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (map[i][j] == '#') {
						cnt++;
					}
				}
			}
			score = h * w - cnt - d[h - 1][w - 1];
		} else {
			score = -1;
		}
		System.out.println(score);
	}

	private static void solve(char[][] map, int x, int y) {
		Deque<P> deque = new ArrayDeque<>();
		deque.add(new P(x, y));
		while (!deque.isEmpty()) {
			P p = deque.poll();
			if (p.x == w && p.y == h) {
				break;
			}
			for (int i = 0; i < 4; i++) {
				int xx = p.x + dx[i];
				int yy = p.y + dy[i];
				if (xx >= 0 && xx < w && yy >= 0 && yy < h && map[yy][xx] == '.' && d[yy][xx] == Integer.MAX_VALUE) {
					deque.add(new P(xx, yy));
					d[yy][xx] = d[p.y][p.x] + 1;
				}
			}
		}
	}
}

class P {
	int x;
	int y;

	public P(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
