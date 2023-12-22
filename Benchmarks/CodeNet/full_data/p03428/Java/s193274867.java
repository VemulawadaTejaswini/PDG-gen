
import java.awt.Point;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Main {

	static class GrahamScan {

		public static List<Point> getHull(Point[] points) {
			if (points.length <= 1)
				return Arrays.asList(points);
			sortByPolar(points, bottomLeft(points));
			Stack<Point> stack = new Stack<>();
			stack.push(points[0]);
			stack.push(points[1]);
			for (int i = 2; i < points.length; i++) {
				Point top = stack.pop();
				while (ccw(stack.peek(), top, points[i]) < 0)
					top = stack.pop();
				stack.push(top);
				stack.push(points[i]);
			}
			return new ArrayList<>(stack);
		}

		private static Point bottomLeft(Point[] points) {
			Point bottomLeft = points[0];
			for (Point p : points)
				if (p.y < bottomLeft.y || p.y == bottomLeft.y && p.x < bottomLeft.x)
					bottomLeft = p;
			return bottomLeft;
		}

		private static int ccw(Point a, Point b, Point c) {
			return a.x * b.y - a.y * b.x + b.x * c.y - b.y * c.x + c.x * a.y - c.y * a.x;
		}

		static int dist(Point p, Point q) {
			return (p.x - q.x) * (p.x - q.x) + (p.y - q.y) * (p.y - q.y);
		}

		private static void sortByPolar(Point[] points, Point r) {
			Arrays.sort(points, (p, q) -> {
				int compPolar = ccw(p, r, q);
				int compDist = dist(p, r) - dist(q, r);
				return compPolar == 0 ? compDist : compPolar;
			});
			// find collinear points in the end positions
			Point p = points[0], q = points[points.length - 1];
			int i = points.length - 2;
			while (i >= 0 && ccw(p, q, points[i]) == 0)
				i--;
			// reverse sort order of collinear points in the end positions
			for (int l = i + 1, h = points.length - 1; l < h; l++, h--) {
				Point tmp = points[l];
				points[l] = points[h];
				points[h] = tmp;
			}
		}
	}

	class Solver {
		double[] solve(Point[] pts) {
			double[] ret = new double[pts.length];
			Map<Point, Integer> m = new HashMap<Point, Integer>();
			for (int i = 0; i < pts.length; i++)
				m.put(pts[i], i);
			List<Point> l = GrahamScan.getHull(pts);
			for (int i = 0; i < l.size(); i++) {
				int prev = (i - 1 + l.size()) % l.size();
				int next = (i + 1) % l.size();
				double d = (GrahamScan.dist(l.get(prev), l.get(i)) + GrahamScan.dist(l.get(i), l.get(next))
						- GrahamScan.dist(l.get(prev), l.get(next)))
						/ (2 * Math
								.sqrt(GrahamScan.dist(l.get(prev), l.get(i)) * GrahamScan.dist(l.get(i), l.get(next))));
				d = Math.acos(-d);
				ret[m.get(l.get(i))] = d / (2.0 * Math.PI);
			}
			return ret;
		}

	}

	InputStream is;
	PrintWriter out;
	String INPUT = "";

	void solve() {

		int t = 1;
		while (t-- > 0) {
			try {
				int n = ni();
				Point[] pts = new Point[n];
				for (int i = 0; i < n; i++)
					pts[i] = new Point(ni(), ni());

				double[] ans = new Solver().solve(pts);
				for (double d : ans)
					out.println(d);
			} catch (Exception e) {
				out.println(e.getMessage());
				throw e;
			}
		}

	}

	void run() throws Exception {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);

		long s = System.currentTimeMillis();
		solve();
		out.flush();
		if (!INPUT.isEmpty())
			tr(System.currentTimeMillis() - s + "ms");
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	private byte[] inbuf = new byte[1024];
	public int lenbuf = 0, ptrbuf = 0;

	private int readByte() {
		if (lenbuf == -1)
			throw new InputMismatchException();
		if (ptrbuf >= lenbuf) {
			ptrbuf = 0;
			try {
				lenbuf = is.read(inbuf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (lenbuf <= 0)
				return -1;
		}
		return inbuf[ptrbuf++];
	}

	private boolean isSpaceChar(int c) {
		return !(c >= 33 && c <= 126);
	}

	private int skip() {
		int b;
		while ((b = readByte()) != -1 && isSpaceChar(b))
			;
		return b;
	}

	private double nd() {
		return Double.parseDouble(ns());
	}

	private char nc() {
		return (char) skip();
	}

	private String ns() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != '
									// ')
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	private char[] ns(int n) {
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while (p < n) {
			if (!(isSpaceChar(b)))
				buf[p++] = (char) b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}

	private char[][] nm(int n, int m) {
		char[][] map = new char[n][];
		for (int i = 0; i < n; i++)
			map[i] = ns(m);
		return map;
	}

	private int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = ni();
		}
		return a;
	}

	private int[][] na(int n, int m) {
		int[][] a = new int[n][];
		for (int i = 0; i < n; i++)
			a[i] = na(m);
		return a;
	}

	private int ni() {
		int num = 0, b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}

		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	private long nl() {
		long num = 0;
		int b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}

		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	private static void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}
