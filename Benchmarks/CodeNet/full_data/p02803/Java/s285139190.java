import java.util.*;

class Main {
	static int[] dy = { 1, 0, -1, 0 };
	static int[] dx = { 0, 1, 0, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[] S = new String[H];
		for (int i = 0; i < H; i++) {
			S[i] = sc.next(); // 行ごとに入力
		}

		Deque<Point> dq = new ArrayDeque<Point>();
		int[][] d = new int[H][W];
		boolean[][] v = new boolean[H][W];
		int max = 0;

		// bfs
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (S[i].charAt(j) == '.') {
					dq.add(new Point(j, i));
					d[i][j] = 0;
					v[i][j] = true;
					while (!dq.isEmpty()) {
						Point now = dq.pollFirst();
						int hy = now.y;
						int hx = now.x;

						for (int k = 0; k < 4; k++) {
							int nx = hx + dx[k];
							int ny = hy + dy[k];
							// 迷路上の動ける点で、訪問済みでない点をキューに追加する
							if (0 <= nx && nx < W && 0 <= ny && ny < H && S[ny].charAt(nx) == '.' && !v[ny][nx]) {
								v[ny][nx] = true;
								d[ny][nx] = d[hy][hx] + 1;
								max = Math.max(d[ny][nx], max); // MAXの更新
								dq.add(new Point(nx, ny));
							}
						}
					}
					for (int k = 0; k < H; k++) {
						Arrays.fill(v[k], false); // 訪問済み情報のクリア
					}
				}
			}
		}
		System.out.println(max);
		sc.close();
	}

	static class Point {
		int y;
		int x;

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
