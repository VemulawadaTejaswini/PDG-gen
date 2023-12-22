import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

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
	static class Task{
		int M = (int) (1e9 + 7);
		public void solve(int testNumber, InputReader in, PrintWriter out) {
				long a = in.nextLong(), b = in.nextLong(), c = in.nextLong(), d = in.nextLong();
				long l = b/c -(a-1)/c, r = b/d - (a-1)/d;
				out.print(b-a +1 - (l+r -(b/lcm(c,d) -(a-1)/lcm(c,d))));
		}//Solve
		private long lcm(long c, long d) {
			return c*d/gcd(c,d);
		}
		private long gcd(long c, long d) {
			if(d == 0) return c;
			return gcd(d, c%d);
		}
		

			
	}//task

	static class InputReader{
		public BufferedReader reader;
		public StringTokenizer tokenizer;
		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}
		public String next() {
			while(tokenizer == null || ! tokenizer.hasMoreTokens()) {
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
		public int[] nextIntArray(int n) {
			int[] arr = new int[n];
			for(int i = -1; ++i < n;) arr[i] = Integer.parseInt(next());
			return arr;
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		
	}
}