import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) {
		ConsoleScanner cin = new ConsoleScanner();
		PrintWriter cout = new PrintWriter(System.out);
		solve(cin, cout);
		cout.flush();
	}

	private static void solve(ConsoleScanner cin, PrintWriter cout) {
		int n = cin.nextInt();
		int[][] abs = new int[n - 1][];
		for (int i = 0; i < abs.length; i++)
			abs[i] = new int[] { cin.nextInt(), cin.nextInt() };

		String ans = solve(n, abs);
		cout.println(ans);
	}

	private static String solve(int n, int[][] abs) {
		// Fennecの最善手：1からNに最短距離で向かう
		// Snukeの最善手：Nから1に最短距離で向かう

		ArrayList<ArrayList<Integer>> conn = new ArrayList<>();
		conn.add(null);
		for (int i = 1; i <= n; i++)
			conn.add(new ArrayList<>());
		for (int[] ab : abs) {
			conn.get(ab[0]).add(ab[1]);
			conn.get(ab[1]).add(ab[0]);
		}

		// ダイクストラ法
		PriorityQueue<int[]> q = new PriorityQueue<>((dhc1, dhc2) -> {
			int cmp;
			cmp = Integer.compare(dhc1[0], dhc2[0]);
			if (cmp != 0)
				return cmp;
			return Integer.compare(dhc1[2], dhc2[2]);
		});
		int[] paint = new int[n + 1];
		Arrays.fill(paint, -1);
		final int FENNEC = 0;
		final int SUNUKE = 1;
		q.add(new int[] { 0, 1, FENNEC });
		q.add(new int[] { 0, n, SUNUKE });
		while (!q.isEmpty()) {
			int[] arr = q.poll();
			int dist = arr[0];
			int here = arr[1];
			int color = arr[2];
			if (paint[here] != -1)
				continue;
			paint[here] = color;
			for (int to : conn.get(here)) {
				if (paint[to] != -1)
					continue;
				q.add(new int[] { dist + 1, to, color });
			}
		}

		long fennec = Arrays.stream(paint).filter(p -> p == FENNEC).count();
		long sunuke = Arrays.stream(paint).filter(p -> p == SUNUKE).count();
		if (fennec > sunuke)
			return "Fennec";
		return "Snuke";
	}

	static class ConsoleScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		String next() {
			try {
				while (!st.hasMoreElements())
					st = new StringTokenizer(br.readLine());
				return st.nextToken();
			} catch (IOException e) {
				throw new AssertionError(e);
			}
		}

		int nextInt() {
			return Integer.parseInt(next());
		}
	}

}
