import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
		String s;
		String sl[];

		s = r.readLine();
		sl = s.split(" ");

		int n = Integer.parseInt(sl[0]);
		int m = Integer.parseInt(sl[1]);

		ArrayList<ArrayList<Integer>> g = new ArrayList<>(300000);
		boolean b[] = new boolean[300000];

		for (int i = 0; i < 3 * n; i++) {
			g.add(new ArrayList<>());
		}

		for (int i = 0; i < m; i++) {
			s = r.readLine();
			sl = s.split(" ");
			int u = Integer.parseInt(sl[0]) - 1;
			int v = Integer.parseInt(sl[1]) - 1;
			g.get(u).add(v + n);
			g.get(u + n).add(v + 2 * n);
			g.get(u + 2 * n).add(v);
		}

		// System.out.println(g);
		s = r.readLine();
		sl = s.split(" ");

		int start = Integer.parseInt(sl[0]) - 1;
		int term = Integer.parseInt(sl[1]) - 1;

		ArrayDeque<Integer> qv = new ArrayDeque<>();
		ArrayDeque<Integer> qd = new ArrayDeque<>();

		qv.offer(start);
		qd.offer(0);

		while (!qv.isEmpty()) {
			int v = qv.poll();
			int d = qd.poll();
			// System.out.println(v + ", " + d);
			if (v == term) {
				System.out.println(d / 3);
				System.exit(0);
			}
			for (Integer e : g.get(v)) {
				if (!b[e]) {
					qv.offer(e);
					qd.offer(d + 1);
					b[e] = true;
				}
			}
		}
		System.out.println(-1);
	}

}