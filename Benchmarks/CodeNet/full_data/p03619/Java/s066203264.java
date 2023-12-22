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
		Arrays.sort(x);
		Arrays.sort(y);
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

		BIT tree = new BIT(n);
		int[] dp = new int[n];
		for (int i = 1; i < pts.size(); i++) {
			dp[i] = tree.get(pts.get(i).y - 1) + 1;
			tree.add(pts.get(i).y, dp[i]);
		}
		
		result -= (dp[n - 1] - 1) * (20 - Math.PI * 5);
		out.println(result);
	}

	class BIT {
		int[] tree;

		public BIT(int n) {
			tree = new int[n];
		}

		int get(int pos) {
			int mx = 0;
			while (pos >= 0) {
				mx = Math.max(mx, tree[pos]);
				pos = (pos & (pos + 1)) - 1;
			}
			return mx;
		}

		void add(int pos, int val) {
			while (pos < tree.length) {
				tree[pos] = Math.max(tree[pos], val);
				pos |= pos + 1;
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
