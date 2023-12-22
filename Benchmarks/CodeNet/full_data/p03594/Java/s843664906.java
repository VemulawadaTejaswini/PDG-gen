import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	static class TaskF {
		class Edge implements Comparable<Edge> {
			int i;
			int j;
			long cost;

			public Edge(int i_, int j_, long cost_) {
				i = i_;
				j = j_;
				cost = cost_;
			}

			public int compareTo(Edge o) {
				return Long.compare(cost, o.cost);
			};
		}

		public void solve(int testNumber, InputReader in, PrintWriter out) {
			int H = in.nextInt();
			int W = in.nextInt();
			int d = in.nextInt();
			String mode = "RYGB";
			for (int i = 0; i < H; ++i) {
				for (int j = 0; j < W; ++j) {
					int v = Math.abs(i + j) / d % 2 + Math.abs(i - j) / d % 2 * 2;
					System.out.print(mode.charAt(v % 4) + (j == W - 1 ? "\n" : ""));
				}
			}
		}
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

	InputStream is;
	PrintWriter out;
	String INPUT = "";

	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskF solver = new TaskF();
		solver.solve(1, in, out);
		out.close();
	}

	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

	}

}