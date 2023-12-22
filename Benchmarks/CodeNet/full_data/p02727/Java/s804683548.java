import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		int rn = scn.nextInt(), gn = scn.nextInt(), cn = scn.nextInt();
		PriorityQueue<Long> r = new PriorityQueue<>();
		PriorityQueue<Long> g = new PriorityQueue<>();
		PriorityQueue<Long> c = new PriorityQueue<>();

		for (int i = 0; i < rn; i++) {
			long v = scn.nextLong();
			if (i >= x) {
				if (r.peek() < v) {
					r.poll();
					r.add(v);
				}
			} else
				r.add(v);
		}
		for (int i = 0; i < gn; i++) {
			long v = scn.nextLong();
			if (i >= y) {
				if (g.peek() < v) {
					g.poll();
					g.add(v);
				}
			} else
				g.add(v);
		}
		for (int i = 0; i < cn; i++)
			c.add(scn.nextLong());
		PriorityQueue<Long> nc = new PriorityQueue<>(Collections.reverseOrder());
		while (!c.isEmpty())
			nc.add(c.poll());

		while (true) {
			long x1 = r.peek(), y1 = g.peek();
			if (nc.size() == 0 || Math.min(x1, y1) >= nc.peek())
				break;
			if (x1 < y1) {
				if (nc.peek() > x1) {
					r.poll();
					r.add(nc.poll());
				}
			} else {
				if (nc.peek() > y1) {
					g.poll();
					g.add(nc.poll());
				}
			}
		}
		long ans = 0;
		while (!r.isEmpty())
			ans += r.poll();
		while (!g.isEmpty())
			ans += g.poll();
		System.out.println(ans);
	}

	static class pair implements Comparable<pair> {
		int k, v;

		pair(int k, int v) {
			this.k = k;
			this.v = v;
		}

		@Override
		public int compareTo(pair o) {
			return this.v - o.v;
		}
	}

	static class Scanner {

		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
	}
}