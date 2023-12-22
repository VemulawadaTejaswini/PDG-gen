import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	
	static final int MAX = 400000000;
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		int l = 2 * MAX, l1 = 2 * MAX, l2 = 2 * MAX, r = -2 * MAX, r1 = -2 * MAX, r2 = -2 * MAX;
		int d = 2 * MAX, d1 = 2 * MAX, d2 = 2 * MAX, u = -2 * MAX, u1 = -2 * MAX, u2 = -2 * MAX;
		int x, y;
		char c;
		for (int i = 0; i < N; i++) {
			x = sc.nextInt() * 2;
			y = sc.nextInt() * 2;
			c = sc.next().charAt(0);
			if (c == 'L') {
				l2 = Math.min(l2, x);
				r2 = Math.max(r2, x);
			} else if (c == 'R') {
				l1 = Math.min(l1, x);
				r1 = Math.max(r1, x);
			} else {
				l = Math.min(l, x);
				r = Math.max(r, x);
			}
			if (c == 'D') {
				d2 = Math.min(d2, y);
				u2 = Math.max(u2, y);
			} else if (c == 'U') {
				d1 = Math.min(d1, y);
				u1 = Math.max(u1, y);
			} else {
				d = Math.min(d, y);
				u = Math.max(u, y);
			}
		}
		long ans = MAX * (long)MAX, first, second;
		for (int t = 0; t <= MAX; t++) {
			first = Math.max(r, Math.max(r1, r2)) - Math.min(l, Math.min(l1, l2));
			second = Math.max(u, Math.max(u1, u2)) - Math.min(d, Math.min(d1, d2));
			ans = Math.min(ans, first * second);
			l1++; r1++; d1++; u1++;
			l2--; r2--; d2--; u2--;
		}
		out.println(ans / 4.0);
		
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
