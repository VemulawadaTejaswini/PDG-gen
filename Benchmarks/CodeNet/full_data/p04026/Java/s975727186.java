import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		InputReader r = new InputReader(System.in);
		char[] arr = r.next().toCharArray();
		for (int len = 2; len <= Math.min(arr.length, 50); len++) {
			for (int i = 0; i < arr.length; i++) {
				int[] cnt = new int[26];
				boolean can = true;
				for (int j = i; j < i + len; j++) {
					if (j >= arr.length) {
						can = false;
						break;
					}
					cnt[arr[j] - 'a']++;
				}
				if (can) {
					int max = -1;
					for (int x = 0; x < 26; x++)
						max = Math.max(cnt[x], max);
					if (max > len / 2) {
						System.out.println((i + 1) + " " + (i + len));
						return;
					}
				}
			}
		}
		System.out.println("-1 -1");
	}

	static class InputReader {
		private BufferedReader reader;
		private StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream));
			tokenizer = null;
		}

		public InputReader(FileReader stream) {
			reader = new BufferedReader(stream);
			tokenizer = null;
		}

		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
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
}
