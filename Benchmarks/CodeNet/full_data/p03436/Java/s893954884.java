import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * AtCoder Beginner Contest 088 D "Grid Repainting"
 *   https://abc088.contest.atcoder.jp/tasks/abc088_d/
 */
public class Main {

	public static void main(String[] args) {

		InputScanner in = new InputScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int H = in.nextInt();
		int W = in.nextInt();
		String[][] s = in.nextStringArray(H, "");

		Main main = new Main();
		Grid grid = main.new Grid(H, W, s, "#", ".");

		// 最短距離記録用
		int[][] dist = new int[H][W];
		for (int i = 0; i < H; i++) {
			Arrays.fill(dist[i], -1);
		}
		dist[0][0] = 1;

		// 幅優先探索用キュー
		LinkedList<Cell> searchCells = new LinkedList<Cell>();
		searchCells.offer(main.new Cell(0, 0));

		// 幅優先探索
		while (!searchCells.isEmpty()) {

			Cell searchCell = searchCells.poll();
			LinkedList<Cell> nearCells = grid.getNearCells(searchCell.x, searchCell.y);

			while (!nearCells.isEmpty()) {

				Cell nearCell = nearCells.poll();
				if (dist[nearCell.x][nearCell.y] < 0 && grid.isRoad(nearCell)) {
					dist[nearCell.x][nearCell.y] = dist[searchCell.x][searchCell.y] + 1;
					searchCells.offer(nearCell);
				}
			}
		}

		int ans = dist[H - 1][W - 1];
		if (ans > 0) {
			ans = grid.getRoadNum() - ans;
		}

		out.println(ans);

		in.close();
		out.close();
	}

	class Grid {

		int height;
		int width;
		String[][] grid;
		String WALL;
		String ROAD;

		public Grid(int height, int width, String[][] input, String wall, String road) {
			this.height = height;
			this.width = width;
			this.grid = input;
			this.WALL = wall;
			this.ROAD = road;
		}

		public boolean isRoad(int hIndex, int wIndex) {
			if (grid[hIndex][wIndex].equals(this.ROAD)) {
				return true;
			} else {
				return false;
			}
		}

		public boolean isRoad(Cell cell) {
			return isRoad(cell.x, cell.y);
		}

		public boolean isOver(int hIndex, int wIndex) {
			if (hIndex < 0 | this.height - 1 < hIndex) {
				return true;
			}
			if (wIndex < 0 | this.width - 1 < wIndex) {
				return true;
			}
			return false;
		}

		public boolean isOver(Cell cell) {
			return isOver(cell.x, cell.y);
		}

		public String getCell(int hIndex, int wIndex) {
			return grid[hIndex][wIndex];
		}

		public String getCell(Cell cell) {
			return getCell(cell.x, cell.y);
		}

		public LinkedList<Cell> getNearCells(int hIndex, int wIndex) {

			LinkedList<Cell> cells = new LinkedList<Cell>();

			if (!isOver(hIndex - 1, wIndex)) {
				cells.offer(new Cell(hIndex - 1, wIndex));
			}
			if (!isOver(hIndex + 1, wIndex)) {
				cells.offer(new Cell(hIndex + 1, wIndex));
			}
			if (!isOver(hIndex, wIndex - 1)) {
				cells.offer(new Cell(hIndex, wIndex - 1));
			}
			if (!isOver(hIndex, wIndex + 1)) {
				cells.offer(new Cell(hIndex, wIndex + 1));
			}

			return cells;
		}

		public LinkedList<Cell> getNearCells(Cell cell) {
			return getNearCells(cell.x, cell.y);
		}

		public int getRoadNum() {
			int ret = 0;
			for (int i = 0; i < this.height; i++) {
				for (int j = 0; j < this.width; j++) {
					if (isRoad(i, j)) {
						ret++;
					}
				}
			}
			return ret;
		}

	}

	class Cell {

		int x;
		int y;

		public Cell(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public String print() {
			return x + " " + y;
		}

	}

	/*
	 * extends java.util.Scanner
	 */
	static class InputScanner {

		Scanner scanner;

		public InputScanner(InputStream inputStream) {
			this.scanner = new Scanner(inputStream);
		}

		public int nextInt() {
			return scanner.nextInt();
		}

		public long nextLong() {
			return scanner.nextLong();
		}

		public double nextDouble() {
			return scanner.nextDouble();
		}

		public String next() {
			return scanner.next();
		}

		public int[] nextIntArray(int n) {
			int[] ret = new int[n];
			for (int i = 0; i < n; i++) {
				ret[i] = scanner.nextInt();
			}
			return ret;
		}

		public int[][] nextIntArray(int h, int w) {
			int[][] ret = new int[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					ret[i][j] = scanner.nextInt();
				}
			}
			return ret;
		}

		public long[] nextLongArray(int n) {
			long[] ret = new long[n];
			for (int i = 0; i < n; i++) {
				ret[i] = scanner.nextLong();
			}
			return ret;
		}

		public long[][] nextlongArray(int h, int w) {
			long[][] ret = new long[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					ret[i][j] = scanner.nextLong();
				}
			}
			return ret;
		}

		public double[] nextDoubleArray(int n) {
			double[] ret = new double[n];
			for (int i = 0; i < n; i++) {
				ret[i] = scanner.nextDouble();
			}
			return ret;
		}

		public double[][] nextDoubleArray(int h, int w) {
			double[][] ret = new double[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					ret[i][j] = scanner.nextLong();
				}
			}
			return ret;
		}

		public String[] nextStringArray(int n) {
			String[] ret = new String[n];
			for (int i = 0; i < n; i++) {
				ret[i] = scanner.next();
			}
			return ret;
		}

		public String[] nextStringArray(String split) {
			String[] ret = scanner.next().split(split);
			return ret;
		}

		public String[][] nextStringArray(int h, int w) {
			String[][] ret = new String[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					ret[i][j] = scanner.next();
				}
			}
			return ret;
		}

		public String[][] nextStringArray(int h, String split) {
			String[][] ret = new String[h][];
			for (int i = 0; i < h; i++) {
				ret[i] = scanner.next().split(split);
			}
			return ret;
		}

		public void close() {
			scanner.close();
		}

	}

}
