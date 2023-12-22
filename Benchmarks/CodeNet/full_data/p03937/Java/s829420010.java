import java.util.Scanner;

public class Main {

	static char[][] A;
	static final int[] dx = { 1, 0, -1, 0 };
	static final int[] dy = { 0, 1, 0, -1 };
	static int H;
	static int W;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		H = in.nextInt();
		W = in.nextInt();
		A = new char[H][W];
		for (int i = 0; i < H; i++) {
			A[i] = in.next().toCharArray();
		}
		boolean[][] seen = new boolean[H][W];
		dfs(0, 0, seen);
		System.out.println(seen[H - 1][W - 1] ? "Possible" : "Impossible");
		in.close();
	}

	static void dfs(int h, int w, boolean[][] seen) {
		seen[h][w] = true;
		if (w - 1 >= 0 && seen[h][w - 1] == false && A[h][w - 1] == '#') {
			return;
		}
		if (h - 1 >= 0 && seen[h - 1][w] == false && A[h - 1][w] == '#') {
			return;
		}
		if ((h + 1 < H && A[h + 1][w] == '#') && (w + 1 < W && A[h][w + 1] == '#')) {
			return;
		}
		for (int i = 0; i < 4; i++) {
			int nh = h + dx[i];
			int nw = w + dy[i];
			if (nh < 0 || nh >= H || nw < 0 || nw >= W)
				continue;
			if (A[nh][nw] == '.')
				continue;
			if (seen[nh][nw] == true)
				continue;
			// 再帰的に探索
			dfs(nh, nw, seen);
		}
	}
}