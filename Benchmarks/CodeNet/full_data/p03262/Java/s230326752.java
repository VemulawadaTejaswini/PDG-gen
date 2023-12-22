import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Built using CHelper plug-in Actual solution is at the top
 */

public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Task solver = new Task();
		solver.solve(1, in, out);
		out.close();
	}

	static class Task {
		public void solve(int testNumber, InputReader in, PrintWriter out) {
			int N = in.nextInt();
			int X = in.nextInt();
			int[] x = new int[N + 1];
			x[0] = X;
			int ans;
			for(int i = 1; i < x.length; i++) {
				x[i] = in.nextInt();
			}
			Arrays.sort(x);
			ans = Math.abs(x[1] - x[0]);
			for(int i = 2; i < x.length; i++) {
				ans = test(Math.abs(x[i] - x[i - 1]), ans);
			}
			out.println(ans);
		}
	}
	
	static int test(int a, int b) {
		int c;
		int ans;
		if(a >= b) {
			while(a % b != 0) {
				c = a % b;
				a = b;
				b = c;
			}
			ans = b;
		}else {
			while(b % a != 0) {
				c = b % a;
				b = a;
				a = c;
			}
			ans = a;
		}
		return ans;
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
