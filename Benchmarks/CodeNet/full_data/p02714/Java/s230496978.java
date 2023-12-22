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
		new Solution().solve(in, out);
		out.close();
	}
	
	private static class Solution {

		public void solve(InputReader in, PrintWriter out) {
			int n = in.nextInt();
			String s = in.next();
			int ans = 0, r = 0, g = 0, b = 0;
//			for (int i = 0; i < n; ++i) {
//				for (int j = i; j < n; ++j) {
//					for (int k = j; k < n; ++k) {
//						if (s.charAt(i) != s.charAt(j) && s.charAt(i) != s.charAt(k) && s.charAt(j) != s.charAt(k))
//							if (j - i != k - j) ++ans;
//					}
//				}
//			}
			for (int i = 0; i < s.length(); ++i) {
				if (s.charAt(i) == 'R') ++r; if (s.charAt(i) == 'G') ++g; if (s.charAt(i) == 'B') ++b;
			}
			ans = r * g * b;
			for (int i = 0; i < n; ++i) {
				for (int j = i+1; j < n; ++j) {
					if (2 * j - i < n) if (s.charAt(i) != s.charAt(j) && s.charAt(i) != s.charAt(2 * j - i) && s.charAt(j) != s.charAt(2 * j - i))
						--ans;
				}
			}
			out.println(ans);
		}
		
	}
	

	private static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32678);
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
		
		private int nextInt() {
			return Integer.parseInt(next());
		}

	}
}
