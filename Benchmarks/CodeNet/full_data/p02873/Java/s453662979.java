import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		char[] S = sc.next().toCharArray();
		int N = S.length + 1;
		int[] elems = new int[N];
		Arrays.fill(elems, - 1);
		if (S[0] == '<') elems[0] = 0;
		if (S[N-2] == '>') elems[N - 1] = 0;
		for (int i = 0; i + 1 < N - 1; i++) {
			if (S[i] == '>' && S[i + 1] == '<') {
				elems[i + 1] = 0;
			}
		}
		for (int i = 0; i < N - 1; i++) {
			if (S[i] == '<' && elems[i] >= 0) {
				elems[i + 1] = Math.max(elems[i + 1], elems[i] + 1);
			}
		}
		for (int i = N - 2; i >= 0; i--) {
			if (S[i] == '>' && elems[i + 1] >= 0) {
				elems[i] = Math.max(elems[i], elems[i + 1] + 1);
			}
		}
		long ans = 0;
		for (int elem : elems) {
			ans += elem;
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
