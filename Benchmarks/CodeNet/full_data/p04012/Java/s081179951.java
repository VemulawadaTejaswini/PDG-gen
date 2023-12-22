import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;
 
public class Main {
 
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		FastScanner in = new FastScanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskB solver = new TaskB();
		solver.solve(1, in, out);
		out.close();
	}
 
	static class TaskB {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
 
 
			char[] c = in.next().toCharArray();
			int[] num = new int[26];
 
			for (int i = 0; i < c.length; i++) {
				num[c[i] - 'a']++;
			}
 
			boolean isBeautiful = true;
			for (int i = 0; i < num.length; i++) {
				if (num[i] % 2 != 0) {
					isBeautiful = false;
					break;
				}
			}
 
			System.out.println(isBeautiful ? "Yes" : "No");
		}
	}
 
	static class FastScanner {
		private BufferedReader in;
		private StringTokenizer st;
 
		public FastScanner(InputStream stream) {
			in = new BufferedReader(new InputStreamReader(stream));
		}
 
		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					String rl = in.readLine();
					if (rl == null) {
						return null;
					}
					st = new StringTokenizer(rl);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}
 
		public int nextInt() {
			return Integer.parseInt(next());
		}
 
	}
}