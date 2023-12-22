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
		int pot = 1;
		while (2 * pot - 1 <= N) pot = 2 * pot;
		if (pot != N && N != 1) {
			out.println("Yes");
			for (int i = 1; i + 1 <= pot - 1; i++) {
				out.println(i + " " + (i + 1));
			}
			out.println((pot - 1) + " " + (N + 1));
			for (int i = 1; i + 1 <= pot - 1; i++) {
				out.println((N + i) + " " + (N + i + 1));
			}
			int xor = 0;
			for (int i = pot; i <= N; i++) {
				xor ^= i;
			}
			int from = pot;
			if ((xor & pot) != 0) {
				xor ^= pot;
				from++;
			}
			for (int i = from; i + 1 <= N; i++) {
				out.println(i + " " + (i + 1));
			}
			if (pot - 1 < N) {
				out.println(N + " " + xor);
				out.println(xor + " " + (from + N));
			}
			for (int i = from; i + 1 <= N; i++) {
				out.println((N + i) + " " + (N + i + 1));
			}
			if (from != pot) {
				int nxor = pot ^ N ^ xor;
				out.println(pot + " " + N);
				int curPos = xor;
				while (nxor != 0) {
					if (curPos > N + pot - 1) throw new RuntimeException();
					if (curPos == pot -1) curPos = 1 + N;
					else curPos++;
					int toXor = curPos;
					if (toXor > N) toXor -= N;
					nxor ^= toXor;
				}
				out.println(curPos + " " + (pot + N));
			}
		} else {
			out.println("No");
		}
		
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
