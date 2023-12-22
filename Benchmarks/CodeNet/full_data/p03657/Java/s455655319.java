import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static class Reader {

		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public Reader(InputStream stream) {
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

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

	}

	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Reader sn = new Reader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		int a = sn.nextInt();
		int b = sn.nextInt();
		if((a+b)%3==0||a%3==0||b%3==0){
			System.out.println("Possible");
		}
		else{
			System.out.println("Impossible");
		}
		out.close();
	}

}