import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		for (; solver.hasNextN();) {
			solver.readBodyN(in.readLine());
		}
		for (; solver.hasNextQ();) {
			solver.readBodyQ(in.readLine());
		}
	}
}

class Solver {
	private class Pos {
		int X;
		int Y;

		Pos(int x, int y) {
			super();
			X = x;
			Y = y;
		}
	}

	int N;
	int M;
	int Q;
	int cntN;
	int cntQ;
	boolean[][] grid;
	ArrayList<Pos> BlueCell;

	public void init() {
		N = 0;
		M = 0;
		Q = 0;
		cntN = 0;
		cntQ = 0;
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		N = Integer.parseInt(strArr[0]);
		M = Integer.parseInt(strArr[1]);
		Q = Integer.parseInt(strArr[2]);
		grid = new boolean[N + 1][M + 1];
		BlueCell = new ArrayList<Pos>();
	}

	public boolean hasNextN() {
		return cntN < N;
	}

	public void readBodyN(String str) {
		// System.out.println(str);
		for (int i = 0; i < M; i++) {
			grid[cntN + 1][i + 1] = str.charAt(i) == '1';
			if (str.charAt(i) == '1')
				BlueCell.add(new Pos(cntN + 1, i + 1));
		}
		cntN++;
	}

	public boolean hasNextQ() {
		return cntQ < Q;
	}

	public void readBodyQ(String str) {
		// System.out.println(str);
		String[] strArr = str.split(" ");
		int x1 = Integer.parseInt(strArr[0]);
		int y1 = Integer.parseInt(strArr[1]);
		int x2 = Integer.parseInt(strArr[2]);
		int y2 = Integer.parseInt(strArr[3]);

		int[][] gridGroup = new int[N + 1][M + 1];

		int group = 0;
		for (Pos p : BlueCell) {
			if (p.X < x1)
				continue;
			if (p.X > x2)
				continue;
			if (p.Y < y1)
				continue;
			if (p.Y > y2)
				continue;
			if (gridGroup[p.X][p.Y] != 0)
				continue;
			group++;
			setGroup(x1, y1, x2, y2, p.X, p.Y, group, gridGroup);
		}
		// for (int n = 1; n <= N; n++) {
		// for (int m = 1; m <= M; m++) {
		// // System.out.print(grid[n][m] ? "■" : "□");
		// System.out.print(gridGroup[n][m]);
		// }
		// System.out.println();
		// }

		System.out.println(group);
		cntQ++;
	}

	private void setGroup(int x1, int y1, int x2, int y2, int x, int y, int group, int[][] gridGroup) {
		gridGroup[x][y] = group;
		int nx = x - 1;
		int ny = y;
		if (x1 <= nx && x2 >= nx && y1 <= ny && y2 >= ny && gridGroup[nx][ny] == 0 && grid[nx][ny])
			setGroup(x1, y1, x2, y2, nx, ny, group, gridGroup);
		nx = x;
		ny = y - 1;
		if (x1 <= nx && x2 >= nx && y1 <= ny && y2 >= ny && gridGroup[nx][ny] == 0 && grid[nx][ny])
			setGroup(x1, y1, x2, y2, nx, ny, group, gridGroup);
		nx = x;
		ny = y + 1;
		if (x1 <= nx && x2 >= nx && y1 <= ny && y2 >= ny && gridGroup[nx][ny] == 0 && grid[nx][ny])
			setGroup(x1, y1, x2, y2, nx, ny, group, gridGroup);
		nx = x + 1;
		ny = y;
		if (x1 <= nx && x2 >= nx && y1 <= ny && y2 >= ny && gridGroup[nx][ny] == 0 && grid[nx][ny])
			setGroup(x1, y1, x2, y2, nx, ny, group, gridGroup);
	}
}
