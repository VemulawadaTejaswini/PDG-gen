import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		long a[] = new long[n];
		PriorityQueue<pair> pq = new PriorityQueue<>((x, y) -> (int) (-x.v + y.v));
		for (int i = 0; i < n; i++) {
			a[i] = scn.nextLong();
			pq.add(new pair(a[i], i));
		}
		n /= 2;
		long sum = 0;
		HashSet<Integer> hs = new HashSet<>();
		while (n > 0) {
			pair p = pq.poll();
			if (hs.contains(p.i + 1) || hs.contains(p.i - 1))
				continue;
			sum += p.v;
			hs.add(p.i);
			n--;
		}
		System.out.println(sum);
	}

	static class pair {
		long v;
		int i;

		pair(long v, int i) {
			this.v = v;
			this.i = i;
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