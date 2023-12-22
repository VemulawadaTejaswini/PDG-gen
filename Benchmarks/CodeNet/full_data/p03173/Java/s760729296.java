import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int N=sc.nextInt();
		long[][] dp=new long[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				dp[i][j]=0;
			}
		}
		long wa=1145141919810L;
		int tasi=0;
		long sum=0;
		for(int i=0; i<N; i++) {
			dp[0][i]=sc.nextLong();
		}
		for(int i=0; i<N-1; i++) {
			wa=114514191981019L;
			for(int j=0; j<N-i-1; j++) {
				wa=Math.min(wa, ((long)dp[i][j]+dp[i][j+1]));
				if(wa==dp[i][j]+dp[i][j+1]) {
					tasi=j;
				}
			}
			sum+=dp[i][tasi]+dp[i][tasi+1];
			for(int j=0; j<tasi; j++) {
				dp[i+1][j]=dp[i][j];
			}
			dp[i+1][tasi]=dp[i][tasi]+dp[i][tasi+1];
			for(int j=tasi+1; j<N-i-1; j++) {
				dp[i+1][j]=dp[i][j+1];
			}
		}
		pl(sum);
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
}