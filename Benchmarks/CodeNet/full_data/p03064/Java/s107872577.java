import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static final int MOD = 998244353;
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		int[] vals = new int[N];
		int total = 0;
		for (int i = 0; i < vals.length; i++) {
			vals[i] = sc.nextInt();
			total += vals[i];
		}
		int[] pots2 = new int[N+1];
		pots2[0] = 1;
		for (int i = 1; i < N+1; i++) {
			pots2[i] = (2 * pots2[i-1]) % MOD;
		}
		int[] sums = new int[total + 1];
		int[] simple = new int[total + 1];
		sums[0] = simple[0] = 1;
		for (int i = 0; i < N; i++) {
			for (int j = total; j >= 0; j--) {
				sums[j] *= 2;
				sums[j] %= MOD;
				if (j >= vals[i]) {
					sums[j] += sums[j-vals[i]];
					simple[j] += simple[j-vals[i]];
					simple[j] %= MOD;
				}
				sums[j] %= MOD;
			}
		}
		long all = 1;
		for (int i = 0; i < N; i++) {
			all *= 3;
			all %= MOD;
		}
		all -= 3 * (long)pots2[N];
		all+=3;
		int min = (total + 1) / 2;
		for (int i = min; i < total; i++) {
			all -= 3 * (long)(sums[i]-2*simple[i]);
		}
		all %= MOD;
		all += MOD;
		all %= MOD;
		out.println(all);
		
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
