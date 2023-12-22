import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

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
	private class Point {
		int X;
		int Y;

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
			Point other = (Point) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (X != other.X)
				return false;
			if (Y != other.Y)
				return false;
			return true;
		}

		public Point(int x, int y) {
			super();
			X = x;
			Y = y;
		}

		private Solver getOuterType() {
			return Solver.this;
		}
	}

	int H;
	int W;
	int K;
	int cnt;
	boolean[][] Room;
	Point Start;

	public void init() {
		H = 0;
		W = 0;
		K = 0;
		cnt = 0;
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		H = Integer.parseInt(strArr[0]);
		W = Integer.parseInt(strArr[1]);
		K = Integer.parseInt(strArr[2]);
		Room = new boolean[H + 1][W + 1];
	}

	public boolean hasNext() {
		return cnt < H;
	}

	public void readBody(String str) {
		// System.out.println(str);
		// String[] strArr = str.split(" ");
		cnt++;
		for (int i = 0; i < W; i++) {
			Room[cnt][i + 1] = (str.charAt(i) == '.' || str.charAt(i) == 'S');
			if (str.charAt(i) == 'S')
				Start = new Point(i + 1, cnt);
		}
	}

	public void solve() {
		footPrint = new HashSet<Point>();
		footPrint.add(Start);
		// print();
		updFootPrint(null, Start, K);
		// System.out.println();
		// print();
		int min = Integer.MAX_VALUE;
		for (Point p : footPrint) {
			min = Integer.min(min, p.X - 1);
			min = Integer.min(min, W - p.X);
			min = Integer.min(min, p.Y - 1);
			min = Integer.min(min, H - p.Y);
		}
		int ans = min / K + 1;
		if (min % K != 0)
			ans++;
		System.out.println(ans);
	}

	HashSet<Point> footPrint;

	private void updFootPrint(Point prev, Point curr, int step) {
		for (int dy = -1; dy <= 1; dy++) {
			for (int dx = (dy == 0 ? -1 : 0); dx <= 1; dx += 2) {
				int x = curr.X + dx;
				int y = curr.Y + dy;
				if (prev != null && prev.X == x && prev.Y == y)
					continue;
				if (x < 1 || y < 1 || x > W || y > H)
					continue;
				if (!Room[y][x])
					continue;
				if (x == 1 || y == 1 || x == W || y == H) {
					footPrint.add(new Point(x, y));
				} else if (step <= 1) {
					footPrint.add(new Point(x, y));
				}
				updFootPrint(curr, new Point(x, y), step - 1);
			}
		}
	}

	private void print() {
		for (int y = 1; y <= H; y++) {
			for (int x = 1; x <= W; x++) {
				// if (Start.X == x && Start.Y == y) {
				// System.out.print("S");
				// continue;
				// }
				if (footPrint.contains(new Point(x, y))) {
					System.out.print("*");
					continue;
				}
				System.out.print(Room[y][x] ? "□" : "■");
			}
			System.out.println();
		}
	}
}
