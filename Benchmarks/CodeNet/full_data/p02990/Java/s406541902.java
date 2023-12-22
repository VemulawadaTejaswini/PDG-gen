import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

public class Main {
	static int max=100001;	//nCr の n の最大値?
	static long MOD=1000000007;
	static long[] fac=new long[max];
	static long[] finv=new long[max];
	static long[] inv=new long[max];
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		COMinit();
		int N=sc.nextInt();
		int K=sc.nextInt();
		for(int i=1; i<=K; i++) {
			long sentaku=COM(N-K+1,i);//赤を固定して考える
			long ao=COM(K-1,i-1);
			pl(sentaku*ao%MOD);
		}

	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
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
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
	static void COMinit() {		//テーブルを作るみたい nCrの　または　階乗の？
		fac[0] = fac[1] = 1;
		finv[0] = finv[1] = 1;
		inv[1] = 1;
		for (int i = 2; i < max; i++){
			fac[i] = fac[i - 1] * i % MOD;
			inv[i] = MOD - inv[(int)(MOD%i)] * (MOD / i) % MOD;
			finv[i] = finv[i - 1] * inv[i] % MOD;
		}
	}
	static long COM(int n, int k){			//二項係数の計算
		if (n < k) return 0;
		if (n < 0 || k < 0) return 0;
		return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
	}
}