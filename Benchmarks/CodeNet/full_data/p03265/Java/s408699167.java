
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		int w = Math.abs(x2 - x1);
		int h = Math.abs(y2 - y1);

		if (x1 <= x2) {

			if (y1 <= y2) {
				// 1
				out.println((x2 - h) + " " + (y2 + w) + " " + (x1 - h) + " " + (y1 + w));
			} else {
				// 2
				out.println((x2 + h) + " " + (y2 + w) + " " + (x1 + h) + " " + (y1 + w));
			}
		} else {

			if (y1 <= y2) {
				// 1
				out.println((x2 - h) + " " + (y2 - w) + " " + (x1 - h) + " " + (y1 - w));
			} else {
				// 2
				out.println((x2 + h) + " " + (y2 - w) + " " + (x1 + h) + " " + (y1 - w));
			}
		}

		out.flush();

	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
