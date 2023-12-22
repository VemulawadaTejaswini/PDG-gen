import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		for (; solver.hasNext();) {
			solver.readBody(in.readLine());
		}
		solver.solve();
	}
}

class Solver {
	int H;
	int W;
	int cnt;

	public void init() {
		H = 0;
		W = 0;
		cnt = 0;
	}

	int[][] Grid;
	int InitBlackCnt;

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		H = Integer.parseInt(strArr[0]);
		W = Integer.parseInt(strArr[1]);
		// System.out.println(H + " " + W);
		Grid = new int[H][W];
		InitBlackCnt = 0;
	}

	public boolean hasNext() {
		return cnt < H;
	}

	final int WHITE = 0;
	final int BLACK = 1;

	public void readBody(String str) {
		// System.out.println(str);
		for (int i = 0; i < W; i++) {
			if (str.charAt(i) == '.')
				Grid[cnt][i] = WHITE;
			else {
				Grid[cnt][i] = BLACK;
				InitBlackCnt++;
			}
		}
		cnt++;
	}

	private class Cell {
		int X;
		int Y;

		public Cell(int x, int y) {
			super();
			X = x;
			Y = y;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + X;
			result = prime * result + Y;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Cell other = (Cell) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (X != other.X)
				return false;
			if (Y != other.Y)
				return false;
			return true;
		}

		private Solver getOuterType() {
			return Solver.this;
		}

	}

	public void solve() {
		footprint = new int[H][W];
		NextStep = new ArrayDeque<Cell>();
		NextStep.push(new Cell(W - 1, H - 1));
		footprint[H - 1][W - 1] = 1;
		step();
		int whiteCnt = footprint[0][0];

		// for (int y = 0; y < H; y++) {
		// for (int x = 0; x < W; x++) {
		// System.out.printf(" %2d", footprint[y][x]);
		// }
		// System.out.println();
		// }

		if (whiteCnt == 0) {
			System.out.println(-1);
			return;
		}
		System.out.println(H * W - InitBlackCnt - whiteCnt);
	}

	private Deque<Cell> NextStep;
	private int[][] footprint;

	private void step() {
		Deque<Cell> ns = new ArrayDeque<Cell>();
		for (Cell c = NextStep.pop();; c = NextStep.pop()) {
			// 上を探索
			if (c.Y > 0 && footprint[c.Y - 1][c.X] == 0 && Grid[c.Y - 1][c.X] == WHITE) {
				footprint[c.Y - 1][c.X] = footprint[c.Y][c.X] + 1;
				ns.push(new Cell(c.X, c.Y - 1));
			}
			// 下を探索
			if (c.Y < H - 1 && footprint[c.Y + 1][c.X] == 0 && Grid[c.Y + 1][c.X] == WHITE) {
				footprint[c.Y + 1][c.X] = footprint[c.Y][c.X] + 1;
				ns.push(new Cell(c.X, c.Y + 1));
			}
			// 左を探索
			if (c.X > 0 && footprint[c.Y][c.X - 1] == 0 && Grid[c.Y][c.X - 1] == WHITE) {
				footprint[c.Y][c.X - 1] = footprint[c.Y][c.X] + 1;
				ns.push(new Cell(c.X - 1, c.Y));
			}
			// 右を探索
			if (c.X < W - 1 && footprint[c.Y][c.X + 1] == 0 && Grid[c.Y][c.X + 1] == WHITE) {
				footprint[c.Y][c.X + 1] = footprint[c.Y][c.X] + 1;
				ns.push(new Cell(c.X + 1, c.Y));
			}
			if (NextStep.size() <= 0)
				break;
		}
		if (ns.size() > 0) {
			NextStep = ns;
			step();
		}
	}

}
