import java.io.*;
import java.util.*;

public class Main {

	static int dist(int[] p1, int[] p2) {
		return Math.max(Math.abs(p1[0] - p2[0]), Math.abs(p1[1] - p2[1]));
	}

	static int[][] pts;
	static int D;
	static TreeMap<Integer, TreeSet<int[]>> adjXMap, adjYMap;
	static TreeMap<Integer, ArrayList<Integer>> adjXL, adjYL;

	static boolean[] visited;

	static void dfs(int u) {
		if (visited[u])
			return;
		visited[u] = true;

		int x = pts[u][0], y = pts[u][1];
		for (int t = x - D; t <= x + D; t += 2 * D) {
			TreeSet<int[]> adjX = adjXMap.get(t);

			if (adjX == null)
				continue;
			while (true) {
				int[] v = adjX.ceiling(new int[] { 0, y - D });
				if (v == null || v[1] > y + D)
					break;

				adjX.remove(v);
//				int y2 = v[1];
//				TreeSet<int[]> adjY = adjYMap.get(y2);
//
//				adjY.remove(new int[] { v[0], t });
				dfs(v[0]);

			}

		}
		for (int t = y - D; t <= y + D; t += 2 * D) {
			TreeSet<int[]> adjY = adjYMap.get(t);
			if (adjY == null)
				continue;
			while (true) {
				int[] v = adjY.ceiling(new int[] { 0, x - D });
				if (v == null || v[1] > x + D)
					break;

				adjY.remove(v);
//				int x2 = v[1];
//				TreeSet<int[]> adjX = adjXMap.get(x2);
//
//				adjX.remove(new int[] { v[0], t });
				dfs(v[0]);

			}

		}
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt(), a = sc.nextInt() - 1, b = sc.nextInt() - 1;
		pts = new int[n][2];
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt(), y = sc.nextInt();
			pts[i][0] = x + y;
			pts[i][1] = y - x;
		}
		D = dist(pts[a], pts[b]);

		adjXMap = new TreeMap();
		adjYMap = new TreeMap<Integer, TreeSet<int[]>>();
		adjXL = new TreeMap();
		adjYL = new TreeMap();

		for (int i = 0; i < n; i++) {

			int x = pts[i][0], y = pts[i][1];

			if (adjXMap.containsKey(x)) {
				adjXMap.get(x).add(new int[] { i, y });
			} else {
				TreeSet<int[]> set = new TreeSet<>((f, s) -> f[1] != s[1] ? f[1] - s[1] : f[0] - s[0]);
				set.add(new int[] { i, y });
				adjXMap.put(x, set);
			
			}

		}
		for (int i = 0; i < n; i++) {
			int x = pts[i][0], y = pts[i][1];

			if (adjYMap.containsKey(y)) {
				adjYMap.get(y).add(new int[] { i, x });
			} else {
				TreeSet<int[]> set = new TreeSet<>((f, s) -> f[1] != s[1] ? f[1] - s[1] : f[0] - s[0]);
				set.add(new int[] { i, x });
				adjYMap.put(y, set);
				
			}

		}
		visited = new boolean[n];
		dfs(a);
		adjXMap.clear();
		adjYMap.clear();
		for (int i = 0; i < n; i++) {

			int x = pts[i][0], y = pts[i][1];

			if (adjXL.containsKey(x)) {
				adjXL.get(x).add(y);
			} else {

				ArrayList<Integer> l = new ArrayList();
				l.add(y);
				adjXL.put(x, l);
			}

		}
		for (int i = 0; i < n; i++) {
			int x = pts[i][0], y = pts[i][1];

			if (adjYL.containsKey(y)) {
				adjYL.get(y).add(x);
			} else {

				ArrayList<Integer> l = new ArrayList();
				l.add(x);
				adjYL.put(y, l);
			}

		}
		long edges = 0;
		for (ArrayList<Integer> l : adjXL.values())
			Collections.sort(l);
		for (ArrayList<Integer> l : adjYL.values())
			Collections.sort(l);
		for (int i = 0; i < n; i++)
			if (visited[i]) {
				int lo, hi;
				int x = pts[i][0], y = pts[i][1];
				for (int t : new int[] { x - D, x + D }) {
					int yMin = y - D + 1, yMax = y + D - 1;
					ArrayList<Integer> adj = adjXL.get(t);
					if (adj == null)
						continue;
					int first = 0, last = -1;
					lo = 0;
					hi = adj.size() - 1;
					while (lo <= hi) {
						int mid = lo + hi >> 1;
						if (adj.get(mid) < yMin)
							lo = mid + 1;
						else if (adj.get(mid) > yMax)
							hi = mid - 1;
						else {
							first = mid;
							hi = mid - 1;
						}
					}
					lo = 0;
					hi = adj.size() - 1;
					while (lo <= hi) {
						int mid = lo + hi >> 1;
						if (adj.get(mid) < yMin)
							lo = mid + 1;
						else if (adj.get(mid) > yMax)
							hi = mid - 1;
						else {
							last = mid;
							lo = mid + 1;
						}

					}
					edges += last - first + 1;
				}
				for (int t : new int[] { y - D, y + D }) {
					int xMin = x - D, xMax = x + D;
					ArrayList<Integer> adj = adjYL.get(t);
					if (adj == null)
						continue;
					int first = 0, last = -1;
					lo = 0;
					hi = adj.size() - 1;
					while (lo <= hi) {
						int mid = lo + hi >> 1;
						if (adj.get(mid) < xMin)
							lo = mid + 1;
						else if (adj.get(mid) > xMax)
							hi = mid - 1;
						else {
							first = mid;
							hi = mid - 1;
						}
					}
					lo = 0;
					hi = adj.size() - 1;
					while (lo <= hi) {
						int mid = lo + hi >> 1;
						if (adj.get(mid) < xMin)
							lo = mid + 1;
						else if (adj.get(mid) > xMax)
							hi = mid - 1;
						else {
							last = mid;
							lo = mid + 1;
						}

					}
					edges += last - first + 1;
				}
			}
		System.out.println(edges >> 1);
		out.close();

	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		Scanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		Scanner(String fileName) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(fileName));
		}

		String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		String nextLine() throws IOException {
			return br.readLine();
		}

		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}

		boolean ready() throws IOException {
			return br.ready();
		}

		int[] nxtArr(int n) throws IOException {
			int[] ans = new int[n];
			for (int i = 0; i < n; i++)
				ans[i] = nextInt();
			return ans;
		}

	}

	static void sort(int[] a) {
		shuffle(a);
		Arrays.sort(a);
	}

	static void shuffle(int[] a) {
		int n = a.length;
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			int tmpIdx = rand.nextInt(n);
			int tmp = a[i];
			a[i] = a[tmpIdx];
			a[tmpIdx] = tmp;
		}
	}

}