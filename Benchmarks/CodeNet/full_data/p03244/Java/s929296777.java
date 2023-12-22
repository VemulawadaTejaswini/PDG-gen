
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
		int[] a = new int[n];
		boolean flag = true;
		a[0] = in.nextInt();
		for (int i = 1; i < n; i++) {
			a[i] = in.nextInt();
			if (a[0] != a[i]) {
				flag = false;
			}
		}
		if (flag) {
			out.println(n / 2);
		} else {
			int x = a[0];
			int y = a[1];
			int ret = (x == y ? 1 : 0);
			int ind = 2;
			if (ret == 1) {
				for (int i = ind; i < a.length - 1; i += 2) {
					x = a[i];
					y = a[i + 1];
					if (x != y) {
						ind = i;
						break;
					} else {
						++ret;

					}
				}
			}
			// out.println(ind + " " + x + " " + y);
			for (int i = ind; i < n; i++) {
				int z = a[i];
				if (i % 2 == 0) {
					if (z != x) {
						++ret;
					}
				} else {
					if (z != y) {
						++ret;
					}
				}
			}
			out.println(ret);
		}

		out.flush();
		out.close();

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