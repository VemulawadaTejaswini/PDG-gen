
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		LightScanner in = new LightScanner(inputStream);
		LightWriter out = new LightWriter(outputStream);

		int H = in.ints();
		int W = in.ints();
		int A = in.ints();
		int B = in.ints();

		int[][] matrix = new int[H][W];

		for (int y = 0; y < B; y++) {
			for (int x = 0; x < A; x++) {
				matrix[y][x] = 1;
			}
		}
		for (int y = B; y < H; y++) {
			for (int x = A; x < W; x++) {
				matrix[y][x] = 1;
			}
		}

		for (int y = 0; y < H; y++) {
			for (int x = 0; x < W; x++) {
				out.ans(matrix[y][x]);
			}
			out.ln();
		}

		out.close();
	}

	static class LightScanner {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;

		public LightScanner(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}

		public String string() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public long longs() {
			return Long.parseLong(string());
		}

		public int ints() {
			return Integer.parseInt(string());
		}
	}

	static class LightWriter implements AutoCloseable {
		private final Writer out;
		private boolean autoflush = false;
		private boolean breaked = true;

		public LightWriter(Writer out) {
			this.out = out;
		}

		public LightWriter(OutputStream out) {
			this(new BufferedWriter(new OutputStreamWriter(out, Charset.defaultCharset())));
		}

		public LightWriter print(char c) {
			try {
				out.write(c);
				breaked = false;
			} catch (IOException ex) {
				throw new UncheckedIOException(ex);
			}
			return this;
		}

		public LightWriter print(String s) {
			try {
				out.write(s, 0, s.length());
				breaked = false;
			} catch (IOException ex) {
				throw new UncheckedIOException(ex);
			}
			return this;
		}

		public LightWriter ans(String s) {
			if (!breaked) {
				print(' ');
			}
			return print(s);
		}

		public LightWriter println(char[] array) {
			return print(new String(array)).ln();
		}

		public LightWriter ans(int i) {
			return ans(Integer.toString(i));
		}

		public LightWriter ans(long i) {
			return ans(Long.toString(i));
		}

		public LightWriter ln() {
			print(System.lineSeparator());
			breaked = true;
			if (autoflush) {
				try {
					out.flush();
				} catch (IOException ex) {
					throw new UncheckedIOException(ex);
				}
			}
			return this;
		}

		public void close() {
			try {
				out.close();
			} catch (IOException ex) {
				throw new UncheckedIOException(ex);
			}
		}

	}
}
