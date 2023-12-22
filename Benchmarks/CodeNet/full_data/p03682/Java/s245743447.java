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

		public Point(int x, int y) {
			super();
			X = x;
			Y = y;
		}

		public int cost(Point p) {
			int xdiff = X - p.X;
			if (xdiff < 0)
				xdiff *= -1;
			int ydiff = Y - p.Y;
			if (ydiff < 0)
				ydiff *= -1;
			return Integer.min(xdiff, ydiff);
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
			Point other = (Point) obj;
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

		@Override
		public String toString() {
			return "Point [X=" + X + ", Y=" + Y + "]";
		}

	}

	int N;
	int cnt;
	ArrayList<Point> Towns;

	public void init() {
		N = 0;
		cnt = 0;
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		Towns = new ArrayList<Point>();
	}

	public boolean hasNext() {
		return cnt < N;
	}

	public void readBody(String str) {
		// System.out.println(str);
		cnt++;
		String[] strArr = str.split(" ");
		int x = Integer.parseInt(strArr[0]);
		int y = Integer.parseInt(strArr[1]);
		// System.out.println(x + " " + y);
		Towns.add(new Point(x, y));
	}

	public void solve() {
		ArrayList<Point> build = new ArrayList<Point>();
		build.add(Towns.get(0));
		Towns.remove(0);

		int cost = 0;

		for (; Towns.size() > 0;) {
			int cmin = Integer.MAX_VALUE;
			int idx = 0;
			for (int i = 0; i < Towns.size(); i++) {
				int c = Integer.MAX_VALUE;
				for (Point p : build) {
					c = Integer.min(cmin, Towns.get(i).cost(p));
				}
				if (c < cmin) {
					cmin = c;
					idx = i;
				}
			}
			build.add(Towns.get(idx));
			Towns.remove(idx);
			cost += cmin;
		}

		// for (Point p : build)
		// System.out.println(p);
		System.out.println(cost);
	}
}
