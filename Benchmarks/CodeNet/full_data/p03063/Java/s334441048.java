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
		char[] s = sc.next().toCharArray();
		int[] acumL = new int[N+1], acumR = new int[N+1];
		for (int i = 1; i < N + 1; i++) {
			acumL[i] = acumL[i-1] + (s[i-1] == '#'? 1 : 0);
		}
		for (int i = 1; i < N + 1; i++) {
			acumR[i] = acumR[i-1] + (s[N - i] == '.'? 1 : 0);
		}
		int ans = N;
		for (int i = 0; i < N + 1; i++) {
			ans = Math.min(ans, acumL[i] + acumR[N-i]);
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
