import java.io.*;
import java.util.*;

public class Main {
	FastScanner in;
	PrintWriter out;

	void solve() {
		int r = in.nextInt();
		int c = in.nextInt();
		int n = in.nextInt();
		Cell[] a = new Cell[n];
		for (int i = 0; i < n; i++) {
			a[i] = new Cell(in.nextInt() - 1, in.nextInt() - 1, in.nextInt());
		}
		Comparator<Cell> cmpX = new Comparator<Cell>() {
			public int compare(Cell arg0, Cell arg1) {
				if (arg0.x != arg1.x) {
					return Integer.compare(arg0.x, arg1.x);
				}
				return Integer.compare(arg0.y, arg1.y);
			}
		};
		Comparator<Cell> cmpY = new Comparator<Cell>() {
			public int compare(Cell arg0, Cell arg1) {
				if (arg0.y != arg1.y) {
					return Integer.compare(arg0.y, arg1.y);
				}
				return Integer.compare(arg0.x, arg1.x);
			}
		};
		int[] compsY = new int[c];
		long[] compsMinValueY = new long[c];
		long[] valueY = new long[c];
		{
			ArrayList<Edge>[] g = new ArrayList[c];
			for (int i = 0; i < g.length; i++) {
				g[i] = new ArrayList<Main.Edge>();
			}
			Arrays.sort(a, cmpX);
			for (int i = 0; i + 1 < n; i++) {
				if (a[i].x == a[i + 1].x) {
					g[a[i].y].add(new Edge(a[i + 1].y, a[i + 1].value
							- a[i].value));
					g[a[i + 1].y].add(new Edge(a[i].y, a[i].value
							- a[i + 1].value));
				}
			}
			if (!ok(g, compsY, compsMinValueY, valueY)) {
				out.println("No");
				return;
			}
		}
		int[] compsX = new int[r];
		long[] compsMinValueX = new long[r];
		long[] valueX = new long[r];
		{
			ArrayList<Edge>[] g = new ArrayList[r];
			for (int i = 0; i < g.length; i++) {
				g[i] = new ArrayList<Main.Edge>();
			}
			Arrays.sort(a, cmpY);
			for (int i = 0; i + 1 < n; i++) {
				if (a[i].y == a[i + 1].y) {
					g[a[i].x].add(new Edge(a[i + 1].x, a[i + 1].value
							- a[i].value));
					g[a[i + 1].x].add(new Edge(a[i].x, a[i].value
							- a[i + 1].value));
				}
			}
			if (!ok(g, compsX, compsMinValueX, valueX)) {
				out.println("No");
				return;
			}
		}
		for (Cell cell : a) {
			long sub = valueY[cell.y] - compsMinValueY[compsY[cell.y]];
			sub += valueX[cell.x] - compsMinValueX[compsX[cell.x]];
			if (cell.value - sub < 0) {
				out.println("No");
				return;
			}
		}
		out.println("Yes");
	}

	boolean dfs(int v, long curValue, ArrayList<Edge>[] g, long[] vals,
			int[] comps, int curComp) {
		comps[v] = curComp;
		vals[v] = curValue;
		for (int i = 0; i < g[v].size(); i++) {
			Edge e = g[v].get(i);
			if (vals[e.to] == Long.MAX_VALUE) {
				if (!dfs(e.to, curValue + e.diff, g, vals, comps, curComp)) {
					return false;
				}
			}
			if (vals[e.to] != curValue + e.diff) {
				return false;
			}
		}
		return true;
	}

	boolean ok(ArrayList<Edge>[] g, int[] comps, long[] compsMinValue,
			long[] vals) {
		Arrays.fill(vals, Long.MAX_VALUE);
		int cntComps = 0;
		for (int i = 0; i < g.length; i++) {
			if (vals[i] == Long.MAX_VALUE) {
				if (!dfs(i, 0, g, vals, comps, cntComps++)) {
					return false;
				}
			}
		}
		Arrays.fill(compsMinValue, Long.MAX_VALUE / 4);
		for (int i = 0; i < g.length; i++) {
			compsMinValue[comps[i]] = Math
					.min(compsMinValue[comps[i]], vals[i]);
		}
		return true;
	}

	class Edge {
		int to;
		long diff;

		public Edge(int to, long diff) {
			super();
			this.to = to;
			this.diff = diff;
		}

	}

	class Cell {
		int x, y;
		long value;

		public Cell(int x, int y, long value) {
			super();
			this.x = x;
			this.y = y;
			this.value = value;
		}

	}

	void run() {
		try {
			in = new FastScanner(new File("object.in"));
			out = new PrintWriter(new File("object.out"));

			solve();

			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	void runIO() {

		in = new FastScanner(System.in);
		out = new PrintWriter(System.out);

		solve();

		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner(File f) {
			try {
				br = new BufferedReader(new FileReader(f));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		public FastScanner(InputStream f) {
			br = new BufferedReader(new InputStreamReader(f));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				String s = null;
				try {
					s = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (s == null)
					return null;
				st = new StringTokenizer(s);
			}
			return st.nextToken();
		}

		boolean hasMoreTokens() {
			while (st == null || !st.hasMoreTokens()) {
				String s = null;
				try {
					s = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (s == null)
					return false;
				st = new StringTokenizer(s);
			}
			return true;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}
	}

	public static void main(String[] args) {
		new Thread(null, new Runnable() {
			public void run() {
				new Main().runIO();
			}
		}, "1", 1 << 26).start();
	}
}