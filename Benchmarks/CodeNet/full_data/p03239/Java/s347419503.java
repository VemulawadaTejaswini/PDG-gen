
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) throws IOException {
		FastReader in = new FastReader(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int n = in.nextInt();
		int t = in.nextInt();
		Pair[] a = new Pair[n];
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			a[i] = new Pair();
			a[i].a = x;
			a[i].b = y;
		}
		Arrays.sort(a);
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i].b <= t) {
				out.println(a[i].a);
				flag = true;
				break;
			}
		}
		if (!flag) {
			out.println("TLE");
		}
		out.flush();
		out.close();

	}

	static class Pair implements Comparable<Pair> {
		int a;
		int b;

		public Pair() {
			// TODO Auto-generated constructor stub
			this.a = a;
			this.b = b;
		}

		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
			return this.a - o.a;
		}

	}

	static class FastReader {
		StringTokenizer st;
		BufferedReader br;

		public FastReader(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public FastReader(FileReader fileReader) {
			br = new BufferedReader(fileReader);
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public boolean ready() throws IOException {
			return br.ready();
		}
	}

}