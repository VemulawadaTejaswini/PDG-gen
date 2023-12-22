import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.*;
import java.util.*;

import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;

public class Main {

	
	public static void main(String[] args) throws IOException {
		FastReader in = new FastReader(System.in);
		PrintWriter out = new PrintWriter(System.out);
	
		int [] a = new int[4+1];
		for (int i = 0; i < 3; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			a[x]++;
			a[y]++;
		}
		int u = 0;
		int v = 0;
		int w = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				++u;
			} 
			else if (a[i] == 2) {
				++v;
			} else {
				++w;
			}
		}
		if (u == 2 && v == 2) {
			out.println("YES");
		} else {
			out.println("NO");
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

		public int[] nextIntArray(int n) throws IOException {
			int[] ret = new int[n];
			for (int i = 0; i < n; i++) {
				ret[i] = nextInt();
			}
			return ret;
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