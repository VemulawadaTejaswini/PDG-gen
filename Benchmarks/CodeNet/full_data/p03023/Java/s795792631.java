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
		float n;
		public void solve(int testNumber, InputReader in, PrintWriter out) {
			n = in.nextFloat();
			out.print((int)((180-360/n)*n));
			
		}//Solve
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
			int[] a = new int[n];
			for(int i = -1; ++i < n;) a[i] = nextInt();
			return a;
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for(int i = -1; ++i < n;) a[i] = nextLong();
			return a;
		}
		public float nextFloat() {
			return Float.parseFloat(next());
		}
	}
}
