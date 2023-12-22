import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	static int acnt = 0, bcnt = 0;
	static boolean memo[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int h = sc.nextInt();
		int w = sc.nextInt();
		int sum = 0;
		char[][] map = new char[h][w];
		for (int i = 0; i < h; i++) {
			map[i] = sc.next().toCharArray();
		}
		memo = new boolean[h][w];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (map[i][j] == '.' && !memo[i][j]) {
					acnt = 0;
					bcnt = 1;
					solve(i, j, map);
					sum += acnt * bcnt;
				}
			}
		}
		System.out.println(sum);
	}

	private static void solve(int i, int j, char[][] map) {
		ArrayDeque<Pos> deque = new ArrayDeque<>();
		Pos pos = new Pos(i, j);
		deque.add(pos);
		int h = map.length;
		int w = map[0].length;
		memo[i][j] = true;
		int[] dh = { 1, -1, 0, 0 };
		int[] dw = { 0, 0, 1, -1 };
		int hh, ww;
		while (!deque.isEmpty()) {
			Pos tmp = deque.poll();
			for (int x = 0; x < 4; x++) {
				hh = dh[x] + tmp.h;
				ww = dw[x] + tmp.w;
				if (hh >= 0 && hh < h && ww >= 0 && ww < w) {
					if (map[tmp.h][tmp.w] == '.') {
						if (map[hh][ww] == '#' && !memo[hh][ww]) {
							memo[hh][ww] = true;
							deque.add(new Pos(hh, ww));
							acnt++;
						}
					} else if (map[tmp.h][tmp.w] == '#') {
						if (map[hh][ww] == '.' && !memo[hh][ww]) {
							memo[hh][ww] = true;
							deque.add(new Pos(hh, ww));
							bcnt++;
						}
					}
				}

			}
		}
	}
}

class Pos {
	int h;
	int w;

	public Pos(int h, int w) {
		this.h = h;
		this.w = w;
	}
}
