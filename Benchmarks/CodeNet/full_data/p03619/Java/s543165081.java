import java.util.*;
import java.util.stream.Collectors;
import java.io.*;

public class Main {

	int MAX = 100_000_000;

	class Point {
		int x, y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "Point [x=" + x + ", y=" + y + "]";
		}
		
		
	}

	void solve() {
		List<Point> pts = new ArrayList<>();
		pts.add(new Point(in.nextInt(), in.nextInt()));
		pts.add(new Point(in.nextInt(), in.nextInt()));
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			pts.add(new Point(in.nextInt(), in.nextInt()));
		}

		Point start = pts.get(0);
		Point finish = pts.get(1);
		if (start.x > finish.x) {
			for (Point p : pts) {
				p.x = MAX - 1 - p.x;
			}
		}
		if (start.y > finish.y) {
			for (Point p : pts) {
				p.y = MAX - 1 - p.y;
			}
		}

		if (start.x == finish.x) {
			double result = 100.0 * (finish.y - start.y);
			for (Point p : pts) {
				if (p.x == start.x && start.y < p.y && p.y < finish.y) {
					result += Math.PI * 10 - 20;
					break;
				}
			}
			out.println(result);
			return;
		}

		if (start.y == finish.y) {
			double result = 100.0 * (finish.x - start.x);
			for (Point p : pts) {
				if (p.y == start.y && start.x < p.x && p.x < finish.x) {
					result += Math.PI * 10 - 20;
					break;
				}
			}
			out.println(result);
			return;
		}
		double result = 100.0 * (finish.x + finish.y - start.x - start.y);
		pts = pts.stream().filter(p -> start.x <= p.x && p.x <= finish.x && start.y <= p.y && p.y <= finish.y)
				.collect(Collectors.toList());
		n = pts.size();
		int[] x = new int[n], y = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = pts.get(i).x;
			y[i] = pts.get(i).y;
		}
		x = removeDupes(x);
		y = removeDupes(y);
		for (int i = 0; i < n; i++) {
			pts.get(i).x = Arrays.binarySearch(x, pts.get(i).x);
			pts.get(i).y = Arrays.binarySearch(y, pts.get(i).y);
		}

		Collections.sort(pts, (o1, o2) -> {
			if (o1.x != o2.x) {
				return o1.x - o2.x;
			}
			return o1.y - o2.y;
		});

		SegmentTree tree = new SegmentTree(n);
		for (int i = 0; i < n; i++) {
			tree.set(i, 0);
		}

		for (int i = 1; i < pts.size() - 1; i++) {
			double cur1 = tree.get(0, pts.get(i).y - 1) + (20 - 5 * Math.PI);
			double cur2 = tree.get(pts.get(i).y, pts.get(i).y) + (20 - 10 * Math.PI);
			tree.set(pts.get(i).y, Math.max(cur1, cur2));
		}
		
		result -= tree.get(0, finish.y);
		out.println(result);
	}
	
	int[] removeDupes(int[] x) {
		Arrays.sort(x);
		int cnt = 0;
		for (int i = 0; i < x.length; i++) {
			if (i == 0 || x[i] > x[i - 1]) {
				cnt++;
			}
		}
		int[] result = new int[cnt];
		for (int i = 0, j =0; i < x.length; i++) {
			if (i == 0 || x[i] > x[i - 1]) {
				result[j++] = x[i];
			}
		}
		return result;
	}

	double INF = Integer.MIN_VALUE;

	class SegmentTree {
		double[] max;
		int size;
		public SegmentTree(int n) {
			max = new double[4 * n];
			size = n;
			Arrays.fill(max, INF);
		}
		
		void set(int pos, double val) {
			set(0, size, pos, val, 0);
		}
		void set(int l, int r, int pos, double val, int i) {
			if (l + 1 == r) {
				max[i] = val;
				return;
			}
			int m = (l + r) >>> 1;
			if (pos < m) {
				set(l, m, pos, val, 2 * i + 1);
			} else {
				set(m, r, pos, val, 2 * i + 2);
			}
			max[i] = Math.max(max[2 * i + 1], max[2 * i + 2]);
		}
		double get(int l, int r) {
			return get(0, size, l, r + 1, 0);
		}
		
		double get(int l, int r, int left, int right, int i) {
			if (left <= l && r <= right) {
				return max[i];
			} else if (right <= l || r <= left) {
				return INF;
			} else {
				int m = (l + r) >> 1;
				return Math.max(get(l, m, left, right, 2 * i + 1), get(m, r, left, right, 2 * i + 2));
			}
		}
	}

	FastScanner in;
	PrintWriter out;

	void run() {
		in = new FastScanner();
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public FastScanner(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public String nextToken() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextToken());
		}

		public long nextLong() {
			return Long.parseLong(nextToken());
		}

		public double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
