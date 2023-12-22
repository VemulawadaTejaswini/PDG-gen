import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		int A = sc.nextInt()-1;
		int B = sc.nextInt()-1;
		int C = sc.nextInt()-1;
		int D = sc.nextInt()-1;
		char[] s = sc.next().toCharArray();
		boolean ok = true;
		int ff = can(s, A, C);
		int ss = can(s, B, D);
		if (ff == 0 || ss == 0) ok = false;
		if (D < C) {
			if (ss < 2) ok = false;
		}
		out.println(ok ? "Yes" : "No");
		
		out.flush();
	}
	
	static int can(char[] s, int from, int to) {
		boolean ok = false;
		for (int i = from; i <= to; i++) {
			if (i+1 <= to && s[i] == '#' && s[i+1] == '#') return 0;
			if (i-1 >= 0 && i+1 < s.length && s[i-1] == '.' && s[i] == '.' && s[i+1] == '.') ok = true;
		}
		return ok ? 2 : 1;
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
