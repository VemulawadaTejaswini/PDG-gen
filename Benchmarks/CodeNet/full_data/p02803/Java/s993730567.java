import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		int[][] S = new int[H][W];
		for (int i = 0; i < H; i++) {
			String s = sc.next();
			for (int j = 0; j < W; j++) {
				S[i][j] = s.charAt(j);
			}
		}
		System.out.println(solve(S, H, W));
	}
	static int solve(int[][] S, int H, int W) {

		int max = 0;
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				for (int ii = 0; ii < H; ii++) {
					for (int jj = 0; jj < W; jj++) {
						if (dfs(S, H, W, i, j, ii, jj) == Integer.MAX_VALUE)
							continue;
						if (S[i][j] == '#' || S[ii][jj] == '#')
							continue;
						if (max > Math.abs(i-ii)+Math.abs(j-jj))
							continue;
						max = Math.max(max, dfs(S, H, W, i, j, ii, jj));
					}
				}
			}
		}
		return max;
	}
	static int dfs(int[][] S, int H, int W, int sx, int sy, int gx, int gy) {

		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};
		int[][] d = new int[H][W];
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				d[i][j] = Integer.MAX_VALUE;
			}
		}
		Queue<Masu> q = new ArrayDeque<>();
		q.add(new Masu(sx, sy));
		d[sx][sy] = 0;
		while (q.size() > 0) {

			Masu mas = q.poll();
			if (mas.x == gx && mas.y == gy) 
				break;
			for (int i = 0; i < 4; i++) {
				int nx = mas.x + dx[i];
				int ny = mas.y + dy[i];

				if (nx >= 0 && nx < H && ny >= 0 && ny < W 
					&& S[nx][ny] != '#' && d[nx][ny] == Integer.MAX_VALUE) {
					q.add(new Masu(nx, ny));
					d[nx][ny] = d[mas.x][mas.y] + 1;
				}
			}
		}
		if (d[gx][gy] == Integer.MAX_VALUE) return 0;
		else return d[gx][gy];
	}
	static class Masu {

		int x;
		int y;
		public Masu(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}