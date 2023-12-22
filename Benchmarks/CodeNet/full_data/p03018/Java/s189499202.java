import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		char[] s = sc.next().toCharArray();
		long ans = 0;
		int as = 0, state = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == 'A') {
				if (state != 0) as = 0;
				state = 0;
				as++;
			}
			if (s[i] == 'B') {
				if (state == 0) {
					state++;
				} else {
					as = 0;
					state = 1;
				}
			}
			if (s[i] == 'C') {
				if (state == 1) {
					ans += as;
					state = 0;
				} else {
					state = 0;
					as = 0;
				}
			}
		}
		out.println(ans);
		
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
