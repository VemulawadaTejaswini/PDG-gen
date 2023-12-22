import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		List<List<Hen>> list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < n - 1; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;
			int c = Integer.parseInt(sa[2]);
			list.get(a).add(new Hen(b, c));
			list.get(b).add(new Hen(a, c));
		}

		sa = br.readLine().split(" ");
		int q = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]) - 1;
		int[] x = new int[q];
		int[] y = new int[q];
		for (int i = 0; i < q; i++) {
			sa = br.readLine().split(" ");
			x[i] = Integer.parseInt(sa[0]) - 1;
			y[i] = Integer.parseInt(sa[1]) - 1;
		}
		br.close();

		long[] d = new long[n];
		Arrays.fill(d, Long.MAX_VALUE);
		Queue<Integer> que = new ArrayDeque<>();
		que.add(k);
		d[k] = 0;
		while (!que.isEmpty()) {
			int cur = que.poll();
			for (Hen h : list.get(cur)) {
				if (d[h.v] == Long.MAX_VALUE) {
					que.add(h.v);
					d[h.v] = d[cur] + h.c;
				}
			}
		}

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < q; i++) {
			pw.println(d[x[i]] + d[y[i]]);
		}
		pw.flush();
	}

	static class Hen {
		int v, c;

		public Hen(int v, int c) {
			this.v = v;
			this.c = c;
		}
	}
}
