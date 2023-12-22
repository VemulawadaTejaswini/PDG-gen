import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	static long MOD = 1000000007;
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		long N = sc.nextInt();
		long M = sc.nextInt();
		long K = sc.nextInt();
		long ans = 0;
		for (int A = 1; A < M; A++) {
			long tmp = ((M - A) * N * N) % MOD;
			ans += tmp * A;
			ans %= MOD;
		}
		for (int A = 1; A < N; A++) {
			long tmp = ((N - A) * M * M) % MOD;
			ans += tmp * A;
			ans %= MOD;
		}
		long num = M * N - 2;
		for (int i = 1; i <= K - 2; i++) {
			ans *= inv(i);
			ans %= MOD;
			ans *= num;
			ans %= MOD;
			num--;
		}
		out.println(ans);
		
		out.flush();
	}
	
	static long eleva(long b, int e) {
		if (e == 0) return 1;
		long tmp = eleva(b, e / 2);
		tmp = (tmp * tmp) % MOD;
		if (e % 2 == 1) {
			tmp = (tmp * b) % MOD;
		}
		return tmp;
	}
	
	static long inv(int val) {
		return eleva(val, (int)MOD - 2);
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
