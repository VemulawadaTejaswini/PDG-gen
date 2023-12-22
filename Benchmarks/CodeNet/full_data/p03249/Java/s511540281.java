import java.io.*;
import java.util.*;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static int n, m, k;
	static long mod = 998244353;
	static Boolean[][] memo;
	static String s;
	static int[][] ad;
	static long inf = Long.MAX_VALUE;
	static int[] color;
	static ArrayList<Integer> o;
	static char[][] g;
	static boolean[] vis, vis1;
	static boolean f;
	static int[] ar, a;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		sb = new StringBuilder();
		n = sc.nextInt();
		TreeSet<pair> bfs = new TreeSet<>();
		for (int i = 0; i < n; i++) {
			bfs.add(new pair(sc.nextLong(), i, 0));
		}
		while (!bfs.isEmpty()) {
			pair cur = bfs.pollFirst();
			int ext = cur.lv;
			long v = cur.x - (n - 2) + 2 * ext;
			pair rob = bfs.ceiling(new pair(v, 0, 0));
		//	System.out.println(v + " G: " + rob + " C: " + cur);
			if (bfs.isEmpty())
				break;
			if (rob == null || v != rob.x) {
				System.out.println(-1);
				return;
			}
			sb.append((cur.y + 1) + " " + (rob.y + 1) + "\n");
			bfs.remove(rob);
			bfs.add(new pair(rob.x, rob.y, rob.lv +1+ cur.lv));
		}
		out.println(sb);
		out.flush();
	}

	static class pair implements Comparable<pair> {
		long x;
		int y, lv;

		pair(long x, int y, int l) {
			this.x = x;
			this.y = y;
			lv = l;
		}

		public String toString() {
			return x + " " + y + " " + lv;
		}

		@Override
		public int compareTo(pair o) {
			if (x == o.x)
				return y - o.y;
			return Long.compare(o.x, x);
		}

	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public Scanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public char nextChar() throws IOException {
			return next().charAt(0);
		}

		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public int[] nextArrInt(int n) throws IOException {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long[] nextArrLong(int n) throws IOException {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}