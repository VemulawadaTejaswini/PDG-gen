import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		char[] vals = sc.next().toCharArray();
		int n = vals.length;
		int[] ans = new int[n + 1];
		int[] more = new int[n + 1];
		ans[n-1] = 1;
		for (int i = n - 2; i >= 0; i--) {
			more[i] = 1 + ans[i + 2];
			if (vals[i] != vals[i+1]) ans[i] = 1 + ans[i+1];
			else ans[i] = Math.max(1 + ans[i + 2], 1 + more[i+1]);
		}
		out.println(ans[0]);
		
		out.flush();
	}
	
	static class MyScanner {
		private BufferedReader br;
		private StringTokenizer tokenizer;
		
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(br.readLine());
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
	}
}
